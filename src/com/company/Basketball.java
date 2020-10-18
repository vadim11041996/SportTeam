package com.company;

public class Basketball extends Team {
    public Basketball(String name, int numberOfPlayers, String teamTalisman, String country, SportTypeEnum sportType) {
        super(name, numberOfPlayers, teamTalisman, country, sportType);
    }

    Basketball(){
        System.out.println("Default constructor");
    }

    @Override
    public void singHymn(){
        System.out.println("Bla bla basketball");
    }

    @Override
    public void singHymn(String country){
        System.out.println(country + " Bla bla basketball");
    }

}
