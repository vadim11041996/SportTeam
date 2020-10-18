package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Football football = new Football("Test", 20, "talismanTest", "Test", SportTypeEnum.FOOTBALL);
        football.singHymn();
        football.singHymn(football.getName());

        List<Team> teams = new ArrayList<>();
        teams.add(new Football("MU", 20, "talisman", "UK", SportTypeEnum.FOOTBALL));
        teams.add(new Basketball("USA", 10, "talisman2", "USA", SportTypeEnum.BASKETBALL));
        teams.add(new Swimming("Steaua", 5, "talisman3", "RO", SportTypeEnum.SWIMMING));
        teams.add(new Football("Chelsea", 20, "talisman4", "UK", SportTypeEnum.FOOTBALL));
        teams.add(new Archery("AC", 4, "talisman5", "DE", SportTypeEnum.ARCHERY));


        System.out.println(filteredFootballTeams(teams));
        System.out.println(filteredBasketballTeams(teams));
        System.out.println(filteredOtherTeamsThanFootballAndBasketball(teams));

        Football football1 = new Football();

    }

    public static List<Team> filteredFootballTeams(List<Team> teams) {
        return teams.stream()
                .filter(team -> SportTypeEnum.FOOTBALL.equals(team.getSportType()))
                .collect(Collectors.toList());
    }

    public static List<Team> filteredBasketballTeams(List<Team> teams) {
        return teams.stream()
                .filter(team -> SportTypeEnum.BASKETBALL.equals(team.getSportType()))
                .collect(Collectors.toList());
    }

    public static List<Team> filteredOtherTeamsThanFootballAndBasketball(List<Team> teams) {
        return teams.stream()
                .filter(team -> !SportTypeEnum.BASKETBALL.equals(team.getSportType()) && !SportTypeEnum.FOOTBALL.equals(team.getSportType()))
                .collect(Collectors.toList());
    }
}
