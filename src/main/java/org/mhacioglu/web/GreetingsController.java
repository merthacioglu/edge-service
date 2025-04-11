package org.mhacioglu.web;

import org.mhacioglu.config.Properties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    private final Properties properties;

    public GreetingsController(Properties properties) {
        this.properties = properties;
    }

    @GetMapping("greetings")
    public String getGreeting() {
        return properties.getGreeting();
    }
}
