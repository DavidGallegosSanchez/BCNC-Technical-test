package com.gallegos.bcnc.application.mapper;

import com.gallegos.bcnc.application.response.ProductResponse;
import com.gallegos.bcnc.domain.model.Price;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    public ProductResponse toResponse(Price price){
        ProductResponse dto = new ProductResponse();
        dto.setProductId(price.getProductId());
        dto.setBrandId(price.getBrandId());
        dto.setStartDate(price.getStartDate());
        dto.setEndDate(price.getEndDate());
        dto.setPrice(price.getPriceField());
        dto.setPriceList(price.getPriceList());

        return dto;
    }

}
