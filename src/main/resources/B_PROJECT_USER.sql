-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Oct 07, 2023 at 04:06 PM
-- Server version: 5.7.39
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bravo`
--

-- --------------------------------------------------------

--
-- Table structure for table `B_PROJECT_USER`
--

CREATE TABLE `B_PROJECT_USER` (
  `id` int(11) NOT NULL,
  `project_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `isActive` tinyint(1) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `B_PROJECT_USER`
--

INSERT INTO `B_PROJECT_USER` (`id`, `project_id`, `user_id`, `isActive`) VALUES
(1, 14, 1, 1),
(2, 14, 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `B_PROJECT_USER`
--
ALTER TABLE `B_PROJECT_USER`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `project_id` (`project_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `B_PROJECT_USER`
--
ALTER TABLE `B_PROJECT_USER`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `B_PROJECT_USER`
--
ALTER TABLE `B_PROJECT_USER`
  ADD CONSTRAINT `b_project_user_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `B_USER` (`id`),
  ADD CONSTRAINT `b_project_user_ibfk_2` FOREIGN KEY (`project_id`) REFERENCES `B_PROJECT` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
