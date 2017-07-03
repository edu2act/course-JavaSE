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
  `content` varchar(20) DEFAULT NULL,
  `sender` int(11) DEFAULT NULL,
  `receiver` int(11) DEFAULT NULL,
  `sendtime` date DEFAULT NULL,
  `recrivetimr` date DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

#
# Structure for the `users` table : 
#

CREATE TABLE `users` (
  `qqnum` int(11) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `registtime` date DEFAULT NULL,
  `gender` varchar(2) DEFAULT NULL,
  `ip` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`qqnum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for the `message` table  (LIMIT 0,500)
#

INSERT INTO `message` (`id`, `content`, `sender`, `receiver`, `sendtime`, `recrivetimr`, `state`) VALUES 
  (1,'1',1,3,'2017-06-14',NULL,1),
  (2,'1',1,2,'2017-06-14',NULL,1),
  (3,'',1,2,'2017-06-14',NULL,1),
  (4,'xc',1,2,'2017-06-14',NULL,1),
  (5,'zx',1,3,'2017-06-14',NULL,1),
  (6,'是',1,3,'2017-06-14',NULL,1),
  (7,'阿萨德',1,3,'2017-06-14',NULL,1),
  (8,'好',1,2,'2017-06-14',NULL,1),
  (9,'是',1,2,'2017-06-14',NULL,1),
  (10,'啊啊啊',1,2,'2017-06-14',NULL,1),
  (11,'师大',2,1,'2017-06-14',NULL,1),
  (12,'省道',1,2,'2017-06-14',NULL,1),
  (13,' 好',2,1,'2017-06-14',NULL,1),
  (14,' ',1,2,'2017-06-14',NULL,1),
  (15,'  省道 ',1,3,'2017-06-14',NULL,1),
  (16,'  地方是',1,3,'2017-06-14',NULL,1),
  (17,'sad',1,2,'2017-06-14',NULL,1),
  (18,'啊',4,1,'2017-06-14',NULL,1),
  (19,'是 ',4,1,'2017-06-14',NULL,1),
  (20,'打 是爱迪生 ',4,1,'2017-06-14',NULL,1),
  (21,'sad ',4,3,'2017-06-14',NULL,1),
  (22,'的是上帝萨达是的地方',1,3,'2017-06-17',NULL,1);
COMMIT;

#
# Data for the `users` table  (LIMIT 0,500)
#

INSERT INTO `users` (`qqnum`, `nickname`, `password`, `registtime`, `gender`, `ip`) VALUES 
  (1,'zhangsan','456','2017-05-31','男','169.254.204.66'),
  (2,'lisi','123','2017-05-31','男','10.222.200.18'),
  (3,'wangwu','123','2017-05-31','男','127.0.0.1'),
  (4,'liuliu','123','2017-05-31','女','10.222.200.18');
COMMIT;



/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;