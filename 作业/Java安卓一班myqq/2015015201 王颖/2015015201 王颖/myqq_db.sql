/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : myqq_db

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-06-13 15:13:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL,
  `content` varchar(100) DEFAULT NULL,
  `sender` int(11) NOT NULL,
  `receiver` int(11) NOT NULL,
  `sendTime` date DEFAULT NULL,
  `receiveTime` date DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `qqnum` int(11) NOT NULL,
  `nickName` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  `registTime` date DEFAULT NULL,
  `gender` char(2) DEFAULT NULL,
  `introduce` varchar(50) DEFAULT NULL,
  `ip` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`qqnum`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '1', '123', null, null, null, '10.7.84.42');
INSERT INTO `users` VALUES ('2', '2', '123', null, null, null, '10.7.84.42');
INSERT INTO `users` VALUES ('3', '3', '123', null, null, null, '10.7.84.42');
INSERT INTO `users` VALUES ('4', '4', '123', null, null, null, null);
