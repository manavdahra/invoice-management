package com.hellofresh.invoicemanagement.service

import jakarta.persistence.*

enum class InvoiceStatus {
    PAID, PENDING, OVERDUE
}

@Entity
@Table(name = "invoice")
class Invoice(
    @Id val id: String,
    val customerId: String,
    val invoiceDate: String,
    val dueDate: String,
    @Enumerated(EnumType.STRING)
    val status: InvoiceStatus,
    @OneToMany(mappedBy = "invoiceId")
    val invoiceItems: List<InvoiceItem>
)

@Entity
@Table(name = "invoice_item")
class InvoiceItem(
    @Id val id: String,
    val invoiceId: String,
    val description: String,
    val quantity: Int,
    val unitPrice: Double,
)
