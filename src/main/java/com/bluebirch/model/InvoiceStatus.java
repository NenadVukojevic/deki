package com.bluebirch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "invoice_status")
public class InvoiceStatus {

    @Id
    @Column(name = "status_id")
    private Integer statusId;

    @Column(name = "status_name")
    private String statusName;  

    public InvoiceStatus() {
    }

    public InvoiceStatus(Integer statusId, String statusName) {
        this.statusId = statusId;
        this.statusName = statusName;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return statusName;
    }
    
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

}
