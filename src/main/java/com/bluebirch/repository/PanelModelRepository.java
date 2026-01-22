package com.bluebirch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bluebirch.model.PanelModel;

@Repository
public interface PanelModelRepository extends JpaRepository<PanelModel, Integer>{

    List<PanelModel> findAll();
    
    List<PanelModel> findByPanelId(Integer panelId);
}
