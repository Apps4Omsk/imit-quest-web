package ru.apps4omsk.imitquest.web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ilya on 16.11.14.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }
}
