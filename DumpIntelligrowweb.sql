CREATE DATABASE  IF NOT EXISTS `htmldata` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `htmldata`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: htmldata
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `intelligrowdata`
--

DROP TABLE IF EXISTS `intelligrowdata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `intelligrowdata` (
  `Name` varchar(50) DEFAULT NULL,
  `EmailId` varchar(50) DEFAULT NULL,
  `UserName` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `intelligrowdata`
--

LOCK TABLES `intelligrowdata` WRITE;
/*!40000 ALTER TABLE `intelligrowdata` DISABLE KEYS */;
INSERT INTO `intelligrowdata` VALUES ('Mansi','mansigupta94124@gmail.com','Mansi123','Mansi@123');
/*!40000 ALTER TABLE `intelligrowdata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `intelligrowmain`
--

DROP TABLE IF EXISTS `intelligrowmain`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `intelligrowmain` (
  `PlantId` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `plantName` varchar(255) DEFAULT NULL,
  `PlantingDate` date DEFAULT NULL,
  PRIMARY KEY (`PlantId`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `intelligrowmain`
--

LOCK TABLES `intelligrowmain` WRITE;
/*!40000 ALTER TABLE `intelligrowmain` DISABLE KEYS */;
INSERT INTO `intelligrowmain` VALUES (28,'Mansi123','Rose','2023-08-01'),(29,'Mansi123','Tulip','2023-08-01');
/*!40000 ALTER TABLE `intelligrowmain` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plantdata`
--

DROP TABLE IF EXISTS `plantdata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `plantdata` (
  `plantName` varchar(255) DEFAULT NULL,
  `Information` varchar(255) DEFAULT NULL,
  `TimeInterval` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plantdata`
--

LOCK TABLES `plantdata` WRITE;
/*!40000 ALTER TABLE `plantdata` DISABLE KEYS */;
INSERT INTO `plantdata` VALUES ('Rose','Scientific Name: Rosa spp, Growing Season: Spring & Summer, Watering Frequency: Regular',1),('Tulip','Scientific Name: Tulipa spp, Growing Season: Full Spring, Watering Frequency: Every 1-2 week',7),('Tulsi','Scientific Name: Ocimum sanctum, Growing Season: Spring, Watering Frequency: Every 1-2 day',1),('Money Plant','Scientific Name: Epipremnum aureum, Growing Season: Spring, Watering Frequency: Every 1-2 week',7),('Sunflower','Scientific Name: Helianthus annuus, Growing Season: Spring & Summer, Watering Frequency: Weekly',7);
/*!40000 ALTER TABLE `plantdata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'htmldata'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-20 21:34:44
