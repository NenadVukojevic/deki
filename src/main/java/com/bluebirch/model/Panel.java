package com.bluebirch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "panel_type")
public class Panel {
    @Id
    @Column(name = "panel_id")
    private Integer panelId;

    @Column(name = "panel_type_name")
    private String panelTypeName;

    public Panel() {
    }

    public Panel(Integer panelId, String panelTypeName) {
        this.panelId = panelId;
        this.panelTypeName = panelTypeName;
    }   

    public Integer getPanelId() {
        return panelId;
    }

    public void setPanelId(Integer panelId) {
        this.panelId = panelId;
    }

    public String getPanelTypeName() {
        return panelTypeName;   
    }

    public void setPanelTypeName(String panelTypeName) {
        this.panelTypeName = panelTypeName;
    }

}
