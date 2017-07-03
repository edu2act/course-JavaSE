/*
Navicat MySQL Data Transfer

Source Server         : xiaoHaoZ1
Source Server Version : 50701
Source Host           : localhost:3306
Source Database       : myqq

Target Server Type    : MYSQL
Target Server Version : 50701
File Encoding         : 65001

Date: 2017-06-17 14:33:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(100) DEFAULT NULL,
  `sender` int(11) NOT NULL,
  `receiver` int(11) NOT NULL,
  `sendTime` date DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', 'C++你好，我是作者。', '1', '2', '2017-06-16', '1');
INSERT INTO `message` VALUES ('2', '作者你好，你是用我实现的吗？', '2', '1', '2017-06-16', '1');
INSERT INTO `message` VALUES ('3', ' 嘻嘻，不是的，我用的是Java语言。。', '1', '2', '2017-06-16', '1');
INSERT INTO `message` VALUES ('4', ' 呜呜呜呜！嘤嘤嘤嘤！', '2', '1', '2017-06-16', '1');
INSERT INTO `message` VALUES ('5', ' 噗！', '1', '2', '2017-06-16', '1');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `qqNum` int(11) NOT NULL AUTO_INCREMENT,
  `nickName` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `registTime` date DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `introduce` varchar(200) DEFAULT NULL,
  `ip` varchar(20) NOT NULL,
  PRIMARY KEY (`qqNum`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '作者', '123', null, null, '我是作者', 'xiaoHaoZ1');
INSERT INTO `users` VALUES ('2', 'C++', '123', null, null, '我是C++', 'xiaoHaoZ1');
INSERT INTO `users` VALUES ('3', 'C', '123', null, null, '我是C', '');
INSERT INTO `users` VALUES ('4', 'Java', '123', null, null, '我是Java', '');
INSERT INTO `users` VALUES ('5', 'PHP', '', null, null, '我是世界上最好的语言', '');
