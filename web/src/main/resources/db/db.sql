CREATE TABLE URL (
  ID     BIGINT PRIMARY KEY AUTO_INCREMENT,
  NAME   VARCHAR (100) NOT NULL,
  BODY   VARCHAR(1000) NOT NULL,
  STATUS VARCHAR (10) NOT NULL
);