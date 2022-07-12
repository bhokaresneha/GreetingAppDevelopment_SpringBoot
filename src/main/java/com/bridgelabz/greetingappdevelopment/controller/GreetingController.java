package com.bridgelabz.greetingappdevelopment.controller;

import com.bridgelabz.greetingappdevelopment.module.User;
import com.bridgelabz.greetingappdevelopment.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class GreetingController {
    //Using Service Layer
    @Autowired
    GreetingServices service1;
    @GetMapping("/serviceData")
    public String serviceData(){
        return "Hello "+service1.message();
    }

    //Using RequestBody
    @GetMapping("/getData")
    public String getdata(@RequestBody User data){
        return "Hello "+data.getFirstName()+" "+data.getLastName();
    }

    //Using RequestMapping
    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    public String reqData(){
        return "Hello RequestMap World";
    }

    //Using RequestMapping And RequestParam
    @RequestMapping(value = {"/get1"},method = RequestMethod.GET)
    public String reqData1(@RequestParam String name, @RequestBody User data){
        return "Hello "+name+" "+data.getLastName();
    }

    //Using PathVariable
    @GetMapping("/param/{name}")
    public String pathData(@PathVariable String name){
        return "Hello "+name+" !!!!" ;
    }
}
