package com.example.testtask.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Entity
@Table(name = "players")
public class Player {
    public Player(int id, String DISPLAY_FIRST_LAST, String DISPLAY_LAST_COMMA_FIRST, int FROM_YEAR, char GAMES_PLAYED_FLAG,
                  int OTHERLEAGUE_EXPERIENCE_CH, int PERSON_ID, String PLAYERCODE, int ROSTERSTATUS, String TEAB_ABBREVIATION,
                  String TEAM_CITY, String TEAM_CODE, int TEAM_ID, String TEAM_NAME, int TO_YEAR) {
        this.id = id;
        this.DISPLAY_FIRST_LAST = DISPLAY_FIRST_LAST;
        this.DISPLAY_LAST_COMMA_FIRST = DISPLAY_LAST_COMMA_FIRST;
        this.FROM_YEAR = FROM_YEAR;
        this.GAMES_PLAYED_FLAG = GAMES_PLAYED_FLAG;
        this.OTHERLEAGUE_EXPERIENCE_CH = OTHERLEAGUE_EXPERIENCE_CH;
        this.PERSON_ID = PERSON_ID;
        this.PLAYERCODE = PLAYERCODE;
        this.ROSTERSTATUS = ROSTERSTATUS;
        this.TEAB_ABBREVIATION = TEAB_ABBREVIATION;
        this.TEAM_CITY = TEAM_CITY;
        this.TEAM_CODE = TEAM_CODE;
        this.TEAM_ID = TEAM_ID;
        this.TEAM_NAME = TEAM_NAME;
        this.TO_YEAR = TO_YEAR;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "DISPLAY_FIRST_LAST")
    private String DISPLAY_FIRST_LAST;

    @Column(name = "DISPLAY_LAST_COMMA_FIRST")
    private String DISPLAY_LAST_COMMA_FIRST;

    @Column(name = "FROM_YEAR")
    private int FROM_YEAR;

    @Column(name = "GAMES_PLAYED_FLAG")
    private char GAMES_PLAYED_FLAG;

    @Column(name = "OTHERLEAGUE_EXPERIENCE_CH")
    private int OTHERLEAGUE_EXPERIENCE_CH;

    @Column(name = "PERSON_ID")
    private int PERSON_ID;

    @Column(name = "PLAYERCODE")
    private String PLAYERCODE;

    @Column(name = "ROSTERSTATUS")
    private int ROSTERSTATUS;

    @Column(name = "TEAB_ABBREVIATION")
    private String TEAB_ABBREVIATION;

    @Column(name = "TEAM_CITY")
    private String TEAM_CITY;

    @Column(name = "TEAM_CODE")
    private String TEAM_CODE;

    @Column(name = "TEAM_ID")
    private int TEAM_ID;

    @Column(name = "TEAM_NAME")
    private String TEAM_NAME;

    @Column(name = "TO_YEAR")
    private int TO_YEAR;


    public Player() {

    }
}
