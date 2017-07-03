/*
Navicat MySQL Data Transfer

Source Server         : Student
Source Server Version : 50717
Source Host           : localhost:9106
Source Database       : myqq_db

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-06-13 16:05:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL,
  `content` varchar(200) DEFAULT NULL,
  `sender` int(20) DEFAULT NULL,
  `receiver` int(11) DEFAULT NULL,
  `sendTime` datetime DEFAULT NULL,
  `receiveTime` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', '001', '1', '2', '2017-06-06 15:45:29', '2017-06-06 15:45:35', '1');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `qqnum` int(11) NOT NULL,
  `nickName` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `registTime` datetime DEFAULT NULL,
  `gender` char(2) DEFAULT NULL,
  `introduce` varchar(30) DEFAULT NULL,
  `ip` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`qqnum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('123', 'bbb', '12345', null, null, null, '192.168.137.1');
INSERT INTO `user` VALUES ('456', 'aaa', '12345', null, null, null, '10.222.239.176');
INSERT INTO `user` VALUES ('12345', 'asd', '12345', null, null, null, '10.222.239.176');
