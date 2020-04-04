/*
SQLyog Ultimate v12.14 (64 bit)
MySQL - 5.6.42 : Database - ldshop
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ldshop` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ldshop`;

/*Table structure for table `tb_category` */

DROP TABLE IF EXISTS `tb_category`;

CREATE TABLE `tb_category` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_pid` int(11) NOT NULL,
  `type_name` varchar(30) NOT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `tb_category` */

insert  into `tb_category`(`type_id`,`type_pid`,`type_name`) values 
(1,-1,'家电家具'),
(2,-1,'电子产品'),
(3,2,'手机'),
(4,2,'电脑');

/*Table structure for table `tb_product` */

DROP TABLE IF EXISTS `tb_product`;

CREATE TABLE `tb_product` (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_title` varchar(30) NOT NULL,
  `cate_id` int(11) NOT NULL,
  `product_stock` int(11) NOT NULL DEFAULT '0',
  `product_price` decimal(10,0) NOT NULL DEFAULT '0',
  `product_sale` decimal(10,0) NOT NULL DEFAULT '0',
  `product_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0下架，1上架，-1冻结，-2删除',
  `is_hot` tinyint(1) NOT NULL DEFAULT '0' COMMENT '0正常，1热门',
  `is_new` tinyint(1) NOT NULL DEFAULT '1' COMMENT '0正常，1新品',
  `product_image` varchar(100) DEFAULT NULL,
  `product_bigimage` varchar(100) DEFAULT NULL,
  `create_user` varchar(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `modify_user` varchar(20) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `tb_product` */

insert  into `tb_product`(`product_id`,`product_title`,`cate_id`,`product_stock`,`product_price`,`product_sale`,`product_status`,`is_hot`,`is_new`,`product_image`,`product_bigimage`,`create_user`,`create_time`,`modify_user`,`modify_time`) values 
(1,'红米6',3,19997,'799','699',1,0,1,'',NULL,NULL,NULL,NULL,NULL),
(2,'苹果11',3,299,'5499','5499',1,1,1,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `tb_product_detail` */

DROP TABLE IF EXISTS `tb_product_detail`;

CREATE TABLE `tb_product_detail` (
  `detail_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_detail` text NOT NULL,
  PRIMARY KEY (`detail_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `tb_product_detail` */

insert  into `tb_product_detail`(`detail_id`,`product_detail`) values 
(1,'红米手机性价比很高，特价促销，需要的赶紧来抢购了'),
(2,'苹果新出品手机，苹果11，苹果出品，必是精品');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
