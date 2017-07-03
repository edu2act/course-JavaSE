/*
Navicat MySQL Data Transfer

Source Server         : sunnan
Source Server Version : 50615
Source Host           : localhost:3306
Source Database       : myqq_db

Target Server Type    : MYSQL
Target Server Version : 50615
File Encoding         : 65001

Date: 2017-06-16 13:27:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(200) DEFAULT NULL,
  `sender` int(11) DEFAULT NULL,
  `receiver` int(11) DEFAULT NULL,
  `sendTime` datetime DEFAULT NULL,
  `receiveTime` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=129 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('123', '', '123', '127', null, null, null, null);
INSERT INTO `message` VALUES ('124', '123', '123', '127', '2017-06-15 18:27:06', null, '1', null);
INSERT INTO `message` VALUES ('125', '123', '127', '123', '2017-06-15 18:54:03', null, '1', null);
INSERT INTO `message` VALUES ('126', '123', '127', '123', '2017-06-15 18:54:28', null, '1', null);
INSERT INTO `message` VALUES ('127', '123', '123', '127', '2017-06-15 18:54:32', null, '1', null);
INSERT INTO `message` VALUES ('128', '123', '123', '127', '2017-06-15 18:57:56', null, '1', null);

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `qqnum` int(11) NOT NULL,
  `nickName` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `registTime` datetime DEFAULT NULL,
  `gender` char(2) DEFAULT NULL,
  `introduce` varchar(200) DEFAULT NULL,
  `ip` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`qqnum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('123', 'nan', '1234', null, null, null, null);
INSERT INTO `users` VALUES ('127', 'SUN', '123', null, null, null, null);
