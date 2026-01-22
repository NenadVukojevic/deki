package com.bluebirch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluebirch.model.Invoice;
import com.bluebirch.model.InvoiceElement;
import com.bluebirch.model.InvoiceStatus;
import com.bluebirch.repository.InvoiceElementRepository;
import com.bluebirch.repository.InvoiceRepository;
import com.bluebirch.repository.InvoiceStatusRepository;

@Service
public class IInvoiceService implements InvoiceService {

    @Autowired
    private InvoiceStatusRepository invoiceStatusRepository;

    @Autowired
    private InvoiceElementRepository invoiceElementRepository;  

    @Autowired
    private InvoiceRepository invoiceRepository;


    @Override
    public List<InvoiceStatus> getAllInvoiceStatuses() {
        return invoiceStatusRepository.findAll();
    }
    
    @Override
    public InvoiceStatus getInvoiceStatusById(Integer statusId) {
        return invoiceStatusRepository.findByStatusId(statusId);
    }   

    @Override
    public InvoiceElement getInvoiceElementById(Integer elementId) {    
        return invoiceElementRepository.findByElementId(elementId);
    }   
    
    @Override
    public List<Invoice> getInvoicesByUserId(Integer userId) {
        return invoiceRepository.findByUserId(userId);
    }

    @Override
    public Invoice getInvoiceById(Integer invoiceId) {
        return invoiceRepository.findByInvoiceId(invoiceId);
    }

    @Override
    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public InvoiceElement saveElement(InvoiceElement existingElement) {
        return invoiceElementRepository.save(existingElement);
    }
    
    @Override
    public InvoiceElement getInvoiceElementByInvoiceId(Integer invoiceId) {
        return invoiceElementRepository.findByInvoiceId(invoiceId).stream().findFirst().orElse(null);
    }
}
