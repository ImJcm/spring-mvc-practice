package com.sparta.springmvc.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Star {
    String name;
    int age;

    /*public Star(String name, int age) {
        this.name = name;
        this.age = age;
    }*/
}
