package com.example.repo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document
public class World {
    private Long id;
    private Integer[][] world;

    public World() {
    }

    public World(Long id, Integer[][] world) {
        this.id = id;
        this.world = world;
    }

    public World(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer[][] getWorld() {
        return world;
    }

    public void setWorld(Integer[][] world) {
        this.world = world;
    }






}
