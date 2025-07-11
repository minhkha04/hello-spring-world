package com.emkay.ntcoffe.controller;

import com.emkay.ntcoffe.entity.Product;
import com.emkay.ntcoffe.entity.User;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Slf4j
@Controller()
public class AuthenticationController {

    @GetMapping({"/login", "/"})
    public String showLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, RedirectAttributes redirectAttributes, HttpSession httpSession) {
        if (username == null || password == null
        || username.isBlank() || password.isBlank()) {
            redirectAttributes.addAttribute("error", "Không được truyền chuỗi rỗng");
            return "login";
        }
        User user;
        if (username.equalsIgnoreCase("admin")) {
            user = User.builder().username(username).password(password).role("ADMIN").build();
        } else {
            user = User.builder().username(username).password(password).role("USER").build();
        }
        log.info("username: {}, password: {}", username, password);

        httpSession.setAttribute("user", user);
        redirectAttributes.addFlashAttribute("message", "Đăng nhập thành công");
        return "redirect:/products";
    }
}
