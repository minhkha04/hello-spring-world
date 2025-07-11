package com.emkay.ntcoffe.entity;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    private long id;
    private String name;
    private Double price;
}
