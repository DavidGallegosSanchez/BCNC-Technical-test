package com.gallegos.bcnc.application;

import com.gallegos.bcnc.application.dto.ProductDto;
import com.gallegos.bcnc.application.mapper.Mapper;
import com.gallegos.bcnc.domain.service.IProduct;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping(ProductController.URL)
public class ProductController {

    private static final Logger logger = LogManager.getLogger(ProductController.class);
    static final String URL = "/api";
    static final String GET_PRODUCTS_BY_CONDITIONS = "/get_product_by_condionts";

    @Autowired
    private IProduct productService;

    @Autowired
    private Mapper mapper;

    @GetMapping(ProductController.GET_PRODUCTS_BY_CONDITIONS)
    public ResponseEntity<String> getProductByConditions(@RequestParam LocalDateTime applicationDate,
                                            @RequestParam int productIdentifier, @RequestParam int brandIdentifier) {
        logger.info("Getting the product.");
        long startTime = System.nanoTime();
        ProductDto out = mapper.toDto(productService.getProductByConditions(applicationDate, productIdentifier, brandIdentifier));
        long endTime = System.nanoTime();
        logger.info("Product calculated in {} seconds.", (double)(endTime - startTime)/1000000000 );

        return ResponseEntity.ok().body("Product: " + out.getProductId() +
                " - brand identifier: " + out.getBrandId() +
                " - price list: " + out.getPriceList() +
                " - star date: " + out.getStartDate() +
                " - end date: " + out.getEndDate() +
                " - price: " + out.getPrice());
    }
}
