package com.dockerforjavadevelopers.hello;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String index() {
        return "Hello World\n";
    }
    
}
