package com.company;

public class Swimming extends Team {

    Swimming(String name, int numberOfPlayers, String teamTalisman, String country, SportTypeEnum sportType) {
        super(name, numberOfPlayers, teamTalisman, country, sportType);
    }

    Swimming() {
        System.out.println("Creating new class of type" + this.getClass().getName());
    }
    @Override
    public void singHymn(){
        System.out.println("Bla bla swimming");
    }

    @Override
    public void singHymn(String country){
        System.out.println(country + " Bla bla swimming");
    }
}
