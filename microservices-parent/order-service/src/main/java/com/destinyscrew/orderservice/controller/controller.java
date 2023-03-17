package com.destinyscrew.orderservice.controller;

import com.destinyscrew.orderservice.dto.OrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class controller {

    @PostMapping
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        return "Order Placed Successfully";
    }
}
