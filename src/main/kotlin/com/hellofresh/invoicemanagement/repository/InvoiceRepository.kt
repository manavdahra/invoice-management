package com.hellofresh.invoicemanagement.repository

import com.hellofresh.invoicemanagement.service.Invoice
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface InvoiceRepository : JpaRepository<Invoice, String>
