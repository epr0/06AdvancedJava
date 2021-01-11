package com.demo.inheritance.example2;

public class Cicinas extends Singer {

    private boolean isSmiling = true;

    public void singLikeCicinas(){

    }

    public boolean isSmiling() {
        return isSmiling;
    }

    public void smile(){
        isSmiling = true;
    }

    public void beSad() {
        isSmiling = false;
        //isSmiling = true; :)
    }
}
