package com.springlessons.lesson1;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music {
    public String getSong() {
        return "Moons sonata";
    }
}
