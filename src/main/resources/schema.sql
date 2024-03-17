CREATE TABLE IF NOT EXISTS invoice (
    id       VARCHAR(60)  PRIMARY KEY NOT NULL UNIQUE,
    customer_id VARCHAR(60) NOT NULL,
    invoice_date DATE NOT NULL,
    due_date DATE NOT NULL,
    status VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS invoice_item (
    id       VARCHAR(60)  PRIMARY KEY NOT NULL UNIQUE,
    invoice_id VARCHAR(60) NOT NULL REFERENCES invoice(id),
    description VARCHAR(255) NOT NULL,
    quantity DECIMAL(10,2) NOT NULL,
    unit_price DECIMAL(10,2) NOT NULL
);
