package com.bluebirch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluebirch.repository.PDVRepository;
import com.bluebirch.model.PDV;
import java.util.List;

@Service
public class IPDVService implements PDVService {
    
    @Autowired
    private PDVRepository pdvRepository;
    
    @Override
    public List<PDV> getAllPDVs() {
        return pdvRepository.findAll(); 
    }
}
