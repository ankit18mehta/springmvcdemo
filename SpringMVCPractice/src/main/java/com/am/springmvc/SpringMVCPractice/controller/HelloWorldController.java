package com.am.springmvc.SpringMVCPractice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormTwo")
    public String letsShoutDude(HttpServletRequest httpServletRequest, Model model) {

        String theName = httpServletRequest.getParameter("studentName");
        theName = theName.toUpperCase();

        String result = "Yo " + theName;
        model.addAttribute("message " + result);
        return "helloworld";
    }

}
