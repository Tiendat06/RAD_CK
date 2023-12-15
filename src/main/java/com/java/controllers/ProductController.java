package com.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @GetMapping("")
    public String index(){
        return "product/product";
    }

    @GetMapping("/add")
    public String addGet(){
        return "product/add_product_page";
    }

    @PostMapping("/add")
    public void addPost(){

    }

    @GetMapping("/update")
    public String updateGet(){
        return "product/update_product_page";
    }

    @PostMapping("/update")
    public void updatePost(){

    }

}
