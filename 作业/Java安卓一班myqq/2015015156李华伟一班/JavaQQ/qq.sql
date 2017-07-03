/*
Navicat MySQL Data Transfer

Source Server         : localhost0_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : qq

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-06-21 14:28:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(100) DEFAULT NULL,
  `sender` int(20) DEFAULT NULL,
  `receiver` int(30) DEFAULT NULL,
  `sendTime` date DEFAULT NULL,
  `receiveTime` date DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', '111', '1', '2', '2017-06-11', '2017-06-11', '1');
INSERT INTO `message` VALUES ('2', '222', '1', '2', '2017-06-15', '2017-06-15', '1');
INSERT INTO `message` VALUES ('3', null, null, null, null, null, null);
INSERT INTO `message` VALUES ('4', '222', '1', '2', '2017-06-18', '2017-06-18', '1');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `qqnum` varchar(11) DEFAULT NULL,
  `nickname` varchar(11) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  `resigntime` date DEFAULT NULL,
  `gender` varchar(100) DEFAULT NULL,
  `indrotuce` varchar(100) DEFAULT NULL,
  `ip` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '1', '1', '2017-06-06', '1', '1', '192.168.92.1');
INSERT INTO `users` VALUES ('2', '2', '2', '2017-06-14', '2', '2', '192.168.92.1');
INSERT INTO `users` VALUES ('3', '3', '3', '2017-06-07', '3', '3', '3');
INSERT INTO `users` VALUES ('4', '4', '4', '2017-06-01', '4', '4', '4');
