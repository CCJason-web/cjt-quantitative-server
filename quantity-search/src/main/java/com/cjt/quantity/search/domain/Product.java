package com.cjt.quantity.search.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {
    private Integer productId;

    private String productName;

    private String productType;

    private static final long serialVersionUID = 1L;

}