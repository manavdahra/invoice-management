package com.hellofresh.invoicemanagement.controller

import com.hellofresh.invoicemanagement.service.Invoice
import com.hellofresh.invoicemanagement.service.InvoiceService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class InvoiceController(val invoiceService: InvoiceService) {

    @GetMapping("/invoices")
    fun getAllInvoices(): ResponseEntity<List<Invoice>> {
        val invoices = invoiceService.getAllInvoices()
        return ResponseEntity.ok(invoices)
    }

    @GetMapping("/invoices/customers/{customerId}")
    fun getInvoicesForCustomer(@PathVariable customerId: String): ResponseEntity<List<Invoice>> {
        val invoices = invoiceService.getInvoicesForCustomer(customerId)
        return ResponseEntity.ok(invoices)
    }

    @GetMapping("/invoices/{invoiceId}")
    fun getInvoice(@PathVariable invoiceId: String): ResponseEntity<Invoice> {
        val invoice = invoiceService.getInvoice(invoiceId)
        return ResponseEntity.ok(invoice)
    }
}
