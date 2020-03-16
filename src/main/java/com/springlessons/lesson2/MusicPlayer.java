package com.springlessons.lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {
    private ClassicMusic classicMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicMusic classicMusic, RockMusic rockMusic) {
        this.classicMusic = classicMusic;
        this.rockMusic = rockMusic;
    }

    private String getSong(List<String> musicList) {
        int randomSong = (int) (Math.random() * 3);
        return musicList.get(randomSong);
    }

    public void playMusic(EnumClass enumObject) {
        List<String> musicList;
        if (enumObject.equals(EnumClass.CLASSICAL)) {
            musicList = classicMusic.getSong();
            System.out.println(getSong(musicList));
        } else {
            musicList = rockMusic.getSong();
            System.out.println(getSong(musicList));
        }
    }
}
