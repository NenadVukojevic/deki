package com.bluebirch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluebirch.model.Panel;
import com.bluebirch.model.PanelModel;
import com.bluebirch.repository.PanelModelRepository;
import com.bluebirch.repository.PanelRepository;

@Service
public class IPanelService implements PanelService {
    
    @Autowired
    private PanelRepository panelRepository;

    @Autowired
    private PanelModelRepository panelModelRepository;

    @Override
    public List<Panel> getAllPanels() {
        // Implementation code to retrieve all panels
        return panelRepository.findAll(); // Placeholder return statement
    }

    @Override
    public List<PanelModel> getAllPanelModels() {
        // TODO Auto-generated method stub
        return panelModelRepository.findAll();
    }

    @Override
    public List<PanelModel> getPanelModelsByPanelId(Integer panelId) {
        // TODO Auto-generated method stub
        return panelModelRepository.findByPanelId(panelId);
    }

    
}
