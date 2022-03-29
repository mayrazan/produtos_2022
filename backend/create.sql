create table produto (id int8 generated by default as identity, nome varchar(255), quantidade numeric(19, 2), valor numeric(19, 2), primary key (id));
INSERT INTO produto(nome, quantidade, valor) VALUES('TV', 10, 5000.5);
INSERT INTO produto(nome, quantidade, valor) VALUES('Notebook', 5, 3999.99);
INSERT INTO produto(nome, quantidade, valor) VALUES('Smartphone', 50, 2199.89);
INSERT INTO produto(nome, quantidade, valor) VALUES('Tablet', 2, 7500.00);
