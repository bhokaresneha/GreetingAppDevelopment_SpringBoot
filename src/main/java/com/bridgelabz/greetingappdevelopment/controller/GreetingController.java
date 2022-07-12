package com.bridgelabz.greetingappdevelopment.controller;
import com.bridgelabz.greetingappdevelopment.module.Data;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello Sneha";
    }
    @RequestMapping(value = {"/hi"}, method = RequestMethod.GET)
    public String sayHelloDifferently() {
        return "Hello Everyone";
    }

    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello " + name + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam (@PathVariable String name){
        return "Hello " + name + " Welcome";
    }

    @PostMapping("/post")
    public String sayHello (@RequestBody Data user){
        return "Hello " + user.getFirstName() + " " + user.getLastName () + "!!!";
    }
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName")String lastName){
        return "Hello "+ firstName + " " + lastName + " !!";
    }
}
