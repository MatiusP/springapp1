package com.springlessons.lesson5;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicMusic implements Music {

    @PostConstruct
    public void initMethod() {
        System.out.println("Initialization...");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("Destroying...");
    }

    public String getSong() {
        return "Mozart";
    }
}
