CREATE DATABASE  IF NOT EXISTS `mods` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `mods`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: mods
-- ------------------------------------------------------
-- Server version	5.5.32

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
-- Table structure for table `base`
--

DROP TABLE IF EXISTS `base`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `base` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `item_type` char(45) DEFAULT NULL,
  `item` char(45) DEFAULT NULL,
  `item_spec_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_base_item_spec1_idx` (`item_spec_id`),
  CONSTRAINT `fk_base_item_spec1` FOREIGN KEY (`item_spec_id`) REFERENCES `item_spec` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `base`
--

LOCK TABLES `base` WRITE;
/*!40000 ALTER TABLE `base` DISABLE KEYS */;
INSERT INTO `base` VALUES (1,'Weapon','Axe',NULL),(2,'Weapon','Sword',NULL),(3,'Weapon','Mace',NULL),(4,'Weapon','Dagger',NULL),(5,'Weapon','Staff',NULL),(6,'Weapon','Bow',NULL),(7,'Weapon','Wand',NULL),(8,'Weapon','Claw',NULL),(9,'Weapon','Sceptre',NULL),(10,'Armor','Helmet',1),(11,'Armor','Helmet',2),(12,'Armor','Helmet',3),(13,'Armor','Helmet',4),(14,'Armor','Helmet',5),(15,'Armor','Helmet',6),(16,'Armor','Chest',1),(17,'Armor','Chest',2),(18,'Armor','Chest',3),(19,'Armor','Chest',4),(20,'Armor','Chest',5),(21,'Armor','Chest',6),(22,'Armor','Gloves',1),(23,'Armor','Gloves',2),(24,'Armor','Gloves',3),(25,'Armor','Gloves',4),(26,'Armor','Gloves',5),(27,'Armor','Gloves',6),(28,'Armor','Boots',1),(29,'Armor','Boots',2),(30,'Armor','Boots',3),(31,'Armor','Boots',4),(32,'Armor','Boots',5),(33,'Armor','Boots',6),(34,'Armor','Shield',1),(35,'Armor','Shield',2),(36,'Armor','Shield',3),(37,'Armor','Shield',4),(38,'Armor','Shield',5),(39,'Armor','Shield',6),(40,'Jewel','Ring',NULL),(41,'Jewel','Amulet',NULL),(42,'Jewel','Quiver',NULL),(43,'Jewel','Belt',NULL);
/*!40000 ALTER TABLE `base` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `base_has_mods`
--

DROP TABLE IF EXISTS `base_has_mods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `base_has_mods` (
  `base_id` int(11) NOT NULL AUTO_INCREMENT,
  `mods_id` int(11) NOT NULL,
  PRIMARY KEY (`base_id`,`mods_id`),
  KEY `fk_base_has_mods_mods1_idx` (`mods_id`),
  KEY `fk_base_has_mods_base1_idx` (`base_id`),
  CONSTRAINT `fk_base_has_mods_base1` FOREIGN KEY (`base_id`) REFERENCES `base` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_base_has_mods_mods1` FOREIGN KEY (`mods_id`) REFERENCES `mods` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `base_has_mods`
--

LOCK TABLES `base_has_mods` WRITE;
/*!40000 ALTER TABLE `base_has_mods` DISABLE KEYS */;
/*!40000 ALTER TABLE `base_has_mods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_spec`
--

DROP TABLE IF EXISTS `item_spec`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_spec` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` char(45) DEFAULT NULL,
  `name` char(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_spec`
--

LOCK TABLES `item_spec` WRITE;
/*!40000 ALTER TABLE `item_spec` DISABLE KEYS */;
INSERT INTO `item_spec` VALUES (1,'Flat','Armor'),(2,'Flat','Evasion'),(3,'Flat','Energy shield'),(4,'Hybrid','Armor and evasion'),(5,'Hybrid','Armor and energy shield'),(6,'Hybrid','Evasion and energy shield');
/*!40000 ALTER TABLE `item_spec` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mods`
--

DROP TABLE IF EXISTS `mods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_mods_range_values` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `name` varchar(128) DEFAULT NULL,
  `rank` int(11) DEFAULT NULL,
  `min_ilevel` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_mods_mods_range_values1_idx` (`id_mods_range_values`),
  CONSTRAINT `fk_mods_mods_range_values1` FOREIGN KEY (`id_mods_range_values`) REFERENCES `mods_range_values` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mods`
--

LOCK TABLES `mods` WRITE;
/*!40000 ALTER TABLE `mods` DISABLE KEYS */;
/*!40000 ALTER TABLE `mods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mods_range_values`
--

DROP TABLE IF EXISTS `mods_range_values`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mods_range_values` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `min_value_first` int(11) DEFAULT NULL,
  `max_value_first` int(11) DEFAULT NULL,
  `min_value_second` int(11) DEFAULT NULL,
  `max_value_second` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mods_range_values`
--

LOCK TABLES `mods_range_values` WRITE;
/*!40000 ALTER TABLE `mods_range_values` DISABLE KEYS */;
/*!40000 ALTER TABLE `mods_range_values` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-01-06 21:07:30
