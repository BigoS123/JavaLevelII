
INSERT INTO USER (LOGIN, PASSWORD, COINS) VALUES 
('MaciekxD', '123xD', 300);

INSERT INTO CAR (NAME, ACCELERATION, HANDLING, BRAKING, TOPSPEED) values
('ferrari', 60, 65, 80, 40),
('bmw', 40, 85, 60, 55),
('ford', 30, 30, 100, 100),
('lamborghini', 55, 70, 60, 60),
('mclaren', 90, 55, 55, 85);

INSERT INTO USERCAR (NAME, ACCELERATION, HANDLING, BRAKING, TOPSPEED, USER_ID) values
('ferrari', 60, 65, 80, 40, 1),
('bmw', 40, 85, 60, 55, 1),
('ford', 30, 30, 100, 100, 1),
('lamborghini', 55, 70, 60, 60, 1),
('mclaren', 90, 55, 55, 85, 1);


INSERT INTO CARPART (ENGINE, BRAKES, TYRES, SUSPENTION, TURBO, USERCAR_ID) values
(62, 66, 24, 35, 55, 1);