-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: jspms8s99
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `chat`
--

DROP TABLE IF EXISTS `chat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `adminid` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `ask` longtext COMMENT '提问',
  `reply` longtext COMMENT '回复',
  `isreply` int(11) DEFAULT NULL COMMENT '是否回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609462020056 DEFAULT CHARSET=utf8 COMMENT='客服聊天表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat`
--

LOCK TABLES `chat` WRITE;
/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
INSERT INTO `chat` VALUES (71,'2020-12-31 12:12:08',1,1,'提问1','回复1',1),(72,'2020-12-31 12:12:08',2,2,'提问2','回复2',2),(73,'2020-12-31 12:12:08',3,3,'提问3','回复3',3),(74,'2020-12-31 12:12:08',4,4,'提问4','回复4',4),(75,'2020-12-31 12:12:08',5,5,'提问5','回复5',5),(76,'2020-12-31 12:12:08',6,6,'提问6','回复6',6),(1609421914467,'2020-12-31 13:38:33',1609421746977,NULL,'新课程上线时间\r\n','很快\r\n',0),(1609462016673,'2021-01-01 00:46:56',11,NULL,'123',NULL,0),(1609462020055,'2021-01-01 00:46:59',11,NULL,'456',NULL,1);
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/jspms8s99/upload/1609417157481.png'),(2,'picture2','http://localhost:8080/jspms8s99/upload/1609420946375.jpg'),(3,'picture3','http://localhost:8080/jspms8s99/upload/1609421678652.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussshipingongxiang`
--

DROP TABLE IF EXISTS `discussshipingongxiang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussshipingongxiang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='视频共享评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussshipingongxiang`
--

LOCK TABLES `discussshipingongxiang` WRITE;
/*!40000 ALTER TABLE `discussshipingongxiang` DISABLE KEYS */;
INSERT INTO `discussshipingongxiang` VALUES (121,'2020-12-31 12:12:08',1,1,'评论内容1','回复内容1'),(122,'2020-12-31 12:12:08',2,2,'评论内容2','回复内容2'),(123,'2020-12-31 12:12:08',3,3,'评论内容3','回复内容3'),(124,'2020-12-31 12:12:08',4,4,'评论内容4','回复内容4'),(125,'2020-12-31 12:12:08',5,5,'评论内容5','回复内容5'),(126,'2020-12-31 12:12:08',6,6,'评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussshipingongxiang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussshipinjiaocheng`
--

DROP TABLE IF EXISTS `discussshipinjiaocheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussshipinjiaocheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609421810878 DEFAULT CHARSET=utf8 COMMENT='视频教程评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussshipinjiaocheng`
--

LOCK TABLES `discussshipinjiaocheng` WRITE;
/*!40000 ALTER TABLE `discussshipinjiaocheng` DISABLE KEYS */;
INSERT INTO `discussshipinjiaocheng` VALUES (111,'2020-12-31 12:12:08',1,1,'评论内容1','回复内容1'),(112,'2020-12-31 12:12:08',2,2,'评论内容2','回复内容2'),(113,'2020-12-31 12:12:08',3,3,'评论内容3','回复内容3'),(114,'2020-12-31 12:12:08',4,4,'评论内容4','回复内容4'),(115,'2020-12-31 12:12:08',5,5,'评论内容5','回复内容5'),(116,'2020-12-31 12:12:08',6,6,'评论内容6','回复内容6'),(1609421049799,'2020-12-31 13:24:08',36,1609421004099,'很好的课程',NULL),(1609421786622,'2020-12-31 13:36:26',36,1609421746977,'很好的课程',NULL),(1609421810877,'2020-12-31 13:36:50',1609421650349,1609421746977,'很好',NULL);
/*!40000 ALTER TABLE `discussshipinjiaocheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forum`
--

DROP TABLE IF EXISTS `forum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) DEFAULT NULL COMMENT '帖子标题',
  `content` longtext NOT NULL COMMENT '帖子内容',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `isdone` varchar(200) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609421866924 DEFAULT CHARSET=utf8 COMMENT='论坛表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forum`
--

LOCK TABLES `forum` WRITE;
/*!40000 ALTER TABLE `forum` DISABLE KEYS */;
INSERT INTO `forum` VALUES (81,'2020-12-31 12:12:08','帖子标题1','帖子内容1',1,1,'用户名1','开放'),(82,'2020-12-31 12:12:08','帖子标题2','帖子内容2',2,2,'用户名2','开放'),(83,'2020-12-31 12:12:08','帖子标题3','帖子内容3',3,3,'用户名3','开放'),(84,'2020-12-31 12:12:08','帖子标题4','帖子内容4',4,4,'用户名4','开放'),(85,'2020-12-31 12:12:08','帖子标题5','帖子内容5',5,5,'用户名5','开放'),(86,'2020-12-31 12:12:08','帖子标题6','帖子内容6',6,6,'用户名6','开放'),(1609421866923,'2020-12-31 13:37:46','提升能力','<p>能力</p>\n<p><img src=\"../../..//upload/1609421862762.jpg\" alt=\"\" width=\"760\" height=\"760\" /></p>',0,1609421746977,'123','开放');
/*!40000 ALTER TABLE `forum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609421704177 DEFAULT CHARSET=utf8 COMMENT='系统公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (101,'2020-12-31 12:12:08','标题1','http://localhost:8080/jspms8s99/upload/1609417208772.jpg','内容1\r\n'),(102,'2020-12-31 12:12:08','标题2','http://localhost:8080/jspms8s99/upload/1609417223818.jpg','内容2\r\n'),(103,'2020-12-31 12:12:08','标题3','http://localhost:8080/jspms8s99/upload/1609417230943.jpg','内容3\r\n'),(104,'2020-12-31 12:12:08','标题4','http://localhost:8080/jspms8s99/upload/1609417239995.jpg','内容4\r\n'),(105,'2020-12-31 12:12:08','标题5','http://localhost:8080/jspms8s99/upload/1609417248406.jpg','内容5\r\n'),(106,'2020-12-31 12:12:08','标题6','http://localhost:8080/jspms8s99/upload/1609417258132.jpg','内容6\r\n'),(1609421704176,'2020-12-31 13:35:03','新课程上线','http://localhost:8080/jspms8s99/upload/1609421695075.jpg','新课程\r\n<img src=\"http://localhost:8080/jspms8s99/upload/1609421701816.jpg\" width=\"900\" height=\"560\" _src=\"http://localhost:8080/jspms8s99/upload/1609421701816.jpg\">\r\n');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shipinfenlei`
--

DROP TABLE IF EXISTS `shipinfenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shipinfenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shipinfenlei` varchar(200) NOT NULL COMMENT '视频分类',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shipinfenlei` (`shipinfenlei`)
) ENGINE=InnoDB AUTO_INCREMENT=1609421622402 DEFAULT CHARSET=utf8 COMMENT='视频分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shipinfenlei`
--

LOCK TABLES `shipinfenlei` WRITE;
/*!40000 ALTER TABLE `shipinfenlei` DISABLE KEYS */;
INSERT INTO `shipinfenlei` VALUES (21,'2020-12-31 12:12:08','平面'),(22,'2020-12-31 12:12:08','电商'),(23,'2020-12-31 12:12:08','建筑'),(24,'2020-12-31 12:12:08','影视'),(1609420708494,'2020-12-31 13:18:27','编程'),(1609421622401,'2020-12-31 13:33:41','办公');
/*!40000 ALTER TABLE `shipinfenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shipingongxiang`
--

DROP TABLE IF EXISTS `shipingongxiang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shipingongxiang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shipinmingcheng` varchar(200) NOT NULL COMMENT '视频名称',
  `shipinfengmian` varchar(200) DEFAULT NULL COMMENT '视频封面',
  `shipin` varchar(200) DEFAULT NULL COMMENT '视频',
  `shipinjieshao` longtext COMMENT '视频介绍',
  `shangchuanriqi` date DEFAULT NULL COMMENT '上传日期',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609421975415 DEFAULT CHARSET=utf8 COMMENT='视频共享';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shipingongxiang`
--

LOCK TABLES `shipingongxiang` WRITE;
/*!40000 ALTER TABLE `shipingongxiang` DISABLE KEYS */;
INSERT INTO `shipingongxiang` VALUES (61,'2020-12-31 12:12:08','视频名称1','http://localhost:8080/jspms8s99/upload/shipingongxiang_shipinfengmian1.jpg','','视频介绍1','2020-12-31','用户名1'),(62,'2020-12-31 12:12:08','视频名称2','http://localhost:8080/jspms8s99/upload/1609417502237.jpg','','视频介绍2','2020-12-31','用户名2'),(63,'2020-12-31 12:12:08','视频名称3','http://localhost:8080/jspms8s99/upload/1609417509919.jpg','','视频介绍3','2020-12-31','用户名3'),(64,'2020-12-31 12:12:08','视频名称4','http://localhost:8080/jspms8s99/upload/1609417518817.jpg','','视频介绍4','2020-12-31','用户名4'),(65,'2020-12-31 12:12:08','视频名称5','http://localhost:8080/jspms8s99/upload/1609417536149.jpg','','视频介绍5','2020-12-31','用户名5'),(1609421975414,'2020-12-31 13:39:34','办公软件学习','http://localhost:8080/jspms8s99/upload/1609421963731.jpg','http://localhost:8080/jspms8s99/file/download?fileName=1609421969557.mp4','介绍','2020-12-31','123');
/*!40000 ALTER TABLE `shipingongxiang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shipingoumai`
--

DROP TABLE IF EXISTS `shipingoumai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shipingoumai` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dingdanbianhao` varchar(200) DEFAULT NULL COMMENT '订单编号',
  `shipinbianhao` varchar(200) DEFAULT NULL COMMENT '视频编号',
  `shipinmingcheng` varchar(200) NOT NULL COMMENT '视频名称',
  `shipinfenlei` varchar(200) NOT NULL COMMENT '视频分类',
  `goumaijiage` varchar(200) DEFAULT NULL COMMENT '购买价格',
  `goumairiqi` date DEFAULT NULL COMMENT '购买日期',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`),
  UNIQUE KEY `dingdanbianhao` (`dingdanbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1609421819176 DEFAULT CHARSET=utf8 COMMENT='视频购买';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shipingoumai`
--

LOCK TABLES `shipingoumai` WRITE;
/*!40000 ALTER TABLE `shipingoumai` DISABLE KEYS */;
INSERT INTO `shipingoumai` VALUES (41,'2020-12-31 12:12:08','订单编号1','视频编号1','视频名称1','视频分类1','购买价格1','2020-12-31','备注1','用户名1','联系电话1','未支付'),(42,'2020-12-31 12:12:08','订单编号2','视频编号2','视频名称2','视频分类2','购买价格2','2020-12-31','备注2','用户名2','联系电话2','未支付'),(43,'2020-12-31 12:12:08','订单编号3','视频编号3','视频名称3','视频分类3','购买价格3','2020-12-31','备注3','用户名3','联系电话3','未支付'),(44,'2020-12-31 12:12:08','订单编号4','视频编号4','视频名称4','视频分类4','购买价格4','2020-12-31','备注4','用户名4','联系电话4','未支付'),(45,'2020-12-31 12:12:08','订单编号5','视频编号5','视频名称5','视频分类5','购买价格5','2020-12-31','备注5','用户名5','联系电话5','未支付'),(46,'2020-12-31 12:12:08','订单编号6','视频编号6','视频名称6','视频分类6','购买价格6','2020-12-31','备注6','用户名6','联系电话6','未支付'),(1609421819175,'2020-12-31 13:36:58','2020123121365376001705','1609421626','ps课程视频','办公','199','2020-12-31','','123','12312312312','已支付');
/*!40000 ALTER TABLE `shipingoumai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shipinjiaocheng`
--

DROP TABLE IF EXISTS `shipinjiaocheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shipinjiaocheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shipinbianhao` varchar(200) DEFAULT NULL COMMENT '视频编号',
  `shipinmingcheng` varchar(200) NOT NULL COMMENT '视频名称',
  `shipinfenlei` varchar(200) NOT NULL COMMENT '视频分类',
  `shipinfengmian` varchar(200) DEFAULT NULL COMMENT '视频封面',
  `shipin` varchar(200) DEFAULT NULL COMMENT '视频',
  `shipinjieshao` longtext COMMENT '视频介绍',
  `goumaijiage` int(11) DEFAULT NULL COMMENT '购买价格',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shipinbianhao` (`shipinbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1609421650350 DEFAULT CHARSET=utf8 COMMENT='视频教程';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shipinjiaocheng`
--

LOCK TABLES `shipinjiaocheng` WRITE;
/*!40000 ALTER TABLE `shipinjiaocheng` DISABLE KEYS */;
INSERT INTO `shipinjiaocheng` VALUES (31,'2020-12-31 12:12:08','视频编号1','视频名称1','平面','http://localhost:8080/jspms8s99/upload/1609416909853.jpg','','视频介绍1',1,'2020-12-31',1,1,'2020-12-31 20:14:44',3),(32,'2020-12-31 12:12:08','视频编号2','视频名称2','平面','http://localhost:8080/jspms8s99/upload/1609416921448.jpg','','视频介绍2',2,'2020-12-31',2,2,'2020-12-31 20:15:18',4),(33,'2020-12-31 12:12:08','视频编号3','视频名称3','平面','http://localhost:8080/jspms8s99/upload/1609416958139.jpg','','视频介绍3',3,'2020-12-31',3,3,'2020-12-31 20:15:27',5),(34,'2020-12-31 12:12:08','视频编号4','视频名称4','平面','http://localhost:8080/jspms8s99/upload/1609416987646.jpg','','视频介绍4',4,'2020-12-31',4,4,'2020-12-31 20:16:05',6),(35,'2020-12-31 12:12:08','视频编号5','视频名称5','平面','http://localhost:8080/jspms8s99/upload/1609417096591.jpg','','视频介绍5',5,'2020-12-31',5,5,'2020-12-31 20:18:11',7),(36,'2020-12-31 12:12:08','视频编号6','视频名称6','平面','http://localhost:8080/jspms8s99/upload/1609417039214.jpg','','视频介绍6',6,'2020-12-31',8,6,'2020-12-31 21:36:29',14),(1609421650349,'2020-12-31 13:34:10','1609421626','ps课程视频','办公','http://localhost:8080/jspms8s99/upload/1609421639654.jpg','http://localhost:8080/jspms8s99/upload/1609421665126.mp4','介绍',199,'2020-12-31',1,0,'2020-12-31 21:37:01',5);
/*!40000 ALTER TABLE `shipinjiaocheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shipinpingjia`
--

DROP TABLE IF EXISTS `shipinpingjia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shipinpingjia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dingdanbianhao` varchar(200) DEFAULT NULL COMMENT '订单编号',
  `shipinbianhao` varchar(200) DEFAULT NULL COMMENT '视频编号',
  `shipinmingcheng` varchar(200) DEFAULT NULL COMMENT '视频名称',
  `yonghupingfen` varchar(200) DEFAULT NULL COMMENT '用户评分',
  `pingjianeirong` longtext COMMENT '评价内容',
  `pingjiariqi` date DEFAULT NULL COMMENT '评价日期',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609421938487 DEFAULT CHARSET=utf8 COMMENT='视频评价';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shipinpingjia`
--

LOCK TABLES `shipinpingjia` WRITE;
/*!40000 ALTER TABLE `shipinpingjia` DISABLE KEYS */;
INSERT INTO `shipinpingjia` VALUES (51,'2020-12-31 12:12:08','订单编号1','视频编号1','视频名称1','1','评价内容1','2020-12-31','用户名1'),(52,'2020-12-31 12:12:08','订单编号2','视频编号2','视频名称2','1','评价内容2','2020-12-31','用户名2'),(53,'2020-12-31 12:12:08','订单编号3','视频编号3','视频名称3','1','评价内容3','2020-12-31','用户名3'),(54,'2020-12-31 12:12:08','订单编号4','视频编号4','视频名称4','1','评价内容4','2020-12-31','用户名4'),(55,'2020-12-31 12:12:08','订单编号5','视频编号5','视频名称5','1','评价内容5','2020-12-31','用户名5'),(56,'2020-12-31 12:12:08','订单编号6','视频编号6','视频名称6','1','评价内容6','2020-12-31','用户名6'),(1609421938486,'2020-12-31 13:38:58','2020123121365376001705','1609421626','ps课程视频','5','很好的课程','2020-12-31','123');
/*!40000 ALTER TABLE `shipinpingjia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609421793539 DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
INSERT INTO `storeup` VALUES (1609421032877,'2020-12-31 13:23:51',1609421004099,36,'shipinjiaocheng','视频名称6','http://localhost:8080/jspms8s99/upload/1609417039214.jpg'),(1609421793538,'2020-12-31 13:36:33',1609421746977,1609421650349,'shipinjiaocheng','ps课程视频','http://localhost:8080/jspms8s99/upload/1609421639654.jpg');
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','zu52vlb3p17eswzbvrx0vm2cby2n403w','2020-12-31 12:12:59','2021-01-01 02:00:59'),(2,1609421004099,'11','yonghu','用户','a0sa83yra10abfjc99k4zykuv7zs5iep','2020-12-31 13:23:30','2020-12-31 14:23:30'),(3,1609421746977,'123','yonghu','用户','9kzk6du8xzh8mod8k9h29ic2peaktip4','2020-12-31 13:35:53','2020-12-31 14:35:53'),(4,11,'用户1','yonghu','用户','tgnxzhhj9wfjc0blut5f3whi22mja5qg','2021-01-01 00:46:49','2021-01-01 01:46:50');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2020-12-31 12:12:08');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuming` varchar(200) NOT NULL COMMENT '用户名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuming` (`yonghuming`)
) ENGINE=InnoDB AUTO_INCREMENT=1609421746978 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2020-12-31 12:12:08','用户1','123456','姓名1','http://localhost:8080/jspms8s99/upload/yonghu_touxiang1.jpg','男','13823888881'),(12,'2020-12-31 12:12:08','用户2','123456','姓名2','http://localhost:8080/jspms8s99/upload/yonghu_touxiang2.jpg','男','13823888882'),(13,'2020-12-31 12:12:08','用户3','123456','姓名3','http://localhost:8080/jspms8s99/upload/yonghu_touxiang3.jpg','男','13823888883'),(14,'2020-12-31 12:12:08','用户4','123456','姓名4','http://localhost:8080/jspms8s99/upload/yonghu_touxiang4.jpg','男','13823888884'),(15,'2020-12-31 12:12:08','用户5','123456','姓名5','http://localhost:8080/jspms8s99/upload/yonghu_touxiang5.jpg','男','13823888885'),(16,'2020-12-31 12:12:08','用户6','123456','姓名6','http://localhost:8080/jspms8s99/upload/yonghu_touxiang6.jpg','男','13823888886'),(1609421746977,'2020-12-31 13:35:46','123','123','陈一','http://localhost:8080/jspms8s99/upload/1609421763236.jpeg','女','12312312312');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-01  9:24:19
