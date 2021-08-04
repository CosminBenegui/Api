package com.example.service;

import com.example.repo.model.Tank;
import com.example.repo.TankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service //dependency injection, instantiated with @Service
public class TankService {

    @Autowired
    private TankRepository tankRepository;

    public List<Tank> findAll() {return tankRepository.findAll();}

    public void createTank(Tank tank) {
        tankRepository.save(tank);
    }

    public void deleteTank(Long id) {
        tankRepository.deleteById(id);
    }

    public Tank findTankById(Long id) {
        return tankRepository.findById(id).get();
    }

    public Tank updateTank(Tank tank) {
        Tank battle = tankRepository.findById(tank.getId()).orElse(null);

        battle.setScore(battle.getScore());
        battle.setGermanAlive(battle.isGermanAlive());
        battle.setRussianAlive(battle.isRussianAlive());
        battle.setRussianTank(battle.getRussianTank());
        battle.setGermanTank(battle.getGermanTank());
        battle.setGermanPosition(battle.getGermanPosition());
        battle.setRussianposition(battle.getRussianposition());
        battle.setMap(battle.getMap());
        battle.setGermanHealth(battle.getGermanHealth());
        battle.setRussianHealth(battle.getRussianHealth());
        battle.setKilledTheGerman(battle.isKilledTheGerman());
        battle.setKilledTheRussian(battle.isKilledTheRussian());
        battle.setTraversableForGerman(battle.isTraversableForGerman());
        battle.setMessage(battle.getMessage());
        battle.setObstacles(tank.getObstacles());






        return tankRepository.save(battle);
    }
}












