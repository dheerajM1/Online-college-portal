/*
SQLyog Community Edition- MySQL GUI v7.15 
MySQL - 5.5.29 : Database - online_exam
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`online_exam` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `online_exam`;

/*Table structure for table `mcq` */

DROP TABLE IF EXISTS `mcq`;

CREATE TABLE `mcq` (
  `mcqId` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(200) DEFAULT NULL,
  `choiceA` varchar(100) DEFAULT NULL,
  `choiceB` varchar(100) DEFAULT NULL,
  `choiceC` varchar(100) DEFAULT NULL,
  `choiceD` varchar(100) DEFAULT NULL,
  `hint1` varchar(100) DEFAULT NULL,
  `hint2` varchar(100) DEFAULT NULL,
  `hint3` varchar(100) DEFAULT NULL,
  `feedback` varchar(150) DEFAULT NULL,
  `answer` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`mcqId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `mcq` */

insert  into `mcq`(`mcqId`,`question`,`choiceA`,`choiceB`,`choiceC`,`choiceD`,`hint1`,`hint2`,`hint3`,`feedback`,`answer`) values (1,' ssda','asd','as','asd','asd',' asd',' addsa',' asd',' sad','A');

/*Table structure for table `numaric` */

DROP TABLE IF EXISTS `numaric`;

CREATE TABLE `numaric` (
  `nuq_id` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(200) DEFAULT NULL,
  `answer` varchar(100) DEFAULT NULL,
  `hint1` varchar(100) DEFAULT NULL,
  `hint2` varchar(100) DEFAULT NULL,
  `hint3` varchar(100) DEFAULT NULL,
  `feedback` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`nuq_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

/*Data for the table `numaric` */

insert  into `numaric`(`nuq_id`,`question`,`answer`,`hint1`,`hint2`,`hint3`,`feedback`) values (1,'what is java','jjj ','llll ','ooo ','ppp ','oooooo ');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(30) NOT NULL AUTO_INCREMENT,
  `firstName` varbinary(30) DEFAULT NULL,
  `lastname` varchar(30) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `role` varchar(30) DEFAULT NULL,
  `numberOfMCQID` int(10) DEFAULT '1',
  `numberOfNumaricID` int(10) DEFAULT '1',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`user_id`,`firstName`,`lastname`,`username`,`password`,`role`,`numberOfMCQID`,`numberOfNumaricID`) values (1,'karnakar','katla','karna','karna','I am a student',1,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
