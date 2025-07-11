package com.emkay.coffee;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@RequestMapping("/api/coffees")
public class CoffeeApiController {

    @GetMapping("/test")
    public ApiResponse<String> test(){
        return ApiResponse.<String>builder()
                .message("Day la message")
                .result("Coffees")
                .build();
    }

    @GetMapping("/coffee")
    public Coffee getCoffee(){
        return Coffee.builder()
                .id("1")
                .name("Toi la coffee")
                .price(10000)
                .build();
    }
}
