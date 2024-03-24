package com.gallegos.bcnc.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private int productId;

    private int brandId;

    private int priority;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private float price;

    private int priceList;
}
