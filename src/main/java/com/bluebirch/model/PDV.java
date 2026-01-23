package com.bluebirch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pdv_base")
public class PDV {
    
    @Id
    @Column(name = "id")    
    private Integer id;

    @Column(name = "pdv_name")
    private String pdvName;

    @Column(name = "pdv_price")
    private float pdvPrice;

    public PDV() {
        
    }

    public PDV(Integer id, String pdvName, float pdvPrice) {
        this.id = id;
        this.pdvName = pdvName;
        this.pdvPrice = pdvPrice;
    }

    public Integer getId() {
        return id;
    }   
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getPdvName() {
        return pdvName;
    }
    
    public void setPdvName(String pdvName) {
        this.pdvName = pdvName;
    }
    
    public float getPdvPrice() {
        return pdvPrice;    
    }
    
    public void setPdvPrice(float pdvPrice) {
        this.pdvPrice = pdvPrice;
    }



}
