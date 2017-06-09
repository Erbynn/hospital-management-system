-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 14, 2017 at 10:52 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `hospital_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE IF NOT EXISTS `attendance` (
  `EmplyeeID` int(11) NOT NULL,
  `Month` varchar(10) DEFAULT NULL,
  `Attendance` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`EmplyeeID`, `Month`, `Attendance`) VALUES
(1, 'Jan', 3);

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE IF NOT EXISTS `doctor` (
`DocID` int(5) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `DocType` varchar(15) NOT NULL,
  `TPNumber` varchar(14) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Age` int(3) NOT NULL,
  `AdmisnDate` varchar(11) NOT NULL,
  `AvailableTime` varchar(20) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`DocID`, `Name`, `DocType`, `TPNumber`, `Address`, `Age`, `AdmisnDate`, `AvailableTime`) VALUES
(1, 'Upul Shantha', 'Audiologist', '0715482395', 'Baragama,Ambalantota', 39, '2014-05-7', NULL),
(2, 'Hirushi Kavya', 'Cardiologist', '0715869711', 'Ridiyagama,Ambalantota', 30, '2016-05-12', 'Sun 3-4'),
(3, 'Manel Paskuel', 'ENT Specialist', '0776903481', 'Palawaththa,Baththramulla', 51, '2008-05-9', NULL),
(4, 'Wasana Gajanayaka', 'Gynecologist', '0710900516', 'Bolana,Ambalantota', 50, '2010-11-17', NULL),
(5, 'Ashen Weerathunga', 'Oncologist', '0716042995', 'campRoad,Kadawatha', 35, '2011-09-7', NULL),
(6, 'Wijitha zoysa', 'Radiologist', '0754951506', 'Delkanda,Nugegoda', 46, '2012-01-20', NULL),
(7, 'Chashika Weerathunga', 'Surgeon', '0713731206', '2nd lane,Nugegoda', 33, '2013-05-16', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE IF NOT EXISTS `employee` (
`EmpID` int(11) NOT NULL,
  `EmpName` varchar(45) NOT NULL,
  `Occupation` varchar(20) NOT NULL,
  `Age` varchar(5) NOT NULL,
  `TPNumber` varchar(14) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `AdmisnDate` varchar(14) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`EmpID`, `EmpName`, `Occupation`, `Age`, `TPNumber`, `Address`, `AdmisnDate`) VALUES
(1, 'Chashika Jayashan', 'Receptionist', '22', '0713731206', 'Delkanda,Nugegoga', 'May 11, 2012');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE IF NOT EXISTS `patient` (
`id` int(15) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Age` int(3) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `TPNumber` varchar(12) NOT NULL,
  `Addresss` varchar(50) NOT NULL,
  `GurdianName` varchar(50) NOT NULL,
  `Disease` varchar(150) NOT NULL,
  `AdmitDate` varchar(11) NOT NULL,
  `WardID` int(4) NOT NULL,
  `DoctorID` int(4) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`id`, `Name`, `Age`, `Gender`, `TPNumber`, `Addresss`, `GurdianName`, `Disease`, `AdmitDate`, `WardID`, `DoctorID`) VALUES
(2, 'Uchintha gamage', 19, 'Female', '0713458923', 'Udahamulla,Nugegoda', 'Kanthi gamage', 'Diabetes', ' 2017-05-13', 1, 2),
(3, 'Binuri Yomandi', 19, 'Female', '0714390950', 'Maththegoda', 'Roshan Wickramathnga', 'Chickenfox', ' 2017-05-13', 4, 5),
(4, 'Nipuna Abeykoon', 26, 'Male', '0773479730', '1stkane,Nugegoda', 'Kumari Abeykoon', 'flue', ' 2017-05-13', 3, 4);

-- --------------------------------------------------------

--
-- Table structure for table `patienttest`
--

CREATE TABLE IF NOT EXISTS `patienttest` (
  `patientID` int(11) NOT NULL,
  `patientName` varchar(45) NOT NULL,
  `TestID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `test`
--

CREATE TABLE IF NOT EXISTS `test` (
`testId` int(11) NOT NULL,
  `testName` varchar(20) NOT NULL,
  `charge` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
`userNo` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL,
  `empID` int(11) NOT NULL,
  `occupation` varchar(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userNo`, `username`, `password`, `empID`, `occupation`) VALUES
(1, 'chashikajw', '123', 1, 'Receptionist'),
(2, 'hkw', '123', 2, 'Doctor'),
(3, 'mwr', '123', 4, 'Doctor');

-- --------------------------------------------------------

--
-- Table structure for table `ward`
--

CREATE TABLE IF NOT EXISTS `ward` (
`WardID` int(3) NOT NULL,
  `WType` varchar(15) NOT NULL,
  `NoOfBeds` int(3) NOT NULL,
  `Charge` int(5) NOT NULL,
  `RemainingBeds` int(3) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ward`
--

INSERT INTO `ward` (`WardID`, `WType`, `NoOfBeds`, `Charge`, `RemainingBeds`) VALUES
(1, 'Maternity', 20, 1800, 20),
(2, 'Pediatrics', 15, 2000, 15),
(3, 'Oncology', 25, 2300, 25),
(4, 'Gynecologist', 20, 2100, 20),
(5, 'Pediatrics', 24, 2000, 24);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
 ADD PRIMARY KEY (`EmplyeeID`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
 ADD PRIMARY KEY (`DocID`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
 ADD PRIMARY KEY (`EmpID`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
 ADD PRIMARY KEY (`id`), ADD KEY `DoctorID` (`DoctorID`);

--
-- Indexes for table `patienttest`
--
ALTER TABLE `patienttest`
 ADD KEY `TestID` (`TestID`), ADD KEY `patientID` (`patientID`);

--
-- Indexes for table `test`
--
ALTER TABLE `test`
 ADD PRIMARY KEY (`testId`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
 ADD PRIMARY KEY (`userNo`);

--
-- Indexes for table `ward`
--
ALTER TABLE `ward`
 ADD PRIMARY KEY (`WardID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
MODIFY `DocID` int(5) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
MODIFY `EmpID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
MODIFY `id` int(15) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `test`
--
ALTER TABLE `test`
MODIFY `testId` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
MODIFY `userNo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `ward`
--
ALTER TABLE `ward`
MODIFY `WardID` int(3) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `patient`
--
ALTER TABLE `patient`
ADD CONSTRAINT `DoctorID` FOREIGN KEY (`DoctorID`) REFERENCES `doctor` (`DocID`) ON DELETE CASCADE;

--
-- Constraints for table `patienttest`
--
ALTER TABLE `patienttest`
ADD CONSTRAINT `patienttest_ibfk_1` FOREIGN KEY (`patientID`) REFERENCES `patient` (`id`),
ADD CONSTRAINT `patienttest_ibfk_2` FOREIGN KEY (`TestID`) REFERENCES `test` (`testId`),
ADD CONSTRAINT `patienttest_ibfk_3` FOREIGN KEY (`patientID`) REFERENCES `patient` (`id`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
