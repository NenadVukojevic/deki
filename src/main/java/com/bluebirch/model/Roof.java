package com.bluebirch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roof_types")
public class Roof {

    @Id
    @Column(name = "roof_id")
    private Integer roofId;

    @Column(name = "roof_type_name")    
    private String roofTypeName;

    @Column(name = "roof_price")    
    private Integer roofPrice;    

    public Roof() {

    }

    public Roof(Integer roofId, String roofTypeName, Integer roofPrice) {
        this.roofId = roofId;
        this.roofTypeName = roofTypeName;
        this.roofPrice = roofPrice;
    }

    public Integer getRoofId() {
        return roofId;
    }   

    public void setRoofId(Integer roofId) {
        this.roofId = roofId;
    }   

    public String getRoofTypeName() {
        return roofTypeName;
    }   

    public void setRoofTypeName(String roofTypeName) {
        this.roofTypeName = roofTypeName;
    }   


    public Integer getRoofPrice() {
        return roofPrice;    
    }

    public void setRoofPrice(Integer roofPrice) {
        this.roofPrice = roofPrice;
    }   

}
