package com.bluebirch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder.In;

@Entity
@Table(name = "panel_models")
public class PanelModel {

    @Id
    @Column(name = "panel_model_id")
    private Integer panelModelId;

    @Column(name = "panel_type_power")
    private Integer panelTypePower;

    @Column(name = "panel_id")
    private Integer panelId;

    @Column(name = "panel_price")
    private Integer panelPrice;

    public PanelModel() {
    }
    
    public PanelModel(Integer panelModelId, Integer panelTypePower, Integer panelId, Integer panelPrice) {
        this.panelModelId = panelModelId;
        this.panelTypePower = panelTypePower;
        this.panelId = panelId;
        this.panelPrice = panelPrice;
    }

    public Integer getPanelModelId() {
        return panelModelId;
    }

    public void setPanelModelId(Integer panelModelId) {
        this.panelModelId = panelModelId;
    }


    public Integer getPanelTypePower() {
        return panelTypePower;
    }

    public void setPanelTypePower(Integer panelTypePower) {
        this.panelTypePower = panelTypePower;
    }

    public Integer getPanelId() {
        return panelId;
    }

    public void setPanelId(Integer panelId) {
        this.panelId = panelId;
    }   

    public Integer getPanelPrice() {
        return panelPrice;
    }

    public void setPanelPrice(Integer panelPrice) {
        this.panelPrice = panelPrice;
    }   
    
}
