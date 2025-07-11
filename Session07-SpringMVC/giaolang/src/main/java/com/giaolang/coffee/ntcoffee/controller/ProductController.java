package com.giaolang.coffee.ntcoffee.controller;

import com.giaolang.coffee.ntcoffee.entity.Account;
import com.giaolang.coffee.ntcoffee.entity.Product;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/products/add")
    public String addProduct(Model model) {
        model.addAttribute("p", new Product());
        return "product-form";
    }


    @GetMapping("/products/edit/{id}")
    public String edit(Model model, @PathVariable String id) {
        //có trong tay id số mấy, thì vào database query lên, ta tạm thời hard-coded
        Product product;
        if (id.equalsIgnoreCase("NTCF1")) {
            product = new Product("NTCF1", "Cà phê vị Java", 30_000);
        }
        else if (id.equalsIgnoreCase("NTCF2")) {
            product = new Product("NTCF2", "Cà phê vị Ngọc Trinh", 40_000);
        }
        else
            product = new Product("NTCF3", "Cà phê vị Java mix Ngọc Trinh", 5_700_000);
        model.addAttribute("p", product);
        return "product-form";

    }


    @GetMapping("/ngoctrinh")
    public String list(Model model, HttpSession session) {
        List<Product> productList = List.of(
                new Product("NTCF1", "Cà phê vị Java", 30_000),
                new Product("NTCF2", "Cà phê vị Ngọc Trinh", 40_000),
                new Product("NTCF3", "Cà phê vị Java mix Ngọc Trinh", 5_700_000));
        //model.addAttribute("sentUser", username);
        model.addAttribute("products", productList);
        //model.addAttribute("sentUser", session.getAttribute("sentUser"));
        //có session lo giữ acc rồi!!!!!!!!!!!!!!!!!!!!
        Account acc = (Account)session.getAttribute("acc");

        model.addAttribute("role", acc.getRole());
        //gửi danh sách sản phẩm + role sang trang!!!
        //CÓ ROLE THÌ BẬT TẮT NÚT BẤM
        return "products";
    }
}
