package com.java.controllers;

import com.java.model.Account;
import com.java.model.Agent;
import com.java.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/login")
    public String loginGet(){
        Account account = new Account();
        Product p = new Product();
        Agent a = new Agent();
        return "log/login";
    }

    @PostMapping("/login")
    public void loginPost(){

    }

    @GetMapping("/logout")
    public void logout(){

    }
}
