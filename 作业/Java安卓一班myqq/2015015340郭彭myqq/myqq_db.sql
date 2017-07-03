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
  `receiveTime` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL COMMENT '1--发送中，2--已读，3--撤销',
  `type` int(11) DEFAULT NULL COMMENT '1--聊天消息，2--系统提示',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=128 DEFAULT CHARSET=utf8;

#
# Structure for the `users` table : 
#

CREATE TABLE `users` (
  `qqnum` int(11) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `registTime` datetime DEFAULT NULL,
  `gender` char(2) DEFAULT NULL,
  `introduce` varchar(200) DEFAULT NULL,
  `ip` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`qqnum`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

#
# Data for the `message` table  (LIMIT 0,500)
#

INSERT INTO `message` (`id`, `content`, `sender`, `receiver`, `sendTime`, `receiveTime`, `state`, `type`) VALUES 
  (1,'wh',1,6,'2017-06-12 20:06:32',NULL,1,NULL),
  (2,'wwwwwww',1,6,'2017-06-12 20:06:44',NULL,1,NULL),
  (3,'wh',1,6,'2017-06-12 20:06:52',NULL,1,NULL),
  (4,'',1,6,'2017-06-12 20:07:06',NULL,1,NULL),
  (5,'',1,6,'2017-06-12 20:08:31',NULL,1,NULL),
  (6,'',1,6,'2017-06-12 20:08:32',NULL,1,NULL),
  (7,'z',1,6,'2017-06-12 20:08:34',NULL,1,NULL),
  (8,'z',1,7,'2017-06-12 20:08:44',NULL,1,NULL),
  (9,'1',6,1,'2017-06-12 20:19:51',NULL,1,NULL),
  (10,'1111',6,1,'2017-06-12 20:19:58',NULL,1,NULL),
  (11,'wh',1,3,'2017-06-14 14:03:17',NULL,1,NULL),
  (12,'ssss',1,3,'2017-06-14 14:03:32',NULL,1,NULL),
  (13,'qqq',1,2,'2017-06-15 09:11:43',NULL,1,NULL),
  (14,'11111111111',1,2,'2017-06-15 09:11:56',NULL,1,NULL),
  (15,'o',1,2,'2017-06-15 09:21:58',NULL,1,NULL),
  (16,'  ',1,2,'2017-06-15 09:22:27',NULL,1,NULL),
  (17,'oooooo',1,2,'2017-06-15 09:22:39',NULL,1,NULL),
  (18,'aaaa',2,1,'2017-06-15 09:22:43',NULL,1,NULL),
  (19,'wwww',1,2,'2017-06-15 09:22:49',NULL,1,NULL),
  (20,'aaa',1,2,'2017-06-15 09:22:59',NULL,1,NULL),
  (21,'www',2,1,'2017-06-15 09:23:11',NULL,1,NULL),
  (22,'aaaa',1,2,'2017-06-15 09:23:14',NULL,1,NULL),
  (23,'nihao',2,1,'2017-06-15 09:23:20',NULL,1,NULL),
  (24,'buhao',1,2,'2017-06-15 09:23:33',NULL,1,NULL),
  (25,'ssss',2,1,'2017-06-15 09:23:38',NULL,1,NULL),
  (26,'llll',1,2,'2017-06-15 09:23:43',NULL,1,NULL),
  (27,'eee',2,1,'2017-06-15 09:23:46',NULL,1,NULL),
  (28,'1',1,2,'2017-06-15 09:35:06',NULL,1,NULL),
  (29,'dddddd',1,2,'2017-06-15 09:35:22',NULL,1,NULL),
  (30,'ddddd',2,1,'2017-06-15 09:35:27',NULL,1,NULL),
  (31,'ddddd',1,2,'2017-06-15 09:35:30',NULL,1,NULL),
  (32,'ddddd',1,2,'2017-06-15 09:35:33',NULL,1,NULL),
  (33,'qqqqqqqqqqqqqqq',1,2,'2017-06-15 09:35:37',NULL,1,NULL),
  (34,'rrr',1,2,'2017-06-15 09:40:54',NULL,1,NULL),
  (35,'0000',2,1,'2017-06-15 09:41:17',NULL,1,NULL),
  (36,'0000',1,2,'2017-06-15 09:41:26',NULL,1,NULL),
  (37,'1111111',2,1,'2017-06-15 09:41:31',NULL,1,NULL),
  (38,'0000',2,1,'2017-06-15 09:42:40',NULL,1,NULL),
  (39,'1111',1,2,'2017-06-15 09:42:42',NULL,1,NULL),
  (40,'三生石',1,2,'2017-06-15 09:44:33',NULL,1,NULL),
  (41,'得得得',1,2,'2017-06-15 09:44:50',NULL,1,NULL),
  (42,'你看看把',2,1,'2017-06-15 09:44:56',NULL,1,NULL),
  (43,'你',1,2,'2017-06-15 09:45:07',NULL,1,NULL),
  (44,'三生三世',1,2,'2017-06-15 09:45:10',NULL,1,NULL),
  (45,'水水水水是',1,2,'2017-06-15 09:45:13',NULL,1,NULL),
  (46,'三生三世',1,2,'2017-06-15 09:45:16',NULL,1,NULL),
  (47,'三生三世',1,2,'2017-06-15 09:45:18',NULL,1,NULL),
  (48,'事实上事实上',1,2,'2017-06-15 09:45:20',NULL,1,NULL),
  (49,'三生三世',2,1,'2017-06-15 09:45:26',NULL,1,NULL),
  (50,'nihao',1,2,'2017-06-15 16:25:05',NULL,1,NULL),
  (51,'qqqqq',1,2,'2017-06-15 16:25:49',NULL,1,NULL),
  (52,'qqqqq',1,2,'2017-06-15 16:25:52',NULL,1,NULL),
  (53,'qqqqq',2,1,'2017-06-15 16:25:56',NULL,1,NULL),
  (54,'qqqq',1,2,'2017-06-15 16:25:59',NULL,1,NULL),
  (55,'nishuoma ???',1,4,'2017-06-15 17:20:10',NULL,1,NULL),
  (56,'ddd',1,4,'2017-06-15 17:20:17',NULL,1,NULL),
  (57,'ddd',1,4,'2017-06-15 17:20:19',NULL,1,NULL),
  (58,'dddd',4,1,'2017-06-15 17:20:26',NULL,1,NULL),
  (59,'ssss',1,4,'2017-06-15 17:20:30',NULL,1,NULL),
  (60,'aaaaa',4,1,'2017-06-15 17:20:33',NULL,1,NULL),
  (61,'aaaa',1,4,'2017-06-15 17:20:38',NULL,1,NULL),
  (62,'aaaaa',4,1,'2017-06-15 17:20:42',NULL,1,NULL),
  (63,'111111111',1,4,'2017-06-15 17:20:45',NULL,1,NULL),
  (64,'111111111111',4,1,'2017-06-15 17:20:48',NULL,1,NULL),
  (65,'1111',1,5,'2017-06-15 22:19:21',NULL,1,NULL),
  (66,'4444',1,5,'2017-06-15 22:19:25',NULL,1,NULL),
  (67,'4444',5,1,'2017-06-15 22:19:39',NULL,1,NULL),
  (68,'wwwww',1,5,'2017-06-15 22:35:40',NULL,1,NULL),
  (69,'wwwwww',1,5,'2017-06-15 22:35:55',NULL,1,NULL),
  (70,'wwwww',1,5,'2017-06-15 22:35:58',NULL,1,NULL),
  (71,'wwww',1,5,'2017-06-15 22:36:02',NULL,1,NULL),
  (72,'wwww',1,5,'2017-06-15 22:36:09',NULL,1,NULL),
  (73,'wwww',1,5,'2017-06-15 22:36:11',NULL,1,NULL),
  (74,'wwwww',1,5,'2017-06-15 22:36:13',NULL,1,NULL),
  (75,'wwww',1,5,'2017-06-15 22:36:15',NULL,1,NULL),
  (76,'wwwwww',1,5,'2017-06-15 22:36:17',NULL,1,NULL),
  (77,'wwww',5,1,'2017-06-15 22:36:21',NULL,1,NULL),
  (78,'wwwww',5,1,'2017-06-15 22:36:29',NULL,1,NULL),
  (79,'',5,1,'2017-06-15 22:36:29',NULL,1,NULL),
  (80,'',5,1,'2017-06-15 22:36:32',NULL,1,NULL),
  (81,'',5,1,'2017-06-15 22:36:33',NULL,1,NULL),
  (82,'',5,1,'2017-06-15 22:36:33',NULL,1,NULL),
  (83,'',5,1,'2017-06-15 22:36:33',NULL,1,NULL),
  (84,'',5,1,'2017-06-15 22:36:33',NULL,1,NULL),
  (85,'',5,1,'2017-06-15 22:36:34',NULL,1,NULL),
  (86,'',5,1,'2017-06-15 22:36:34',NULL,1,NULL),
  (87,'',5,1,'2017-06-15 22:36:34',NULL,1,NULL),
  (88,'',5,1,'2017-06-15 22:36:34',NULL,1,NULL),
  (89,'',5,1,'2017-06-15 22:36:34',NULL,1,NULL),
  (90,'',5,1,'2017-06-15 22:36:34',NULL,1,NULL),
  (91,'',5,1,'2017-06-15 22:36:35',NULL,1,NULL),
  (92,'二号你好',1,2,'2017-06-15 22:38:25',NULL,1,NULL),
  (93,'oooo',1,3,'2017-06-20 14:21:03',NULL,1,NULL),
  (94,'',1,3,'2017-06-20 14:21:08',NULL,1,NULL),
  (95,'',1,3,'2017-06-20 14:21:10',NULL,1,NULL),
  (96,'',1,3,'2017-06-20 14:21:11',NULL,1,NULL),
  (97,'ffffff',1,3,'2017-06-20 14:21:15',NULL,1,NULL),
  (98,'fffff',1,3,'2017-06-20 14:21:17',NULL,1,NULL),
  (99,'111',1,3,'2017-06-20 14:21:36',NULL,1,NULL),
  (100,'ddd',1,3,'2017-06-20 14:22:05',NULL,1,NULL),
  (101,'ddd',3,1,'2017-06-20 14:22:09',NULL,1,NULL),
  (102,'dd',1,3,'2017-06-20 14:22:11',NULL,1,NULL),
  (103,'ddd',3,1,'2017-06-20 14:22:13',NULL,1,NULL),
  (104,'ddd',1,3,'2017-06-20 14:22:19',NULL,1,NULL),
  (105,'dddd',3,1,'2017-06-20 14:22:22',NULL,1,NULL),
  (106,'dddd',1,3,'2017-06-20 14:22:25',NULL,1,NULL),
  (107,'dddd',3,1,'2017-06-20 14:22:31',NULL,1,NULL),
  (108,'dddd',1,3,'2017-06-20 14:22:33',NULL,1,NULL),
  (109,'sssss',3,1,'2017-06-20 14:22:35',NULL,1,NULL),
  (110,'sss',3,1,'2017-06-20 14:22:39',NULL,1,NULL),
  (111,'ssss',1,3,'2017-06-20 14:22:43',NULL,1,NULL),
  (112,'ssss',3,1,'2017-06-20 14:22:45',NULL,1,NULL),
  (113,'sssss',1,3,'2017-06-20 14:22:48',NULL,1,NULL),
  (114,'ssss',1,4,'2017-06-20 14:51:00',NULL,1,NULL),
  (115,'nihsu!',4,1,'2017-06-20 14:51:10',NULL,1,NULL),
  (116,'nishuo',1,4,'2017-06-20 14:51:15',NULL,1,NULL),
  (117,'haixing',4,1,'2017-06-20 14:51:21',NULL,1,NULL),
  (118,'nishuo ba ',1,4,'2017-06-20 14:51:25',NULL,1,NULL),
  (119,'wenjian l',4,1,'2017-06-20 14:51:30',NULL,1,NULL),
  (120,'o hehe',1,4,'2017-06-20 14:51:33',NULL,1,NULL),
  (121,'yibanban',4,1,'2017-06-20 14:51:42',NULL,1,NULL),
  (122,'haixingba',1,4,'2017-06-20 14:51:47',NULL,1,NULL),
  (123,'hello',1,2,'2017-06-20 14:54:20',NULL,1,NULL),
  (124,'hi',2,1,'2017-06-20 14:54:25',NULL,1,NULL),
  (125,'nihao',1,2,'2017-06-20 14:54:34',NULL,1,NULL),
  (126,'wobuhao',2,1,'2017-06-20 14:54:39',NULL,1,NULL),
  (127,'youdiansihu',1,2,'2017-06-20 14:54:48',NULL,1,NULL);
COMMIT;

#
# Data for the `users` table  (LIMIT 0,500)
#

INSERT INTO `users` (`qqnum`, `nickname`, `password`, `registTime`, `gender`, `introduce`, `ip`) VALUES 
  (1,'qian','123','2017-06-12 20:03:10','男','456','10.222.225.139'),
  (2,'chen','123','2017-06-12 20:03:46','男','456','10.222.225.139'),
  (3,'zhang','123','2017-06-12 20:04:14','男','456','10.222.225.139'),
  (4,'li','123','2017-06-12 20:04:36','女','456','10.222.225.139'),
  (5,'guo','123','2017-06-12 20:04:54','男','456','127.0.0.1'),
  (6,'wang','123','2017-06-12 20:05:02','男','456','10.222.210.72'),
  (7,'liu','123','2017-06-12 20:05:10','男','456','127.0.0.1'),
  (8,'hou','123','2017-06-12 20:05:25','女','456','127.0.0.1'),
  (9,'zhao','123','2017-06-12 20:05:51','女','456','127.0.0.1');
COMMIT;



/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;