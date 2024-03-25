package com.gallegos.bcnc.application.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class ProductDto {
    private int productId;

    private int brandId;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private float price;

    private int priceList;
}
