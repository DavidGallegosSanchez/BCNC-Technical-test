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
        dto.setStartDate(price.getStartDate());
        dto.setEndDate(price.getEndDate());
        dto.setPrice(price.getPrice());
        dto.setPriceList(price.getPriceList());

        return dto;
    }

}
