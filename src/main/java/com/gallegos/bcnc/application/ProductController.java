package com.gallegos.bcnc.application;

import com.gallegos.bcnc.application.request.ProductRequest;
import com.gallegos.bcnc.application.response.ProductResponse;
import com.gallegos.bcnc.domain.service.IProduct;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping(ProductController.URL)
public class ProductController {

    private static final Logger logger = LogManager.getLogger(ProductController.class);
    static final String URL = "/api";
    static final String GET_PRODUCTS_BY_CONDITIONS = "/get_product_by_condionts";
    static final String GET_PRODUCTS_BY_CONDITIONS_RESPONSE = "/get_product_by_condionts_response";

    @Autowired
    private IProduct productService;

    @GetMapping(ProductController.GET_PRODUCTS_BY_CONDITIONS)
    public Map<String, Object> getProductByConditions(@RequestParam LocalDateTime applicationDate, @RequestParam int productIdentifier, @RequestParam int brandIdentifier) {

        logger.info("Getting the product.");
        long startTime = System.nanoTime();
        Map<String, Object> body = productService.getProductByConditions(applicationDate, productIdentifier, brandIdentifier);
        long endTime = System.nanoTime();
        logger.info("Product calculated in {} seconds.", (double)(endTime - startTime)/1000000000 );

        return body;
    }

    @PostMapping(value = ProductController.GET_PRODUCTS_BY_CONDITIONS_RESPONSE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ProductResponse getProductByConditionsResponse(@RequestBody final ProductRequest productRequest) {
        logger.info("Getting the product.");
        long startTime = System.nanoTime();
        ProductResponse out = productService.getProductByConditionsPostMethod(productRequest);
        long endTime = System.nanoTime();
        logger.info("Product calculated in {} seconds.", (double)(endTime - startTime)/1000000000 );

        return out;
    }
}
