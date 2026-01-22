package com.bluebirch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bluebirch.model.InvoiceElement;

@Repository
public interface InvoiceElementRepository extends JpaRepository<InvoiceElement, Integer> {

    InvoiceElement findByElementId(Integer elementId);
    List<InvoiceElement> findByInvoiceId(Integer invoiceId);

}
