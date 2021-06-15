-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-06-2021 a las 13:36:54
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
-- Estructura de tabla para la tabla `cuentas`
--

CREATE TABLE `cuentas` (
  `cuenta` varchar(25) NOT NULL,
  `password` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cuentas`
--

INSERT INTO `cuentas` (`cuenta`, `password`) VALUES
('Carlos', '76d80224611fc919a5d54f0ff9fba446'),
('Samael', '7815696ecbf1c96e6894b779456d330e');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huespedes`
--

CREATE TABLE `huespedes` (
  `Nombre` varchar(45) NOT NULL,
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
('Adan Velasco Herver', 'S', 30, 'Xalapa', 1, 4, '2021-09-11', 1),
('Alejandra Luevano', 'S', 15, 'Mexico, Aguascalientes', 2, 4, '2021-06-19', 1),
('Ana Maria Santillan', 'D', 9, 'Aguascalientes, Mexico', 3, 20, '2019-09-13', 1),
('Beatriz Adriana Carbajal', 'S', 3, 'Los Cabos', 1, 3, '2019-06-13', 1),
('Benjamin Luna Rios', 'S', 12, 'Matamoros', 3, 6, '2024-04-12', 1),
('Carlos Luevano Santillan', 'T', 24, 'Mexico, Aguascalientes', 5, 10, '2021-06-12', 1),
('Daniel Hernandez Arguello', 'D', 19, 'Acapulco', 3, 8, '2020-09-24', 1),
('Esteban Ovalle Aguilar', 'D', 10, 'Monterrey', 3, 7, '2021-06-16', 1),
('Jazmin Salvador Velazco', 'D', 29, 'San Luis Potosí-Soledad', 4, 12, '2017-12-30', 1),
('Jose del Refugio Luevano', 'T', 26, 'Guadalajara', 3, 17, '2018-02-16', 1),
('Susana Lopez Milpas', 'D', 17, 'Zacatecas-Guadalupe', 3, 14, '2014-01-20', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cuentas`
--
ALTER TABLE `cuentas`
  ADD PRIMARY KEY (`cuenta`);

--
-- Indices de la tabla `huespedes`
--
ALTER TABLE `huespedes`
  ADD PRIMARY KEY (`Nombre`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
