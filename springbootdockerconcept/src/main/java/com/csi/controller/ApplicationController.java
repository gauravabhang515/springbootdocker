package com.csi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {
    @GetMapping

    public ResponseEntity<String> sayHi(){

        return ResponseEntity.ok("Welcome to fintech csi");
    }
    @GetMapping("/services")

    public ResponseEntity<String> sayServices(){
        return ResponseEntity.ok("Softwere development");
    }
    @GetMapping("/addess")
    public ResponseEntity<String> sayAddress(){
        return ResponseEntity.ok("Pune/PCMC");
    }


}
