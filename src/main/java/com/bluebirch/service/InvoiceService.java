package com.bluebirch.service;

import java.util.List;

import com.bluebirch.model.Invoice;
import com.bluebirch.model.InvoiceElement;
import com.bluebirch.model.InvoiceStatus;

public interface InvoiceService {
    public List<InvoiceStatus> getAllInvoiceStatuses();
    public InvoiceStatus getInvoiceStatusById(Integer statusId);

    public InvoiceElement getInvoiceElementById(Integer elementId);    
    public InvoiceElement getInvoiceElementByInvoiceId(Integer invoiceId);


    public List<Invoice> getInvoicesByUserId(Integer userId);
    public Invoice getInvoiceById(Integer invoiceId);

    public Invoice createInvoice(Invoice invoice);
    public InvoiceElement saveElement(InvoiceElement existingElement);
}
