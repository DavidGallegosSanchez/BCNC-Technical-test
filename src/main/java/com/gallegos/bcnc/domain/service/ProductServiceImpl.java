package com.gallegos.bcnc.domain.service;

import com.gallegos.bcnc.domain.model.Price;
import com.gallegos.bcnc.domain.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProductServiceImpl implements  IProduct{

    @Autowired
    IProductRepository productRepository;
    @Override
    public Price getProductByConditions(LocalDateTime applicationDate, int productIdentifier, int brandIdentifier) {
        return productRepository.getProductByConditions(applicationDate, productIdentifier, brandIdentifier).get(0);
    }
}
