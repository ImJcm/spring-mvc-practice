package com.sparta.springmvc.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Star {
    String name;
    int age;

    /*public Star(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Star() {}*/
}