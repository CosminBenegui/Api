package com.example.service;

import com.example.repo.SimulateRepository;
import com.example.repo.model.Simulate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SimulateService {
    @Autowired
    private SimulateRepository simulateRepository;

    //Find all the logs
    public List<Simulate> findAll() {

        return simulateRepository.findAll();
    }
    //Create log with all the variables
    public void createScore(Simulate simulate) {
        simulateRepository.save(simulate);

    }
    //Delete log by
    public void deleteSimulate(Long id) {

        simulateRepository.deleteById(id);
    }
    //Find log by id
    public Simulate findSimulateById(Long id) {
        return simulateRepository.findById(id).get();
    }

    //THIS UPDATES THE SCORE BASED ON THE BOOLEAN VALUES DEAD & KILLEDTHEENEMY AND IF 1 TANK HAS KILLED THE ENEMY
    public Simulate updateScore(Simulate simulate) {
        Simulate battle = simulateRepository.findById(simulate.getId()).orElse(null);
//        battle.setTrack(simulate.getTrack());
//        battle.setObstacles(simulate.getObstacles());
//        battle.setDead(simulate.isDead());
//        battle.setKilledTheEnemy(simulate.isKilledTheEnemy());
//
//
//        //BUSINESS LOGIC FOR CHANGING THE SCORE based on the two states dead and killedTheEnemy
//        if (battle.isDead() == true) {
//            battle.setScore("0-1" + "You lost the Battle");
//            battle.setTankHealth(0);
//            battle.setTrack("Destroyed");
//            battle.setTurret("Damaged");
//        } else if (battle.isDead() == false) {
//            battle.setScore("0-0");
//            battle.setTankHealth(100);
//            battle.setTurret("Fire");
//        }
//        if (battle.isKilledTheEnemy() == true) {
//            battle.setScore("1-0" + " You won the Battle");
//            battle.setTrack("Stop");
//            battle.setTurret("Standby");
//        } else if (battle.isKilledTheEnemy() == false) {
//            battle.setScore("0-0");
//            battle.setTurret("Standby");
//            battle.setTrack("Moving to next location");
//        }
//
//        if(battle.getTanks().contains("20")){
//            battle.setTraversable(false);
//            battle.setMessage("You have reach an obstacle, change position");
//
//        }else if(battle.getTanks().contains("34"))
//            battle.setTraversable(false);{
//                battle.setMessage("You have reach an obstacle, change position");
//        }if(battle.getTanks().contains("12"))
//            battle.setTraversable(false);{
//            battle.setMessage("You have reach an obstacle, change position");
//        }


        battle.setGermanTank("German Tank");
        battle.setRussianTank("Russian Tank");
        battle.setGermanPosition(battle.getGermanPosition());
        battle.setRussianPosition(battle.getRussianPosition());
        battle.setMap(battle.getMap());
        battle.setGermanHealth(100);
        battle.setRussianHealth(100);
        battle.setTraversableForGerman(battle.isTraversableForGerman());
        battle.setTraversableForGerman(battle.isTraversableForRussian());
        battle.setMessage(battle.getMessage());
        battle.setObstacles(battle.getObstacles());
        
        if(battle.isGermanAlive() == false){
            battle.setScore("1-0");
            
        }else if(battle.isRussianAlive() == false ){
            battle.setScore("0-1");
        }else if(battle.isGermanAlive() == true){
            battle.setScore("0-0");
        }else if (battle.isRussianAlive() == true){
            battle.setScore("0-0");
        }


        if(battle.isKilledTheGerman() == true){
            battle.setMessage("Congrats u won the war glory g");
        }else if(battle.isKilledTheRussian() == true){
            battle.setMessage("congrats mother russia");
        }else if(battle.isKilledTheGerman() == false){
            battle.setMessage("The war continues c");
        }else if(battle.isKilledTheRussian() == false){
            battle.setMessage("The war continues comrade");
        }






        return simulateRepository.save(battle);
    }

    //This updates all variables created
    public Simulate updateAll(Simulate simulate) {
        Simulate existingSimulate = simulateRepository.findById(simulate.getId()).orElse(null);

//        existingSimulate.setId(simulate.getId());
//        existingSimulate.setTankName(simulate.getTankName());
//        existingSimulate.setScore(simulate.getScore());
//        existingSimulate.setMapId(simulate.getMapId());
//        existingSimulate.setTanks(simulate.getTanks());
//        existingSimulate.setDead(simulate.isDead());
//        existingSimulate.setTankHealth(simulate.getTankHealth());
//        existingSimulate.setTurret(simulate.getTurret());
//        existingSimulate.setTrack(simulate.getTrack());
//        existingSimulate.setObstacles(simulate.getObstacles());
//        existingSimulate.setKilledTheEnemy(simulate.isKilledTheEnemy());
//        existingSimulate.setMessage(simulate.getMessage());

        return simulateRepository.save(existingSimulate);
    }
}




