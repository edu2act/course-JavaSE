/*
Navicat MySQL Data Transfer

Source Server         : connection1
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : myqq_db

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-06-20 08:37:14
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
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', 'v\'v\'v\'v', '0', '1', '2017-06-14 20:54:19', null, '1', null);
INSERT INTO `message` VALUES ('2', '', '0', '1', '2017-06-14 20:54:19', null, '1', null);
INSERT INTO `message` VALUES ('3', '22', '0', '1', '2017-06-14 21:52:16', null, '1', null);
INSERT INTO `message` VALUES ('4', '11', '1', '0', '2017-06-14 22:15:33', null, '1', null);
INSERT INTO `message` VALUES ('5', '111', '1', '0', '2017-06-15 08:20:32', null, '1', null);
INSERT INTO `message` VALUES ('6', '222', '1', '0', '2017-06-15 08:20:42', null, '1', null);
INSERT INTO `message` VALUES ('7', '222', '2', '1', '2017-06-15 08:24:04', null, '1', null);
INSERT INTO `message` VALUES ('8', '222', '1', '2', '2017-06-15 08:24:18', null, '1', null);
INSERT INTO `message` VALUES ('9', '22', '1', '2', '2017-06-15 08:24:22', null, '1', null);
INSERT INTO `message` VALUES ('10', '2222', '1', '2', '2017-06-15 19:12:25', null, '1', null);
INSERT INTO `message` VALUES ('11', 'test', '1', '0', '2017-06-15 20:00:27', null, '1', null);
INSERT INTO `message` VALUES ('12', 'test', '1', '0', '2017-06-15 20:06:03', null, '1', null);
INSERT INTO `message` VALUES ('13', 'dddd', '1', '2', '2017-06-15 20:15:53', null, '1', null);
INSERT INTO `message` VALUES ('14', 'test', '1', '2', '2017-06-15 20:20:01', null, '1', null);
INSERT INTO `message` VALUES ('15', 'test', '1', '2', '2017-06-15 20:21:01', null, '1', null);
INSERT INTO `message` VALUES ('16', 'test', '1', '2', '2017-06-15 20:23:55', null, '1', null);
INSERT INTO `message` VALUES ('17', 'test', '1', '2', '2017-06-15 20:24:05', null, '1', null);
INSERT INTO `message` VALUES ('18', 'test ', '1', '0', '2017-06-15 20:28:14', null, '1', null);
INSERT INTO `message` VALUES ('19', 'test', '0', '1', '2017-06-15 20:30:20', null, '1', null);
INSERT INTO `message` VALUES ('20', 'test', '1', '0', '2017-06-15 20:32:29', null, '1', null);
INSERT INTO `message` VALUES ('21', 'test', '1', '0', '2017-06-15 20:33:22', null, '1', null);
INSERT INTO `message` VALUES ('22', 'test', '1', '0', '2017-06-15 20:34:53', null, '1', null);
INSERT INTO `message` VALUES ('23', 'test', '3', '0', '2017-06-15 20:38:04', null, '1', null);
INSERT INTO `message` VALUES ('24', 'test', '1', '2', '2017-06-15 20:41:19', null, '1', null);
INSERT INTO `message` VALUES ('25', 'test  again', '1', '0', '2017-06-15 20:43:02', null, '1', null);
INSERT INTO `message` VALUES ('26', '1', '1', '0', '2017-06-15 20:47:43', null, '1', null);
INSERT INTO `message` VALUES ('27', '', '1', '2', '2017-06-15 20:49:55', null, '1', null);
INSERT INTO `message` VALUES ('28', 'ok?', '3', '1', '2017-06-15 20:51:18', null, '1', null);
INSERT INTO `message` VALUES ('29', '21hang  ', '3', '0', '2017-06-15 20:53:50', null, '1', null);
INSERT INTO `message` VALUES ('30', 'hello', '1', '0', '2017-06-15 21:13:01', null, '1', null);
INSERT INTO `message` VALUES ('31', 'test  ssss', '1', '0', '2017-06-15 21:19:10', null, '1', null);
INSERT INTO `message` VALUES ('32', 'dd', '1', '3', '2017-06-15 21:24:41', null, '1', null);
INSERT INTO `message` VALUES ('33', 'wwww', '2', '0', '2017-06-15 21:32:55', null, '1', null);
INSERT INTO `message` VALUES ('34', 'enen ?', '2', '1', '2017-06-15 21:42:51', null, '1', null);
INSERT INTO `message` VALUES ('35', 'what', '1', '2', '2017-06-15 21:43:03', null, '1', null);
INSERT INTO `message` VALUES ('36', '什么啊', '2', '1', '2017-06-15 21:44:52', null, '1', null);
INSERT INTO `message` VALUES ('37', '喂喂喂', '1', '2', '2017-06-15 21:45:08', null, '1', null);
INSERT INTO `message` VALUES ('38', '等等', '2', '0', '2017-06-16 09:37:07', null, '1', null);
INSERT INTO `message` VALUES ('39', '1', '1', '3', '2017-06-16 11:58:55', null, '1', null);
INSERT INTO `message` VALUES ('40', '1', '1', '3', '2017-06-16 11:58:57', null, '1', null);
