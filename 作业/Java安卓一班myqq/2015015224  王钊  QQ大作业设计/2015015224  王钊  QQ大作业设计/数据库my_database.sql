# SQL Manager 2007 Lite for MySQL 4.4.2.1
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : my_database


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE `my_database`
    CHARACTER SET 'utf8'
    COLLATE 'utf8_general_ci';

USE `my_database`;

#
# Structure for the `message` table : 
#

CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(200) DEFAULT 'NULL',
  `sender` int(11) DEFAULT NULL,
  `receiver` int(11) NOT NULL,
  `sendTime` datetime DEFAULT NULL,
  `receiveTime` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL COMMENT '1--发送中，2--已读，3--撤销''',
  `type` int(11) DEFAULT NULL COMMENT '1--聊天消息，2--系统提示',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

#
# Structure for the `user` table : 
#

CREATE TABLE `user` (
  `qqnum` int(11) NOT NULL AUTO_INCREMENT,
  `nickName` varchar(20) DEFAULT 'NULL',
  `password` varchar(20) DEFAULT 'NULL',
  `registTime` datetime DEFAULT NULL,
  `gender` char(2) DEFAULT NULL,
  `introduce` varchar(200) NOT NULL DEFAULT 'NULL',
  `ip` varchar(20) DEFAULT 'NULL\r\n',
  PRIMARY KEY (`qqnum`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

#
# Data for the `message` table  (LIMIT 0,500)
#

INSERT INTO `message` (`id`, `content`, `sender`, `receiver`, `sendTime`, `receiveTime`, `state`, `type`) VALUES 
  (1,'对讲机附件附件',1,3,'2017-06-13 18:34:31',NULL,1,NULL),
  (2,'123',1,2,'2017-06-13 18:36:42',NULL,1,NULL),
  (3,'未达到',1,4,'2017-06-13 18:36:55',NULL,1,NULL),
  (4,'都使得',1,4,'2017-06-13 18:40:40',NULL,1,NULL),
  (5,'的方法对方',1,5,'2017-06-13 18:41:44',NULL,1,NULL),
  (6,'12345',1,5,'2017-06-13 18:43:14',NULL,1,NULL),
  (7,'123',5,1,'2017-06-13 18:43:35',NULL,1,NULL),
  (8,'123456',1,4,'2017-06-13 18:44:13',NULL,1,NULL),
  (9,'1234567',4,1,'2017-06-13 18:44:30',NULL,1,NULL),
  (10,'大酒店',3,2,'2017-06-14 15:15:31',NULL,1,NULL),
  (11,'紧急集合',3,2,'2017-06-14 15:15:45',NULL,1,NULL),
  (12,'奥特星球出现怪兽',2,3,'2017-06-14 15:17:14',NULL,1,NULL),
  (13,'回来',2,6,'2017-06-14 15:17:25',NULL,1,NULL),
  (14,'123',1,2,'2017-06-14 15:35:22',NULL,1,NULL),
  (15,'都深深的多',1,2,'2017-06-14 15:35:27',NULL,1,NULL),
  (16,'时代大厦',1,2,'2017-06-14 15:35:30',NULL,1,NULL),
  (17,'是滴是滴',1,2,'2017-06-14 15:35:34',NULL,1,NULL),
  (18,'奥特曼',1,4,'2017-06-14 15:36:07',NULL,1,NULL),
  (19,'佐菲',1,4,'2017-06-14 15:36:11',NULL,1,NULL),
  (20,'按实际',4,1,'2017-06-14 15:36:41',NULL,1,NULL),
  (21,'多多',4,1,'2017-06-14 15:36:45',NULL,1,NULL);
COMMIT;

#
# Data for the `user` table  (LIMIT 0,500)
#

INSERT INTO `user` (`qqnum`, `nickName`, `password`, `registTime`, `gender`, `introduce`, `ip`) VALUES 
  (1,'zuofei','123','1960-01-05 00:00:00','男','巫师','10.7.88.160'),
  (2,'aoteman','123','1961-01-05 00:00:00','男','战士','10.7.88.160'),
  (3,'saiwen','123','1962-01-05 00:00:00','男','魔法师','10.7.88.160'),
  (4,'jieke','123','1963-01-05 00:00:00','男','精灵','10.7.88.160'),
  (5,'aisi','123','1970-01-04 00:00:00','男','战士','10.7.84.241'),
  (6,'tailuo','123','1980-01-03 00:00:00','男','圣使','12400');
COMMIT;



/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;