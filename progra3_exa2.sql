-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 01-02-2017 a las 23:40:13
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `progra3_exa2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `author`
--

CREATE TABLE IF NOT EXISTS `author` (
  `id_Author` int(11) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  PRIMARY KEY (`id_Author`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=29 ;

--
-- Volcado de datos para la tabla `author`
--

INSERT INTO `author` (`id_Author`, `name`) VALUES
(28, 'Markus Suzak');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `authorcontact`
--

CREATE TABLE IF NOT EXISTS `authorcontact` (
  `id_authorContact` int(11) NOT NULL AUTO_INCREMENT,
  `id_Author` int(11) NOT NULL,
  `contact` text NOT NULL,
  `type` text NOT NULL,
  PRIMARY KEY (`id_authorContact`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=28 ;

--
-- Volcado de datos para la tabla `authorcontact`
--

INSERT INTO `authorcontact` (`id_authorContact`, `id_Author`, `contact`, `type`) VALUES
(27, 28, '25679302', 'Telefono');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `book`
--

CREATE TABLE IF NOT EXISTS `book` (
  `id_book` int(11) NOT NULL AUTO_INCREMENT,
  `id_Author` int(11) NOT NULL,
  `id_type` int(11) NOT NULL,
  `name` text NOT NULL,
  `dateRelease` date NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`id_book`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `booktype`
--

CREATE TABLE IF NOT EXISTS `booktype` (
  `id_type` int(11) NOT NULL AUTO_INCREMENT,
  `type` text NOT NULL,
  PRIMARY KEY (`id_type`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=27 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
