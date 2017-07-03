/*
Navicat MySQL Data Transfer

Source Server         : wuyaping
Source Server Version : 50717
Source Host           : localhost:9106
Source Database       : myqq_db

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-06-15 22:06:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `file`
-- ----------------------------
DROP TABLE IF EXISTS `file`;
CREATE TABLE `file` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(10000) DEFAULT NULL,
  `sender` int(11) DEFAULT NULL,
  `receiver` int(11) DEFAULT NULL,
  `sendTime` date DEFAULT NULL,
  `receiveTime` date DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of file
-- ----------------------------

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(1000) NOT NULL,
  `sender` int(11) NOT NULL,
  `receiver` int(11) NOT NULL,
  `sendTime` date DEFAULT NULL,
  `receiveTime` date DEFAULT NULL,
  `state` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `sender` (`sender`),
  KEY `receiver` (`receiver`),
  CONSTRAINT `receiver` FOREIGN KEY (`receiver`) REFERENCES `users` (`qqnum`),
  CONSTRAINT `sender` FOREIGN KEY (`sender`) REFERENCES `users` (`qqnum`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', '1', '1', '2', '2017-06-13', null, '1');
INSERT INTO `message` VALUES ('2', 'hdhnwidhnwndl', '1', '2', '2017-06-13', null, '1');
INSERT INTO `message` VALUES ('3', 'ckbsk', '1', '2', '2017-06-14', null, '1');
INSERT INTO `message` VALUES ('4', 'd kj ,d, ', '1', '2', '2017-06-14', null, '1');
INSERT INTO `message` VALUES ('5', 'safkaf', '1', '2', '2017-06-15', null, '1');
INSERT INTO `message` VALUES ('6', '', '1', '2', '2017-06-15', null, '1');
INSERT INTO `message` VALUES ('7', 'halou ', '1', '2', '2017-06-15', null, '1');
INSERT INTO `message` VALUES ('8', '123', '1', '2', '2017-06-15', null, '1');
INSERT INTO `message` VALUES ('9', '4', '1', '2', '2017-06-15', null, '1');
INSERT INTO `message` VALUES ('10', '', '1', '2', '2017-06-15', null, '1');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `qqnum` int(11) NOT NULL,
  `nickName` varchar(20) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `registTime` date DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `introduce` varchar(50) DEFAULT NULL,
  `ip` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`qqnum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'wuyaping', '123', '2017-06-09', '123', '123', '169.254.74.211');
INSERT INTO `users` VALUES ('2', 'liuwei', '123', '2017-06-10', '123', '123', '127.0.0.1');
