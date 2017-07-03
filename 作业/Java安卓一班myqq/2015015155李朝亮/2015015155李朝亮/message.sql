/*
Navicat MySQL Data Transfer

Source Server         : lcl
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : myqq_db

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-06-20 17:23:39
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
  `state` int(11) DEFAULT NULL COMMENT '1--鍙戦€佷腑锛?--宸茶锛?--鎾ら攢',
  `type` int(11) DEFAULT NULL COMMENT '1--鑱婂ぉ娑堟伅锛?--绯荤粺鎻愮ず',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('3', '123', '1', '2', '2017-06-13 17:13:20', null, '1', null);
INSERT INTO `message` VALUES ('4', '123', '1', '931402469', '2017-06-14 14:09:51', null, '1', null);
INSERT INTO `message` VALUES ('5', '', '1', '931402469', '2017-06-14 14:09:52', null, '1', null);
INSERT INTO `message` VALUES ('6', '', '1', '931402469', '2017-06-14 14:09:53', null, '1', null);
INSERT INTO `message` VALUES ('7', '', '1', '931402469', '2017-06-14 14:09:54', null, '1', null);
INSERT INTO `message` VALUES ('8', '为', '1', '931402469', '2017-06-14 15:18:22', null, '1', null);
INSERT INTO `message` VALUES ('9', '大', '1', '931402469', '2017-06-14 15:18:27', null, '1', null);
INSERT INTO `message` VALUES ('10', '', '1', '931402469', '2017-06-14 15:18:28', null, '1', null);
INSERT INTO `message` VALUES ('11', '123', '1', '931402469', '2017-06-14 15:18:35', null, '1', null);
INSERT INTO `message` VALUES ('12', '按单个', '1', '931402469', '2017-06-14 15:18:38', null, '1', null);
INSERT INTO `message` VALUES ('13', '水电费', '1', '931402469', '2017-06-14 15:19:59', null, '1', null);
INSERT INTO `message` VALUES ('14', '', '1', '931402469', '2017-06-14 15:20:00', null, '1', null);
INSERT INTO `message` VALUES ('15', '适当', '1', '931402469', '2017-06-14 15:20:03', null, '1', null);
