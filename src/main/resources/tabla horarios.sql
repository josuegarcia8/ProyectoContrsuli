drop schema contrasuli;
drop user admin_contrasuli;

/*Se crea la base de datos */
CREATE SCHEMA `contrasuli` ;

/*Se crea la tabla de horario semanal que sale de San José*/
CREATE TABLE `contrasuli`.`sanJose_Puriscal_k` (
  `id_spWk145` INT NOT NULL AUTO_INCREMENT,
	`hora` VARCHAR (15) NOT NULL,
    `servicio` VARCHAR (15) NOT NULL,
  PRIMARY KEY (`id_spWk145`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;
  
  /*Se crea la tabla de horario de fin de semana que sale de San José*/
CREATE TABLE `contrasuli`.`sanJose_Puriscal_d` (
	`id_spWd145` INT NOT NULL AUTO_INCREMENT,
     `hora` VARCHAR (15) NOT NULL,
     `servicio` VARCHAR (15) NOT NULL,
    PRIMARY KEY (`id_spWd145`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

/*Se crea la tabla de horario semanal que sale de Puriscal*/
CREATE TABLE `contrasuli`.`puriscal_SanJose_k` (
  `id_psWk145` INT NOT NULL AUTO_INCREMENT,
	`hora` VARCHAR (15) NOT NULL,
    `servicio` VARCHAR (15) NOT NULL,
  PRIMARY KEY (`id_psWk145`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;
  
  /*Se crea la tabla de horario de fin de semana que sale de Puriscal*/
CREATE TABLE `contrasuli`.`puriscal_SanJose_d` (
	`id_psWd145` INT NOT NULL AUTO_INCREMENT,
     `hora` VARCHAR (15) NOT NULL,
     `servicio` VARCHAR (15) NOT NULL,
    PRIMARY KEY (`id_psWd145`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;


/*
INSERT INTO `contrasuli`.`weekR145` (`id_wr145`,`sjosePuris`, `purisJose`) VALUES ("1","10:50am", "4:50am");
INSERT INTO `contrasuli`.`wendR145` (`id_wdr145`,`purisJose`, `sjosePuris`) VALUES ("1","1:50pm", "3:50am");*/

/*Se crea un usuario para la base de datos llamado "admin_contrasuli" y tiene la contraseña "admin_C."*/
create user 'admin_contrasuli'@'%' identified by 'admin_C.';
/*Se asignan los prvilegios sobr ela base de datos TechShop al usuario creado */
grant all privileges on contrasuli.* to 'admin_contrasuli'@'%';
flush privileges;