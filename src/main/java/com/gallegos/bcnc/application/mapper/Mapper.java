package com.gallegos.bcnc.application.mapper;

import com.gallegos.bcnc.application.dto.ProductDto;
import com.gallegos.bcnc.domain.model.Price;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    public ProductDto toDto(Price price){
        ProductDto dto = new ProductDto();
        dto.setProductId(price.getProductId());
        dto.setBrandId(price.getBrandId());
        dto.setPriority(price.getPriority());
        dto.setStartDate(price.getStartDate());
        dto.setEndDate(price.getEndDate());
        dto.setPrice(price.getPrice());
        dto.setPriceList(price.getPriceList());

        return dto;
    }

    public Price toPrice(ProductDto productDto){
        Price price = new Price();
        price.setProductId(productDto.getProductId());
        price.setBrandId(productDto.getBrandId());
        price.setPriority(productDto.getPriority());
        price.setStartDate(productDto.getStartDate());
        price.setEndDate(productDto.getEndDate());
        price.setPrice(productDto.getPrice());
        price.setPriceList(productDto.getPriceList());

        return price;
    }
}
