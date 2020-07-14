-- MySQL dump 10.13  Distrib 5.7.30, for Linux (x86_64)
--
-- Host: localhost    Database: JDBC_gitHub_project_fisrt
-- ------------------------------------------------------
-- Server version	5.7.30-0ubuntu0.18.04.1

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
-- Table structure for table `tbl_book`
--

DROP TABLE IF EXISTS `tbl_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_book` (
  `b_id` int(3) NOT NULL AUTO_INCREMENT,
  `b_name` varchar(28) DEFAULT NULL,
  `b_author` varchar(28) DEFAULT NULL,
  `b_dept` varchar(20) DEFAULT NULL,
  `b_prise` float NOT NULL,
  `b_quantity` int(11) NOT NULL,
  PRIMARY KEY (`b_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_book`
--

LOCK TABLES `tbl_book` WRITE;
/*!40000 ALTER TABLE `tbl_book` DISABLE KEYS */;
INSERT INTO `tbl_book` VALUES (1,'Big Data Black Book',' DT Editorial Services','it',450,15),(2,'Construc Planning','P.S. Gahlot','civil',299,26),(3,'Construct Management','B. M. Dhir','civil',228,16),(4,'Database Concepts',' Abraham Silberschatz','computer',895,28),(5,'Digital Fortress',' Dan Brown ','electronic',351,12),(6,'Fundamental Database','Elmasri Ramez','it',701,23),(7,'Engineering Hydrology','K. Subramanya','mechanical',605,32),(8,'Programming with Java','E Balagurusamy','computer',453,24),(9,'Operating Systems','Rajiv Chopra','computer',399,23),(10,'Begin Programming with Java',' Barry A. Burd','it',54,33),(11,'Strength of Materials','S S Rattan','mechanical',634,29),(12,'Strength of Material','R.S. Khurmi','mechanical',565,27),(13,'Basic Structural Analysis','C S Reddy','civil',584,36),(14,'Structural Analysis',' Devdas Menon','civil',950,14),(15,'Theory of Machines','R.S. Khurmi','mechanical',578,26),(16,'Basic Structural Analysis','C S Reddy ','civil',584,34),(17,'THEORY OF MACHINES Pback 1',' Sadhu Singh ','mechanical',150,42),(18,'Tunnel Engineering','Kumar','civil',151,12);
/*!40000 ALTER TABLE `tbl_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_book_issue_return`
--

DROP TABLE IF EXISTS `tbl_book_issue_return`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_book_issue_return` (
  `b_id` int(11) NOT NULL,
  `b_name` varchar(20) DEFAULT NULL,
  `b_author` varchar(20) DEFAULT NULL,
  `b_dept` varchar(20) DEFAULT NULL,
  `b_issue_date` date NOT NULL,
  `b_return_date` date DEFAULT NULL,
  `b_status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_book_issue_return`
--

LOCK TABLES `tbl_book_issue_return` WRITE;
/*!40000 ALTER TABLE `tbl_book_issue_return` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_book_issue_return` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_log`
--

DROP TABLE IF EXISTS `tbl_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_log` (
  `b_id` int(11) NOT NULL,
  `b_name` varchar(20) DEFAULT NULL,
  `b_dept` varchar(20) DEFAULT NULL,
  `b_isse_date` date DEFAULT NULL,
  `b_return_date` date DEFAULT NULL,
  `b_author` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_log`
--

LOCK TABLES `tbl_log` WRITE;
/*!40000 ALTER TABLE `tbl_log` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_student`
--

DROP TABLE IF EXISTS `tbl_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_student` (
  `s_id` int(11) NOT NULL,
  `s_name` varchar(20) DEFAULT NULL,
  `S_dept` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_student`
--

LOCK TABLES `tbl_student` WRITE;
/*!40000 ALTER TABLE `tbl_student` DISABLE KEYS */;
INSERT INTO `tbl_student` VALUES (1,'rohan','it'),(2,'gaurav','computer'),(3,'abhi','mechanical'),(4,'rohit','computer'),(5,'pravin','civil'),(6,'rushabh','electronic'),(7,'vinayk','civil'),(8,'ketan','chemical');
/*!40000 ALTER TABLE `tbl_student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-13 18:25:29
