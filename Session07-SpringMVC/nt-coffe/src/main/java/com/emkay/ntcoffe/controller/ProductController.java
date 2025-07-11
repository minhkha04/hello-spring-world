package com.emkay.ntcoffe.controller;

import com.emkay.ntcoffe.entity.Product;
import com.emkay.ntcoffe.entity.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @GetMapping()
    public String showProducts(Model model, HttpSession httpSession) {
        List<Product> products = List.of(
                Product.builder().id(1).name("Coffee 1").price(100.0).build(),
                Product.builder().id(2).name("Coffee 2").price(1000.0).build(),
                Product.builder().id(3).name("Coffee 2").price(19999.0).build()
        );
        model.addAttribute("products", products);
        User user = (User) httpSession.getAttribute("user");
        model.addAttribute("user", user);
        return "products";
    }

    @GetMapping("/add")
    public String addProduct(Model model) {
        model.addAttribute("p", new Product());
        return "product-form";
    }

    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable long id, Model model) {
        Product product = Product.builder().id(id)
                .name("ten cu")
                .price(6969.69).build();
        model.addAttribute("p", product);
        return "product-form";
    }

    @PostMapping("/save")
    public String saveProduct(
            @ModelAttribute("p") Product product,
            RedirectAttributes redirectAttributes
    ) {
        // Giả lập lưu sản phẩm
        System.out.println("Saving product: " + product.getId());
        System.out.println("Product name: " + product.getName());
        redirectAttributes.addFlashAttribute("message", "Thanh cong " + product.getName());
        return "redirect:/products";
    }
}