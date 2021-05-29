-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2021 at 02:03 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `monitoring_attendance`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance_of_employee`
--

CREATE TABLE `attendance_of_employee` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `fullname` varchar(255) NOT NULL,
  `Date` datetime NOT NULL DEFAULT current_timestamp(),
  `type` tinyint(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `attendance_of_employee`
--

INSERT INTO `attendance_of_employee` (`id`, `username`, `fullname`, `Date`, `type`) VALUES
(1, 'john_dave@gmail.com', 'John DavePacinio', '2021-05-29 16:27:42', 1),
(2, 'marjorie_entoma@gmail.com', 'MarjorieEntoma', '2021-05-29 17:41:08', 1),
(3, 'marjorie_entoma@gmail.com', 'MarjorieEntoma', '2021-05-29 17:48:08', 2);

-- --------------------------------------------------------

--
-- Table structure for table `employeetable`
--

CREATE TABLE `employeetable` (
  `employee_id` int(11) NOT NULL,
  `firstName` varchar(255) NOT NULL,
  `lastName` varchar(255) NOT NULL,
  `department` varchar(255) NOT NULL,
  `position` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `emailAddress` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employeetable`
--

INSERT INTO `employeetable` (`employee_id`, `firstName`, `lastName`, `department`, `position`, `address`, `gender`, `emailAddress`, `password`) VALUES
(1, 'John Dave', 'Pacinio', 'CCT', 'Analyst', 'Bantayan Island', 'Male', 'john_dave@gmail.com', 'orcs_dave123'),
(3, 'Marjorie', 'Entoma', ' Administrator department', 'Administrative Specialist', 'Dalaguete', 'Female', 'marjorie_entoma@gmail.com', 'MarjGor6e0us'),
(4, 'Kyla Jean', 'Dumaguit', 'Support and Security Department', 'Senior Security Analyst', 'Medellin, Cebu', 'Female', 'kyla_dumaguit@gmail.com', 'hell0_Kitty123'),
(6, 'Chymbee', 'Cerenio', 'HR Department', 'Applications Specialist​', 'Bantayan Island', 'Female', 'chymbee_cerenio@gmail.com', 'mickey_mouse123'),
(8, 'Eleasar ', 'Patot', 'IT', 'Software/Application Developer', 'Dalaguete, Cebu', 'Male', 'elsa_patot@gmail.com', 'elsa123'),
(9, 'Jenie Joy', 'Tomalon', 'IT', 'Chief Information Officer (CIO)', 'Samar', 'Female', 'jenie_tomalon@gmail.com', 'jenie143'),
(10, 'Precy Jean', 'Roxas', 'Administrator department', 'Administrative Director', 'Negros', 'Female', 'precy_roxas@gmail.com', 'precy_xeng143'),
(11, 'Daryll', 'Vidosola', 'Support and Security', 'Manager', 'Malabuyok, Cebu', 'Male', 'daryll_vildosola@gmail', 'daryll_143_zer02'),
(12, 'Baldwin', 'Manungas', 'Administration Deparment', 'Manager', 'Camaman‑an, CDOC', 'Male', 'baldwin_manungas@gmail.com', 'manungas_drwingLover'),
(13, 'Patrick Carl', 'Glinogo', 'IT', 'Software Developer', 'Nug-as, Alcoy, Cebu', 'Male', 'patrick@gmail.com', 'patrick123'),
(15, 'Charlene', 'Cabactulan', 'HR', 'Administrative Manager', 'Cagayan de Oro City', 'Female', 'charlene_cabacs@gmail.com', 'changlenePikot123'),
(17, 'Angelica ', 'Manlapaz', 'HR', 'Manager', 'Negros Oriental', 'Female', 'angelica_manlapaz@gmail.com', 'angel_jikay123'),
(18, 'angelica_manlapaz@gmail.com', 'Angelica ', 'Manlapaz', 'HR', 'Assisstant Manager', 'Negros Oriental', 'Female', 'angel_jikay123');

-- --------------------------------------------------------

--
-- Table structure for table `project`
--

CREATE TABLE `project` (
  `project_id` int(11) NOT NULL,
  `project_title` varchar(255) NOT NULL,
  `department` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `project`
--

INSERT INTO `project` (`project_id`, `project_title`, `department`, `status`) VALUES
(1, 'Milk Tea Store Management', 'IT Services Development', 'Progressing'),
(2, 'Pharmacy Inventory Management', 'HR', 'Review'),
(3, 'Restaurant POS System', 'Administrator Deparment', 'In Progress'),
(4, 'Car Wash Management System', 'Support and Security Department', 'Review'),
(5, 'Hotel Booking System', 'Marketing Department', 'In Progress'),
(6, 'Inventory Management System', 'Finance Department', 'Pending'),
(9, 'Bending Machine', 'IT Services Development', 'Review'),
(10, 'Personal Blog', 'IT Services Development', 'Complete');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `created_at` datetime NOT NULL DEFAULT current_timestamp(),
  `deleted_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `gender`, `created_at`, `deleted_at`) VALUES
(1, 'admin', 'admin123', 'Male', '2021-05-22 19:27:53', NULL),
(4, 'kyla_dumaguit@gmail.com', 'hell0_Kitty', 'Female', '2021-05-29 11:17:14', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `attendance_of_employee`
--
ALTER TABLE `attendance_of_employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employeetable`
--
ALTER TABLE `employeetable`
  ADD PRIMARY KEY (`employee_id`);

--
-- Indexes for table `project`
--
ALTER TABLE `project`
  ADD PRIMARY KEY (`project_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `attendance_of_employee`
--
ALTER TABLE `attendance_of_employee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `employeetable`
--
ALTER TABLE `employeetable`
  MODIFY `employee_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `project`
--
ALTER TABLE `project`
  MODIFY `project_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
