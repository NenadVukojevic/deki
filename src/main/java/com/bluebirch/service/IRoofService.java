package com.bluebirch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluebirch.model.Roof;
import com.bluebirch.repository.RoofRepository;

@Service
public class IRoofService implements RoofService {
    
    @Autowired
    private RoofRepository roofRepository;

    @Override
    public List<Roof> getAllRoofs() {
        return roofRepository.findAll();    
    }
}
