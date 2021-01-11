package com.demo.inheritance.example2;

//base/super/parent
public class Singer {
    //private kintamieji nebus paveldeti vaiku
    protected int yearsExperience = 5;

    //protected member ( k )pasiekiamas visos klasese
    // tame paciame package ir visose vaikinese klasese
    // kituose package
    protected void singCommonSong() {
        System.out.println("Singing popular song.");
    }
}
