package com.example.springlearning.uc1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UC1 {
    @GetMapping("/hello")
    public String ss(){
        return "Hello from BridgeLabz!!!";
    }

}
