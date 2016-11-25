/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : attendance_management

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2016-11-25 20:38:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `department_name` varchar(255) DEFAULT NULL,
  `department_manager` int(11) DEFAULT NULL,
  `vice_general_manager` int(11) DEFAULT NULL,
  `general_manager` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------

-- ----------------------------
-- Table structure for leavebill
-- ----------------------------
DROP TABLE IF EXISTS `leavebill`;
CREATE TABLE `leavebill` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `application_time` varchar(255) DEFAULT NULL,
  `leave_date` varchar(255) DEFAULT NULL,
  `num_of_days` int(11) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `describes` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of leavebill
-- ----------------------------
INSERT INTO `leavebill` VALUES ('1', '2016-11-22 16:30:09', '2016-11-23', '1', '1', 'aaaaaaaa', '1');
INSERT INTO `leavebill` VALUES ('2', '2016-11-09 16:30:42', '2016-11-12', '1', '1', 'bbbbbb', '1');
INSERT INTO `leavebill` VALUES ('3', '2016-11-22 16:31:02', '2016-11-24', '2', '1', 'qqqqqqq', '1');
INSERT INTO `leavebill` VALUES ('4', '2016-11-02 16:31:21', '2016-11-08', '3', '1', 'wwwwwwww', '1');
INSERT INTO `leavebill` VALUES ('5', '2016-11-18 16:31:43', '2016-11-29', '1', '1', 'rrrrrrrrr', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `entry_date` date DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123', '123', 'qqq', '男', '2000-01-01', '12345678', '2016-01-01', '1', '123456@789.com');
INSERT INTO `user` VALUES ('2', 'abc', 'abc', 'aaa', null, null, null, null, null, 'abc@def.com');
INSERT INTO `user` VALUES ('3', '456', '456', 'qqq', '男', '2001-06-06', '45612379', '2016-02-22', '1', null);

-- ----------------------------
-- Table structure for user_department
-- ----------------------------
DROP TABLE IF EXISTS `user_department`;
CREATE TABLE `user_department` (
  `employee_id` int(11) NOT NULL,
  `department_id` int(11) NOT NULL,
  PRIMARY KEY (`employee_id`,`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_department
-- ----------------------------

-- ----------------------------
-- Table structure for user_leave
-- ----------------------------
DROP TABLE IF EXISTS `user_leave`;
CREATE TABLE `user_leave` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `leave_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_leave
-- ----------------------------
INSERT INTO `user_leave` VALUES ('1', '1', '1');
INSERT INTO `user_leave` VALUES ('2', '1', '3');
INSERT INTO `user_leave` VALUES ('3', '1', '4');
INSERT INTO `user_leave` VALUES ('4', '2', '5');
INSERT INTO `user_leave` VALUES ('5', '1', '2');
INSERT INTO `user_leave` VALUES ('6', '1', '2');
