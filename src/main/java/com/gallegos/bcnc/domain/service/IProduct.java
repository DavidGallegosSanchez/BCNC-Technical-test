package com.gallegos.bcnc.domain.service;

import com.gallegos.bcnc.domain.model.Price;

import java.time.LocalDateTime;

public interface IProduct {

    /**
     * Returns a product based on application date, product identifier and product id.
     * @param applicationDate Date of application of the product to be returned
     * @param productIdentifier product identifier of the product to be returned
     * @param brandIdentifier brand identifier of the product to be returned
     * @return Output object with missing number
     */
    Price getProductByConditions(LocalDateTime applicationDate, int productIdentifier, int brandIdentifier);
}
