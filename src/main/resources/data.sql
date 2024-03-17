INSERT INTO `invoice`(id, customer_id, invoice_date, due_date, status)
VALUES (1, '1', '2020-01-01', '2020-01-31', 'PAID'),
       (2, '2', '2020-02-01', '2020-02-28', 'PENDING'),
       (3, '3', '2020-03-01', '2020-03-31', 'PAID'),
       (4, '4', '2020-04-01', '2020-04-30', 'PENDING'),
       (5, '5', '2020-05-01', '2020-05-31', 'PAID');

INSERT INTO `invoice_item`(id, invoice_id, description, quantity, unit_price)
VALUES ('1', '1', 'Item 1', 1, 100),
       ('2', '1', 'Item 2', 2, 200),
       ('3', '2', 'Item 3', 3, 300),
       ('4', '2', 'Item 4', 4, 400),
       ('5', '3', 'Item 5', 5, 500),
       ('6', '3', 'Item 6', 6, 600),
       ('7', '4', 'Item 7', 7, 700),
       ('8', '4', 'Item 8', 8, 800),
       ('9', '5', 'Item 9', 9, 900),
       ('10', '5', 'Item 10', 10, 1000);
