package com.example.pdfrag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RouteController {

    @GetMapping("/pdfReg")
    public String korea(){
        return "rag";
    }
}
