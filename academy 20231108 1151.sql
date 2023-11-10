-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.27-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema academy
--

CREATE DATABASE IF NOT EXISTS academy;
USE academy;

--
-- Definition of table `equipamento`
--

DROP TABLE IF EXISTS `equipamento`;
CREATE TABLE `equipamento` (
  `id` int(11) NOT NULL,
  `equipamento` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `equipamento`
--

/*!40000 ALTER TABLE `equipamento` DISABLE KEYS */;
INSERT INTO `equipamento` (`id`,`equipamento`) VALUES 
 (1,'LEG PRESS'),
 (2,'EXTENSORA');
/*!40000 ALTER TABLE `equipamento` ENABLE KEYS */;


--
-- Definition of table `equipamento_fluxo`
--

DROP TABLE IF EXISTS `equipamento_fluxo`;
CREATE TABLE `equipamento_fluxo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `equipamentoId` int(11) NOT NULL,
  `horario` datetime NOT NULL,
  `presenca` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `equipamentoId` (`equipamentoId`),
  CONSTRAINT `equipamento_fluxo_ibfk_1` FOREIGN KEY (`equipamentoId`) REFERENCES `equipamento` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `equipamento_fluxo`
--

/*!40000 ALTER TABLE `equipamento_fluxo` DISABLE KEYS */;
INSERT INTO `equipamento_fluxo` (`id`,`equipamentoId`,`horario`,`presenca`) VALUES 
 (1,1,'2023-10-04 12:00:00',0),
 (2,2,'2023-10-04 12:00:00',1),
 (3,1,'2023-10-04 13:00:00',0),
 (4,2,'2023-10-04 13:00:00',0),
 (5,1,'2023-10-04 14:00:00',0),
 (6,2,'2023-10-04 14:00:00',0),
 (7,1,'2023-10-04 15:00:00',0),
 (8,2,'2023-10-04 15:00:00',0),
 (9,1,'2023-10-04 16:00:00',0),
 (10,2,'2023-10-04 16:00:00',0),
 (11,1,'2023-10-04 17:00:00',0),
 (12,2,'2023-10-04 17:00:00',0),
 (13,1,'2023-10-04 18:00:00',0),
 (14,2,'2023-10-04 18:00:00',0),
 (15,1,'2023-10-04 19:00:00',0),
 (16,2,'2023-10-04 19:00:00',0),
 (17,1,'2023-10-04 20:00:00',0),
 (18,2,'2023-10-04 20:00:00',0),
 (19,1,'2023-10-04 21:00:00',1),
 (20,2,'2023-10-04 21:00:00',0),
 (21,1,'2023-10-04 22:00:00',1),
 (22,2,'2023-10-04 22:00:00',1),
 (23,1,'2023-10-04 23:00:00',1),
 (24,2,'2023-10-04 23:00:00',0);
/*!40000 ALTER TABLE `equipamento_fluxo` ENABLE KEYS */;


--
-- Definition of table `pagamento`
--

DROP TABLE IF EXISTS `pagamento`;
CREATE TABLE `pagamento` (
  `id` int(11) NOT NULL,
  `usuarioId` int(11) NOT NULL,
  `data` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `usuarioId` (`usuarioId`),
  CONSTRAINT `pagamento_ibfk_1` FOREIGN KEY (`usuarioId`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pagamento`
--

/*!40000 ALTER TABLE `pagamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagamento` ENABLE KEYS */;


--
-- Definition of table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nome` varchar(15) NOT NULL,
  `sobrenome` varchar(15) NOT NULL,
  `CPF` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usuario`
--

/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;


--
-- Definition of table `usuario_fluxo`
--

DROP TABLE IF EXISTS `usuario_fluxo`;
CREATE TABLE `usuario_fluxo` (
  `id` int(11) NOT NULL,
  `contagem` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usuario_fluxo`
--

/*!40000 ALTER TABLE `usuario_fluxo` DISABLE KEYS */;
INSERT INTO `usuario_fluxo` (`id`,`contagem`) VALUES 
 (1,937);
/*!40000 ALTER TABLE `usuario_fluxo` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
