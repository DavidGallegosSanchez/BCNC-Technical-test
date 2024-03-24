package com.gallegos.bcnc.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "PRICE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Price")
    private int id;

    @Column(name = "Brand_Id")
    private int brandId;

    @Column(name = "Start_Date")
    private LocalDateTime startDate;

    @Column(name = "End_Date")
    private LocalDateTime endDate;

    @Column(name = "Price_List")
    private int priceList;

    @Column(name = "Product_Id")
    private int productId;

    @Column(name = "Priority")
    private int priority;

    @Column(name = "Price")
    private float price;

    @Column(name = "Curr")
    private String curr;
}
