package com.springlessons.lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    String playMusic() {
        return "Now playing: " + music1.getSong() + ", " + music2.getSong();
//        System.out.println("Now playing: " + rockMusic.getSong());

    }

}