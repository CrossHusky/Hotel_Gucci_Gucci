-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-06-2021 a las 14:44:46
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel_gucci_gucci`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huespedes`
--

CREATE TABLE `huespedes` (
  `Nombre` varchar(25) NOT NULL,
  `TipoHabitacion` char(1) NOT NULL,
  `NumeroHabitacion` int(10) NOT NULL,
  `CiudadOrigen` varchar(30) NOT NULL,
  `TotalPersonas` int(10) NOT NULL,
  `DiasAlojo` int(10) NOT NULL,
  `FechaIngreso` date NOT NULL,
  `InHotel` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `huespedes`
--

INSERT INTO `huespedes` (`Nombre`, `TipoHabitacion`, `NumeroHabitacion`, `CiudadOrigen`, `TotalPersonas`, `DiasAlojo`, `FechaIngreso`, `InHotel`) VALUES
('Alejandra Luevano', 'S', 15, 'Mexico, Aguascalientes', 2, 4, '2021-06-19', 1),
('Ana Maria Santillan', 'D', 9, 'Aguascalientes, Mexico', 3, 20, '2019-09-13', 1),
('Carlos Luevano Santillan', 'T', 24, 'Mexico, Aguascalientes', 5, 10, '2021-06-12', 1),
('Esteban Ovalle Aguilar', 'D', 10, 'Monterrey', 3, 7, '2021-06-16', 1),
('Jose del refugio', 'T', 7, 'Mexico, Aguascalientes', 4, 7, '2021-06-09', 1),
('Sujeto', 'D', 5, 'Villa quien', 2, 4, '2021-06-04', 1),
('Sujeto 1', 'S', 1, 'kmlxzkjcposa ajmcx', 1, 13, '2021-06-24', 1),
('Sujeto 11', 'S', 2, 'mfsdma', 2, 5, '2021-06-05', 1),
('Sujeto 16', 'S', 16, 'kvknsd kndfikjew', 2, 6, '2021-06-30', 1),
('Sujeto 20', 'S', 14, 'dlklf;dskl', 1, 5, '2021-02-25', 1),
('Sujeto 22', 'D', 11, 'kjmklciks', 4, 8, '2017-03-17', 1),
('Sujeto 23', 'D', 21, 'asdfolkllw', 3, 4, '2019-06-02', 1),
('Sujeto 24', 'D', 20, 'poisdpf', 2, 6, '2021-06-04', 1),
('Sujeto 25', 'D', 19, 'mcnjna djnskad', 3, 6, '2026-03-27', 1),
('Sujeto 26', 'D', 18, 'mncajkl as;ol', 4, 12, '2014-03-12', 1),
('Sujeto 27', 'D', 28, 'ioiweijnd', 1, 15, '2015-08-15', 1),
('Sujeto 29', 'D', 29, 'valksir 32', 2, 8, '2014-11-10', 1),
('Sujeto 31', 'T', 23, 'mn ncwsidjie', 4, 8, '2018-03-23', 1),
('Sujeto 32', 'T', 25, 'peis xieng', 3, 8, '2016-01-01', 1),
('Sujeto 34', 'S', 30, 'knlsdfkopa soajda', 3, 3, '2021-03-15', 1),
('Sujeto 4', 'S', 4, 'ldokgksdfg', 3, 16, '2021-06-18', 1),
('Sujeto 5', 'S', 13, 'Jalisco', 1, 5, '2021-06-08', 1),
('Sujeto 6', 'S', 3, 'Cosio', 1, 5, '2021-06-26', 1),
('Sujeto8', 'D', 6, 'Guerrero', 3, 4, '2021-06-09', 1),
('Sujetos 12', 'T', 26, 'asdflkaojdsfldfkljls21', 4, 6, '2021-06-20', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `huespedes`
--
ALTER TABLE `huespedes`
  ADD PRIMARY KEY (`Nombre`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
