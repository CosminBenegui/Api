package com.example.controller;

import com.example.repo.model.Tank;
import com.example.service.TankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/tank")
public class TankController {

    private final TankService tankService;

    @Autowired //telling TankService should be autowired for tankService
    public TankController(TankService tankService) {

        this.tankService = tankService;
    }

    @PostMapping(value = "createTank", produces = MediaType.APPLICATION_JSON_VALUE)
    public void createTank(@RequestBody Tank tank) {

        tankService.createTank(tank);
    }



    @DeleteMapping(value = "deleteTankById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteTank(@PathVariable Long id) {
        tankService.deleteTank(id);
    }

    @GetMapping(value = "tanks", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Tank> findTanks() {
        return tankService.findAll();

    }

    @GetMapping(value = "tank{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Tank findTankById(Long id) {
        return tankService.findTankById(id);

    }
    @PutMapping(value = "updateTank", produces = MediaType.APPLICATION_JSON_VALUE)
    public Tank updateTank(@RequestBody Tank tank) {
        return tankService.updateTank(tank);
    }
}

