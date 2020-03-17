package com.springlessons.lesson3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
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
