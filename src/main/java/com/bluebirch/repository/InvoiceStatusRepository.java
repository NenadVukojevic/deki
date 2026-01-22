package com.bluebirch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bluebirch.model.InvoiceStatus;

@Repository
public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer> {

    List<InvoiceStatus> findAll();
    InvoiceStatus findByStatusId(Integer statusId);

}
