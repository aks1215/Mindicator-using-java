-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3307
-- Generation Time: Feb 18, 2024 at 03:36 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mindic`
--
CREATE DATABASE IF NOT EXISTS `mindic` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `mindic`;

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `passw` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `passw`) VALUES
(1, 'aks', 'ak@gmail.com'),
(2, 'aks', 'ak@gmail.com'),
(3, 'yog', '2121'),
(4, 'abc', '222'),
(5, 'zzz', 'zzz@gmail.com'),
(6, 'yog', '111'),
(7, 'akk', '321'),
(8, 'akk', '111'),
(9, 'abc', '123'),
(10, 'xyz', '123'),
(11, 'pratiksha', '111'),
(12, 'ddd', '444');

-- --------------------------------------------------------

--
-- Table structure for table `routpa`
--

CREATE TABLE `routpa` (
  `id` int(10) NOT NULL,
  `src` varchar(20) NOT NULL,
  `tims` time(6) NOT NULL,
  `im1` varchar(20) NOT NULL,
  `td1` time(6) NOT NULL,
  `im2` varchar(20) NOT NULL,
  `td2` time(6) NOT NULL,
  `im3` varchar(20) NOT NULL,
  `td3` time(6) NOT NULL,
  `im4` varchar(20) NOT NULL,
  `td4` time(6) NOT NULL,
  `im5` varchar(20) NOT NULL,
  `td5` time(6) NOT NULL,
  `im6` varchar(20) NOT NULL,
  `td6` time(6) NOT NULL,
  `im7` varchar(20) NOT NULL,
  `td7` time(6) NOT NULL,
  `im8` varchar(20) NOT NULL,
  `td8` time(6) NOT NULL,
  `im9` varchar(20) NOT NULL,
  `td9` time(6) NOT NULL,
  `im10` varchar(20) NOT NULL,
  `td10` time(6) NOT NULL,
  `im11` varchar(20) NOT NULL,
  `td11` time(6) NOT NULL,
  `im12` varchar(20) NOT NULL,
  `td12` time(6) NOT NULL,
  `dst` varchar(20) NOT NULL,
  `td13` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `routpa`
--

INSERT INTO `routpa` (`id`, `src`, `tims`, `im1`, `td1`, `im2`, `td2`, `im3`, `td3`, `im4`, `td4`, `im5`, `td5`, `im6`, `td6`, `im7`, `td7`, `im8`, `td8`, `im9`, `td9`, `im10`, `td10`, `im11`, `td11`, `im12`, `td12`, `dst`, `td13`) VALUES
(1, 'Panvel', '22:15:00.000000', 'Khandeshwar', '22:20:00.000000', 'Manasarovar', '22:23:00.000000', 'Kharghar', '22:26:00.000000', 'Belapur CBD', '22:30:00.000000', 'Seawood Darave', '22:34:00.000000', 'Nerul', '22:38:00.000000', 'Juinagar', '22:42:00.000000', 'Turbhe', '22:46:00.000000', 'Koparkhairane', '22:50:00.000000', 'Ghansoli', '22:53:00.000000', 'Rabale', '22:56:00.000000', 'Airoli', '22:59:00.000000', 'Thane', '23:07:00.000000'),
(2, 'Panvel', '11:02:00.000000', 'Khandeshwar', '11:07:00.000000', 'Manasarovar', '11:10:00.000000', 'Kharghar', '11:13:00.000000', 'Belapur CBD', '11:17:00.000000', 'Seawood Darave', '11:21:00.000000', 'Nerul', '11:25:00.000000', 'Juinagar', '11:30:00.000000', 'Turbhe', '11:34:00.000000', 'Koparkhairane', '11:38:00.000000', 'Ghansoli', '11:41:00.000000', 'Rabale', '11:44:00.000000', 'Airoli', '11:47:00.000000', 'Thane', '11:55:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `routpt`
--

CREATE TABLE `routpt` (
  `id` int(11) NOT NULL,
  `src` varchar(20) NOT NULL,
  `timc` time(6) NOT NULL,
  `im1` varchar(20) NOT NULL,
  `td1` time(6) NOT NULL,
  `im2` varchar(20) NOT NULL,
  `td2` time(6) NOT NULL,
  `im3` varchar(20) NOT NULL,
  `td3` time(6) NOT NULL,
  `im4` varchar(20) NOT NULL,
  `td4` timestamp(6) NOT NULL DEFAULT current_timestamp(6) ON UPDATE current_timestamp(6),
  `im5` varchar(20) NOT NULL,
  `td5` time(6) NOT NULL,
  `im6` varchar(20) NOT NULL,
  `td6` time(6) NOT NULL,
  `im7` varchar(20) NOT NULL,
  `td7` time(6) NOT NULL,
  `im8` varchar(20) NOT NULL,
  `td8` time(6) NOT NULL,
  `im9` varchar(20) NOT NULL,
  `td9` time(6) NOT NULL,
  `im10` varchar(20) NOT NULL,
  `td10` time(6) NOT NULL,
  `im11` varchar(20) NOT NULL,
  `td11` time(6) NOT NULL,
  `im12` varchar(20) NOT NULL,
  `td12` time(6) NOT NULL,
  `dst` varchar(20) NOT NULL,
  `td13` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `routsd1`
--

CREATE TABLE `routsd1` (
  `id` int(10) NOT NULL,
  `src` varchar(20) NOT NULL,
  `tim1` time(6) NOT NULL,
  `im1` varchar(20) NOT NULL,
  `td1` time(6) NOT NULL,
  `im2` varchar(20) NOT NULL,
  `td2` time(6) NOT NULL,
  `im3` varchar(20) NOT NULL,
  `td3` time(6) NOT NULL,
  `im4` varchar(20) NOT NULL,
  `td4` time(6) NOT NULL,
  `im5` varchar(20) NOT NULL,
  `td5` time(6) NOT NULL,
  `im6` varchar(20) NOT NULL,
  `td6` time(6) NOT NULL,
  `im7` varchar(20) NOT NULL,
  `td7` time(6) NOT NULL,
  `dst` varchar(20) NOT NULL,
  `td8` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `routsd1`
--

INSERT INTO `routsd1` (`id`, `src`, `tim1`, `im1`, `td1`, `im2`, `td2`, `im3`, `td3`, `im4`, `td4`, `im5`, `td5`, `im6`, `td6`, `im7`, `td7`, `dst`, `td8`) VALUES
(1, 'virar', '20:45:00.000000', 'Vaitarana', '20:55:00.000000', 'Saphale', '21:02:00.000000', 'Kelve', '21:08:00.000000', 'Palghar', '21:15:00.000000', 'Umroli', '21:21:00.000000', 'Boisar', '21:28:00.000000', 'Vangaon', '21:35:00.000000', 'Dahanu', '21:57:00.000000'),
(2, 'virar', '14:32:00.000000', 'Vaitarana', '14:42:00.000000', 'Saphale', '14:50:00.000000', 'Kelve', '14:55:00.000000', 'Palghar', '15:02:00.000000', 'Umroli', '15:08:00.000000', 'Boisar', '15:13:00.000000', 'Vangaon', '15:19:00.000000', 'Dahanu', '15:44:00.000000'),
(3, 'virar', '11:05:00.000000', 'Vaitarana', '11:15:00.000000', 'Saphale', '11:23:00.000000', 'Kelve', '11:29:00.000000', 'Palghar', '11:37:00.000000', 'Umroli', '11:43:00.000000', 'Boisar', '11:51:00.000000', 'Vangaon', '12:04:00.000000', 'Dahanu', '12:20:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `tdemcta`
--

CREATE TABLE `tdemcta` (
  `id` int(10) NOT NULL,
  `src` varchar(20) NOT NULL,
  `st` time(6) NOT NULL,
  `ims1` varchar(20) NOT NULL,
  `ts1` time(6) NOT NULL,
  `ims2` varchar(20) NOT NULL,
  `ts2` time(6) NOT NULL,
  `ims3` varchar(20) NOT NULL,
  `ts3` time(6) NOT NULL,
  `ims4` varchar(20) NOT NULL,
  `ts4` time(6) NOT NULL,
  `ims5` varchar(20) NOT NULL,
  `ts5` time(6) NOT NULL,
  `ims6` varchar(20) NOT NULL,
  `ts6` time(6) NOT NULL,
  `ims7` varchar(20) NOT NULL,
  `ts7` time(6) NOT NULL,
  `ims8` varchar(20) NOT NULL,
  `ts8` time(6) NOT NULL,
  `ims9` varchar(20) NOT NULL,
  `ts9` time(6) NOT NULL,
  `ims10` varchar(20) NOT NULL,
  `ts10` time(6) NOT NULL,
  `ims11` varchar(20) NOT NULL,
  `ts11` time(6) NOT NULL,
  `ims12` varchar(20) NOT NULL,
  `ts12` time(6) NOT NULL,
  `ims13` varchar(20) NOT NULL,
  `ts13` time(6) NOT NULL,
  `dst` varchar(20) NOT NULL,
  `ts14` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tdemcta`
--

INSERT INTO `tdemcta` (`id`, `src`, `st`, `ims1`, `ts1`, `ims2`, `ts2`, `ims3`, `ts3`, `ims4`, `ts4`, `ims5`, `ts5`, `ims6`, `ts6`, `ims7`, `ts7`, `ims8`, `ts8`, `ims9`, `ts9`, `ims10`, `ts10`, `ims11`, `ts11`, `ims12`, `ts12`, `ims13`, `ts13`, `dst`, `ts14`) VALUES
(1, 'CSTM', '10:24:00.000000', 'Masjid', '10:27:00.000000', 'Sandhurst Road', '10:30:00.000000', 'DockYard Road', '10:32:00.000000', 'Reay Road', '10:34:00.000000', 'Cotton Green', '10:36:00.000000', 'Sewri', '10:39:00.000000', 'Vadala Road', '10:42:00.000000', 'Kings Circle', '10:47:00.000000', 'Mahim Jn', '10:49:00.000000', 'Bandra', '10:53:00.000000', 'Khar Road', '10:58:00.000000', 'Santacruz', '11:01:00.000000', 'Vile Parle', '11:04:00.000000', 'Andheri', '11:08:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `tdemlog`
--

CREATE TABLE `tdemlog` (
  `id` int(10) NOT NULL,
  `user` varchar(20) NOT NULL,
  `msg` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tdemlog`
--

INSERT INTO `tdemlog` (`id`, `user`, `msg`) VALUES
(1, 'aks', 'hello'),
(2, 'aks', 'train'),
(3, 'aks', 'gm'),
(4, 'aks', 'late'),
(5, 'abc', 'late'),
(8, 'yog', 'goodmorning'),
(15, 'aks', 'hello trains late'),
(16, 'ak', 'hello all'),
(17, 'abc', 'hello all'),
(18, 'xyz', 'hello train'),
(19, 'pratiksha', 'hello all good morning'),
(20, 'ddd', 'all trains are late');

-- --------------------------------------------------------

--
-- Table structure for table `tdemo1`
--

CREATE TABLE `tdemo1` (
  `id` int(10) NOT NULL,
  `src` varchar(20) NOT NULL,
  `times` time(6) NOT NULL,
  `ims1` varchar(20) NOT NULL,
  `tims1` time(6) NOT NULL,
  `ims2` varchar(20) NOT NULL,
  `tims2` time(6) NOT NULL,
  `ims3` varchar(20) NOT NULL,
  `tims3` time(6) NOT NULL,
  `ims4` varchar(20) NOT NULL,
  `tims4` time(6) NOT NULL,
  `ims5` varchar(20) NOT NULL,
  `tims5` time(6) NOT NULL,
  `ims6` varchar(20) NOT NULL,
  `tims6` time(6) NOT NULL,
  `ims7` varchar(20) NOT NULL,
  `tims7` time(6) NOT NULL,
  `ims8` varchar(20) NOT NULL,
  `tims8` time(6) NOT NULL,
  `ims9` varchar(20) NOT NULL,
  `tims9` time(6) NOT NULL,
  `ims10` varchar(20) NOT NULL,
  `tims10` time(6) NOT NULL,
  `ims11` varchar(20) NOT NULL,
  `tims11` time(6) NOT NULL,
  `ims12` varchar(20) NOT NULL,
  `tims12` time(6) NOT NULL,
  `ims13` varchar(20) NOT NULL,
  `tims13` time(6) NOT NULL,
  `ims14` varchar(20) NOT NULL,
  `tims14` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tdemo1`
--

INSERT INTO `tdemo1` (`id`, `src`, `times`, `ims1`, `tims1`, `ims2`, `tims2`, `ims3`, `tims3`, `ims4`, `tims4`, `ims5`, `tims5`, `ims6`, `tims6`, `ims7`, `tims7`, `ims8`, `tims8`, `ims9`, `tims9`, `ims10`, `tims10`, `ims11`, `tims11`, `ims12`, `tims12`, `ims13`, `tims13`, `ims14`, `tims14`) VALUES
(1, 'virar', '19:10:00.000000', 'Nalasopara', '19:15:00.000000', 'Vasai', '19:21:00.000000', 'Naigaon', '19:27:00.000000', 'Bhayandar', '19:32:00.000000', 'MiraRoad', '19:37:00.000000', 'Dahisar', '19:42:00.000000', 'Borivali', '19:46:00.000000', 'Andheri', '19:56:00.000000', 'Bandra', '20:02:00.000000', 'Dadar', '20:10:00.000000', 'MumbaiCentral', '20:15:00.000000', 'GrantRoad', '20:20:00.000000', 'MarineLines', '20:25:00.000000', 'Churchgate', '20:30:00.000000'),
(2, 'virar', '06:18:00.000000', 'Nalasopara', '06:23:00.000000', 'Vasai', '06:29:00.000000', 'Naigaon', '06:34:00.000000', 'Bhayandar', '06:39:00.000000', 'Mira Road', '06:44:00.000000', 'Dahisar', '06:48:00.000000', 'Borivali', '06:52:00.000000', 'Andheri', '07:02:00.000000', 'Bandra', '07:10:00.000000', 'Dadar', '07:15:00.000000', 'MumbaiCentral', '07:20:00.000000', 'GrantRoad', '07:25:00.000000', 'MarineLines', '07:30:00.000000', 'Churchgate', '07:35:00.000000'),
(3, 'virar', '20:45:00.000000', 'Nalasopara', '20:50:00.000000', 'Vasai', '20:55:00.000000', 'Naigaon', '20:59:00.000000', 'Bhayandar', '21:04:00.000000', 'MiraRoad', '21:09:00.000000', 'Dahisar', '21:15:00.000000', 'Borivali', '21:20:00.000000', 'Andheri', '21:25:00.000000', 'Bandra', '21:30:00.000000', 'Dadar', '21:35:00.000000', 'MumbaiCentral', '21:40:00.000000', 'GrantRoad', '21:45:00.000000', 'MarineLines', '21:50:00.000000', 'Churchgate', '21:55:00.000000'),
(4, 'virar', '20:30:00.000000', 'Nalasopara', '20:35:00.000000', 'Vasai', '20:40:00.000000', 'Naigaon', '20:46:00.000000', 'Bhayandar', '20:50:00.000000', 'MiraRoad', '20:55:00.000000', 'Dahisar', '21:01:00.000000', 'Borivali', '21:05:00.000000', 'Andheri', '21:15:00.000000', 'Bandra', '21:25:00.000000', 'Dadar', '21:30:00.000000', 'MumbaiCentral', '21:35:00.000000', 'GrantRoad', '21:40:00.000000', 'MarineLines', '21:45:00.000000', 'Churchgate', '21:50:00.000000'),
(5, 'virar', '20:49:00.000000', 'Nalasopara', '20:54:00.000000', 'Vasai', '21:00:00.000000', 'Naigaon', '21:05:00.000000', 'Bhayandar', '21:10:00.000000', 'MiraRoad', '21:15:00.000000', 'Dahisar', '21:20:00.000000', 'Borivali', '21:25:00.000000', 'Andheri', '21:35:00.000000', 'Bandra', '21:40:00.000000', 'Dadar', '21:50:00.000000', 'MumbaiCentral', '21:55:00.000000', 'GrantRoad', '21:59:00.000000', 'MarineLines', '22:05:00.000000', 'Churchgate', '22:10:00.000000'),
(6, 'virar', '22:23:00.000000', 'Nalasopara', '22:28:00.000000', 'Vasai', '22:32:00.000000', 'Naigaon', '22:37:00.000000', 'Bhayandar', '22:42:00.000000', 'MiraRoad', '22:47:00.000000', 'Dahisar', '22:52:00.000000', 'Borivali', '22:57:00.000000', 'Andheri', '23:07:00.000000', 'Bandra', '23:12:00.000000', 'Dadar', '23:20:00.000000', 'MumbaiCentral', '23:25:00.000000', 'GrantRoad', '23:30:00.000000', 'MarineLines', '23:35:00.000000', 'Churchgate', '23:40:00.000000'),
(7, 'virar', '21:50:00.000000', 'Nalasopara', '21:55:00.000000', 'Vasai', '22:01:00.000000', 'Naigaon', '22:06:00.000000', 'Bhayandar', '22:11:00.000000', 'MiraRoad', '22:16:00.000000', 'Dahisar', '22:20:00.000000', 'Borivali', '22:25:00.000000', 'Andheri', '22:35:00.000000', 'Bandra', '22:40:00.000000', 'Dadar', '22:45:00.000000', 'MumbaiCentral', '22:50:00.000000', 'GrantRoad', '22:55:00.000000', 'MarineLines', '23:01:00.000000', 'Churchgate', '23:07:00.000000'),
(8, 'virar', '19:27:00.000000', 'Nalasopara', '19:32:00.000000', 'Vasai', '19:38:00.000000', 'Naigaon', '19:43:00.000000', 'Bhayandar', '19:49:00.000000', 'MiraRoad', '19:55:00.000000', 'Dahisar', '20:00:00.000000', 'Borivali', '20:05:00.000000', 'Andheri', '20:15:00.000000', 'Bandra', '20:25:00.000000', 'Dadar', '20:30:00.000000', 'MumbaiCentral', '20:35:00.000000', 'GrantRoad', '20:40:00.000000', 'MarineLines', '20:45:00.000000', 'Churchgate', '20:50:00.000000'),
(9, 'virar', '18:30:00.000000', 'Nalasopara', '18:35:00.000000', 'Vasai', '18:41:00.000000', 'Naigaon', '18:45:00.000000', 'Bhayandar', '18:50:00.000000', 'MiraRoad', '18:55:00.000000', 'Dahisar', '18:59:00.000000', 'Borivali', '19:03:00.000000', 'Andheri', '19:13:00.000000', 'Bandra', '19:20:00.000000', 'Dadar', '19:25:00.000000', 'MumbaiCentral', '19:30:00.000000', 'GrantRoad', '19:35:00.000000', 'MarineLines', '19:40:00.000000', 'Churchgate', '19:45:00.000000'),
(10, 'virar', '14:45:00.000000', 'Nalasopara', '14:50:00.000000', 'Vasai', '14:56:00.000000', 'Naigaon', '15:01:00.000000', 'Bhayandar', '15:06:00.000000', 'MiraRoad', '15:11:00.000000', 'Dahisar', '15:15:00.000000', 'Borivali', '15:20:00.000000', 'Andheri', '15:35:00.000000', 'Bandra', '15:45:00.000000', 'Dadar', '15:50:00.000000', 'MumbaiCentral', '15:55:00.000000', 'GrantRoad', '16:01:00.000000', 'MarineLines', '16:07:00.000000', 'Churchgate', '16:12:00.000000'),
(11, 'virar', '11:10:00.000000', 'Nalasopara', '11:17:00.000000', 'Vasai', '11:22:00.000000', 'Naigaon', '11:26:00.000000', 'Bhayandar', '11:32:00.000000', 'Mira Road', '11:37:00.000000', 'Dahisar', '11:41:00.000000', 'Borivali', '11:47:00.000000', 'Andheri', '12:03:00.000000', 'Bandra', '12:12:00.000000', 'Dadar', '12:19:00.000000', 'MumbaiCentral', '12:27:00.000000', 'GrantRoad', '12:30:00.000000', 'MarineLines', '12:35:00.000000', 'Churchgate', '12:37:00.000000'),
(12, 'virar', '08:28:00.000000', 'Nalasopara', '08:34:00.000000', 'Vasai', '08:39:00.000000', 'Naigaon', '08:43:00.000000', 'Bhayandar', '08:48:00.000000', 'MiraRoad', '08:53:00.000000', 'Dahisar', '08:57:00.000000', 'Borivali', '09:02:00.000000', 'Andheri', '09:15:00.000000', 'Bandra', '09:25:00.000000', 'Dadar', '09:31:00.000000', 'MumbaiCentral', '09:38:00.000000', 'GrantRoad', '09:40:00.000000', 'MarineLines', '09:45:00.000000', 'Churchgate', '09:49:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `tdemocb`
--

CREATE TABLE `tdemocb` (
  `id1` int(10) NOT NULL,
  `sr` varchar(20) NOT NULL,
  `tm` time(6) NOT NULL,
  `ims1` varchar(20) NOT NULL,
  `ta1` time(6) NOT NULL,
  `ims2` varchar(20) NOT NULL,
  `ta2` time(6) NOT NULL,
  `ims3` varchar(20) NOT NULL,
  `ta3` time(6) NOT NULL,
  `ims4` varchar(20) NOT NULL,
  `ta4` time(6) NOT NULL,
  `ims5` varchar(20) NOT NULL,
  `ta5` time(6) NOT NULL,
  `ims6` varchar(20) NOT NULL,
  `ta6` time(6) NOT NULL,
  `ims7` varchar(20) NOT NULL,
  `ta7` time(6) NOT NULL,
  `ims8` varchar(20) NOT NULL,
  `ta8` time(6) NOT NULL,
  `ims9` varchar(20) NOT NULL,
  `ta9` time(6) NOT NULL,
  `ims10` varchar(20) NOT NULL,
  `ta10` time(6) NOT NULL,
  `ims11` varchar(20) NOT NULL,
  `ta11` time(6) NOT NULL,
  `ims12` varchar(20) NOT NULL,
  `ta12` time(6) NOT NULL,
  `ims13` varchar(20) NOT NULL,
  `ta13` time(6) NOT NULL,
  `ims14` varchar(20) NOT NULL,
  `ta14` time(6) NOT NULL,
  `ims15` varchar(20) NOT NULL,
  `ta15` time(6) NOT NULL,
  `ims16` varchar(20) NOT NULL,
  `ta16` time(6) NOT NULL,
  `ims17` varchar(20) NOT NULL,
  `ta17` time(6) NOT NULL,
  `ims18` varchar(20) NOT NULL,
  `ta18` time(6) NOT NULL,
  `ims19` varchar(20) NOT NULL,
  `ta19` time(6) NOT NULL,
  `ims20` varchar(20) NOT NULL,
  `ta20` time(6) NOT NULL,
  `dst` varchar(20) NOT NULL,
  `ta21` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tdemocb`
--

INSERT INTO `tdemocb` (`id1`, `sr`, `tm`, `ims1`, `ta1`, `ims2`, `ta2`, `ims3`, `ta3`, `ims4`, `ta4`, `ims5`, `ta5`, `ims6`, `ta6`, `ims7`, `ta7`, `ims8`, `ta8`, `ims9`, `ta9`, `ims10`, `ta10`, `ims11`, `ta11`, `ims12`, `ta12`, `ims13`, `ta13`, `ims14`, `ta14`, `ims15`, `ta15`, `ims16`, `ta16`, `ims17`, `ta17`, `ims18`, `ta18`, `ims19`, `ta19`, `ims20`, `ta20`, `dst`, `ta21`) VALUES
(1, 'Churchgate', '22:49:00.000000', 'Marine Lines', '22:52:00.000000', 'Charni Road', '22:54:00.000000', 'Grant Road', '22:57:00.000000', 'Mumbai Central', '22:59:00.000000', 'Mahalakshmi', '23:02:00.000000', 'Lower Parel', '23:05:00.000000', 'Prabhadevi', '23:08:00.000000', 'Dadar', '23:10:00.000000', 'Matunga Road', '23:12:00.000000', 'Mahim Jn', '23:15:00.000000', 'Bandra', '23:19:00.000000', 'Khar Road', '23:23:00.000000', 'Santacruz', '23:25:00.000000', 'Vile Parle', '23:28:00.000000', 'Andheri', '23:34:00.000000', 'Jogeshwari', '23:37:00.000000', 'Ram Mandir', '23:40:00.000000', 'Goregaon', '23:42:00.000000', 'Malad', '23:46:00.000000', 'Kandivali', '23:49:00.000000', 'Borivali', '23:56:00.000000'),
(2, 'Churchgate', '22:49:00.000000', 'Marine Lines', '22:52:00.000000', 'Charni Road', '22:54:00.000000', 'Grant Road', '22:57:00.000000', 'Mumbai Central', '22:59:00.000000', 'Mahalakshmi', '23:02:00.000000', 'Lower Parel', '23:05:00.000000', 'Prabhadevi', '23:08:00.000000', 'Dadar', '23:10:00.000000', 'Matunga Road', '23:12:00.000000', 'Mahim Jn', '23:15:00.000000', 'Bandra', '23:19:00.000000', 'Khar Road', '23:23:00.000000', 'Santacruz', '23:25:00.000000', 'Vile Parle', '23:28:00.000000', 'Andheri', '23:34:00.000000', 'Jogeshwari', '23:37:00.000000', 'Ram Mandir', '23:40:00.000000', 'Goregaon', '23:42:00.000000', 'Malad', '23:46:00.000000', 'Kandivali', '23:49:00.000000', 'Borivali', '23:56:00.000000'),
(3, 'Churchgate', '10:54:00.000000', 'Marine Lines', '10:57:00.000000', 'Charni Road', '10:59:00.000000', 'Grant Road', '11:02:00.000000', 'Mumbai Central', '11:04:00.000000', 'Mahalakshmi', '11:07:00.000000', 'Lower Parel', '11:10:00.000000', 'Prabhadevi', '11:13:00.000000', 'Dadar', '11:15:00.000000', 'Matunga Road', '11:17:00.000000', 'Mahim Jn', '11:20:00.000000', 'Bandra', '11:24:00.000000', 'Khar Road', '11:27:00.000000', 'Santacruz', '11:29:00.000000', 'Vile Parle', '11:32:00.000000', 'Andheri', '11:37:00.000000', 'Jogeshwari', '11:40:00.000000', 'Ram Mandir', '11:43:00.000000', 'Goregaon', '11:45:00.000000', 'Malad', '11:49:00.000000', 'Kandivali', '11:52:00.000000', 'Borivali', '11:59:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `tdemocdhn`
--

CREATE TABLE `tdemocdhn` (
  `id` int(10) NOT NULL,
  `src` varchar(20) NOT NULL,
  `tm` time(6) NOT NULL,
  `im1` varchar(20) NOT NULL,
  `tm1` time(6) NOT NULL,
  `im2` varchar(20) NOT NULL,
  `tm2` time(6) NOT NULL,
  `im3` varchar(20) NOT NULL,
  `tm3` time(6) NOT NULL,
  `im4` varchar(20) NOT NULL,
  `tm4` time(6) NOT NULL,
  `im5` varchar(20) NOT NULL,
  `tm5` time(6) NOT NULL,
  `im6` varchar(20) NOT NULL,
  `tm6` time(6) NOT NULL,
  `im7` varchar(20) NOT NULL,
  `tm7` time(6) NOT NULL,
  `im8` varchar(20) NOT NULL,
  `tm8` time(6) NOT NULL,
  `im9` varchar(20) NOT NULL,
  `tm9` time(6) NOT NULL,
  `im10` varchar(20) NOT NULL,
  `tm10` time(6) NOT NULL,
  `im11` varchar(20) NOT NULL,
  `tm11` time(6) NOT NULL,
  `im12` varchar(20) NOT NULL,
  `tm12` time(6) NOT NULL,
  `im13` varchar(20) NOT NULL,
  `tm13` time(6) NOT NULL,
  `im14` varchar(20) NOT NULL,
  `tm14` time(6) NOT NULL,
  `im15` varchar(20) NOT NULL,
  `tm15` time(6) NOT NULL,
  `im16` varchar(20) NOT NULL,
  `tm16` time(6) NOT NULL,
  `im17` varchar(20) NOT NULL,
  `tm17` time(6) NOT NULL,
  `im18` varchar(20) NOT NULL,
  `tm18` time(6) NOT NULL,
  `im19` varchar(20) NOT NULL,
  `tm19` time(6) NOT NULL,
  `im20` varchar(20) NOT NULL,
  `tm20` time(6) NOT NULL,
  `im21` varchar(20) NOT NULL,
  `tm21` time(6) NOT NULL,
  `dst` varchar(20) NOT NULL,
  `tm22` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tdemocdhn`
--

INSERT INTO `tdemocdhn` (`id`, `src`, `tm`, `im1`, `tm1`, `im2`, `tm2`, `im3`, `tm3`, `im4`, `tm4`, `im5`, `tm5`, `im6`, `tm6`, `im7`, `tm7`, `im8`, `tm8`, `im9`, `tm9`, `im10`, `tm10`, `im11`, `tm11`, `im12`, `tm12`, `im13`, `tm13`, `im14`, `tm14`, `im15`, `tm15`, `im16`, `tm16`, `im17`, `tm17`, `im18`, `tm18`, `im19`, `tm19`, `im20`, `tm20`, `im21`, `tm21`, `dst`, `tm22`) VALUES
(1, 'Churchgate', '20:12:00.000000', 'MarineLines', '20:17:00.000000', 'Grant Road', '20:22:00.000000', 'Mumbai Central', '20:29:00.000000', 'Dadar', '20:35:00.000000', 'Bandra', '20:45:00.000000', 'Andheri', '20:55:00.000000', 'Borivali', '21:10:00.000000', 'Dahisar', '21:15:00.000000', 'Mira Road', '21:25:00.000000', 'Bhayandar', '21:30:00.000000', 'Naigaon', '21:36:00.000000', 'Vasai', '21:41:00.000000', 'Nalasopara', '21:46:00.000000', 'Virar', '21:51:00.000000', 'Vaitarana', '22:01:00.000000', 'Saphale', '22:08:00.000000', 'Kelve Road', '22:14:00.000000', 'Palghar', '22:21:00.000000', 'Umroli', '22:29:00.000000', 'Boisar', '22:35:00.000000', 'Vangaon', '22:42:00.000000', 'Dahanu', '23:10:00.000000'),
(2, 'Churchgate', '11:06:00.000000', 'Marine lines', '11:08:00.000000', 'Grant road', '11:11:00.000000', 'Mumbai central', '11:13:00.000000', 'Dadar', '11:20:00.000000', 'Bandra', '11:25:00.000000', 'Andheri', '11:33:00.000000', 'Borivali', '11:47:00.000000', 'Dahisar', '11:52:00.000000', 'Mira Road', '11:57:00.000000', 'Bhayandar', '12:02:00.000000', 'Naigaon', '12:08:00.000000', 'Vasai', '12:13:00.000000', 'Nalasopara', '12:19:00.000000', 'Virar', '12:26:00.000000', 'Vaitarana', '12:37:00.000000', 'Saphale', '12:45:00.000000', 'Kelve Road', '12:52:00.000000', 'Palghar', '13:01:00.000000', 'Umroli', '13:07:00.000000', 'Boisar', '13:13:00.000000', 'Vangaon', '13:21:00.000000', 'Dahanu', '13:42:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `tdemock`
--

CREATE TABLE `tdemock` (
  `id` int(20) NOT NULL,
  `sst` varchar(20) NOT NULL,
  `tc` time(6) NOT NULL,
  `im1` varchar(20) NOT NULL,
  `tc1` time(6) NOT NULL,
  `im2` varchar(20) NOT NULL,
  `tc2` time(6) NOT NULL,
  `im3` varchar(20) NOT NULL,
  `tc3` time(6) NOT NULL,
  `im4` varchar(20) NOT NULL,
  `tc4` time(6) NOT NULL,
  `im5` varchar(20) NOT NULL,
  `tc5` time(6) NOT NULL,
  `im6` varchar(20) NOT NULL,
  `tc6` time(6) NOT NULL,
  `im7` varchar(20) NOT NULL,
  `tc7` time(6) NOT NULL,
  `im8` varchar(20) NOT NULL,
  `tc8` time(6) NOT NULL,
  `im9` varchar(20) NOT NULL,
  `tc9` time(6) NOT NULL,
  `im10` varchar(20) NOT NULL,
  `tc10` time(6) NOT NULL,
  `im11` varchar(20) NOT NULL,
  `tc11` time(6) NOT NULL,
  `im12` varchar(20) NOT NULL,
  `tc12` time(6) NOT NULL,
  `im13` varchar(20) NOT NULL,
  `tc13` time(6) NOT NULL,
  `im14` varchar(20) NOT NULL,
  `tc14` time(6) NOT NULL,
  `im15` varchar(20) NOT NULL,
  `tc15` time(6) NOT NULL,
  `im16` varchar(20) NOT NULL,
  `tc16` time(6) NOT NULL,
  `im17` varchar(20) NOT NULL,
  `tc17` time(6) NOT NULL,
  `im18` varchar(20) NOT NULL,
  `tc18` time(6) NOT NULL,
  `im19` varchar(20) NOT NULL,
  `tc19` time(6) NOT NULL,
  `im20` varchar(20) NOT NULL,
  `tc20` time(6) NOT NULL,
  `im21` varchar(20) NOT NULL,
  `tc21` time(6) NOT NULL,
  `im22` varchar(20) NOT NULL,
  `tc22` time(6) NOT NULL,
  `im23` varchar(20) NOT NULL,
  `tc23` time(6) NOT NULL,
  `im24` varchar(20) NOT NULL,
  `tc24` time(6) NOT NULL,
  `dst` varchar(20) NOT NULL,
  `tc25` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tdemock`
--

INSERT INTO `tdemock` (`id`, `sst`, `tc`, `im1`, `tc1`, `im2`, `tc2`, `im3`, `tc3`, `im4`, `tc4`, `im5`, `tc5`, `im6`, `tc6`, `im7`, `tc7`, `im8`, `tc8`, `im9`, `tc9`, `im10`, `tc10`, `im11`, `tc11`, `im12`, `tc12`, `im13`, `tc13`, `im14`, `tc14`, `im15`, `tc15`, `im16`, `tc16`, `im17`, `tc17`, `im18`, `tc18`, `im19`, `tc19`, `im20`, `tc20`, `im21`, `tc21`, `im22`, `tc22`, `im23`, `tc23`, `im24`, `tc24`, `dst`, `tc25`) VALUES
(1, 'CSMT', '14:11:00.000000', 'Masjid', '14:14:00.000000', 'Sandhurst Rd', '14:16:00.000000', 'Byculla', '14:19:00.000000', 'Chinchpokli', '14:21:00.000000', 'Currey Rd', '14:23:00.000000', 'Parel', '14:26:00.000000', 'Dadar', '14:29:00.000000', 'Matunga', '14:32:00.000000', 'Sion', '14:35:00.000000', 'Kurla', '14:39:00.000000', 'Vidyadihar', '14:42:00.000000', 'Ghatkopar', '14:45:00.000000', 'Vikhroli', '14:49:00.000000', 'Kanjurmarg', '14:52:00.000000', 'Bhandup', '14:55:00.000000', 'Nahur', '14:58:00.000000', 'Mulund', '15:01:00.000000', 'Thane', '15:05:00.000000', 'Kalva', '15:10:00.000000', 'Mumbra', '15:16:00.000000', 'Diva Jn', '15:20:00.000000', 'Kopar', '15:25:00.000000', 'Dombivli', '15:28:00.000000', 'Thakurli', '15:32:00.000000', 'Kalyan', '15:38:00.000000'),
(2, 'CSMT', '11:50:00.000000', 'Masjid', '11:53:00.000000', 'Sandhurst Rd', '11:55:00.000000', 'Byculla', '11:58:00.000000', 'Chinchpokli', '12:00:00.000000', 'Currey Rd', '12:02:00.000000', 'Parel', '12:05:00.000000', 'Dadar', '12:08:00.000000', 'Matunga', '12:11:00.000000', 'Sion', '12:14:00.000000', 'Kurla', '12:18:00.000000', 'Vidyavihar', '12:21:00.000000', 'Ghatkopar', '12:24:00.000000', 'Vikhroli', '12:28:00.000000', 'Kanjurmarg', '12:31:00.000000', 'Bhandup', '12:34:00.000000', 'Nahur', '12:37:00.000000', 'Mulund', '12:40:00.000000', 'Thane', '12:45:00.000000', 'Kalva', '12:50:00.000000', 'Mumbra', '12:56:00.000000', 'Diva', '01:00:00.000000', 'Kopar', '01:05:00.000000', 'Dombivili', '01:08:00.000000', 'Thakurli', '01:12:00.000000', 'Kalyan', '01:18:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `tdemocp`
--

CREATE TABLE `tdemocp` (
  `id` int(10) NOT NULL,
  `sst` varchar(20) NOT NULL,
  `tims` time(6) NOT NULL,
  `im1` varchar(20) NOT NULL,
  `tc1` time(6) NOT NULL,
  `im2` varchar(20) NOT NULL,
  `tc2` time(6) NOT NULL,
  `im3` varchar(20) NOT NULL,
  `tc3` time(6) NOT NULL,
  `im4` varchar(20) NOT NULL,
  `tc4` time(6) NOT NULL,
  `im5` varchar(20) NOT NULL,
  `tc5` time(6) NOT NULL,
  `im6` varchar(20) NOT NULL,
  `tc6` time(6) NOT NULL,
  `im7` varchar(20) NOT NULL,
  `tc7` time(6) NOT NULL,
  `im8` varchar(20) NOT NULL,
  `tc8` time(6) NOT NULL,
  `im9` varchar(20) NOT NULL,
  `tc9` time(6) NOT NULL,
  `im10` varchar(20) NOT NULL,
  `tc10` time(6) NOT NULL,
  `im11` varchar(20) NOT NULL,
  `tc11` time(6) NOT NULL,
  `im12` varchar(20) NOT NULL,
  `tc12` time(6) NOT NULL,
  `im13` varchar(20) NOT NULL,
  `tc13` time(6) NOT NULL,
  `im14` varchar(20) NOT NULL,
  `tc14` time(6) NOT NULL,
  `im15` varchar(20) NOT NULL,
  `tc15` time(6) NOT NULL,
  `im16` varchar(20) NOT NULL,
  `tc16` time(6) NOT NULL,
  `im17` varchar(20) NOT NULL,
  `tc17` time(6) NOT NULL,
  `im18` varchar(20) NOT NULL,
  `tc18` time(6) NOT NULL,
  `im19` varchar(20) NOT NULL,
  `tc19` time(6) NOT NULL,
  `im20` varchar(20) NOT NULL,
  `tc20` time(6) NOT NULL,
  `im21` varchar(20) NOT NULL,
  `tc21` time(6) NOT NULL,
  `im22` varchar(20) NOT NULL,
  `tc22` time(6) NOT NULL,
  `im23` varchar(20) NOT NULL,
  `tc23` time(6) NOT NULL,
  `dst` varchar(20) NOT NULL,
  `tc24` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tdemocp`
--

INSERT INTO `tdemocp` (`id`, `sst`, `tims`, `im1`, `tc1`, `im2`, `tc2`, `im3`, `tc3`, `im4`, `tc4`, `im5`, `tc5`, `im6`, `tc6`, `im7`, `tc7`, `im8`, `tc8`, `im9`, `tc9`, `im10`, `tc10`, `im11`, `tc11`, `im12`, `tc12`, `im13`, `tc13`, `im14`, `tc14`, `im15`, `tc15`, `im16`, `tc16`, `im17`, `tc17`, `im18`, `tc18`, `im19`, `tc19`, `im20`, `tc20`, `im21`, `tc21`, `im22`, `tc22`, `im23`, `tc23`, `dst`, `tc24`) VALUES
(1, 'CSMT', '20:49:00.000000', 'Masjid', '20:52:00.000000', 'Sandhurst Road', '20:55:00.000000', 'Dockyard Road', '20:57:00.000000', 'Reay Road', '20:59:00.000000', 'Cotton Green', '21:01:00.000000', 'Sewri', '21:04:00.000000', 'Vadala Road', '21:07:00.000000', 'GTB Nagar', '21:12:00.000000', 'Chunabhatti', '21:15:00.000000', 'Kurla', '21:18:00.000000', 'Tilaknagar', '21:21:00.000000', 'Chembur', '21:23:00.000000', 'Govandi', '21:26:00.000000', 'Mankhurd', '21:29:00.000000', 'Vashi', '21:38:00.000000', 'Sanpada', '21:40:00.000000', 'Juinagar', '21:43:00.000000', 'Nerul', '21:47:00.000000', 'Seawood Darave', '21:50:00.000000', 'Belapur CBD', '21:54:00.000000', 'Kharghar', '21:58:00.000000', 'Manasarovar', '22:01:00.000000', 'Khandeshwar', '22:04:00.000000', 'Panvel', '22:09:00.000000'),
(2, 'CSMT', '11:04:00.000000', 'Masjid', '11:07:00.000000', 'Sandhurst Road', '11:10:00.000000', 'Dockyard Road', '11:12:00.000000', 'Reay Road', '11:14:00.000000', 'Cotton Green', '11:16:00.000000', 'Sewri', '11:19:00.000000', 'Vadala Road', '11:22:00.000000', 'GTB Nagar', '11:27:00.000000', 'Chunabhatti', '11:30:00.000000', 'Kurla', '11:33:00.000000', 'Tilaknagar', '11:36:00.000000', 'Chembur', '11:38:00.000000', 'Govandi', '11:41:00.000000', 'Mankhurd', '11:44:00.000000', 'Vashi', '11:53:00.000000', 'Sanpada', '11:55:00.000000', 'Jauinagar', '11:58:00.000000', 'Nerul', '12:02:00.000000', 'Seawood DARAVE', '12:05:00.000000', 'Belapur CBD', '12:09:00.000000', 'Kharghar', '12:13:00.000000', 'Manasarovar', '12:16:00.000000', 'Khandeshwar', '12:19:00.000000', 'Panvel', '12:24:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `tdemocv`
--

CREATE TABLE `tdemocv` (
  `id` int(10) NOT NULL,
  `sst` varchar(20) NOT NULL,
  `tims` time(6) NOT NULL,
  `im1` varchar(20) NOT NULL,
  `tc1` time(6) NOT NULL,
  `im2` varchar(20) NOT NULL,
  `tc2` time(6) NOT NULL,
  `im3` varchar(20) NOT NULL,
  `tc3` time(6) NOT NULL,
  `im4` varchar(20) NOT NULL,
  `tc4` time(6) NOT NULL,
  `im5` varchar(20) NOT NULL,
  `tc5` time(6) NOT NULL,
  `i6` varchar(20) NOT NULL,
  `tc6` time(6) NOT NULL,
  `im7` varchar(20) NOT NULL,
  `tc7` time(6) NOT NULL,
  `im8` varchar(20) NOT NULL,
  `tc8` time(6) NOT NULL,
  `im9` varchar(20) NOT NULL,
  `tc9` time(6) NOT NULL,
  `im10` varchar(20) NOT NULL,
  `tc10` time(6) NOT NULL,
  `im11` varchar(20) NOT NULL,
  `tc11` time(6) NOT NULL,
  `im12` varchar(20) NOT NULL,
  `tc12` time(6) NOT NULL,
  `im13` varchar(20) NOT NULL,
  `tc13` time(6) NOT NULL,
  `dst` varchar(20) NOT NULL,
  `tc14` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tdemocv`
--

INSERT INTO `tdemocv` (`id`, `sst`, `tims`, `im1`, `tc1`, `im2`, `tc2`, `im3`, `tc3`, `im4`, `tc4`, `im5`, `tc5`, `i6`, `tc6`, `im7`, `tc7`, `im8`, `tc8`, `im9`, `tc9`, `im10`, `tc10`, `im11`, `tc11`, `im12`, `tc12`, `im13`, `tc13`, `dst`, `tc14`) VALUES
(1, 'churchgate', '21:30:00.000000', 'marine lines', '21:35:00.000000', 'grant road', '22:40:00.000000', 'mumbai central', '22:45:00.000000', 'dadar', '22:50:00.000000', 'bandra', '22:55:00.000000', 'andheri', '23:10:00.000000', 'borivali', '23:15:00.000000', 'dahisar', '23:20:00.000000', 'mira road', '23:25:00.000000', 'bhayandar', '23:30:00.000000', 'naigaon', '23:35:00.000000', 'vasai', '23:40:00.000000', 'nalasopara', '23:45:00.000000', 'virar', '23:50:00.000000'),
(2, 'churchgate', '22:15:00.000000', 'marine lines', '22:20:00.000000', 'grant road', '22:25:00.000000', 'mumbai central', '22:29:00.000000', 'dadar', '22:35:00.000000', 'bandra', '22:45:00.000000', 'andheri', '22:55:00.000000', 'borivali', '23:10:00.000000', 'dahisar', '23:15:00.000000', 'mira road', '23:15:00.000000', 'bhayandar', '23:20:00.000000', 'naigaon', '23:25:00.000000', 'vasai', '23:31:00.000000', 'nalasopara', '23:35:00.000000', 'virar', '23:40:00.000000'),
(3, 'churchgate', '19:10:00.000000', 'marine lines', '19:15:00.000000', 'grant road', '19:20:00.000000', 'mumbai central', '19:25:00.000000', 'dadar', '19:35:00.000000', 'bandra', '19:45:00.000000', 'andheri', '19:50:00.000000', 'borivali', '20:05:00.000000', 'dahisar', '20:10:00.000000', 'mira road', '20:15:00.000000', 'bhayandar', '20:20:00.000000', 'naigaon', '20:25:00.000000', 'vasai', '20:30:00.000000', 'nalasopara', '20:35:00.000000', 'virar', '20:40:00.000000'),
(4, 'Churchgate', '11:09:00.000000', 'marine lines', '11:12:00.000000', 'Grant Road', '11:17:00.000000', 'mumbai central', '11:19:00.000000', 'Dadar', '11:26:00.000000', 'Bandra', '11:31:00.000000', 'Andheri', '11:40:00.000000', 'Borivali', '11:55:00.000000', 'Dahisar', '11:59:00.000000', 'Mira Road', '12:04:00.000000', 'Bhayandar', '12:09:00.000000', 'Naigaon', '12:15:00.000000', 'Vasai', '12:21:00.000000', 'Nalasopara', '12:27:00.000000', 'virar', '12:35:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `tdemodc`
--

CREATE TABLE `tdemodc` (
  `id` int(10) NOT NULL,
  `src` varchar(20) NOT NULL,
  `td` time(6) NOT NULL,
  `im1` varchar(20) NOT NULL,
  `td1` time(6) NOT NULL,
  `im2` varchar(20) NOT NULL,
  `td2` time(6) NOT NULL,
  `im3` varchar(20) NOT NULL,
  `td3` time(6) NOT NULL,
  `im4` varchar(20) NOT NULL,
  `td4` time(6) NOT NULL,
  `im5` varchar(20) NOT NULL,
  `td5` time(6) NOT NULL,
  `im6` varchar(20) NOT NULL,
  `td6` time(6) NOT NULL,
  `im7` varchar(20) NOT NULL,
  `td7` time(6) NOT NULL,
  `im8` varchar(20) NOT NULL,
  `td8` time(6) NOT NULL,
  `im9` varchar(20) NOT NULL,
  `td9` time(6) NOT NULL,
  `im10` varchar(20) NOT NULL,
  `td10` time(6) NOT NULL,
  `im11` varchar(20) NOT NULL,
  `td11` time(6) NOT NULL,
  `im12` varchar(20) NOT NULL,
  `td12` time(6) NOT NULL,
  `im13` varchar(20) NOT NULL,
  `td13` time(6) NOT NULL,
  `im14` varchar(20) NOT NULL,
  `td14` time(6) NOT NULL,
  `im15` varchar(20) NOT NULL,
  `td15` time(6) NOT NULL,
  `dst` varchar(20) NOT NULL,
  `td16` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tdemodc`
--

INSERT INTO `tdemodc` (`id`, `src`, `td`, `im1`, `td1`, `im2`, `td2`, `im3`, `td3`, `im4`, `td4`, `im5`, `td5`, `im6`, `td6`, `im7`, `td7`, `im8`, `td8`, `im9`, `td9`, `im10`, `td10`, `im11`, `td11`, `im12`, `td12`, `im13`, `td13`, `im14`, `td14`, `im15`, `td15`, `dst`, `td16`) VALUES
(1, 'Dahanu Rd', '12:45:00.000000', 'Vangaon', '13:00:00.000000', 'Boisar', '13:08:00.000000', 'Umroli', '13:14:00.000000', 'Palghar', '13:21:00.000000', 'Kelva', '13:35:00.000000', 'Saphale', '13:41:00.000000', 'Vaitarana', '13:48:00.000000', 'Virar', '13:57:00.000000', 'Vasai', '14:09:00.000000', 'Bhayandar', '14:17:00.000000', 'Borivali', '14:25:00.000000', 'Andheri', '14:38:00.000000', 'Bandra', '14:47:00.000000', 'Dadar', '14:53:00.000000', 'Mumbai Central', '15:00:00.000000', 'Churchgate', '15:11:00.000000'),
(3, 'Dahanu Rd', '19:40:00.000000', 'Vangaon', '19:55:00.000000', 'Boisar', '20:02:00.000000', 'Umroli', '20:08:00.000000', 'Palghar', '20:15:00.000000', 'Kelva', '20:29:00.000000', 'Saphale', '20:35:00.000000', 'Vaitarana', '20:43:00.000000', 'Virar', '20:55:00.000000', 'Vasai', '21:03:00.000000', 'Bhayandar', '21:11:00.000000', 'Borivali', '21:19:00.000000', 'Andheri', '21:33:00.000000', 'Bandra', '21:42:00.000000', 'Dadar', '21:50:00.000000', 'Mumbai Central', '21:57:00.000000', 'Churchgate', '22:08:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `tdemokc`
--

CREATE TABLE `tdemokc` (
  `id` int(10) NOT NULL,
  `sst` varchar(20) NOT NULL,
  `tk` time(6) NOT NULL,
  `im1` varchar(20) NOT NULL,
  `tk1` time(6) NOT NULL,
  `im2` varchar(20) NOT NULL,
  `tk2` time(6) NOT NULL,
  `im3` varchar(20) NOT NULL,
  `tk3` time(6) NOT NULL,
  `im4` varchar(20) NOT NULL,
  `tk4` time(6) NOT NULL,
  `im5` varchar(20) NOT NULL,
  `tk5` time(6) NOT NULL,
  `im6` varchar(20) NOT NULL,
  `tk6` time(6) NOT NULL,
  `im7` varchar(20) NOT NULL,
  `tk7` time(6) NOT NULL,
  `im8` varchar(20) NOT NULL,
  `tk8` time(6) NOT NULL,
  `im9` varchar(20) NOT NULL,
  `tk9` time(6) NOT NULL,
  `im10` varchar(20) NOT NULL,
  `tk10` time(6) NOT NULL,
  `im11` varchar(20) NOT NULL,
  `tk11` time(6) NOT NULL,
  `im12` varchar(20) NOT NULL,
  `tk12` time(6) NOT NULL,
  `im13` varchar(20) NOT NULL,
  `tk13` time(6) NOT NULL,
  `im14` varchar(20) NOT NULL,
  `tk14` time(6) NOT NULL,
  `im15` varchar(20) NOT NULL,
  `tk15` time(6) NOT NULL,
  `im16` varchar(20) NOT NULL,
  `tk16` time(6) NOT NULL,
  `im17` varchar(20) NOT NULL,
  `tk17` time(6) NOT NULL,
  `im18` varchar(20) NOT NULL,
  `tk18` time(6) NOT NULL,
  `im19` varchar(20) NOT NULL,
  `tk19` time(6) NOT NULL,
  `im20` varchar(20) NOT NULL,
  `tk20` time(6) NOT NULL,
  `im21` varchar(20) NOT NULL,
  `tk21` time(6) NOT NULL,
  `im22` varchar(20) NOT NULL,
  `tk22` time(6) NOT NULL,
  `im23` varchar(20) NOT NULL,
  `tk23` time(6) NOT NULL,
  `im24` varchar(20) NOT NULL,
  `tk24` time(6) NOT NULL,
  `dst` varchar(20) NOT NULL,
  `tk25` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tdemokc`
--

INSERT INTO `tdemokc` (`id`, `sst`, `tk`, `im1`, `tk1`, `im2`, `tk2`, `im3`, `tk3`, `im4`, `tk4`, `im5`, `tk5`, `im6`, `tk6`, `im7`, `tk7`, `im8`, `tk8`, `im9`, `tk9`, `im10`, `tk10`, `im11`, `tk11`, `im12`, `tk12`, `im13`, `tk13`, `im14`, `tk14`, `im15`, `tk15`, `im16`, `tk16`, `im17`, `tk17`, `im18`, `tk18`, `im19`, `tk19`, `im20`, `tk20`, `im21`, `tk21`, `im22`, `tk22`, `im23`, `tk23`, `im24`, `tk24`, `dst`, `tk25`) VALUES
(1, 'Kalyan', '11:46:00.000000', 'Thakurli', '11:53:00.000000', 'Dombivli', '11:57:00.000000', 'Kopar', '12:00:00.000000', 'Diva JN', '12:05:00.000000', 'Mumbra', '12:09:00.000000', 'Kalva', '12:15:00.000000', 'Thane', '12:21:00.000000', 'Mulund', '12:26:00.000000', 'Nahur', '12:29:00.000000', 'Bhandup', '12:32:00.000000', 'Kanjurmarg', '12:35:00.000000', 'Vikhroli', '12:38:00.000000', 'Ghatkopar', '12:42:00.000000', 'Vidyavihar', '12:45:00.000000', 'Kurla', '12:48:00.000000', 'Sion', '12:52:00.000000', 'Matunga', '12:55:00.000000', 'Dadar', '12:59:00.000000', 'Parel', '13:02:00.000000', 'Currey Rd', '13:05:00.000000', 'Chinchpokli', '13:07:00.000000', 'Byculla', '13:09:00.000000', 'Sandhurst Rd', '13:12:00.000000', 'Masjid', '13:15:00.000000', 'CSMT', '13:18:00.000000'),
(2, 'Kalyan', '14:08:00.000000', 'Thakurli', '14:13:00.000000', 'Dombivli', '14:16:00.000000', 'Kopar', '14:19:00.000000', 'Diva Jn', '14:24:00.000000', 'Mumbra', '14:28:00.000000', 'Kalva', '14:34:00.000000', 'Thane', '14:39:00.000000', 'Mulund', '14:44:00.000000', 'Nahur', '14:47:00.000000', 'Bhandup', '14:50:00.000000', 'Kanjurmarg', '14:53:00.000000', 'Vikhroli', '14:56:00.000000', 'Ghatkopar', '15:00:00.000000', 'Vidyavihar', '15:03:00.000000', 'Kurla', '15:06:00.000000', 'Sion', '15:10:00.000000', 'Matunga', '15:13:00.000000', 'Dadar', '15:17:00.000000', 'Parel', '15:20:00.000000', 'Currey Rd', '15:23:00.000000', 'Chinchpokli', '15:25:00.000000', 'Byculla', '15:27:00.000000', 'Sandhurst Rd', '15:30:00.000000', 'Masjid', '15:33:00.000000', 'CSMT', '15:36:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `tdemopc`
--

CREATE TABLE `tdemopc` (
  `id` int(10) NOT NULL,
  `sst` varchar(20) NOT NULL,
  `times` time(6) NOT NULL,
  `ims1` varchar(20) NOT NULL,
  `tims1` time(6) NOT NULL,
  `ims2` varchar(20) NOT NULL,
  `tims2` time(6) NOT NULL,
  `ims3` varchar(20) NOT NULL,
  `tims3` time(6) NOT NULL,
  `ims4` varchar(20) NOT NULL,
  `tims4` time(6) NOT NULL,
  `ims5` varchar(20) NOT NULL,
  `tims5` time(6) NOT NULL,
  `ims6` varchar(20) NOT NULL,
  `tims6` time(6) NOT NULL,
  `ims7` varchar(20) NOT NULL,
  `tims7` time(6) NOT NULL,
  `ims8` varchar(20) NOT NULL,
  `tims8` time(6) NOT NULL,
  `ims9` varchar(20) NOT NULL,
  `tims9` time(6) NOT NULL,
  `ims10` varchar(20) NOT NULL,
  `tims10` time(6) NOT NULL,
  `ims11` varchar(20) NOT NULL,
  `tims11` time(6) NOT NULL,
  `ims12` varchar(20) NOT NULL,
  `tims12` time(6) NOT NULL,
  `ims13` varchar(20) NOT NULL,
  `tims13` time(6) NOT NULL,
  `ims14` varchar(20) NOT NULL,
  `tims14` time(6) NOT NULL,
  `ims15` varchar(20) NOT NULL,
  `tims15` time(6) NOT NULL,
  `ims16` varchar(20) NOT NULL,
  `tims16` time(6) NOT NULL,
  `ims17` varchar(20) NOT NULL,
  `tims17` time(6) NOT NULL,
  `ims18` varchar(20) NOT NULL,
  `tims18` time(6) NOT NULL,
  `ims19` varchar(20) NOT NULL,
  `tims19` time(6) NOT NULL,
  `ims20` varchar(20) NOT NULL,
  `tims20` time(6) NOT NULL,
  `ims21` varchar(20) NOT NULL,
  `tims21` time(6) NOT NULL,
  `ims22` varchar(20) NOT NULL,
  `tims22` time(6) NOT NULL,
  `ims23` varchar(20) NOT NULL,
  `tims23` time(6) NOT NULL,
  `dst` varchar(20) NOT NULL,
  `tims24` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tdemopc`
--

INSERT INTO `tdemopc` (`id`, `sst`, `times`, `ims1`, `tims1`, `ims2`, `tims2`, `ims3`, `tims3`, `ims4`, `tims4`, `ims5`, `tims5`, `ims6`, `tims6`, `ims7`, `tims7`, `ims8`, `tims8`, `ims9`, `tims9`, `ims10`, `tims10`, `ims11`, `tims11`, `ims12`, `tims12`, `ims13`, `tims13`, `ims14`, `tims14`, `ims15`, `tims15`, `ims16`, `tims16`, `ims17`, `tims17`, `ims18`, `tims18`, `ims19`, `tims19`, `ims20`, `tims20`, `ims21`, `tims21`, `ims22`, `tims22`, `ims23`, `tims23`, `dst`, `tims24`) VALUES
(1, 'Panvel', '22:23:00.000000', 'Khandeshwar', '22:28:00.000000', 'Manasarovar', '22:31:00.000000', 'Kharghar', '22:34:00.000000', 'Belapur CBD', '22:38:00.000000', 'Seawood Darave', '22:42:00.000000', 'Nerul', '22:46:00.000000', 'Juinagar', '22:49:00.000000', 'Sanpadaa', '22:52:00.000000', 'Vashi', '22:54:00.000000', 'Mankhurd', '23:02:00.000000', 'Govandi', '23:05:00.000000', 'Chembur', '23:07:00.000000', 'Tilaknagar', '23:10:00.000000', 'Kurla', '23:13:00.000000', 'Chunabhatti', '23:16:00.000000', 'GTB Nagar', '23:19:00.000000', 'Vadala Road', '23:25:00.000000', 'Sewri', '23:28:00.000000', 'Cotton Green', '23:31:00.000000', 'Reay Road', '23:33:00.000000', 'Dockyard Road', '23:36:00.000000', 'Sandhurst Road', '23:38:00.000000', 'Masjid', '23:40:00.000000', 'CSMT', '23:43:00.000000'),
(2, 'Panvel', '11:16:00.000000', 'Khandeshwar', '11:21:00.000000', 'Manasarovar', '11:24:00.000000', 'Kharghar', '11:27:00.000000', 'Belapur CBD', '11:31:00.000000', 'Seawood DARAVE', '11:35:00.000000', 'Nerul', '11:38:00.000000', 'Juinagar', '11:41:00.000000', 'Sanpada', '11:44:00.000000', 'Vashi', '11:46:00.000000', 'Mankhurd', '11:54:00.000000', 'Govandi', '11:57:00.000000', 'Chembur', '11:59:00.000000', 'Tilaknagar', '12:02:00.000000', 'Kurla', '12:05:00.000000', 'Chunabhatti', '12:08:00.000000', 'GTB Nagar', '12:11:00.000000', 'Vadala Road', '12:17:00.000000', 'Sewri', '12:20:00.000000', 'Cotton Green', '12:23:00.000000', 'Reay Road', '12:25:00.000000', 'Dockyard Road', '12:28:00.000000', 'Sandhurst Road', '12:30:00.000000', 'Masjid', '12:32:00.000000', 'CSMT', '12:35:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `tdemovbs`
--

CREATE TABLE `tdemovbs` (
  `id` int(10) NOT NULL,
  `src` varchar(20) NOT NULL,
  `tims` time(6) NOT NULL,
  `im1` varchar(20) NOT NULL,
  `ts1` time(6) NOT NULL,
  `im2` varchar(20) NOT NULL,
  `ts2` time(6) NOT NULL,
  `im3` varchar(20) NOT NULL,
  `ts3` time(6) NOT NULL,
  `im4` varchar(20) NOT NULL,
  `ts4` time(6) NOT NULL,
  `im5` varchar(20) NOT NULL,
  `ts5` time(6) NOT NULL,
  `im6` varchar(20) NOT NULL,
  `ts6` time(6) NOT NULL,
  `dst` varchar(20) NOT NULL,
  `ts7` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tdemovbs`
--

INSERT INTO `tdemovbs` (`id`, `src`, `tims`, `im1`, `ts1`, `im2`, `ts2`, `im3`, `ts3`, `im4`, `ts4`, `im5`, `ts5`, `im6`, `ts6`, `dst`, `ts7`) VALUES
(1, 'virar', '20:35:00.000000', 'Nalasopara', '20:40:00.000000', 'Vasai', '20:45:00.000000', 'Naigaon', '20:51:00.000000', 'Bhayandar', '20:56:00.000000', 'Mira Road', '21:02:00.000000', 'Dahisar', '21:06:00.000000', 'Borivali', '21:10:00.000000'),
(2, 'virar', '22:35:00.000000', 'Nalasopara', '22:40:00.000000', 'Vasai', '22:46:00.000000', 'Naigaon', '22:51:00.000000', 'Bhayandar', '22:56:00.000000', 'Mira Road', '23:01:00.000000', 'Dahisar', '23:05:00.000000', 'Borivali', '23:10:00.000000'),
(3, 'virar', '11:39:00.000000', 'Nalasopara', '11:45:00.000000', 'Vasai', '11:50:00.000000', 'Naigaon', '11:54:00.000000', 'Bhayandar', '12:00:00.000000', 'Mira Road', '12:05:00.000000', 'Dahisar', '12:09:00.000000', 'Borivali', '12:15:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `tdempta`
--

CREATE TABLE `tdempta` (
  `id` int(10) NOT NULL,
  `src` varchar(20) NOT NULL,
  `stm` time(6) NOT NULL,
  `im1` varchar(20) NOT NULL,
  `tm1` time(6) NOT NULL,
  `im2` varchar(10) NOT NULL,
  `tm2` time(6) NOT NULL,
  `im3` varchar(20) NOT NULL,
  `tm3` time(6) NOT NULL,
  `im4` varchar(20) NOT NULL,
  `tm4` time(6) NOT NULL,
  `im5` varchar(20) NOT NULL,
  `tm5` time(6) NOT NULL,
  `im6` varchar(20) NOT NULL,
  `tm6` time(6) NOT NULL,
  `im7` varchar(20) NOT NULL,
  `tm7` time(6) NOT NULL,
  `im8` varchar(20) NOT NULL,
  `tm8` time(6) NOT NULL,
  `im9` varchar(20) NOT NULL,
  `tm9` time(6) NOT NULL,
  `im10` varchar(20) NOT NULL,
  `tm10` time(6) NOT NULL,
  `im11` varchar(20) NOT NULL,
  `tm11` time(6) NOT NULL,
  `im12` varchar(20) NOT NULL,
  `tm12` time(6) NOT NULL,
  `im13` varchar(20) NOT NULL,
  `tm13` time(6) NOT NULL,
  `im14` varchar(20) NOT NULL,
  `tm14` time(6) NOT NULL,
  `im15` varchar(20) NOT NULL,
  `tm15` time(6) NOT NULL,
  `im16` varchar(20) NOT NULL,
  `tm16` time(6) NOT NULL,
  `im17` varchar(20) NOT NULL,
  `tm17` time(6) NOT NULL,
  `im18` varchar(20) NOT NULL,
  `tm18` time(6) NOT NULL,
  `im19` varchar(20) NOT NULL,
  `tm19` time(6) NOT NULL,
  `im20` varchar(20) NOT NULL,
  `tm20` time(6) NOT NULL,
  `im21` varchar(20) NOT NULL,
  `tm21` time(6) NOT NULL,
  `im22` varchar(20) NOT NULL,
  `tm22` time(6) NOT NULL,
  `im23` varchar(20) NOT NULL,
  `tm23` time(6) NOT NULL,
  `dst` varchar(20) NOT NULL,
  `tm24` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tdempta`
--

INSERT INTO `tdempta` (`id`, `src`, `stm`, `im1`, `tm1`, `im2`, `tm2`, `im3`, `tm3`, `im4`, `tm4`, `im5`, `tm5`, `im6`, `tm6`, `im7`, `tm7`, `im8`, `tm8`, `im9`, `tm9`, `im10`, `tm10`, `im11`, `tm11`, `im12`, `tm12`, `im13`, `tm13`, `im14`, `tm14`, `im15`, `tm15`, `im16`, `tm16`, `im17`, `tm17`, `im18`, `tm18`, `im19`, `tm19`, `im20`, `tm20`, `im21`, `tm21`, `im22`, `tm22`, `im23`, `tm23`, `dst`, `tm24`) VALUES
(1, 'Panvel', '19:35:00.000000', 'Khandeshwar', '19:40:00.000000', 'Mansarovar', '19:43:00.000000', 'Kharghar', '19:46:00.000000', 'Belapur CBD', '19:50:00.000000', 'Seawood Darave', '19:54:00.000000', 'Nerul', '19:57:00.000000', 'Juinagar', '20:00:00.000000', 'Sanpada', '20:03:00.000000', 'Vashi', '20:05:00.000000', 'Mankhurd', '20:13:00.000000', 'Govandi', '20:16:00.000000', 'Chembur', '20:18:00.000000', 'Tilaknagar', '20:21:00.000000', 'Kurla', '20:24:00.000000', 'Chunabhatti', '20:27:00.000000', 'GTB Nagar', '20:30:00.000000', 'Vadala Road', '20:42:00.000000', 'Kings Circle', '20:47:00.000000', 'Mahim Jn', '20:49:00.000000', 'Bandra', '20:53:00.000000', 'Khar Road', '20:58:00.000000', 'Santacruz', '21:01:00.000000', 'Vile parle', '21:04:00.000000', 'Andheri', '21:08:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `tdemtp`
--

CREATE TABLE `tdemtp` (
  `id` int(10) NOT NULL,
  `src` varchar(20) NOT NULL,
  `tims` time(6) NOT NULL,
  `im1` varchar(20) NOT NULL,
  `tt1` time(6) NOT NULL,
  `im2` varchar(20) NOT NULL,
  `tt2` time(6) NOT NULL,
  `im3` varchar(20) NOT NULL,
  `tt3` time(6) NOT NULL,
  `im4` varchar(20) NOT NULL,
  `tt4` time(6) NOT NULL,
  `im5` varchar(20) NOT NULL,
  `tt5` time(6) NOT NULL,
  `im6` varchar(20) NOT NULL,
  `tt6` time(6) NOT NULL,
  `im7` varchar(20) NOT NULL,
  `tt7` time(6) NOT NULL,
  `im8` varchar(20) NOT NULL,
  `tt8` time(6) NOT NULL,
  `im9` varchar(20) NOT NULL,
  `tt9` time(6) NOT NULL,
  `im10` varchar(20) NOT NULL,
  `tt10` time(6) NOT NULL,
  `im11` varchar(20) NOT NULL,
  `tt11` time(6) NOT NULL,
  `im12` varchar(20) NOT NULL,
  `tt12` time(6) NOT NULL,
  `dst` varchar(20) NOT NULL,
  `tt13` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tdemtp`
--

INSERT INTO `tdemtp` (`id`, `src`, `tims`, `im1`, `tt1`, `im2`, `tt2`, `im3`, `tt3`, `im4`, `tt4`, `im5`, `tt5`, `im6`, `tt6`, `im7`, `tt7`, `im8`, `tt8`, `im9`, `tt9`, `im10`, `tt10`, `im11`, `tt11`, `im12`, `tt12`, `dst`, `tt13`) VALUES
(1, 'Thane', '14:36:00.000000', 'Airoli', '14:44:00.000000', 'Rabale', '14:47:00.000000', 'Ghansoli', '14:50:00.000000', 'Koparkhairane', '14:53:00.000000', 'Turbhe', '14:57:00.000000', 'Juinagar', '15:01:00.000000', 'Nerul', '15:05:00.000000', 'Seawood DARAVE', '15:09:00.000000', 'Belapur CBD', '15:13:00.000000', 'Kharghar', '15:17:00.000000', 'Manasarovar', '15:20:00.000000', 'Khandeshwar', '15:23:00.000000', 'Panvel', '15:28:00.000000'),
(2, 'Thane', '16:32:00.000000', 'Airoli', '16:40:00.000000', 'Rabale', '16:43:00.000000', 'Ghansoli', '16:46:00.000000', 'Koparkhairane', '16:49:00.000000', 'Turbhe', '16:53:00.000000', 'Juinagar', '16:57:00.000000', 'Nerul', '17:01:00.000000', 'Seawood DARAVE', '17:05:00.000000', 'Belapur CBD', '17:09:00.000000', 'Kharghar', '17:13:00.000000', 'Manasarovar', '17:16:00.000000', 'Khandeshwar', '17:19:00.000000', 'Panvel', '17:24:00.000000'),
(3, 'Thane', '11:14:00.000000', 'Airoli', '11:22:00.000000', 'Rabale', '11:25:00.000000', 'Ghansoli', '11:28:00.000000', 'Koparkhairane', '11:31:00.000000', 'Turbhe', '11:35:00.000000', 'Juinagar', '11:39:00.000000', 'Nerul', '11:44:00.000000', 'Seawood DARAVE', '11:48:00.000000', 'Belapur CBD', '11:52:00.000000', 'Kharghar', '11:56:00.000000', 'Manasarovar', '11:59:00.000000', 'Khandeshwar', '12:02:00.000000', 'Panvel', '12:07:00.000000'),
(4, 'Thane', '20:15:00.000000', 'Airoli', '20:23:00.000000', 'Rabale', '20:26:00.000000', 'Ghansoli', '20:29:00.000000', 'Koparkhairane', '20:32:00.000000', 'Turbhe', '20:36:00.000000', 'Juinagar', '20:40:00.000000', 'Nerul', '20:44:00.000000', 'Seawood DARAVE', '20:48:00.000000', 'Belapur CBD', '20:52:00.000000', 'Kharghar', '20:56:00.000000', 'Manasarovar', '20:59:00.000000', 'Khandeshwar', '21:02:00.000000', 'Panvel', '21:07:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `tlogin`
--

CREATE TABLE `tlogin` (
  `id` int(11) NOT NULL,
  `user` varchar(20) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `msg` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tlogin`
--

INSERT INTO `tlogin` (`id`, `user`, `pass`, `msg`) VALUES
(1, 'aks', '123', 'hello all andheri train running late'),
(2, 'aks', '123', 'hello'),
(5, 'aks', '123', 'train'),
(6, 'zzz', '333', 'vasai'),
(8, 'aks', '123', 'hi'),
(10, 'aks', '123', 'dadar');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `routpa`
--
ALTER TABLE `routpa`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `routpt`
--
ALTER TABLE `routpt`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `routsd1`
--
ALTER TABLE `routsd1`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tdemcta`
--
ALTER TABLE `tdemcta`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tdemlog`
--
ALTER TABLE `tdemlog`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tdemo1`
--
ALTER TABLE `tdemo1`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tdemocb`
--
ALTER TABLE `tdemocb`
  ADD PRIMARY KEY (`id1`);

--
-- Indexes for table `tdemocdhn`
--
ALTER TABLE `tdemocdhn`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tdemock`
--
ALTER TABLE `tdemock`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tdemocp`
--
ALTER TABLE `tdemocp`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tdemocv`
--
ALTER TABLE `tdemocv`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tdemodc`
--
ALTER TABLE `tdemodc`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tdemokc`
--
ALTER TABLE `tdemokc`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tdemopc`
--
ALTER TABLE `tdemopc`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tdemovbs`
--
ALTER TABLE `tdemovbs`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tdempta`
--
ALTER TABLE `tdempta`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tdemtp`
--
ALTER TABLE `tdemtp`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tlogin`
--
ALTER TABLE `tlogin`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `routpa`
--
ALTER TABLE `routpa`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `routpt`
--
ALTER TABLE `routpt`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `routsd1`
--
ALTER TABLE `routsd1`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tdemcta`
--
ALTER TABLE `tdemcta`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tdemlog`
--
ALTER TABLE `tdemlog`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `tdemo1`
--
ALTER TABLE `tdemo1`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `tdemocb`
--
ALTER TABLE `tdemocb`
  MODIFY `id1` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tdemocdhn`
--
ALTER TABLE `tdemocdhn`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tdemock`
--
ALTER TABLE `tdemock`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tdemocp`
--
ALTER TABLE `tdemocp`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tdemocv`
--
ALTER TABLE `tdemocv`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tdemodc`
--
ALTER TABLE `tdemodc`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tdemokc`
--
ALTER TABLE `tdemokc`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tdemopc`
--
ALTER TABLE `tdemopc`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tdemovbs`
--
ALTER TABLE `tdemovbs`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tdempta`
--
ALTER TABLE `tdempta`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tdemtp`
--
ALTER TABLE `tdemtp`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tlogin`
--
ALTER TABLE `tlogin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
