package com.gallegos.bcnc.domain.service;

import com.gallegos.bcnc.application.mapper.Mapper;
import com.gallegos.bcnc.application.request.ProductRequest;
import com.gallegos.bcnc.application.response.ProductResponse;
import com.gallegos.bcnc.domain.model.Price;
import com.gallegos.bcnc.domain.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProductServiceImpl implements  IProduct{

    @Autowired
    IProductRepository productRepository;

    @Autowired
    private Mapper mapper;

    @Override
    public Map<String, Object> getProductByConditions(LocalDateTime applicationDate, int productIdentifier, int brandIdentifier) {

        Price price = productRepository.getProductByConditions(applicationDate, productIdentifier, brandIdentifier);
        return completeJsonObject(price);
    }

    @Override
    public ProductResponse getProductByConditionsPostMethod(ProductRequest productRequest) {
        return mapper.toResponse(productRepository.getProductByConditions(productRequest.getApplicationDate(),
                productRequest.getProductIdentifier(), productRequest.getBrandIdentifier()));
    }

    private static  Map<String, Object> completeJsonObject(Price price) {
        Map<String, Object> body = new HashMap<>();
        body.put("product", price.getProductId());
        body.put("brand identifier", price.getBrandId());
        body.put("price list", price.getPriceList());
        body.put("star date", price.getEndDate());
        body.put("end date", price.getEndDate());
        body.put("price", price.getPriceField());
        return body;
    }
}
