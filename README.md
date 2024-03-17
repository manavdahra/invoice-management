## Endpoints

Server is running on `http://localhost:8080`

Get invoices
- GET /api/invoices

Get invoice by id
- GET /api/invoices/1

Get invoices by customer id
- GET /api/customers/1/invoices


### Use cases
1. Given the customer id, add customer details in invoice 
   1. First name / Last name  
   2. Address
   3. Add tests for this use case

   Assume customer details are available at following endpoint:
    - GET http://customer-service/api/customers/1

2. Add total amount in invoice
   1. Total amount = sum of all line items in invoice
   2. Add tests for this use case

3. Add cancel invoice functionality
   1. Cancel invoice by id
   2. Add tests for this use case