-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 03, 2021 at 03:00 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `parcel_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `bank`
--

CREATE TABLE `bank` (
  `bank_id` int(11) NOT NULL,
  `bank_name` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bank`
--

INSERT INTO `bank` (`bank_id`, `bank_name`) VALUES
(1, 'AFFIN BANK BERHAD'),
(2, 'ALLIANCE BANK MALAYSIA BERHAD'),
(3, 'AMBANK (M) BERHAD'),
(4, 'BNP PARIBAS MALAYSIA BERHAD'),
(5, 'BANGKOK BANK BERHAD'),
(6, 'BANK OF AMERICA MALAYSIA BERHAD'),
(7, 'BANK OF CHINA (MALAYSIA) BERHAD'),
(8, 'CIMB BANK BERHAD'),
(9, 'CHINA CONSTRUCTION BANK (MALAYSIA) BERHAD'),
(10, 'CITIBANK BERHAD'),
(11, 'DEUTSCHE BANK (MALAYSIA) BERHAD'),
(12, 'HSBC BANK MALAYSIA BERHAD'),
(13, 'HONG LEONG BANK BERHAD'),
(14, 'INDIA INTERNATIONAL BANK (MALAYSIA) BERHAD'),
(15, 'MALAYAN BANKING BERHAD'),
(16, 'OCBC BANK (MALAYSIA) BERHAD'),
(17, 'PUBLIC BANK BERHAD'),
(18, 'RHB BANK BERHAD'),
(19, 'AFFIN ISLAMIC BANK BERHAD'),
(20, 'ALLIANCE ISLAMIC BANK BERHAD'),
(21, 'AMBANK ISLAMIC BERHAD'),
(22, 'BANK ISLAM MALAYSIA BERHAD'),
(23, 'BANK MUAMALAT MALAYSIA BERHAD'),
(24, 'CIMB ISLAMIC BANK BERHAD'),
(25, 'HSBC AMANAH MALAYSIA BERHAD'),
(26, 'HONG LEONG ISLAMIC BANK BERHAD'),
(27, 'MBSB BANK BERHAD'),
(28, 'MAYBANK ISLAMIC BERHAD'),
(29, 'OCBC AL-AMIN BANK BERHAD'),
(30, 'PUBLIC ISLAMIC BANK BERHAD'),
(31, 'RHB ISLAMIC BANK BERHAD'),
(32, 'STANDARD CHARTERED SAADIQ BERHAD');

-- --------------------------------------------------------

--
-- Table structure for table `parcel`
--

CREATE TABLE `parcel` (
  `parcel_id` int(11) NOT NULL,
  `parcel_weight` decimal(10,2) NOT NULL,
  `parcel_sender` int(11) NOT NULL COMMENT 'refer sender.sender_id',
  `parcel_receiver` int(11) NOT NULL COMMENT 'refer receiver.receiver_id'
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `parcel`
--

INSERT INTO `parcel` (`parcel_id`, `parcel_weight`, `parcel_sender`, `parcel_receiver`) VALUES
(1, '6.12', 0, 0),
(2, '3.31', 6, 3),
(3, '2.53', 7, 4),
(4, '4.91', 8, 5),
(5, '0.64', 9, 6),
(6, '9.27', 10, 7),
(7, '4.07', 11, 8),
(8, '8.03', 12, 9),
(9, '0.32', 13, 10),
(10, '9.73', 14, 11),
(11, '0.42', 15, 12),
(12, '7.43', 16, 13),
(13, '9.24', 17, 14),
(14, '7.34', 18, 15),
(15, '1.64', 19, 16),
(16, '6.27', 20, 17),
(17, '9.83', 21, 18),
(18, '6.72', 22, 19),
(19, '6.92', 23, 20),
(20, '3.27', 24, 21),
(21, '3.36', 25, 22),
(22, '3.63', 27, 23),
(23, '7.35', 30, 24),
(24, '6.57', 35, 25),
(25, '2.05', 36, 26),
(26, '4.14', 37, 27),
(27, '0.25', 38, 28),
(28, '8.25', 39, 29),
(29, '8.98', 40, 30),
(30, '6.66', 41, 31),
(31, '5.27', 42, 32),
(32, '4.99', 43, 33),
(33, '3.11', 44, 34),
(34, '7.84', 45, 35),
(35, '4.61', 46, 36),
(36, '8.02', 47, 37),
(37, '8.86', 48, 38),
(38, '2.16', 49, 39),
(39, '4.38', 50, 40),
(40, '5.94', 51, 41),
(41, '5.84', 52, 42);

-- --------------------------------------------------------

--
-- Table structure for table `parcel_details`
--

CREATE TABLE `parcel_details` (
  `pd_id` int(11) NOT NULL,
  `pd_parcel` int(11) NOT NULL,
  `pd_rate` int(11) NOT NULL COMMENT 'refer rate.rate_id',
  `pd_tracking_no` varchar(50) NOT NULL,
  `reg_date` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `parcel_details`
--

INSERT INTO `parcel_details` (`pd_id`, `pd_parcel`, `pd_rate`, `pd_tracking_no`, `reg_date`) VALUES
(1, 3, 6, '7202111241450364', '2021-11-24 14:50:36'),
(2, 4, 10, 'SBH82021112415065', '2021-11-24 15:06:49'),
(3, 5, 2, 'SGR92021112415426', '2021-11-24 15:42:46'),
(4, 6, 19, 'NSN102021112415477', '2021-11-24 15:47:28'),
(5, 7, 9, 'NSN112021112415528', '2021-11-24 15:52:00'),
(6, 8, 17, 'MLK122021112415529', '2021-11-24 15:52:41'),
(7, 9, 1, 'JHR1320211124155610', '2021-11-24 15:56:07'),
(8, 10, 20, 'MLK1420211124155811', '2021-11-24 15:58:32'),
(9, 11, 1, 'PLS1520211124160112', '2021-11-24 16:01:21'),
(10, 12, 15, 'PHG1620211124160513', '2021-11-24 16:05:46'),
(11, 13, 19, 'NSN1720211124160814', '2021-11-24 16:08:15'),
(12, 14, 15, 'MLK1820211124161115', '2021-11-24 16:11:35'),
(13, 15, 4, 'MLK1920211124161316', '2021-11-24 16:13:48'),
(14, 16, 13, 'KDH2020211124161417', '2021-11-24 16:14:33'),
(15, 17, 20, 'KTN2120211124161718', '2021-11-24 16:17:18'),
(16, 18, 14, 'KDH2220211124162119', '2021-11-24 16:21:10'),
(17, 19, 14, 'LBN2320211124162220', '2021-11-24 16:22:44'),
(18, 20, 7, 'SWK2420211124162421', '2021-11-24 16:24:50'),
(19, 21, 7, 'MLK2520211124162522', '2021-11-24 16:25:27'),
(20, 22, 8, 'KTN2720211124162923', '2021-11-24 16:29:17'),
(21, 23, 15, 'MLK3020211124210924', '2021-11-24 21:09:17'),
(22, 24, 14, 'MLK3520211127233525', '2021-11-27 23:35:09'),
(23, 25, 5, 'MLK3620211128095126', '2021-11-28 09:51:44'),
(24, 26, 9, 'MLK3720211128095827', '2021-11-28 09:58:25'),
(25, 27, 1, 'JHR3820211128105928', '2021-11-28 10:59:19'),
(26, 28, 17, 'JHR3920211128112329', '2021-11-28 11:23:58'),
(27, 29, 18, 'MLK4020211128113630', '2021-11-28 11:36:52'),
(28, 30, 14, 'MLK4120211130223731', '2021-11-30 22:37:32'),
(29, 31, 11, 'JHR4220211130225532', '2021-11-30 22:55:01'),
(30, 32, 10, 'MLK4320211130225933', '2021-11-30 22:59:03'),
(31, 33, 7, 'PNG4420211130230634', '2021-11-30 23:06:23'),
(32, 34, 16, 'JHR4520211130230935', '2021-11-30 23:09:32'),
(33, 35, 10, 'MLK4620211201103836', '2021-12-01 10:38:20'),
(34, 36, 17, 'MLK4720211201104137', '2021-12-01 10:41:30'),
(35, 37, 18, 'JHR4820211201143338', '2021-12-01 14:33:17'),
(36, 38, 5, 'JHR4920211201144039', '2021-12-01 14:40:34'),
(37, 39, 9, 'JHR5020211201144540', '2021-12-01 14:45:45'),
(38, 40, 12, 'MLK5120211203214641', '2021-12-03 21:46:04'),
(39, 41, 12, 'JHR5220211203214842', '2021-12-03 21:48:32');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `payment_id` int(11) NOT NULL,
  `payment_trans` int(11) NOT NULL COMMENT 'refer trans.trans_id',
  `payment_ref_id` varchar(50) NOT NULL COMMENT 'payment_gateway_ref_no\r\n',
  `payment_amount` decimal(10,2) NOT NULL,
  `payment_cc` varchar(50) NOT NULL,
  `payment_cvv` varchar(10) NOT NULL,
  `payment_bank` varchar(50) NOT NULL,
  `reg_date` datetime NOT NULL DEFAULT current_timestamp(),
  `payment_status` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`payment_id`, `payment_trans`, `payment_ref_id`, `payment_amount`, `payment_cc`, `payment_cvv`, `payment_bank`, `reg_date`, `payment_status`) VALUES
(1, 30, '30202111302310', '30.30', '1723164321194321', '127', 'AMBANK (M) BERHAD', '2021-11-30 23:10:02', 1),
(2, 30, '30202112011031', '30.30', '1234512345123456', '123', 'AMBANK (M) BERHAD', '2021-12-01 10:31:02', 1),
(3, 31, '31202112011038', '14.85', '1234', '123', 'PUBLIC BANK BERHAD', '2021-12-01 10:38:36', 1),
(4, 32, '32202112011041', '20.15', '1234', '123', 'BNP PARIBAS MALAYSIA BERHAD', '2021-12-01 10:41:41', 1),
(5, 32, '32202112011048', '20.15', '12345123451234567', '123', 'AFFIN BANK BERHAD', '2021-12-01 10:48:28', 1),
(6, 32, '32202112011051', '20.15', '1234', '123', 'AFFIN BANK BERHAD', '2021-12-01 10:51:59', 1),
(7, 32, '32202112011052', '20.15', '123451234512345', '123', 'AFFIN BANK BERHAD', '2021-12-01 10:52:40', 1),
(8, 35, '35202112011446', '22.15', '1234512345123456', '123', 'CIMB BANK BERHAD', '2021-12-01 14:46:37', 1),
(9, 37, '37202112032149', '25.65', '1234512345123456', '123', 'BANK OF CHINA (MALAYSIA) BERHAD', '2021-12-03 21:49:41', 1);

-- --------------------------------------------------------

--
-- Table structure for table `rate`
--

CREATE TABLE `rate` (
  `rate_id` int(11) NOT NULL,
  `rate_weight_min` decimal(10,2) NOT NULL,
  `rate_weight_max` decimal(10,2) NOT NULL,
  `rate_within_state` decimal(10,2) NOT NULL,
  `rate_within_peninsular` decimal(10,2) NOT NULL,
  `rate_sabah_sarawak` decimal(10,2) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rate`
--

INSERT INTO `rate` (`rate_id`, `rate_weight_min`, `rate_weight_max`, `rate_within_state`, `rate_within_peninsular`, `rate_sabah_sarawak`) VALUES
(1, '0.00', '0.50', '8.00', '8.50', '14.85'),
(2, '0.51', '1.00', '9.00', '10.05', '21.20'),
(3, '1.01', '1.50', '10.05', '11.15', '27.55'),
(4, '1.51', '2.00', '10.60', '12.20', '33.90'),
(5, '2.01', '2.50', '11.65', '15.15', '40.30'),
(6, '2.51', '3.00', '12.70', '16.90', '46.65'),
(7, '3.01', '3.50', '13.80', '18.65', '53.00'),
(8, '3.51', '4.00', '14.30', '20.40', '59.35'),
(9, '4.01', '4.50', '14.85', '22.15', '65.70'),
(10, '4.51', '5.00', '14.85', '23.30', '72.10'),
(11, '5.01', '5.50', '15.90', '24.50', '78.45'),
(12, '5.51', '6.00', '15.90', '25.65', '84.80'),
(13, '6.01', '6.50', '16.95', '26.80', '91.15'),
(14, '6.51', '7.00', '16.95', '28.00', '97.50'),
(15, '7.01', '7.50', '18.00', '29.15', '103.90'),
(16, '7.51', '8.00', '18.00', '30.30', '110.25'),
(17, '8.01', '8.50', '20.15', '31.50', '116.60'),
(18, '8.51', '9.00', '20.15', '32.65', '122.95'),
(19, '9.01', '9.50', '21.20', '33.80', '129.30'),
(20, '9.51', '10.00', '21.20', '35.00', '135.70');

-- --------------------------------------------------------

--
-- Table structure for table `receiver`
--

CREATE TABLE `receiver` (
  `r_id` int(11) NOT NULL,
  `r_name` varchar(50) NOT NULL,
  `r_phone` varchar(50) NOT NULL,
  `r_add` varchar(50) NOT NULL,
  `r_city` varchar(50) NOT NULL,
  `r_postcode` varchar(10) NOT NULL,
  `r_state` int(11) NOT NULL COMMENT 'refer state.state_id'
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `receiver`
--

INSERT INTO `receiver` (`r_id`, `r_name`, `r_phone`, `r_add`, `r_city`, `r_postcode`, `r_state`) VALUES
(1, 'AMINAH', '123456', 'TEST1', 'TEST2', '00100', 2),
(2, 'ABU', '234213', 'TEST', 'TEST', '12342', 8),
(3, 'HALIM', '235235', 'TEST', 'ETST', '43244', 6),
(4, 'Wahab', '45747', 'jhrtjuhrtu', 'tjurtujrt', '56746', 6),
(5, 'MUHAMMAD IKMAL BIN ADNAN', '0198792131', '4, KM 20, KUNJUNG MENANTI', 'KUNDASANG', '81000', 10),
(6, 'NUR IZZATI BT HISHAM', '0197782140', '40, JLN MS 21, TAMAN MAS SURIA ', 'SHAH ALAM ', '51000', 12),
(7, 'hrtjtrj', '75457', 'htrjt', 'tjhrtj', '57755', 5),
(8, 'hrtjtrj', '6745754', 'htrhrtjhtr', 'htrhjtruj', '57577', 5),
(9, 'fgjmfjfry', '56747', 'jfrjrj', 'jrtjtr', '45745', 4),
(10, 'y4re5tuy45tu', '5477', 'tjhtruj', 'jhrtjyrt', '54757', 1),
(11, 'jtyjtyjkty', '7457457', 'jytrjtry', 'tyrjtryj', '67456', 4),
(12, 'jrtyjrtyjry', '574574', 'jntjty', 'jhgjktyk', '4657846578', 9),
(13, 'rtjtrjutr', '645653467', 'jrytjrtyj', 'jrtyjrtyj', '57567', 6),
(14, 'rtujrttrjtrj', '547457', 'jrtyjtryj', 'trjtrj', '57777', 5),
(15, 'trjutryiurt6yiu', '74574567', 'jhfrtjrt', 'hftjtrd', '54757', 4),
(16, 'gjkgjkghj', '5765757547', 'hfghfhhh', 'gfhfghfg', '57575', 4),
(17, 'ugyktuyityi', '65858', 'jkyuhioyu', 'hjkuy', '79797', 2),
(18, 'fhtfdjtrjt', '654876548', 'kytktyk', 'jygthkty', '68767', 3),
(19, 'htrjtrjtr', '57457', 'uytrujtr', 'htrhjtrtrjtr', '64567', 2),
(20, 'htjhrtjhrt', '57457', 'rjrtyj', 'jtrjtr', '6346', 15),
(21, 'fghtrjrtj', '373457453', 'jmrtyjkrtkjy', 'jtyjytr', '57757', 11),
(22, 'htfrjtrjrtj', '5745754', 'trfjrtfjrt', 'jfrtjrtyfj', '65767', 4),
(23, 'ggerher', '4634567', 'hetrhtre', 'gtrhyter', '63466', 3),
(24, 'Eunice', '0176863120', '101, Bukit Rambai Indah', 'Cheng', '75350', 4),
(25, 'EUNICE FOO', '01898653368', '59,JALAN SRI WANGSA, TAMAN SRI WANGSA', 'BATU BERENDAM', '75350', 4),
(26, 'JOSLYN FOO', '0176225433', 'N0 8, JALAN SAGA 9, TAMAN PG 9', 'ULU TIRAM', '81600', 4),
(27, 'JANEY FOO', '0126122642', '637, JLN DELIMA 5, TMN BUKIT MELAKA', 'BUKIT BERUANG', '75450', 4),
(28, 'JOSLYN FOO', '0189920111', '90,JLN SAGA, TMN SAGA', 'ULU TIRAM', '81600', 1),
(29, 'joslyn ', '0162859670', 'no 8, jln tun mutahie', 'ulu tiram', '81600', 1),
(30, 'JOSLYN FOO ', '0126122642', 'NO,8 ,JALAN TP7, TMN TP7', 'MELAKA TENGAH', '75450', 4),
(31, 'JANEY FOO', '0152231124', '7, JLN TP 7, TMN TP 7,', 'SUNGAI UDANG', '76100', 4),
(32, 'JANEY', '0122829911', '59,JLN SSE1, TAMAN SEE QQ1', 'JOHOR BAHRU ', '86100', 1),
(33, 'JANEY', '0122211121', '90,JLN SSS', 'MELAKA', '75350', 4),
(34, 'asasas', '2223232', 'xasxaxsasx', 'xasxSAas', '333344', 7),
(35, 'AISYAH', '0198821123', 'NO 8, JALAN TP 7, TMN TP 7', 'ULU TIRAM', '81622', 1),
(36, 'EUNICE FOO', '0162850670', '59, JLN SRI WANGSA, TMN SRI WANGSA', 'BATU BERENDAM', '75350', 4),
(37, 'aisyah', '01222123', '637,jln delima 5', 'melaka', '75350', 4),
(38, 'NURUL AISYAH ', '0162850670', '637-B,JALAN TP7, TMN TP7', 'ULU TIRAM', '81600', 1),
(39, 'NURUL AISYAH', '0162850670', '637,JLN TP 7, TMN TP7', 'ULU TIRAM', '81600', 1),
(40, 'NURUL AISYAH', '0126125368', '637,JLN TP 7, TMN TP7', 'ULU TIRAM', '81600', 1),
(41, 'EUNICE FOO', '0125532221', 'NO 8, JLN TP 7, TMN TP7', 'SUNGAI UDANG', '76100', 4),
(42, 'EE SUEY TENG ', '0125532221', 'NO 60, JALAN PD3, TMN PD3', 'ULU TIRAM', '81600', 1);

-- --------------------------------------------------------

--
-- Table structure for table `sender`
--

CREATE TABLE `sender` (
  `sender_id` int(11) NOT NULL,
  `sender_name` varchar(50) NOT NULL,
  `sender_mykad` varchar(50) NOT NULL,
  `sender_phone` varchar(50) NOT NULL,
  `sender_add` varchar(50) NOT NULL,
  `sender_city` varchar(50) NOT NULL,
  `sender_postcode` varchar(10) NOT NULL,
  `sender_state` varchar(50) NOT NULL COMMENT 'refer state.state_id'
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sender`
--

INSERT INTO `sender` (`sender_id`, `sender_name`, `sender_mykad`, `sender_phone`, `sender_add`, `sender_city`, `sender_postcode`, `sender_state`) VALUES
(1, 'Nurul', '1234', '1234', '1234', 'test', 'test', '3'),
(2, 'Siti Syakinah Bakry', '041213041298', '0198886566', '101, Taman Rambai Indah', 'Tangga Batu', '75400', '4'),
(3, 'EUNICE FOO XUAN XUAN', '002202041234', '0167321091', '5, JALAN KM 5, KESIDANG MERAK', 'BATU BERENDAM', '75350', '4'),
(4, 'SITI', '1234', '12345', 'TEST', 'TEST', '75350', '4'),
(5, 'ALI', '124124', '124124', 'TEST', 'TEST', '13122', '14'),
(6, 'AMIN', '235235', '52353', 'TETS', 'TEST', '12345', '9'),
(7, 'Abdul', '2141234', '4124124', 'fsgewgtwe', 'gsrgwerg', '32555', '13'),
(8, 'SITI AISYAH BINTI BAKRY', '001123050476', '01132110987', '101, TAMAN RAMBAI INDAH', 'TANGGA BATU', '75400', '4'),
(9, 'NUR AMINAH BT TALIB', '980918021324', '0185621256', '12, LOT SERI WANGSA', 'UJUNG PASIR', '00120', '9'),
(10, 'gsrdgher', '43745', '745754', 'tfjhtrfj', 'jfjfy', '57457', '9'),
(11, 'fsfgewsag', '634634', '3463456', 'ghtrjhrt', 'tghjtru', '54674', '7'),
(12, 'gjhrtjuhtr', '547574', '547457', 'fgjfyj', 'fjfr', '75675', '4'),
(13, 'bfthgrtj', '57y547', '5745', 'jtryjry', 'hjtryj', '57577', '1'),
(14, 'hftrjhrt', '574567', '75687658', 'gyhkjtyk', 'jtyuktuy', '86868', '4'),
(15, 'htfdrjhtrj', '746574', '74577', 'nfgjnfg', 'nfgnfg', '57577', '9'),
(16, 'fgdsfrhgerh', '3634567534', '634567534', 'rtjrtyj', 'jrjr', '54757', '6'),
(17, 'gdrfherth', '76587568', '85687568', 'mgfyhk', 'yktyk', '67658', '5'),
(18, 'sgrshgerher', '346346', '5674574', 'hfgjfj', 'fjfyjk', '57457', '4'),
(19, 'dhtrhtrehtr', '5745745', '7457457', 'hrturtuh', 'hjftrjhrt', '57577', '6'),
(20, 'uyohulkuhgylkyul', '7478465874', '46845686458', 'hgjgyjkygt', 'hkghkuyt', '67856', '2'),
(21, 'dvsgberh', '5674574', '5756876', 'thyutrjrty', 'nfjryj', '74574', '3'),
(22, 'gerherh', '4234634', '46346', 'hgtjhrt', 'hrhetr', '65666', '2'),
(23, 'gerhe', '6345645', '547457', 'nfgj', 'jhnfrtjm', '54745', '15'),
(24, 'gfdhetrjh', '346346', '6346346', 'hetrjhter', 'jtrjtrj', '57577', '10'),
(25, 'ertyeuye', '56734747', '5437457', 'bdgfhdtfgjh', 'hfdtjhtr', '57577', '6'),
(26, '', '', '', '', '', '', '1'),
(27, 'hrtjrtjrtj', '65745687', '65487568', 'yjyfgtjkty', 'jktykty', '34555', '4'),
(28, '', '', '', '', '', '', '1'),
(29, '', '', '', '', '', '', '1'),
(30, 'Aisyah', '000929040168', '0187688286', '4, Jalan BBP 3, Taman Batu Berendam Putra', 'Batu Berendam', '75350', '4'),
(31, '', '', '', '', '', '', '1'),
(32, '', '', '', '', '', '', '1'),
(33, 'EUNICE', '000219040120', '0162850670', '59,JALAN SRI WANGSA, TAMAN SRI WANGSA', 'MELAKA', '75350', '4'),
(34, 'EUNICE FOO', '000210920220', '0126122642', '59, JALAN SRI WANGSA, TAMAN SRI WANGSA', 'MELAKA', '75350', '4'),
(35, 'NURUL AISYAH', '000929040523', '0176125433', 'NO 3, JALAN BBP 3, TAMAN BBP 3', 'BATU BERENDAM', '75350', '4'),
(36, 'EUNICE FOO', '000219040120', '0189865368', '59,JALAN SRI WANGSA,TAMAN SRI WANGSA', 'BATU BERENDAM', '75350', '4'),
(37, 'EUNICE', '000219040120', '0189865368', '59,JLN SRI WANGSA, TMN SRI WANGSA', 'BATU BERENDAM', '75350 ', '4'),
(38, 'EUNICE', '000219040120', '0199903322', '59,JLN SRI WANGSA , TMN SRI WANGSA', 'BATU BERENDAM', '75350', '4'),
(39, 'eunice', '000219040120', '0189865368', '59,jln sri wangsa', 'batu berendam', '75350', '4'),
(40, 'EUNICE FOO', '00219040120', '0189865368', '59,JLN SRI WANGSA,TMN SRI WANGSA', 'BATU BERENDAM', '75350', '4'),
(41, 'EUNICE', '000219040120', '0126122642', '59,JLN SRI WANGSA,TMN SRI WANGSA', 'BATU BERENDAM', '75350', '4'),
(42, 'FOO', '090001102201', '01222322231', '59,JLN SRIW ANSAA', 'MELAKA', '75350', '4'),
(43, 'EUNICE', '000219040120', '0126122642', '59', 'MELAKA', '75350', '4'),
(44, 'EUNICE', '000219040120', '0126122642', '59,jln sri wna1', 'mellak', '75350', '4'),
(45, 'EUNICE', '000219040120', '0126122642', '59,JLN SRI WANGSA, TMN SRI WANGSA', 'BATU BERENDAM', '75350', '4'),
(46, 'NURUL AISYAH', '000929040123', '0126122543', '59, JALAN BBP 3, TMN BBP 3', 'BATU BERENDAM ', '75350', '4'),
(47, 'EUNICE', '00021903332211', '0122211234', '59,JLN SRI WANGSA', 'BATU BERENDAM', '75350', '4'),
(48, 'EUNICE FOO', '000219040120', '0126122642', '59,JALAN SRI WANGSA,TMN SRI WANGSA', 'BATU BERENDAM', '75350', '4'),
(49, 'EUNICE FOO', '000219040120', '0126122642', '59, JLN SRI WANGSA, TMN SRI WANGSA', 'BATU BERENDAM', '75350', '4'),
(50, 'EUNICE FOO', '000219040120', '0126122642', '59, JLN SRI WANGSA,TMN SRI WANGSA', 'BATU BERENDAM', '75350', '4'),
(51, 'JANEY FOO', '000219040120', '0126122231', '637-B,JALAN DELIMA 5, TMN BUKIT MELAKA', 'MELAKA', '75450', '4'),
(52, 'EUNICE FOO', '000219040120', '0122211222', '59,JLN SRI WANGSA,TMN SRI WANGSA', 'MELAKA', '75350', '4');

-- --------------------------------------------------------

--
-- Table structure for table `state`
--

CREATE TABLE `state` (
  `state_id` int(11) NOT NULL,
  `state_name` varchar(50) NOT NULL,
  `state_iso` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `state`
--

INSERT INTO `state` (`state_id`, `state_name`, `state_iso`) VALUES
(1, 'JOHOR', 'JHR'),
(2, 'KEDAH', 'KDH'),
(3, 'KELANTAN', 'KTN'),
(4, 'MELAKA', 'MLK'),
(5, 'NEGERI SEMBILAN', 'NSN'),
(6, 'PAHANG', 'PHG'),
(7, 'PULAU PINANG', 'PNG'),
(8, 'PERAK', 'PRK'),
(9, 'PERLIS', 'PLS'),
(10, 'SABAH', 'SBH'),
(11, 'SARAWAK', 'SWK'),
(12, 'SELANGOR', 'SGR'),
(13, 'TERENGGANU', 'TRG'),
(14, 'WP KUALA LUMPUR', 'KUL'),
(15, 'WP LABUAN', 'LBN'),
(16, 'WP PUTRAJAYA', 'PJY');

-- --------------------------------------------------------

--
-- Table structure for table `trans`
--

CREATE TABLE `trans` (
  `trans_id` int(11) NOT NULL,
  `trans_parcel` int(11) NOT NULL COMMENT 'refer parcel.parcel_id',
  `trans_no` varchar(50) NOT NULL,
  `trans_price` decimal(10,2) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `trans`
--

INSERT INTO `trans` (`trans_id`, `trans_parcel`, `trans_no`, `trans_price`) VALUES
(1, 5, '9202115426', '0.00'),
(2, 6, '10202115477', '0.00'),
(3, 7, '11202115528', '22.15'),
(4, 8, '12202115529', '31.50'),
(5, 9, '132021155610', '8.50'),
(6, 10, '142021155811', '0.00'),
(7, 11, '152021160112', '8.50'),
(8, 12, '162021160513', '29.15'),
(9, 13, '172021160814', '33.80'),
(10, 14, '182021161115', '29.15'),
(11, 15, '192021161316', '12.20'),
(12, 16, '202021161417', '26.80'),
(13, 17, '212021161718', '0.00'),
(14, 18, '222021162119', '16.95'),
(15, 19, '232021162220', '16.95'),
(16, 20, '242021162421', '53.00'),
(17, 21, '252021162522', '18.65'),
(18, 22, '272021162923', '20.40'),
(19, 23, '302021210924', '18.00'),
(20, 24, '352021233525', '16.95'),
(21, 25, '362021095126', '11.65'),
(22, 26, '372021095827', '14.85'),
(23, 27, '382021105928', '8.50'),
(24, 28, '392021112329', '31.50'),
(25, 29, '402021113630', '20.15'),
(26, 30, '412021223731', '16.95'),
(27, 31, '422021225532', '24.50'),
(28, 32, '432021225933', '14.85'),
(29, 33, '442021230634', '18.65'),
(30, 34, '452021230935', '30.30'),
(31, 35, '462021103836', '14.85'),
(32, 36, '472021104137', '20.15'),
(33, 37, '482021143338', '32.65'),
(34, 38, '492021144039', '15.15'),
(35, 39, '502021144540', '22.15'),
(36, 40, '512021214641', '15.90'),
(37, 41, '522021214842', '25.65');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bank`
--
ALTER TABLE `bank`
  ADD PRIMARY KEY (`bank_id`);

--
-- Indexes for table `parcel`
--
ALTER TABLE `parcel`
  ADD PRIMARY KEY (`parcel_id`);

--
-- Indexes for table `parcel_details`
--
ALTER TABLE `parcel_details`
  ADD PRIMARY KEY (`pd_id`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`payment_id`);

--
-- Indexes for table `rate`
--
ALTER TABLE `rate`
  ADD PRIMARY KEY (`rate_id`);

--
-- Indexes for table `receiver`
--
ALTER TABLE `receiver`
  ADD PRIMARY KEY (`r_id`);

--
-- Indexes for table `sender`
--
ALTER TABLE `sender`
  ADD PRIMARY KEY (`sender_id`);

--
-- Indexes for table `state`
--
ALTER TABLE `state`
  ADD PRIMARY KEY (`state_id`);

--
-- Indexes for table `trans`
--
ALTER TABLE `trans`
  ADD PRIMARY KEY (`trans_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bank`
--
ALTER TABLE `bank`
  MODIFY `bank_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `parcel`
--
ALTER TABLE `parcel`
  MODIFY `parcel_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT for table `parcel_details`
--
ALTER TABLE `parcel_details`
  MODIFY `pd_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `payment_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `rate`
--
ALTER TABLE `rate`
  MODIFY `rate_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `receiver`
--
ALTER TABLE `receiver`
  MODIFY `r_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT for table `sender`
--
ALTER TABLE `sender`
  MODIFY `sender_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- AUTO_INCREMENT for table `state`
--
ALTER TABLE `state`
  MODIFY `state_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `trans`
--
ALTER TABLE `trans`
  MODIFY `trans_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
