package com.example.service;

import com.example.repo.WorldRepository;
import com.example.repo.model.World;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorldService {

    @Autowired
    private WorldRepository worldRepository;

    public List<World> findAll() {
        return worldRepository.findAll();
    }

    public void createWorld(World world) {
        worldRepository.save(world);
    }

    public void deleteWorld(Long id) {
        worldRepository.deleteById(id);
    }

    public World findWorldById(Long id) {
        return worldRepository.findById(id).get();
    }
}
