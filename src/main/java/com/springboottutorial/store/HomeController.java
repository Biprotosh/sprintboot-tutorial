package com.springboottutorial.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // we are telling spring that this class should be used as a web controller for receiving web traffic
public class HomeController {

    /**
     * To send a request to root of our website we want this index() method to be called
     * using the annotation we send a request to root of out website
     * to send a request to a different endpoint we can write something like this @RequestMapping("/about")
     */
    @RequestMapping("/")
    public String index(){
        return "index.html"; // returning the view we want to show to our website
    }
}
