package com.demo.polymorph.example1;

public class BallMain {
    public static void main(String[] args) {
        Ball ball = new Ball(100);
        Ball basketball = new Basketball(200);
        Ball football = new Football(180);
        System.out.println(ball.toString());
        System.out.println(basketball.toString());
        System.out.println(football.toString());
        Football football1 = new Football(199);
        football1.doSomething();
    }


}
