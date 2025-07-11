package com.emkay.ioc.v1scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.emkay.ioc.v1scan")
// quét tất cả toàn bộ class trong thư mục trên, xem object nào cần tạo ta ko thì tạo, new luôn object
// để phân biệt object nào cần tạo, object nào ko cần tạo, thì đấu dấu class bằng 1 trong 3 từ khóa:
// @Component @Service @Repository
public class AppConfig {

}
