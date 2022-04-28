/**
 * project name   : E-Commerce-Backend
 * project author : Mindula Dilthushan
 * author email   : minduladilthushan1@gmail.com
 */
package com.example.ecommercebackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecommerce/api/root")
public class RootController {

    @GetMapping
    public String mainRoot() {
        return "Main Root..!";
    }
}
