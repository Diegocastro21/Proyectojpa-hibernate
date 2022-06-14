CREATE TABLE `Libros` (
	`isbn` VARCHAR(255) NOT NULL,
	`titulo` VARCHAR(255) NOT NULL,
	`autor` VARCHAR(255) NOT NULL,
	`precio` INT NOT NULL,
	`fecha` DATE NOT NULL,
	PRIMARY KEY (`isbn`)
);


