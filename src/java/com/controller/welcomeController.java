/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.User;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/welcome")
public class welcomeController {
    
    @RequestMapping()
    public String welcome(HttpSession session){
        User user = new User("Yana", "Andika");
        session.setAttribute("user", user);
        return "welcome";
    }
}
