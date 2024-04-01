package com.gallegos.bcnc.domain.service;

import com.gallegos.bcnc.application.request.ProductRequest;
import com.gallegos.bcnc.application.response.ProductResponse;

import java.time.LocalDateTime;
import java.util.Map;

public interface IProduct {

    /**
     * Returns a product based on application date, product identifier and product id.
     * @param applicationDate Date of application of the product to be returned
     * @param productIdentifier product identifier of the product to be returned
     * @param brandIdentifier brand identifier of the product to be returned
     * @return Price object with result in a JSON object format
     */
    Map<String, Object> getProductByConditions(LocalDateTime applicationDate, int productIdentifier, int brandIdentifier);

    /**
     * Returns a product based on application date, product identifier and product id.
     * @param productRequest object with applicationDate, productIdentifier and brandIdentifier values
     * @return Price object with result
     */
    ProductResponse getProductByConditionsPostMethod(ProductRequest productRequest);
}
