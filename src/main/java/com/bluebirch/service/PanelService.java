package com.bluebirch.service;

import java.util.List;

import com.bluebirch.model.Panel;
import com.bluebirch.model.PanelModel;

public interface PanelService {

    List<Panel> getAllPanels();

    List<PanelModel> getAllPanelModels();
    
    List<PanelModel> getPanelModelsByPanelId(Integer panelId);
} 