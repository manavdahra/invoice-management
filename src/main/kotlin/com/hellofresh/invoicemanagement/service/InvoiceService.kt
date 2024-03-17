package com.hellofresh.invoicemanagement.service

import com.hellofresh.invoicemanagement.repository.InvoiceRepository
import org.springframework.stereotype.Service

@Service
class InvoiceService(val invoiceRepository: InvoiceRepository) {

    fun getAllInvoices(): List<Invoice> {
        return invoiceRepository.findAll()
    }

    fun getInvoicesForCustomer(customerId: String): List<Invoice> {
        return invoiceRepository.findAll().filter { it.customerId == customerId }
    }

    fun getInvoice(invoiceId: String): Invoice {
        return invoiceRepository.findById(invoiceId).orElseThrow { InvoiceNotFoundException(invoiceId) }
    }
}

class InvoiceNotFoundException(invoiceId: String) : RuntimeException("Invoice not found for id: $invoiceId")
