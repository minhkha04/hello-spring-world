package com.example.coffeev3.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    String id;

    @Column(columnDefinition = "NVARCHAR(50)", nullable = false)
    String name;

    @Column(columnDefinition = "NVARCHAR(255)")
    String description;

    @Column(nullable = false)
    int quantity;

    @Column(nullable = false)
    double price;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    Category category;
}
