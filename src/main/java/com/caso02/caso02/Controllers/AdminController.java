/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caso02.caso02.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Franklin
 */
@Controller
@RequestMapping("/administrador")
public class AdminController {
    public AdminController(){
        
    }
    
    @GetMapping()
    public String Home(){
        return "administrador";
    }
    
}
