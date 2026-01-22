package com.bluebirch.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "invoices")
public class Invoice {
    @Id
    @Column(name = "invoice_id")
    private Integer invoiceId;

    @Column(name = "create_date")
    private Date createDate;
    
    @Column(name = "user_id")    
    private Integer userId;
    
    @Column(name = "status")
    private Integer status;

    public Invoice() {
    }

    public Invoice(Integer invoiceId, Date createDate, Integer userId, Integer status) {
        this.invoiceId = invoiceId;
        this.createDate = createDate;
        this.userId = userId;
        this.status = status;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    public Integer getStatus() {
        return status;
    }   

    public void setStatus(Integer status) {
        this.status = status;
    }
}
