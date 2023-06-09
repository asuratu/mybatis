/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80033
 Source Host           : localhost:3306
 Source Schema         : gf-demo-user

 Target Server Type    : MySQL
 Target Server Version : 80033
 File Encoding         : 65001

 Date: 09/06/2023 18:15:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT 'User ID',
  `passport` varchar(45) NOT NULL COMMENT 'User Passport',
  `password` varchar(45) NOT NULL COMMENT 'User Password',
  `nickname` varchar(45) NOT NULL COMMENT 'User Nickname',
  `create_at` datetime DEFAULT NULL COMMENT 'Created Time',
  `update_at` datetime DEFAULT NULL COMMENT 'Updated Time',
  `balance` decimal(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '余额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` (`id`, `passport`, `password`, `nickname`, `create_at`, `update_at`, `balance`) VALUES (3, 'admin1', '111', '李四', '2023-05-24 16:23:13', '2023-05-24 16:23:15', 1300.00);
INSERT INTO `user` (`id`, `passport`, `password`, `nickname`, `create_at`, `update_at`, `balance`) VALUES (4, 'user5', '123', '张三5', '2023-05-24 16:23:13', '2023-05-24 16:23:15', 0.00);
INSERT INTO `user` (`id`, `passport`, `password`, `nickname`, `create_at`, `update_at`, `balance`) VALUES (5, 'user5', '123', '张三5', '2023-05-24 16:23:13', '2023-05-24 16:23:15', 0.00);
INSERT INTO `user` (`id`, `passport`, `password`, `nickname`, `create_at`, `update_at`, `balance`) VALUES (6, 'user5', '123', '张三5', '2023-05-24 16:23:13', '2023-05-24 16:23:15', 0.00);
INSERT INTO `user` (`id`, `passport`, `password`, `nickname`, `create_at`, `update_at`, `balance`) VALUES (7, 'user5', '123', '张三5', '2023-05-25 05:18:36', '2023-05-24 16:23:15', 0.00);
INSERT INTO `user` (`id`, `passport`, `password`, `nickname`, `create_at`, `update_at`, `balance`) VALUES (8, 'user5', '123', '张三5', '2023-05-25 05:19:26', '2023-05-24 16:23:15', 0.00);
INSERT INTO `user` (`id`, `passport`, `password`, `nickname`, `create_at`, `update_at`, `balance`) VALUES (9, 'user5', '123', '张三5', '2023-05-25 05:19:26', '2023-05-24 16:23:15', 0.00);
INSERT INTO `user` (`id`, `passport`, `password`, `nickname`, `create_at`, `update_at`, `balance`) VALUES (10, 'user5', '123', '张三5', '2023-05-25 05:25:31', '2023-05-25 13:25:31', 0.00);
INSERT INTO `user` (`id`, `passport`, `password`, `nickname`, `create_at`, `update_at`, `balance`) VALUES (11, 'feng', '123456', 'feng', '2023-05-25 16:38:52', '2023-05-25 16:38:52', 100.00);
INSERT INTO `user` (`id`, `passport`, `password`, `nickname`, `create_at`, `update_at`, `balance`) VALUES (12, 'feng', '123456', 'feng', '2023-05-25 16:43:22', '2023-05-25 16:43:22', 100.00);
INSERT INTO `user` (`id`, `passport`, `password`, `nickname`, `create_at`, `update_at`, `balance`) VALUES (13, 'feng', '123456', 'feng', '2023-05-25 16:44:03', '2023-05-25 16:44:03', 100.00);
INSERT INTO `user` (`id`, `passport`, `password`, `nickname`, `create_at`, `update_at`, `balance`) VALUES (14, 'fengfengfengfeng', '123456', 'feng', '2023-05-27 00:44:57', '2023-05-29 17:23:26', 100.00);
INSERT INTO `user` (`id`, `passport`, `password`, `nickname`, `create_at`, `update_at`, `balance`) VALUES (15, 'feng', '123456', 'feng', '2023-05-25 16:45:35', '2023-05-25 16:45:35', 100.00);
INSERT INTO `user` (`id`, `passport`, `password`, `nickname`, `create_at`, `update_at`, `balance`) VALUES (16, 'feng', '123456', 'feng', '2023-05-25 16:47:01', '2023-05-25 16:47:01', 100.00);
INSERT INTO `user` (`id`, `passport`, `password`, `nickname`, `create_at`, `update_at`, `balance`) VALUES (17, 'feng', '123456', 'feng', '2023-05-25 16:47:06', '2023-05-25 16:47:06', 100.00);
INSERT INTO `user` (`id`, `passport`, `password`, `nickname`, `create_at`, `update_at`, `balance`) VALUES (18, 'feng', '123456', 'feng', '2023-05-25 16:47:20', '2023-05-25 16:47:20', 100.00);
INSERT INTO `user` (`id`, `passport`, `password`, `nickname`, `create_at`, `update_at`, `balance`) VALUES (19, 'feng', '123456', 'feng', '2023-05-29 17:23:26', '2023-05-29 17:23:26', 100.00);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
