package com.bluebirch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bluebirch.model.Roof;

@Repository
public interface RoofRepository extends JpaRepository<Roof, Integer>    {
    List<Roof> findAll();
}
