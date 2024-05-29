package ru.geekbrains.hw2;

import org.springframework.stereotype.Component;

@Component
public class Speaker {
    private String speech = "Hello, user";

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public void speak(){
        System.out.println(speech);
    }

}
