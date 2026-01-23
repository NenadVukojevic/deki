package com.bluebirch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bluebirch.model.Panel;

@Repository
public interface PanelRepository extends JpaRepository <Panel, Integer> {
    
    List<Panel> findAll();

}
