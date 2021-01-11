package com.demo.inheritance.example2;

public class SingerMain {

    public static void main(String[] args) {
        Singer singer = new Singer();
        System.out.println(singer.yearsExperience);
        singer.singCommonSong();
        //singer.smile(); parent can't do child behavior

        Radzi radzi = new Radzi();
        //paveldi patirti ir galimybe dainuoti
        System.out.println(radzi.yearsExperience);
        radzi.singCommonSong();
        //turi galimybe dainuoti unikaliai kaip radzi
        radzi.singLikeRadzi();

        Cicinas cicinas = new Cicinas();
        System.out.println(cicinas.yearsExperience);
        cicinas.singCommonSong();
        cicinas.beSad();
        System.out.println(cicinas.isSmiling());
        cicinas.smile();
        System.out.println(cicinas.isSmiling());

    }
}
