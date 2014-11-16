package ru.apps4omsk.imitquest.web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.apps4omsk.imitquest.web.response.Greeting;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ilya on 16.11.14.
 */
@RestController
public class HomeController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public @ResponseBody
    Greeting index() {
        return new Greeting(counter.incrementAndGet(), "Hello");
    }
}
