package com.fantoir.fantoir.api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class testController {
    @RequestMapping("/")
    public String greeting(){
        return "hello world";
    }

    @GetMapping(value = "/{name}")
    public String greetingWithName(@PathVariable String name){
        return String.format("Welcom %s to our Springboot App.", name);
    }
    
}
