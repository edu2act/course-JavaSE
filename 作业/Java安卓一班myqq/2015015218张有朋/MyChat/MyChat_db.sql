# SQL Manager 2007 Lite for MySQL 4.4.2.1
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : MyChat_db


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE `MyChat_db`
    CHARACTER SET 'utf8'
    COLLATE 'utf8_general_ci';

USE `mychat_db`;

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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

#
# Structure for the `users` table : 
#

CREATE TABLE `users` (
  `chatNum` int(11) NOT NULL AUTO_INCREMENT,
  `nickName` varchar(20) DEFAULT NULL,
  `pw` varchar(20) DEFAULT NULL,
  `registTime` datetime DEFAULT NULL,
  `gender` char(2) DEFAULT NULL,
  `introduce` varchar(200) DEFAULT NULL,
  `ip` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`chatNum`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

#
# Data for the `message` table  (LIMIT 0,500)
#

INSERT INTO `message` (`id`, `content`, `sender`, `receiver`, `sendTime`, `receiveTime`, `state`, `type`) VALUES 
  (2,'你好',3,4,'2017-06-13 22:11:24',NULL,1,NULL),
  (3,'你好',3,4,'2017-06-13 22:15:47',NULL,1,NULL),
  (4,'你好',3,4,'2017-06-13 22:15:56',NULL,1,NULL),
  (5,'你好',3,5,'2017-06-13 22:17:50',NULL,1,NULL),
  (6,'你好',3,6,'2017-06-13 22:20:30',NULL,1,NULL),
  (7,'你好',3,5,'2017-06-15 12:48:37',NULL,1,NULL);
COMMIT;

#
# Data for the `users` table  (LIMIT 0,500)
#

INSERT INTO `users` (`chatNum`, `nickName`, `pw`, `registTime`, `gender`, `introduce`, `ip`) VALUES 
  (3,'zhang','231','2017-06-13 21:43:57','女','hhhh','192.168.135.1'),
  (4,'zhang','231','2017-06-13 21:54:39','女','hhhh','127.0.0.1'),
  (5,'monster','123','2017-06-13 22:17:16','男','woshidie','127.0.0.1'),
  (6,'monster','123','2017-06-13 22:20:04','男','woshidie','192.168.135.1');
COMMIT;



/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;