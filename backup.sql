-- MySQL dump 10.13  Distrib 5.5.37, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: student
-- ------------------------------------------------------
-- Server version	5.5.37-0ubuntu0.12.04.1

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
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `b_id` int(11) DEFAULT NULL,
  `b_name` varchar(20) NOT NULL DEFAULT '',
  `b_author` varchar(20) DEFAULT NULL,
  `dept` varchar(20) DEFAULT NULL,
  `stud_id` int(11) DEFAULT NULL,
  `b_quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`b_name`),
  KEY `stud_id` (`stud_id`),
  CONSTRAINT `book_ibfk_1` FOREIGN KEY (`stud_id`) REFERENCES `student` (`stud_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1004,'c','richi','computer',NULL,5),(1002,'database','gaurav','it',1,27),(1005,'digital','vaibhav','electronics',3,20),(1003,'java','jams','it',NULL,15),(1001,'os','rohan','electronics',2,35);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book1`
--

DROP TABLE IF EXISTS `book1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book1` (
  `stud_id` int(11) DEFAULT NULL,
  `b_name` varchar(20) DEFAULT NULL,
  `b_issue` date DEFAULT NULL,
  `b_return` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book1`
--

LOCK TABLES `book1` WRITE;
/*!40000 ALTER TABLE `book1` DISABLE KEYS */;
INSERT INTO `book1` VALUES (1,'os','2018-05-12','1111-11-11'),(2,'java','2019-01-02','0000-00-00'),(3,'os','2018-02-11','0000-00-00'),(4,'database','2018-02-12','0000-00-00'),(5,'database','0000-00-00','0000-00-00'),(6,'os','0000-00-00','2012-08-09'),(6,'database','0000-00-00','2013-11-05'),(3,'os','2018-05-12','0000-00-00'),(6,'java','2018-05-12','0000-00-00');
/*!40000 ALTER TABLE `book1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book11`
--

DROP TABLE IF EXISTS `book11`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book11` (
  `b_name` varchar(20) NOT NULL,
  `b_quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`b_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book11`
--

LOCK TABLES `book11` WRITE;
/*!40000 ALTER TABLE `book11` DISABLE KEYS */;
INSERT INTO `book11` VALUES ('big data',15),('construction',5),('database',10),('digital',8),('hydrology',10),('java',15),('os',35),('som',41),('structures',16),('tom',23),('tunnel engineering',7);
/*!40000 ALTER TABLE `book11` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book111`
--

DROP TABLE IF EXISTS `book111`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book111` (
  `sr_no` double NOT NULL AUTO_INCREMENT,
  `stud_id` int(11) NOT NULL,
  `b_name` varchar(20) NOT NULL,
  `b_issue` date DEFAULT NULL,
  `b_return` date DEFAULT NULL,
  UNIQUE KEY `sr_no` (`sr_no`),
  KEY `b_name` (`b_name`),
  CONSTRAINT `book111_ibfk_1` FOREIGN KEY (`b_name`) REFERENCES `book11` (`b_name`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book111`
--

LOCK TABLES `book111` WRITE;
/*!40000 ALTER TABLE `book111` DISABLE KEYS */;
INSERT INTO `book111` VALUES (1,1,'os','2019-02-08','0000-00-00'),(2,3,'os','2018-11-08','2018-12-08'),(3,6,'database','2018-10-11','2018-11-11'),(4,6,'database','2018-10-11','2018-11-11'),(5,69,'digital','2019-01-20','2019-02-15'),(6,8,'tom','2018-06-25','2018-07-01'),(7,9,'tom','2018-06-25','2018-07-01'),(8,9,'tom','2018-06-25','2018-06-30'),(9,9,'som','2018-06-25','2018-06-30'),(10,45,'os','2018-02-09','0000-00-00'),(11,65,'java','2019-02-09','0000-00-00'),(12,65,'digital','2019-02-09','0000-00-00'),(13,3,'os','2018-02-12','2018-02-22'),(14,12,'java','2018-02-12','2018-02-22'),(15,24,'som','2019-02-09','0000-00-00'),(16,21,'tom','2019-01-09','0000-00-00'),(17,7,'java','2019-01-09','0000-00-00'),(18,43,'os','2018-01-09','2018-01-20'),(19,13,'database','2018-01-20','2018-01-20'),(20,26,'som','2018-09-09','2018-10-20'),(21,24,'som','2019-02-09','0000-00-00'),(22,32,'database','2018-09-09','2018-10-20'),(23,43,'database','2018-01-09','2018-01-20'),(24,54,'java','2018-05-12','0000-00-00'),(25,15,'structures','2019-01-09','0000-00-00'),(26,26,'os','2019-02-02','2019-02-22'),(27,6,'java','2019-01-01','0000-00-00');
/*!40000 ALTER TABLE `book111` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sample`
--

DROP TABLE IF EXISTS `sample`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sample` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `d_salary` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sample`
--

LOCK TABLES `sample` WRITE;
/*!40000 ALTER TABLE `sample` DISABLE KEYS */;
INSERT INTO `sample` VALUES (102,'aa',1033),(101,'rohan',1000);
/*!40000 ALTER TABLE `sample` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `stud_id` int(11) NOT NULL DEFAULT '0',
  `stud_name` varchar(20) DEFAULT NULL,
  `dept` varchar(20) NOT NULL,
  `stud_issued_book_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`stud_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'rohann','it',NULL),(2,'gaurav','it',NULL),(3,'omkar','electronics',NULL),(4,'amit','commerse',NULL),(5,'santosh','commerse',NULL);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-11 14:03:47
