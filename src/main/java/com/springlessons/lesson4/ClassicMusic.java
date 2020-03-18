package com.springlessons.lesson4;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicMusic implements Music {
    private List<String> classicMusicList = new ArrayList<String>();

    {
        classicMusicList.add("Moon sonata");
        classicMusicList.add("Requiem");
        classicMusicList.add("Mozart");
    }

    public List<String> getSong() {
        return classicMusicList;
    }
}
