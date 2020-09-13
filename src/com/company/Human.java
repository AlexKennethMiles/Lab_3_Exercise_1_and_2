package com.company;

public class Human {
    public Human(){
        Head head = new Head();
        System.out.println("Intelligence is: " + head.getIntelligence());
        head.thinking();
        Leg legR = new Leg();
        System.out.println("Endurance of the right leg: " + legR.getEndurance());
        Leg legL = new Leg(241);
        System.out.println("Endurance of the left leg: " + legL.getEndurance());
        legL.walking();
        Hand handR = new Hand();
        System.out.println("The power of the right hand: " + handR.getPower());
        Hand handL = new Hand(209);
        System.out.println("The power of the left hand: " + handL.getPower());
        handR.press();
    }

}
