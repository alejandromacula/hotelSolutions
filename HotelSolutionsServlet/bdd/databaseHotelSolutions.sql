-- MySQL dump 10.13  Distrib 5.6.23, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: databasehotelsolutions
-- ------------------------------------------------------
-- Server version	5.6.24-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `habitacion`
--

DROP TABLE IF EXISTS `habitacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `habitacion` (
  `idhabitacion` int(11) NOT NULL AUTO_INCREMENT,
  `estado` tinyint(1) DEFAULT NULL,
  `ocupada` tinyint(1) DEFAULT NULL,
  `piso` int(11) DEFAULT NULL,
  `nroHab` int(11) DEFAULT NULL,
  `observaciones` mediumtext,
  `idhotel` int(11) NOT NULL,
  `idtipoDeHabitacion` int(11) NOT NULL,
  PRIMARY KEY (`idhabitacion`),
  KEY `fk_habitacion_hotel_idx` (`idhotel`),
  KEY `fk_tblHabitaciones_tblTipoHabitaciones1_idx` (`idtipoDeHabitacion`),
  CONSTRAINT `fk_habitacion_hotel` FOREIGN KEY (`idhotel`) REFERENCES `hotel` (`idhotel`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tblHabitaciones_tblTipoHabitaciones1` FOREIGN KEY (`idtipoDeHabitacion`) REFERENCES `tipodehabitacion` (`idtipoDeHabitacion`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habitacion`
--

LOCK TABLES `habitacion` WRITE;
/*!40000 ALTER TABLE `habitacion` DISABLE KEYS */;
INSERT INTO `habitacion` VALUES (1,1,0,1,2,'ninguna',1,1),(2,1,0,1,2,'ninguna',3,1),(3,1,0,1,2,'ninguna',3,1);
/*!40000 ALTER TABLE `habitacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hotel`
--

DROP TABLE IF EXISTS `hotel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hotel` (
  `idhotel` int(11) NOT NULL AUTO_INCREMENT,
  `calle` varchar(45) DEFAULT NULL,
  `estrellas` int(11) DEFAULT NULL,
  `habitaciones` int(11) DEFAULT NULL,
  `puerta` varchar(45) DEFAULT NULL,
  `calleCruze` varchar(45) DEFAULT NULL,
  `idlocalidad` int(11) NOT NULL,
  `razonSocial` varchar(45) DEFAULT NULL,
  `cuit` int(11) DEFAULT NULL,
  `nombre` varchar(45) NOT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idhotel`),
  KEY `fk_hotel_localidad1_idx` (`idlocalidad`),
  CONSTRAINT `fk_hotel_localidad1` FOREIGN KEY (`idlocalidad`) REFERENCES `localidad` (`idlocalidad`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hotel`
--

LOCK TABLES `hotel` WRITE;
/*!40000 ALTER TABLE `hotel` DISABLE KEYS */;
INSERT INTO `hotel` VALUES (1,NULL,2,NULL,'',NULL,1,'luna morena',1234567,'luna morena','cale 33',241,522222,'hotellunamorena@live.com'),(2,NULL,2,NULL,'',NULL,1,'luna morena',1234567,'luna morena','cale 33',241,522222,'hotellunamorena@live.com'),(3,NULL,2,NULL,'',NULL,1,'luna morena',1234567,'luna morena','cale 33',241,522222,'hotellunamorena@live.com'),(4,NULL,2,NULL,'',NULL,1,'luna morena',1234567,'luna morena','cale 33',241,522222,'hotellunamorena@live.com'),(5,NULL,2,NULL,'',NULL,1,'luna morena',1234567,'luna morena','cale 33',241,522222,'hotellunamorena@live.com'),(6,NULL,2,NULL,'',NULL,1,'luna morena',1234567,'luna morena','cale 33',241,522222,'hotellunamorena@live.com');
/*!40000 ALTER TABLE `hotel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `localidad`
--

DROP TABLE IF EXISTS `localidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `localidad` (
  `idlocalidad` int(11) NOT NULL AUTO_INCREMENT,
  `localidad` varchar(45) NOT NULL,
  `idpartido` int(11) NOT NULL,
  PRIMARY KEY (`idlocalidad`),
  KEY `fk_localidad_partido1_idx1` (`idpartido`),
  CONSTRAINT `fk_localidad_partido1` FOREIGN KEY (`idpartido`) REFERENCES `partido` (`idpartido`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `localidad`
--

LOCK TABLES `localidad` WRITE;
/*!40000 ALTER TABLE `localidad` DISABLE KEYS */;
INSERT INTO `localidad` VALUES (1,'lanus',1);
/*!40000 ALTER TABLE `localidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partido`
--

DROP TABLE IF EXISTS `partido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `partido` (
  `idpartido` int(11) NOT NULL AUTO_INCREMENT,
  `partido` varchar(45) NOT NULL,
  `idprovincia` int(11) NOT NULL,
  PRIMARY KEY (`idpartido`),
  KEY `fk_partido_provincia1_idx1` (`idprovincia`),
  CONSTRAINT `fk_partido_provincia1` FOREIGN KEY (`idprovincia`) REFERENCES `provincia` (`idprovincia`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partido`
--

LOCK TABLES `partido` WRITE;
/*!40000 ALTER TABLE `partido` DISABLE KEYS */;
INSERT INTO `partido` VALUES (1,'lanus',1);
/*!40000 ALTER TABLE `partido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `provincia`
--

DROP TABLE IF EXISTS `provincia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `provincia` (
  `idprovincia` int(11) NOT NULL AUTO_INCREMENT,
  `provincia` varchar(45) NOT NULL,
  PRIMARY KEY (`idprovincia`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `provincia`
--

LOCK TABLES `provincia` WRITE;
/*!40000 ALTER TABLE `provincia` DISABLE KEYS */;
INSERT INTO `provincia` VALUES (1,'buenos aires');
/*!40000 ALTER TABLE `provincia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reserva`
--

DROP TABLE IF EXISTS `reserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reserva` (
  `idreserva` int(11) NOT NULL AUTO_INCREMENT,
  `senia` float DEFAULT NULL,
  `precioFinal` float DEFAULT NULL,
  `desde` datetime DEFAULT NULL,
  `hasta` datetime DEFAULT NULL,
  `confirmada` tinyint(1) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `observaciones` varchar(200) DEFAULT NULL,
  `idhabitacion` int(11) NOT NULL,
  `idUsuario` int(11) NOT NULL,
  PRIMARY KEY (`idreserva`),
  KEY `fk_reserva_habitacion1_idx` (`idhabitacion`),
  KEY `fk_tblreservas_usuario1_idx` (`idUsuario`),
  CONSTRAINT `fk_reserva_habitacion1` FOREIGN KEY (`idhabitacion`) REFERENCES `habitacion` (`idhabitacion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tblreservas_usuario1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reserva`
--

LOCK TABLES `reserva` WRITE;
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
INSERT INTO `reserva` VALUES (1,112,350,'2014-08-12 00:00:00','2014-08-15 00:00:00',1,'2014-03-28 00:00:00','todo ok',1,1),(2,112,350,'2014-08-12 00:00:00','2014-08-15 00:00:00',1,'2014-03-28 00:00:00','todo ok',1,1),(3,112,350,'2014-08-12 00:00:00','2014-08-15 00:00:00',1,'2014-03-28 00:00:00','todo ok',1,1),(4,112,350,'2014-08-12 00:00:00','2014-08-15 00:00:00',1,'2014-03-28 00:00:00','todo ok',1,1);
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipodehabitacion`
--

DROP TABLE IF EXISTS `tipodehabitacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipodehabitacion` (
  `idtipoDeHabitacion` int(11) NOT NULL,
  `tipoDeHabitacion` varchar(45) NOT NULL,
  PRIMARY KEY (`idtipoDeHabitacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipodehabitacion`
--

LOCK TABLES `tipodehabitacion` WRITE;
/*!40000 ALTER TABLE `tipodehabitacion` DISABLE KEYS */;
INSERT INTO `tipodehabitacion` VALUES (1,'doble');
/*!40000 ALTER TABLE `tipodehabitacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipodeusuario`
--

DROP TABLE IF EXISTS `tipodeusuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipodeusuario` (
  `idtipodeUsuario` int(11) NOT NULL,
  `tipodeUsuario` varchar(45) NOT NULL,
  `privilegios` varchar(45) NOT NULL,
  PRIMARY KEY (`idtipodeUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipodeusuario`
--

LOCK TABLES `tipodeusuario` WRITE;
/*!40000 ALTER TABLE `tipodeusuario` DISABLE KEYS */;
INSERT INTO `tipodeusuario` VALUES (1,'comun','ninguno');
/*!40000 ALTER TABLE `tipodeusuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombreDeUsuario` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `fechaNacimiento` datetime DEFAULT NULL,
  `dni` int(11) DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `calle` varchar(45) DEFAULT NULL,
  `puerta` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `idtipoDeUsuario` int(11) NOT NULL,
  `numeroCalle` int(11) DEFAULT NULL,
  `idlocalidad` int(11) NOT NULL,
  PRIMARY KEY (`idUsuario`),
  KEY `fk_tblUsuarios_tblTipoUsuarios1_idx` (`idtipoDeUsuario`),
  KEY `fk_usuario_localidad1_idx` (`idlocalidad`),
  CONSTRAINT `fk_tblUsuarios_tblTipoUsuarios1` FOREIGN KEY (`idtipoDeUsuario`) REFERENCES `tipodeusuario` (`idtipodeUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuario_localidad1` FOREIGN KEY (`idlocalidad`) REFERENCES `localidad` (`idlocalidad`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'martin123684','mar1234','martin','macario',42251654,'1991-07-25 00:00:00',35855187,'m','sitio de montevideo','','martin@gmail.com',1,150,1),(2,'martin123684','mar1234','martin','macario',42251654,'1991-07-25 00:00:00',35855187,'m','sitio de montevideo','','martin@gmail.com',1,150,1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-05-18  0:19:44
