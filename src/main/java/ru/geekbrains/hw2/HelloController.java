package ru.geekbrains.hw2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    Speaker speaker;

    @GetMapping("/speaker")
    public String speak(){
        speaker.speak();
        return speaker.getSpeech();
    }
}
