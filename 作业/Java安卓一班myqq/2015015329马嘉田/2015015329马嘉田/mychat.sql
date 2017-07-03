# SQL Manager 2007 Lite for MySQL 4.4.2.1
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : mychat


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES latin1 */;

SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE `mychat`
    CHARACTER SET 'utf8'
    COLLATE 'utf8_general_ci';

USE `mychat`;

#
# Structure for the `message` table : 
#

CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(50) DEFAULT NULL,
  `sender` int(11) DEFAULT NULL,
  `receiver` int(11) DEFAULT NULL,
  `sendTime` date DEFAULT NULL,
  `receiveTime` date DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 AVG_ROW_LENGTH=862;

#
# Structure for the `users` table : 
#

CREATE TABLE `users` (
  `mychatNum` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nickName` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `registTime` date DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `introduce` varchar(200) DEFAULT NULL,
  `ip` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`mychatNum`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

#
# Data for the `message` table  (LIMIT 0,500)
#

INSERT INTO `message` (`id`, `content`, `sender`, `receiver`, `sendTime`, `receiveTime`, `state`) VALUES 
  (4,'123',1,2,'2017-06-21',NULL,1),
  (5,'123',2,1,'2017-06-21',NULL,1),
  (6,'123',1,2,'2017-06-21',NULL,1),
  (7,'123',1,2,'2017-06-21',NULL,1),
  (8,' ???',1,2,'2017-06-21',NULL,1),
  (9,'1',1,2,'2017-06-21',NULL,1),
  (10,'1',1,2,'2017-06-21',NULL,1),
  (11,'1',1,2,'2017-06-21',NULL,1),
  (12,'123',1,2,'2017-06-21',NULL,1),
  (13,'1',1,2,'2017-06-21',NULL,1),
  (15,'123',1,2,'2017-06-21',NULL,1),
  (16,'1222222',1,2,'2017-06-21',NULL,1),
  (18,'123',1,2,'2017-06-21',NULL,1),
  (19,'123',1,2,'2017-06-21',NULL,1),
  (20,'123',1,2,'2017-06-21',NULL,1);
COMMIT;

#
# Data for the `users` table  (LIMIT 0,500)
#

INSERT INTO `users` (`mychatNum`, `nickName`, `password`, `registTime`, `gender`, `introduce`, `ip`) VALUES 
  (1,'123','123',NULL,NULL,NULL,'thinkpadpc'),
  (2,'345','123',NULL,NULL,NULL,'169.254.186.121'),
  (3,'789','123',NULL,NULL,NULL,NULL);
COMMIT;



/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;