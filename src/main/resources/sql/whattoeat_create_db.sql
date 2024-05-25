/*
SQLyog  v12.2.6 (64 bit)
MySQL - 5.7.22 : Database - whattoeat
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`whattoeat` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `whattoeat`;

/*Table structure for table `comment_record` */

DROP TABLE IF EXISTS `comment_record`;

CREATE TABLE `comment_record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(64) DEFAULT NULL COMMENT '评论昵称',
  `comment` varchar(1024) DEFAULT NULL COMMENT '评论内容',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `comment_record` */

insert  into `comment_record`(`id`,`name`,`comment`,`create_time`) values 
(1,'a','a','2020-12-06 22:45:43'),
(2,'b','b','2020-12-06 23:51:18'),
(3,'c','c','2020-12-06 23:55:51'),
(4,'d','d','2020-12-06 23:56:43'),
(5,'1','111','2020-12-07 00:02:07'),
(6,'2','2','2020-12-07 00:03:45'),
(7,'111','11','2020-12-07 00:10:24');

/*Table structure for table `dining_hall_dish` */

DROP TABLE IF EXISTS `dining_hall_dish`;

CREATE TABLE `dining_hall_dish` (
  `id` int(16) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `dining_hall_code` varchar(32) DEFAULT NULL COMMENT '餐厅编码',
  `dining_hall_name` varchar(256) DEFAULT NULL COMMENT '餐厅名称',
  `dish_code` varchar(32) DEFAULT NULL COMMENT '菜品编码',
  `dish_name` varchar(256) DEFAULT NULL COMMENT '菜品名称',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `creator` varchar(128) DEFAULT NULL COMMENT '创建人',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `updater` varchar(128) DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `dining_hall_dish` */

insert  into `dining_hall_dish`(`id`,`dining_hall_code`,`dining_hall_name`,`dish_code`,`dish_name`,`create_time`,`creator`,`update_time`,`updater`) values 
(1,'00000001','易购楼百乐汇美食花园','00000001','百乐汇厨房','2021-04-18 00:25:25','wzc',NULL,NULL),
(2,'00000001','易购楼百乐汇美食花园','00000002','麻辣香锅','2021-04-18 00:25:29','wzc',NULL,NULL),
(3,'00000001','易购楼百乐汇美食花园','00000003','小椒小麻酸菜鱼','2021-04-18 00:25:32','wzc',NULL,NULL),
(4,'00000001','易购楼百乐汇美食花园','00000004','铁将军铁板饭','2021-04-18 00:25:56','wzc',NULL,NULL),
(5,'00000001','易购楼百乐汇美食花园','00000005','秦晋面馆','2021-04-18 00:25:57','wzc',NULL,NULL),
(6,'00000001','易购楼百乐汇美食花园','00000006','淮南牛肉汤','2021-04-18 00:25:59','wzc',NULL,NULL),
(7,'00000001','易购楼百乐汇美食花园','00000007','饺子','2021-04-18 00:28:40','wzc',NULL,NULL),
(8,'00000002','易购负一层麦金地餐厅','00000008','兰州拉面','2021-04-18 00:29:44','wzc',NULL,NULL),
(9,'00000002','易购负一层麦金地餐厅','00000009','石锅饭','2021-04-18 00:31:06','wzc',NULL,NULL),
(10,'00000002','易购负一层麦金地餐厅','00000010','负一楼饺子','2021-04-18 00:31:07','wzc',NULL,NULL),
(11,'00000002','易购负一层麦金地餐厅','00000011','负一楼面','2021-04-18 00:31:07','wzc',NULL,NULL),
(12,'00000002','易购负一层麦金地餐厅','00000012','港式烧腊','2021-04-18 00:31:09','wzc',NULL,NULL),
(13,'00000003','苏宁总部餐厅','00000013','麻辣烫','2021-04-18 00:31:17','wzc',NULL,NULL),
(14,'00000003','苏宁总部餐厅','00000014','12块套餐','2021-04-18 00:31:32','wzc',NULL,NULL);

/*Table structure for table `operate_log` */

DROP TABLE IF EXISTS `operate_log`;

CREATE TABLE `operate_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `visit_time` timestamp NULL DEFAULT NULL COMMENT '访问时间',
  `username` varchar(64) DEFAULT NULL COMMENT '用户名',
  `ip` varchar(128) DEFAULT NULL COMMENT '访问ip',
  `url` varchar(255) DEFAULT NULL COMMENT '访问url',
  `execution_time` varchar(255) DEFAULT NULL COMMENT '访问时长',
  `method` varchar(255) DEFAULT NULL COMMENT '访问方法',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `operate_log` */

insert  into `operate_log`(`id`,`visit_time`,`username`,`ip`,`url`,`execution_time`,`method`) values 
(1,'2020-12-06 15:56:28',NULL,'0:0:0:0:0:0:0:1','/comment/saveComment','19158','[类名] com.wzc.whattoeat.controller.CommentController[方法名] saveGiftPackage'),
(2,'2020-12-06 16:02:08',NULL,'0:0:0:0:0:0:0:1','/comment/saveComment','5','[类名] com.wzc.whattoeat.controller.CommentController[方法名] saveGiftPackage'),
(3,'2020-12-06 16:03:43',NULL,'0:0:0:0:0:0:0:1','/comment/saveComment','19094','[类名] com.wzc.whattoeat.controller.CommentController[方法名] saveGiftPackage'),
(4,'2020-12-07 00:10:23',NULL,'0:0:0:0:0:0:0:1','/comment/saveComment','2265','[类名] com.wzc.whattoeat.controller.CommentController[方法名] saveGiftPackage');

/*Table structure for table `user_info` */

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `username` varchar(64) NOT NULL COMMENT '用户名',
  `password` varchar(64) DEFAULT NULL COMMENT '密码',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `mobile` varchar(255) DEFAULT NULL COMMENT '手机号',
  `nick_name` varchar(255) DEFAULT NULL COMMENT '昵称',
  `gender` varchar(255) DEFAULT NULL COMMENT '性别',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `user_info` */

insert  into `user_info`(`id`,`username`,`password`,`email`,`mobile`,`nick_name`,`gender`,`create_time`) values 
(1,'wzc','123456','361785671@qq.com','15365998093','wzc','1','2020-12-06 23:37:04');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
