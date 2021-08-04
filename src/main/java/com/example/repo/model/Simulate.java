package com.example.repo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document
public class Simulate {
    private Long id;
    private String score;
    private boolean germanAlive;
    private boolean russianAlive;
    private String russianTank;
    private String germanTank;
    private int[] germanPosition;
    private int[] russianPosition;
    private int[] map;
    private int germanHealth;
    private int russianHealth;
    private boolean killedTheGerman;
    private boolean killedTheRussian;
    private boolean traversableForGerman;
    private boolean traversableForRussian;
    private String message;
    private int[] obstacles;


//Contructor with all the variables

    public Simulate(Long id, String score, boolean germanAlive, boolean russianAlive, String russianTank, String germanTank, int[] germanPosition, int[] russianPosition, int[] map, int germanHealth, int russianHealth, boolean killedTheGerman, boolean killedTheRussian, boolean traversableForGerman, boolean traversableForRussian, String message, int[] obstacles) {
        this.id = id;
        this.score = score;
        this.germanAlive = germanAlive;
        this.russianAlive = russianAlive;
        this.russianTank = russianTank;
        this.germanTank = germanTank;
        this.germanPosition = germanPosition;
        this.russianPosition = russianPosition;
        this.map = map;
        this.germanHealth = germanHealth;
        this.russianHealth = russianHealth;
        this.killedTheGerman = killedTheGerman;
        this.killedTheRussian = killedTheRussian;
        this.traversableForGerman = traversableForGerman;
        this.traversableForRussian = traversableForRussian;
        this.message = message;
        this.obstacles = obstacles;
    }


    //Constructor without id in case we need mongodb to generate an objectid for us

    public Simulate(String score, boolean germanAlive, boolean russianAlive, String russianTank, String germanTank, int[] germanPosition, int[] russianPosition, int[] map, int germanHealth, int russianHealth, boolean killedTheGerman, boolean killedTheRussian, boolean traversableForGerman, boolean traversableForRussian, String message, int[] obstacles) {
        this.score = score;
        this.germanAlive = germanAlive;
        this.russianAlive = russianAlive;
        this.russianTank = russianTank;
        this.germanTank = germanTank;
        this.germanPosition = germanPosition;
        this.russianPosition = russianPosition;
        this.map = map;
        this.germanHealth = germanHealth;
        this.russianHealth = russianHealth;
        this.killedTheGerman = killedTheGerman;
        this.killedTheRussian = killedTheRussian;
        this.traversableForGerman = traversableForGerman;
        this.traversableForRussian = traversableForRussian;
        this.message = message;
        this.obstacles = obstacles;
    }
    public Simulate() {

    }


//Getters and Setters in order to update the log


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public boolean isGermanAlive() {
        return germanAlive;
    }

    public void setGermanAlive(boolean germanAlive) {
        this.germanAlive = germanAlive;
    }

    public boolean isRussianAlive() {
        return russianAlive;
    }

    public void setRussianAlive(boolean russianAlive) {
        this.russianAlive = russianAlive;
    }

    public String getRussianTank() {
        return russianTank;
    }

    public void setRussianTank(String russianTank) {
        this.russianTank = russianTank;
    }

    public String getGermanTank() {
        return germanTank;
    }

    public void setGermanTank(String germanTank) {
        this.germanTank = germanTank;
    }

    public int[] getGermanPosition() {
        return germanPosition;
    }

    public void setGermanPosition(int[] germanPosition) {
        this.germanPosition = germanPosition;
    }

    public int[] getRussianPosition() {
        return russianPosition;
    }

    public void setRussianPosition(int[] russianPosition) {
        this.russianPosition = russianPosition;
    }

    public int[] getMap() {
        return map;
    }

    public void setMap(int[] map) {
        this.map = map;
    }

    public int getGermanHealth() {
        return germanHealth;
    }

    public void setGermanHealth(int germanHealth) {
        this.germanHealth = germanHealth;
    }

    public int getRussianHealth() {
        return russianHealth;
    }

    public void setRussianHealth(int russianHealth) {
        this.russianHealth = russianHealth;
    }

    public boolean isKilledTheGerman() {
        return killedTheGerman;
    }

    public void setKilledTheGerman(boolean killedTheGerman) {
        this.killedTheGerman = killedTheGerman;
    }

    public boolean isKilledTheRussian() {
        return killedTheRussian;
    }

    public void setKilledTheRussian(boolean killedTheRussian) {
        this.killedTheRussian = killedTheRussian;
    }

    public boolean isTraversableForGerman() {
        return traversableForGerman;
    }

    public void setTraversableForGerman(boolean traversableForGerman) {
        this.traversableForGerman = traversableForGerman;
    }

    public boolean isTraversableForRussian() {
        return traversableForRussian;
    }

    public void setTraversableForRussian(boolean traversableForRussian) {
        this.traversableForRussian = traversableForRussian;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int[] getObstacles() {
        return obstacles;
    }

    public void setObstacles(int[] obstacles) {
        this.obstacles = obstacles;
    }

    @Override
    public String toString() {
        return "Simulate{" +
                "id=" + id +
                ", score='" + score + '\'' +
                ", germanAlive=" + germanAlive +
                ", russianAlive=" + russianAlive +
                ", russianTank='" + russianTank + '\'' +
                ", germanTank='" + germanTank + '\'' +
                ", germanPosition=" + Arrays.toString(germanPosition) +
                ", russianposition=" + Arrays.toString(russianPosition) +
                ", map=" + Arrays.toString(map) +
                ", germanHealth=" + germanHealth +
                ", russianHealth=" + russianHealth +
                ", killedTheGerman=" + killedTheGerman +
                ", killedTheRussian=" + killedTheRussian +
                ", traversableForGerman=" + traversableForGerman +
                ", traversableForRussian=" + traversableForRussian +
                ", message='" + message + '\'' +
                ", obstacles=" + Arrays.toString(obstacles) +
                '}';
    }


}
