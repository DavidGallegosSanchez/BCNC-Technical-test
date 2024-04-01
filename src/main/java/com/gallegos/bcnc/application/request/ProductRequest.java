package com.gallegos.bcnc.application.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class ProductRequest {

    private LocalDateTime applicationDate;
    private int productIdentifier;
    private int brandIdentifier;

}
