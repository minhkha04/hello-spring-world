package com.example.coffeev3.config;

import com.example.coffeev3.entity.Category;
import com.example.coffeev3.entity.Product;
import com.example.coffeev3.service.CategoryService;
import com.example.coffeev3.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public class DataInit implements CommandLineRunner {

    CategoryService categoryService;
    ProductService productService;


    @Override
    public void run(String... args) throws Exception {
        Category category1 = Category.builder()
                .name("Cà phê")
                .description("Các loại cà phê thơm ngon")
                .build();

        Category category2 = Category.builder()
                .name("Trà")
                .description("Các loại trà thanh mát")
                .build();

        Category category3 = Category.builder()
                .name("Sinh tố")
                .description("Các loại sinh tố bổ dưỡng")
                .build();

        Category category4 = Category.builder()
                .name("Nước ép")
                .description("Các loại nước ép trái cây tươi ngon")
                .build();

        Product product1 = Product.builder()
                .id("CF1")
                .name("Cà phê Espresso")
                .description("Cà phê đen nguyên chất, đậm đà hương vị")
                .price(50000)
                .category(category1)
                .build();

        Product product2 = Product.builder()
                .id("TR1")
                .name("Trà Xanh Matcha")
                .description("Trà xanh matcha nguyên chất, thanh mát")
                .price(40000)
                .category(category2)
                .build();

        Product product3 = Product.builder()
                .id("ST1")
                .name("Sinh tố Bơ")
                .description("Sinh tố bơ mịn màng, bổ dưỡng")
                .price(60000)
                .category(category3)
                .build();

        Product product4 = Product.builder()
                .id("NE1")
                .name("Nước ép Cam Tươi")
                .description("Nước ép cam tươi mát, giàu vitamin C")
                .price(45000)
                .category(category4)
                .build();

        Product product5 = Product.builder()
                .id("CF2")
                .name("Cà phê Latte")
                .description("Cà phê sữa béo ngậy, thơm ngon")
                .price(55000)
                .category(category1)
                .build();

        Product product6 = Product.builder()
                .id("TR2")
                .name("Trà Đen Truyền Thống")
                .description("Trà đen truyền thống, hương vị đậm đà")
                .price(35000)
                .category(category2)
                .build();

        Product product7 = Product.builder()
                .id("ST2")
                .name("Sinh tố Dâu Tây")
                .description("Sinh tố dâu tây ngọt ngào, tươi mát")
                .price(65000)
                .category(category3)
                .build();

        Product product8 = Product.builder()
                .id("NE2")
                .name("Nước ép Dứa Tươi")
                .description("Nước ép dứa tươi ngon, giải khát tuyệt vời")
                .price(50000)
                .category(category4)
                .build();

        categoryService.saveAll(List.of(category1, category2, category3, category4));
        productService.saveAll(List.of(product1, product2, product3, product4, product5, product6, product7, product8));
    }
}
