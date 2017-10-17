/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.Product;
import com.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/Product")
public class BarangController {
    @Autowired
    Barang br;
    
    @RequestMapping("/all")
    public String showAllProduct(Model model){
        List<Product> products = br.findAll();
        model.addAttribute("prod", products);
        return "Product";
    }
    
    @RequestMapping(value="/{customerId}")
    public String showOneComputer(@PathVariable Integer customerId, HttpSession session){
        User user = new User("retere", "Lamakau");
        Product product = br.findById(customerId);
        user.getProducts().add(product);
        session.setAttribute("user", user);
        return "detail"; 
    }
    
    
}
