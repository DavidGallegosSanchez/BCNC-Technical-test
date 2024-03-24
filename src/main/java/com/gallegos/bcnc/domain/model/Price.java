package com.gallegos.bcnc.domain.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "PRICE")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Price")
    private Long id;

    @Column(name = "Brand_Id")
    private Long brandId;
    @Column(name = "Start_Date")
    private LocalDateTime startDate;

    @Column(name = "End_Date")
    private LocalDateTime endDate;

    @Column(name = "Price_List")
    private Long priceList;

    @Column(name = "Product_Id")
    private Long productId;

    @Column(name = "Priority")
    private Long priority;

    @Column(name = "Price")
    private float price;

    @Column(name = "Curr")
    private String curr;
}
