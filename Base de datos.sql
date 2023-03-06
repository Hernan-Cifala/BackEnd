-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: portfolio
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `conocimientos`
--

DROP TABLE IF EXISTS `conocimientos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `conocimientos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `conocimiento` varchar(100) DEFAULT NULL,
  `Formacion_id` int NOT NULL,
  `Formacion_Persona_id` int NOT NULL,
  PRIMARY KEY (`id`,`Formacion_id`,`Formacion_Persona_id`),
  KEY `fk_Conocimientos_Formacion1_idx` (`Formacion_id`,`Formacion_Persona_id`),
  CONSTRAINT `fk_Conocimientos_Formacion1` FOREIGN KEY (`Formacion_id`, `Formacion_Persona_id`) REFERENCES `formacion` (`id`, `Persona_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conocimientos`
--

LOCK TABLES `conocimientos` WRITE;
/*!40000 ALTER TABLE `conocimientos` DISABLE KEYS */;
INSERT INTO `conocimientos` VALUES (1,'Buenas prácticas de programación.',1,1),(2,'Desarrollo Web Front End.',1,1),(3,'HTML, CSS, JavaScript, Typescript.',1,1),(4,'Bootstrap, Angular.',1,1),(5,'Git, Github.',1,1),(6,'Programación en C#.',2,1),(7,'Uso de scripts para definición de comportamientos.',2,1),(8,'Conceptos avanzados de la programación orientada a objetos.',2,1),(9,'Optimización del código.',2,1),(10,'Recolección, procesamiento, análisis y visualización de datos.',3,1),(11,'Uso avanzado de hojas de cálculo.',3,1),(12,'Manejo de bases de datos con SQL.',3,1),(13,'Programación en R.',3,1),(14,'Nivel avanzado de inglés.',4,1);
/*!40000 ALTER TABLE `conocimientos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `experiencia`
--

DROP TABLE IF EXISTS `experiencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `experiencia` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombreEmpresa` varchar(45) DEFAULT NULL,
  `esTrabajoActual` tinyint DEFAULT NULL,
  `fechaInicio` date DEFAULT NULL,
  `fechaFin` date DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `Persona_id` int NOT NULL,
  PRIMARY KEY (`id`,`Persona_id`),
  KEY `fk_Experiencia_Persona1_idx` (`Persona_id`),
  CONSTRAINT `fk_Experiencia_Persona1` FOREIGN KEY (`Persona_id`) REFERENCES `persona` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experiencia`
--

LOCK TABLES `experiencia` WRITE;
/*!40000 ALTER TABLE `experiencia` DISABLE KEYS */;
/*!40000 ALTER TABLE `experiencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `formacion`
--

DROP TABLE IF EXISTS `formacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `formacion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) DEFAULT NULL,
  `Persona_id` int NOT NULL,
  PRIMARY KEY (`id`,`Persona_id`),
  KEY `fk_Formacion_Persona_idx` (`Persona_id`),
  CONSTRAINT `fk_Formacion_Persona` FOREIGN KEY (`Persona_id`) REFERENCES `persona` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `formacion`
--

LOCK TABLES `formacion` WRITE;
/*!40000 ALTER TABLE `formacion` DISABLE KEYS */;
INSERT INTO `formacion` VALUES (1,'Capacitación #SéProgramar completa. Cursando #YoProgramo. Conocimientos adquiridos:',1),(2,'Capacitación extensa sobre el desarrollo de videojuegos con Unity. Conocimientos adquiridos:',1),(3,'Capacitación extensa relacionada al análisis de datos complejo. Conocimientos adquiridos:',1),(4,'Aprobado el First Certificate Exam in English. Certifica:',1);
/*!40000 ALTER TABLE `formacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habilidad`
--

DROP TABLE IF EXISTS `habilidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `habilidad` (
  `id` int NOT NULL AUTO_INCREMENT,
  `habilidad` varchar(45) DEFAULT NULL,
  `ruta` varchar(45) DEFAULT NULL,
  `Persona_id` int NOT NULL,
  PRIMARY KEY (`id`,`Persona_id`),
  KEY `fk_Habilidad_Persona1_idx` (`Persona_id`),
  CONSTRAINT `fk_Habilidad_Persona1` FOREIGN KEY (`Persona_id`) REFERENCES `persona` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habilidad`
--

LOCK TABLES `habilidad` WRITE;
/*!40000 ALTER TABLE `habilidad` DISABLE KEYS */;
INSERT INTO `habilidad` VALUES (1,'Soft Skills','assets\\public_html\\Soft_skills.png',1),(2,'Hard Skills','assets\\public_html\\Hard_skills.png',1);
/*!40000 ALTER TABLE `habilidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `titulo` varchar(45) DEFAULT NULL,
  `resumen` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,'Hernán','Cifalá','Programador','Pensador analítico con mentalidad técnica y atención al detalle busca insertarse al mercado laboral con el objetivo de expandir sus conocimientos de programación y ser parte de un equipo de desarrollo.');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proyecto`
--

DROP TABLE IF EXISTS `proyecto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proyecto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `proyecto` varchar(45) DEFAULT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `Persona_id` int NOT NULL,
  PRIMARY KEY (`id`,`Persona_id`),
  KEY `fk_Proyectos_Persona1_idx` (`Persona_id`),
  CONSTRAINT `fk_Proyectos_Persona1` FOREIGN KEY (`Persona_id`) REFERENCES `persona` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proyecto`
--

LOCK TABLES `proyecto` WRITE;
/*!40000 ALTER TABLE `proyecto` DISABLE KEYS */;
INSERT INTO `proyecto` VALUES (1,'Portfolio','El desarrollo de este portfolio.',1),(2,'Proyecto \"Oeste Salvaje\"','Videojuego desarrollado con Unity.',1),(3,'Sales Conversion Optimization','Análisis sobre campañas de marketing de una empresa.',1);
/*!40000 ALTER TABLE `proyecto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tareas`
--

DROP TABLE IF EXISTS `tareas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tareas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tarea` varchar(100) DEFAULT NULL,
  `Proyecto_id` int NOT NULL,
  `Proyecto_Persona_id` int NOT NULL,
  PRIMARY KEY (`id`,`Proyecto_id`,`Proyecto_Persona_id`),
  KEY `fk_Tareas_Proyecto1_idx` (`Proyecto_id`,`Proyecto_Persona_id`),
  CONSTRAINT `fk_Tareas_Proyecto1` FOREIGN KEY (`Proyecto_id`, `Proyecto_Persona_id`) REFERENCES `proyecto` (`id`, `Persona_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tareas`
--

LOCK TABLES `tareas` WRITE;
/*!40000 ALTER TABLE `tareas` DISABLE KEYS */;
INSERT INTO `tareas` VALUES (1,'Uso de HTML, CSS y JavaScript.',1,1),(2,'Implementación con Bootstrap y Angular.',1,1),(3,'Creación de repositorios local y remoto.',1,1),(4,'Desarrollo Front End dinámico.',1,1),(5,'Programación con C#.',2,1),(6,'Diseño de niveles y escenarios.',2,1),(7,'Animaciones e IA avanzada.',2,1),(8,'Sistema de físicas y proyectiles.',2,1),(9,'Elementos de UI interactivos.',2,1),(10,'Procesamiento de datos en Excel y SQLite.',3,1),(11,'Análisis y visualización de datos con R.',3,1),(12,'Presentación de resultados en PowerPoint.',3,1);
/*!40000 ALTER TABLE `tareas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-23 18:16:56
