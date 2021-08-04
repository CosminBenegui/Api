package com.example.controller;

import com.example.repo.model.World;
import com.example.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//Declaring World Controller as a RestController
@RequestMapping(path = "api/v1/world")
public class WorldController {

    private final WorldService worldService;

    @Autowired
    public WorldController(WorldService worldService) {
        this.worldService = worldService;
    }

    @PostMapping(value = "/createWorld", produces = MediaType.APPLICATION_JSON_VALUE)
    public void createWorld(@RequestBody World world) {
        worldService.createWorld(world);
    }

    @DeleteMapping(value = "/deleteWorldById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteWorld(@PathVariable Long id) {
        worldService.deleteWorld(id);
    }

    @GetMapping(value = "/worlds", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<World> findWorld() {
        return worldService.findAll();
    }

    @GetMapping(value = "/world{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public World findWorldById(Long id) {
        return worldService.findWorldById(id);
    }

}

