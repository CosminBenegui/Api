package com.example.controller;

import com.example.repo.model.Simulate;
import com.example.service.SimulateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //declaring SimulateController as the REST controller
@RequestMapping(path = "api/vi/simulateScore")
public class SimulateController {
    private final SimulateService simulateService;


    @Autowired //telling SimulateService should be autowired for simulateService
    public SimulateController(SimulateService simulateService) {

        this.simulateService = simulateService;
    }

    @PostMapping(value = "score_id", produces = MediaType.APPLICATION_JSON_VALUE)
    public void createScore(@RequestBody Simulate simulate) {
        simulateService.createScore(simulate);
    }


    @DeleteMapping(value = "deleteSimulate/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteSimulate(@PathVariable Long id) {
        simulateService.deleteSimulate(id);
    }

    @GetMapping(value = "simulateFindAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Simulate> findSimulate() {
        return simulateService.findAll();

    }

    @GetMapping(value = "simulateFindById{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Simulate findSimulateById(Long id) {
        return simulateService.findSimulateById(id);

    }

    @PutMapping(value = "updateSimulateScore", produces = MediaType.APPLICATION_JSON_VALUE)
    public Simulate updateScore(@RequestBody Simulate simulate) {
        return simulateService.updateScore(simulate);
    }

    @PutMapping(value = "updateAllVariablesForTesting", produces = MediaType.APPLICATION_JSON_VALUE)
    public Simulate updateAllVariables(@RequestBody Simulate simulate) {
        return simulateService.updateAll(simulate);
    }
}
