USE test;
DROP TABLE IF EXISTS part;
CREATE TABLE part(
id INT(11) NOT NULL AUTO_INCREMENT,
name varchar(255) NOT NULL,
is_necessary bit(1) not NUll,
count INT(11) not NULL,
PRIMARY KEY (id))
COLLATE='utf8_general_ci'
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

INSERT INTO part (name, is_necessary, count) VALUES ('Display', true, '11');
INSERT INTO part (name, is_necessary, count) VALUES ('Video card Nvidia', true, '10');
INSERT INTO part (name, is_necessary, count) VALUES ('Video card Radeon', true, '15');
INSERT INTO part (name, is_necessary, count) VALUES ('VGA', true, '12');
INSERT INTO part (name, is_necessary, count) VALUES ('RAM-ddr-3', true, '9');
INSERT INTO part (name, is_necessary, count) VALUES ('HDD', true, '12');
INSERT INTO part (name, is_necessary, count) VALUES ('SDD', true, '8');
INSERT INTO part (name, is_necessary, count) VALUES ('CPU intel', true, '14');
INSERT INTO part (name, is_necessary, count) VALUES ('CPU AMD', true, '19');
INSERT INTO part (name, is_necessary, count) VALUES ('Cooler for CPU', true, '15');
INSERT INTO part (name, is_necessary, count) VALUES ('Sound card', false, '7');
INSERT INTO part (name, is_necessary, count) VALUES ('SATA-3', true, '22');
INSERT INTO part (name, is_necessary, count) VALUES ('Keyboard', true, '17');
INSERT INTO part (name, is_necessary, count) VALUES ('Computer mouse', true, '10');
INSERT INTO part (name, is_necessary, count) VALUES ('Speakers SVEN', false, '18');
INSERT INTO part (name, is_necessary, count) VALUES ('Mother board', true, '14');
INSERT INTO part (name, is_necessary, count) VALUES ('PS Case', true, '5');
INSERT INTO part (name, is_necessary, count) VALUES ('Power Supply', true, '7');
INSERT INTO part (name, is_necessary, count) VALUES ('Power cable', true, '14');
INSERT INTO part (name, is_necessary, count) VALUES ('Cooler', false, '14');
INSERT INTO part (name, is_necessary, count) VALUES ('web-cam', false, '2');