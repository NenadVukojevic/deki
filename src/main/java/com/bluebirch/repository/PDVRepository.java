package com.bluebirch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bluebirch.model.PDV;

public interface PDVRepository extends JpaRepository<PDV, Integer>   {

    List<PDV> findAll();
    
}
