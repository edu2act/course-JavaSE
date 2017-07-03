/*
Navicat MySQL Data Transfer

Source Server         : QQ
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : myqq

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-06-16 22:18:49
*/

SET FOREIGN_KEY_CHECKS=0;

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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'zhangsan', '111', '2017-01-01 17:49:56', '', '', 'Ti·Amo');
INSERT INTO `users` VALUES ('2', 'lisi', '222', '2017-06-13 17:51:15', null, null, 'Ti·Amo');
INSERT INTO `users` VALUES ('3', 'wangwu', '333', '2017-06-21 17:51:29', null, null, null);
INSERT INTO `users` VALUES ('4', 'renliu', '444', '2017-05-20 17:51:42', null, null, null);
