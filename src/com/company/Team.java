package com.company;

public class Team {
    private String name;
    private int numberOfPlayers;
    private String teamTalisman;
    private String country;
    private SportTypeEnum sportType;

    Team(String name, int numberOfPlayers, String teamTalisman, String country, SportTypeEnum sportType) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.teamTalisman = teamTalisman;
        this.country = country;
        this.sportType = sportType;
    }

    Team() {
        System.out.println("Creating new class of type" + this.getClass().getName());
    }

    public void singHymn() {
        System.out.println("Hymn sing tra la la la la");
    }

    public void singHymn(String country) {
        System.out.println(country + " Hymn sing tra la la la la");
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public String getTeamTalisman() {
        return teamTalisman;
    }

    public String getCountry() {
        return country;
    }

    public SportTypeEnum getSportType() {
        return sportType;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", teamTalisman='" + teamTalisman + '\'' +
                ", country='" + country + '\'' +
                ", sportType=" + sportType +
                '}';
    }
}
