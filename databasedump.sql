/*
SQLyog Enterprise - MySQL GUI v6.13
MySQL - 5.1.30-community : Database - pizza
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

create database if not exists `pizza`;

USE `pizza`;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

/*Table structure for table `catalogue` */

DROP TABLE IF EXISTS `catalogue`;

CREATE TABLE `catalogue` (
  `Pizza` varchar(150) DEFAULT NULL,
  `constituents` varchar(100) NOT NULL,
  `Medium` varchar(100) DEFAULT NULL,
  `Large` varchar(100) DEFAULT NULL,
  `Extra_Large` varchar(100) DEFAULT NULL,
  `Jumbo` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `catalogue` */

insert  into `catalogue`(`Pizza`,`constituents`,`Medium`,`Large`,`Extra_Large`,`Jumbo`) values ('MARGHERITA','Cheese & Tomato Sauce','15.00','18.00','23.00','27.00'),('CHICKEN DELIGHT','Chicken, Fresh Tomatoes & Green Pepper','17.00','21.00','26.00','31.00'),('CHICKEN SUPREME','Chicken, Mushroom & Sweet Corn','17.00','21.00','26.00','31.00'),('VEGETARIAN SUPREME','Onion, Green Pepper, Mushroom, Sweetcorn','17.00','21.00','26.00','31.00'),('HAWAIIAN','Ham & Pineapple','17.00','21.00','26.00','31.00'),('CALYPSO','Tuna, Onion, Green Pepper & Sweetcorn','17.00','21.00','26.00','31.00'),('PEPPERONI PASSION','Double Pepperoni& Double Cheese ','17.00','23.00','27.00','33.00'),('SIZZLER','Tomato & Garlic Sauce, Herbs, Sausage, Green Pepper, Chicken & Onion','18.00','23.00','27.00','33.00'),('MIXED GRILL','Sausage, Bacon, Mushroom & Fresh Tomatoes','18.00','23.00','27.00','34.00'),('NEW YORKER','Pepperoni, Ham, Bacon & Mushroom','18.00','23.00','27.00','34.00'),('AMERICANO','Barbecue Sauce, Pepperoni, Beef, Chicken & Onion','18.00','23.00','27.00','34.00'),('LOVERS ROCK','Beef, Chicken, Fresh Tomatoes & Green Pepper','18.00','23.00','27.00','34.00'),('TEXAS BBQ','Barbecue Sauce, Sausage, Chicken, Onion & Green Pepper','18.00','23.00','27.00','34.00'),('MEATEATER','Pepperoni, Ham, Chicken, Sausage & Beef','19.00','25.00','32.00','39.00'),('MIGHTY MEATY','Onion, Mushroom, Pepperoni, Ham & Chicken','19.00','25.00','32.00','39.00'),('PAPAS SPECIAL','Pepperoni, Sausage, Ham, Beef, Onion, Green Pepper & Sweetcorn','19.00','24.00','29.00','36.00'),('BIG PAPA','Chunks of Spicy Beef, Spicy Chicken & Spicy Goat Meat','19.00','24.00','29.00','36.00'),('FREESTYLER','Any Four Toppings of Your Choice','19.00','24.00','29.00','36.00');

/*Table structure for table `orderplacement` */

DROP TABLE IF EXISTS `orderplacement`;

CREATE TABLE `orderplacement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `location` varchar(100) NOT NULL,
  `type` varchar(20) NOT NULL,
  `size` varchar(20) NOT NULL,
  `quantity` varchar(20) NOT NULL,
  `added_toppings` text,
  `removed_toppings` text,
  `salespoint` varchar(30) NOT NULL,
  `timestamp` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

/*Data for the table `orderplacement` */

insert  into `orderplacement`(`id`,`name`,`phone`,`location`,`type`,`size`,`quantity`,`added_toppings`,`removed_toppings`,`salespoint`,`timestamp`) values (24,'Jeffrey Emmanuael','0242671863','Developers Office-ISSER, Legon Campus.','Lovers Rock','Large','3','Mushroom, Olives, Green Pepper, Bacon','None Specified','Osu','16 Dec 2013 19:52:35 GMT'),(25,'Saviour Kwaku','0244112009','Saviour Mobile, East Legon Accra','Texas BBQ','Large','2','Onions, Green pepper, Bacon, Sweet Corn','None Specified','Osu','16 Dec 2013 20:00:40 GMT'),(26,'Enyam Saviour','0244001667','Okponglo','Lovers Rock','Extra Large','3','None Specified','Mushroom, Sausage','Osu','19 Dec 2013 02:45:10 GMT'),(27,'Enyam Saviour','0244001667','Okponglo','New Yorker','Large','2','None Specified','None Specified','East Legon','19 Dec 2013 18:18:36 GMT'),(28,'William','0242532959','East Legon','Vegetarian Supreme','Extra Large','1','None Specified','Onions','Osu','7 Jan 2014 20:25:43 GMT'),(29,'Gerald','0244112990','Shai Hills','Papas Special','Large','3','None Specified','Onions','Spintex','7 Jan 2014 20:37:15 GMT');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `idnumber` varchar(30) NOT NULL,
  `password` varchar(40) NOT NULL,
  `timestamp` int(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`idnumber`,`password`,`timestamp`) values ('admin','admin',15);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
