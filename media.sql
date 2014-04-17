SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

CREATE TABLE IF NOT EXISTS `book` (
  `ID` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `author` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `genre` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`ID`, `title`, `author`, `genre`) VALUES
('1115', 'ScrewTape Letters', 'Lewis', 'Fiction'),
('1112', 'Huckleberry Fin', 'Tom Sawyer', 'Fiction'),
('1113', 'Encyclopedia', 'multiple', 'NonFiction'),
('1114', 'Vogue', 'cahllahan', 'Entertainment');

-- --------------------------------------------------------

--
-- Table structure for table `mediaType`
--

CREATE TABLE IF NOT EXISTS `mediaType` (
  `mediaID` int(255) DEFAULT NULL,
  `mediaTypeName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `mediaType`
--

INSERT INTO `mediaType` (`mediaID`, `mediaTypeName`) VALUES
(1, 'book'),
(2, 'movie'),
(3, 'cd'),


-- --------------------------------------------------------

--
-- Table structure for table `movie`
--

CREATE TABLE IF NOT EXISTS `movie` (
  `ID` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `author` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `genre` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `movie`
--

INSERT INTO `movie` (`ID`, `title`, `author`, `genre`) VALUES
('1000', 'Pirates of the Carribean', 'smith', 'action'),
('2000', 'Dude where my car', 'apple', 'comedy'),
('3000', 'scream', 'james', 'horror'),
('4000', 'passion', 'cahllahan', 'drama'),


-- --------------------------------------------------------

--
-- Table structure for table `cd`
--

CREATE TABLE IF NOT EXISTS `cd` (
  `ID` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `author` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `genre` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `cd`
--

INSERT INTO `cd` (`ID`, `title`, `author`, `genre`) VALUES
('7777', 'release', 'smith', 'rock'),
('8888', 'remember', 'apple', 'gospel'),
('9999', 'forget', 'james', 'country'),
('1123', 'careless', 'cahllahan', 'rap');



