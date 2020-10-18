package com.company;

public class Football extends Team {
    Football(String name, int numberOfPlayers, String teamTalisman, String country, SportTypeEnum sportType) {
        super(name, numberOfPlayers, teamTalisman, country, sportType);
    }

    Football() {
        System.out.println("Creating new class of type" + this.getClass().getName());
    }

    @Override
    public void singHymn(){
        System.out.println("Bla bla football");
    }

    @Override
    public void singHymn(String country){
        System.out.println(country + " Bla bla football");
    }

}
