/*
Navicat MySQL Data Transfer

Source Server         : localhost_1234
Source Server Version : 50717
Source Host           : localhost:1234
Source Database       : users

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-06-20 20:01:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(15) DEFAULT NULL,
  `sender` int(11) DEFAULT NULL,
  `receiver` int(11) DEFAULT NULL,
  `sendTime` date DEFAULT NULL,
  `receiveTime` date DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', '123', '4', '3', '2017-06-20', '2017-06-20', '1');
INSERT INTO `message` VALUES ('2', '456', '4', '3', '2017-06-20', '2017-06-20', '1');
INSERT INTO `message` VALUES ('3', '123', '4', '3', '2017-06-20', null, '1');
INSERT INTO `message` VALUES ('4', '456', '4', '3', '2017-06-20', null, '1');
INSERT INTO `message` VALUES ('5', '123', '4', '3', '2017-06-20', null, '1');
INSERT INTO `message` VALUES ('6', '456', '4', '3', '2017-06-20', null, '1');
INSERT INTO `message` VALUES ('7', '789', '4', '3', '2017-06-20', null, '1');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `qqnum` int(11) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(12) DEFAULT NULL,
  `password` varchar(12) DEFAULT NULL,
  `registTime` date DEFAULT NULL,
  `gender` varchar(12) DEFAULT NULL,
  `introduce` varchar(12) DEFAULT NULL,
  `ip` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`qqnum`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', null, null, '2016-12-30', null, null, null);
INSERT INTO `user` VALUES ('3', '123', '456', '2017-05-27', '男', '123', '192.168.191.3');
INSERT INTO `user` VALUES ('4', '123', '123', '2017-05-27', '男', '123', '10.7.89.23');
