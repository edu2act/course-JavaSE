/*
Navicat MySQL Data Transfer

Source Server         : lcl
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : myqq_db

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-06-20 17:23:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `qqnum` int(11) NOT NULL AUTO_INCREMENT,
  `nickName` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `registTime` datetime DEFAULT NULL,
  `gender` char(2) DEFAULT NULL,
  `introduce` varchar(200) DEFAULT NULL,
  `ip` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`qqnum`)
) ENGINE=InnoDB AUTO_INCREMENT=931402471 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', '1', '2017-06-01 17:07:49', '男', '123', '10.222.253.132');
INSERT INTO `user` VALUES ('2', '2', '2', '2017-06-01 17:08:12', '女', '12', '15');
INSERT INTO `user` VALUES ('3', '3', '3', '2017-06-01 17:10:08', '男', '12', '54');
INSERT INTO `user` VALUES ('931402469', '帅比', '123', '2017-06-01 17:05:46', '男', '很帅', '10.7.84.91');
INSERT INTO `user` VALUES ('931402470', '帅帅', '123', '2017-06-16 10:59:26', '男', '15', null);
