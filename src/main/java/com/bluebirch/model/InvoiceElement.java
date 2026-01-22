package com.bluebirch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "invoice_elements")
public class InvoiceElement {

    @Id
    @Column(name = "element_id")    
    public Integer elementId;

    @Column(name = "invoice_id")
    public Integer invoiceId;
    
    @Column(name = "invertor_id")
    public Integer invertorId;
    
    @Column(name = "invertor_model")
    public Integer invertorModel;
    
    @Column(name = "invertor_count")
    public Integer invertorCount;
    
    @Column(name = "panel_type")
    public Integer panelType;
    
    @Column(name = "panel_model")
    public Integer panelModel;

    @Column(name = "panel_count")
    public Integer panelCount;
    
    @Column(name = "pdv_base")
    public Integer pdvBase;

    @Column(name = "roof_type")
    public Integer roofType;

    public InvoiceElement() {
    }

    public InvoiceElement(Integer elementId, Integer invoiceId, Integer invertorId, Integer invertorModel,
            Integer invertorCount, Integer panelType, Integer panelModel, Integer panelCount, Integer pdvBase,
            Integer roofType) {
        this.elementId = elementId;
        this.invoiceId = invoiceId;
        this.invertorId = invertorId;
        this.invertorModel = invertorModel;
        this.invertorCount = invertorCount;
        this.panelType = panelType;
        this.panelModel = panelModel;
        this.panelCount = panelCount;
        this.pdvBase = pdvBase;
        this.roofType = roofType;
    }

    public Integer getElementId() {
        return elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getInvertorId() {
        return invertorId;
    }

    public void setInvertorId(Integer invertorId) {
        this.invertorId = invertorId;
    }

    public Integer getInvertorModel() {
        return invertorModel;
    }

    public void setInvertorModel(Integer invertorModel) {
        this.invertorModel = invertorModel;
    }

    public Integer getInvertorCount() {
        return invertorCount;
    }

    public void setInvertorCount(Integer invertorCount) {
        this.invertorCount = invertorCount;
    }

    public Integer getPanelType() {
        return panelType;
    }

    public void setPanelType(Integer panelType) {
        this.panelType = panelType;
    }

    public Integer getPanelModel() {
        return panelModel;
    }

    public void setPanelModel(Integer panelModel) {
        this.panelModel = panelModel;
    }

    public Integer getPanelCount() {
        return panelCount;
    }

    public void setPanelCount(Integer panelCount) {
        this.panelCount = panelCount;
    }

    public Integer getPdvBase() {
        return pdvBase;
    }

    public void setPdvBase(Integer pdvBase) {
        this.pdvBase = pdvBase;
    }

    public Integer getRoofType() {
        return roofType;
    }

    public void setRoofType(Integer roofType) {
        this.roofType = roofType;
    }

        
}
