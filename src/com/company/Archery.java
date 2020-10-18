package com.company;

public class Archery extends Team {

    Archery(String name, int numberOfPlayers, String teamTalisman, String country, SportTypeEnum sportType) {
        super(name, numberOfPlayers, teamTalisman, country, sportType);
    }

    Archery() {
        System.out.println("Creating new class of type" + this.getClass().getName());
    }

    @Override
    public void singHymn(){
        System.out.println("Bla bla archery");
    }

    @Override
    public void singHymn(String country){
        System.out.println(country + " Bla bla archery");
    }
}
