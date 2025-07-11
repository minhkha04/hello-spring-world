package com.emkay.coffee;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
@Builder
@ToString
public class Coffee {
    String id;
    String name;
    double price;
}
