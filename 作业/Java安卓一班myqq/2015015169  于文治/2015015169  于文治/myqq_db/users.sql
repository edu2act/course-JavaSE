/*
Navicat MySQL Data Transfer

Source Server         : connection1
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : myqq_db

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-06-20 08:37:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `qqnum` int(11) NOT NULL AUTO_INCREMENT,
  `nickName` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `registTime` datetime DEFAULT NULL,
  `gender` char(2) DEFAULT NULL,
  `introduce` varchar(200) DEFAULT NULL,
  `ip` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`qqnum`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('0', 'han', '0', '2014-10-10 00:00:00', '男', null, '');
INSERT INTO `users` VALUES ('1', 'wang', '1', '2017-05-03 20:45:17', '女', null, '');
INSERT INTO `users` VALUES ('2', 'lee', '2', '2017-06-07 20:56:00', '男', null, '');
INSERT INTO `users` VALUES ('3', 'danny', '3', '2017-05-31 20:56:35', '男', null, '');
INSERT INTO `users` VALUES ('4', '地方', '2', '2017-06-16 10:45:46', '', '', null);
INSERT INTO `users` VALUES ('5', 'A', '5', '2017-06-16 10:46:35', '', '', null);
INSERT INTO `users` VALUES ('6', '88', '3', '2017-06-16 10:49:05', '', '', null);
INSERT INTO `users` VALUES ('7', '777', '8', '2017-06-16 10:49:17', '', '', null);
INSERT INTO `users` VALUES ('8', '强尼', '666', '2017-06-16 10:51:41', '', '', null);
INSERT INTO `users` VALUES ('9', '2', '2', '2017-06-16 12:01:12', '2', '2', null);
INSERT INTO `users` VALUES ('10', '3', '3', '2017-06-16 12:06:14', '3', '3', null);
INSERT INTO `users` VALUES ('11', '4', '4', '2017-06-16 12:07:46', '4', '4', null);
INSERT INTO `users` VALUES ('12', '热', '99', '2017-06-16 12:10:30', '', '', null);
