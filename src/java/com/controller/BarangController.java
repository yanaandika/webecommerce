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
    
    List<Product> products = new ArrayList<>();
    @RequestMapping("/all")
    public String showAllProduct(HttpSession session){
        List<Product> products = br.findAll();
        session.setAttribute("prod", products);
        return "Product";
    }
    
    @RequestMapping(value="/{customerId}")
    public String showOneComputer(@PathVariable Integer customerId, HttpSession session){
        User user = new User("retere", "Lamakau");
        Product product = br.findById(customerId);
        user.getProducts().add(product);
        session.setAttribute("prod", product);
        session.setAttribute("user", user);
        return "detail"; 
    }
    
    
    @RequestMapping(value = "/tambahkan") // pake kurung kalo detail
    public String detailProduk(Model model, HttpSession session) {
        session.setAttribute("keranjang", products);
        List<Product> list = (List<Product>) session.getAttribute("keranjang");
        list.add((Product) session.getAttribute("prod"));
        session.removeAttribute("prod");
        return "keranjang";
    }
    
    @RequestMapping(value = "isiKeranjang")
    public String isiKeranjang(){
        return "cart";
    }
    
    @RequestMapping(value ="hapus/{id}")
    public String isiKeranjang(HttpSession session, @PathVariable("id") Integer id){
        List<Product> list=(List<Product>) session.getAttribute("keranjang");
        List<Product> keranjangBaru = new ArrayList<>();
        int penampung=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()==id) {
                penampung=i;
            }
        }
        list.remove(penampung);
        return "cart";
    }
}
