package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setName("Leader");
        boss.setPower(900);
        System.out.println(boss.getName() + " " + boss.getPower());

        Warrier warrier = new Warrier();
        warrier.setName("Alone");
        warrier.setPower(1500);
        System.out.println(warrier.getName() + " " + warrier.getPower());

        Magical magical = new Magical();
        magical.setName("Magician");
        magical.setSuperAbillity("Healing");
        System.out.println(magical.getName() + " " + magical.getSuperAbillity());

        Mental mental = new Mental();
        mental.setName("Creator");
        mental.setCreate("Poison");
        System.out.println(mental.getName() + "  " + mental.getCreate());






    }
}
