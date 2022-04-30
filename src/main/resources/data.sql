DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
  id VARCHAR(10),
  name VARCHAR(250),
  total_bill INT
);

INSERT INTO customer (id, name,total_bill) VALUES ('1', 'John',110);
INSERT INTO customer (id, name,total_bill) VALUES ('2', 'Samuel',80);
INSERT INTO customer (id, name,total_bill) VALUES ('3', 'clarke',180);
INSERT INTO customer (id, name,total_bill) VALUES ('4', 'Mike',260);
INSERT INTO customer (id, name,total_bill) VALUES ('5', 'Jack',20);
INSERT INTO customer (id, name,total_bill) VALUES ('6', 'mice',870);
