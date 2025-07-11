package com.example.coffeev3.controller;

import com.example.coffeev3.entity.Product;
import com.example.coffeev3.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ProductController {

    ProductService productService;

    @GetMapping("")
    public String showProductList(Model model) {
        List<Product> list = productService.findAll();
        model.addAttribute("products", list);
        return "products";
    }
}
