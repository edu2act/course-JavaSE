# SQL Manager 2007 Lite for MySQL 4.4.2.1
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : myqq_db


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE `myqq_db`
    CHARACTER SET 'utf8'
    COLLATE 'utf8_general_ci';

USE `myqq_db`;

#
# Structure for the `message` table : 
#

CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(200) DEFAULT NULL,
  `sender` int(11) DEFAULT NULL,
  `receiver` int(11) DEFAULT NULL,
  `sendTime` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL COMMENT '1--发送中，2--已读，3--撤销',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

#
# Structure for the `users` table : 
#

CREATE TABLE `users` (
  `qqnum` int(11) NOT NULL AUTO_INCREMENT,
  `nickName` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `registTime` datetime DEFAULT NULL,
  `gender` char(2) DEFAULT NULL,
  `introduce` varchar(200) DEFAULT NULL,
  `ip` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`qqnum`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

#
# Data for the `message` table  (LIMIT 0,500)
#

INSERT INTO `message` (`id`, `content`, `sender`, `receiver`, `sendTime`, `state`) VALUES 
  (1,'11',1,2,'2017-06-12 19:04:09',1),
  (2,'4',2,1,'2017-06-12 19:51:45',1),
  (3,'4',1,2,'2017-06-12 19:51:54',1),
  (4,'4',1,2,'2017-06-12 20:03:25',1),
  (5,'天',1,2,'2017-06-12 20:03:34',1),
  (6,'4',1,2,'2017-06-12 20:14:26',1),
  (7,'123',1,2,'2017-06-12 20:18:52',1),
  (8,'123',1,2,'2017-06-12 20:20:41',1),
  (9,'2',1,2,'2017-06-12 20:20:44',1),
  (10,'123',1,2,'2017-06-14 16:04:23',1),
  (11,'123',1,2,'2017-06-14 16:04:29',1),
  (12,'4',1,2,'2017-06-14 16:04:33',1),
  (13,'123',1,2,'2017-06-14 16:17:55',1),
  (14,'123',1,2,'2017-06-14 16:20:38',1),
  (15,'123',1,2,'2017-06-14 16:25:36',1),
  (16,'123',1,2,'2017-06-14 16:26:46',1),
  (17,'1',1,2,'2017-06-14 16:44:31',1),
  (18,'2',1,2,'2017-06-14 16:44:35',1),
  (19,'1',1,2,'2017-06-15 16:59:37',1),
  (20,'123',1,2,'2017-06-15 16:59:47',1);
COMMIT;

#
# Data for the `users` table  (LIMIT 0,500)
#

INSERT INTO `users` (`qqnum`, `nickName`, `password`, `registTime`, `gender`, `introduce`, `ip`) VALUES 
  (1,'zhang','123','2017-06-07 14:49:39','男','','169.254.135.119'),
  (2,'zhang','123','2017-06-07 14:54:09','男','456','169.254.135.119');
COMMIT;



/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;