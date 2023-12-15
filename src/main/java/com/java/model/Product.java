package com.java.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    private String productID;
    private String productName;
    private float productPrice;
    private int productQuantity;
    private String productDescription;
}
