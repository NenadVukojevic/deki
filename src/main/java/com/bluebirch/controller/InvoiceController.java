package com.bluebirch.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluebirch.model.Invoice;
import com.bluebirch.model.InvoiceElement;
import com.bluebirch.model.InvoiceStatus;
import com.bluebirch.service.InvoiceService;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @GetMapping("/statuses")
    public ResponseEntity<List<InvoiceStatus>> getAllInvoiceStatuses() {
        List<InvoiceStatus> statuses = invoiceService.getAllInvoiceStatuses();
        return new ResponseEntity<List<InvoiceStatus>>(statuses, HttpStatus.OK);
    }

    @GetMapping("/{id}/user-invoices")
    public ResponseEntity<List<Invoice>> getUserInvoices(@PathVariable Integer id) {
        List<Invoice> invoices = invoiceService.getInvoicesByUserId(id);
        return new ResponseEntity<List<Invoice>>(invoices, HttpStatus.OK);
    }   

    @GetMapping("/{id}")
    public ResponseEntity<Invoice> getInvoiceById(@PathVariable Integer id) {
        Invoice invoice = invoiceService.getInvoiceById(id);
        return new ResponseEntity<Invoice>(invoice, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<Invoice> createInvoice(@RequestBody Invoice invoice) {
        Invoice createdInvoice = invoiceService.createInvoice(invoice);
        return new ResponseEntity<Invoice>(createdInvoice, HttpStatus.CREATED);
    }
    
    @PostMapping("/elements/{id}")
    public ResponseEntity<InvoiceElement> populateInvoiceElement(@RequestBody InvoiceElement element, @PathVariable Integer id) {
        InvoiceElement existingElement = invoiceService.getInvoiceElementByInvoiceId(id);

        if(existingElement == null) {
            existingElement = new InvoiceElement();
        }
        else
        {
            existingElement.setInvoiceId(id);
            existingElement.setElementId(0); // Reset ID to create new entry
        }
        existingElement.setInvertorId(element.getInvertorId());
        existingElement.setInvertorModel(element.getInvertorModel());
        existingElement.setInvertorCount(element.getInvertorCount());
        existingElement.setPanelModel(element.getPanelModel());
        existingElement.setPanelType(element.getPanelType());
        existingElement.setPanelCount(element.getPanelCount());
        existingElement.setRoofType(element.getRoofType());
        existingElement.setPdvBase(element.getPdvBase());     

        InvoiceElement savedElement = invoiceService.saveElement(existingElement);

        return new ResponseEntity<InvoiceElement>(savedElement, HttpStatus.OK);
    }
}
