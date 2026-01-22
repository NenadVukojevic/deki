package com.bluebirch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bluebirch.model.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

    Invoice findByInvoiceId(Integer invoiceId);
    List<Invoice> findByUserId(Integer userId);

}
