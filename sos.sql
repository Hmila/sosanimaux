-- phpMyAdmin SQL Dump
-- version 3.4.9
-- http://www.phpmyadmin.net
--
-- Client: 127.0.0.1
-- Généré le : Ven 21 Février 2014 à 10:28
-- Version du serveur: 5.5.20
-- Version de PHP: 5.3.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `sos`
--

-- --------------------------------------------------------

--
-- Structure de la table `administrateur`
--

CREATE TABLE IF NOT EXISTS `administrateur` (
  `Id_admin` int(10) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(20) NOT NULL,
  `Prenom` varchar(20) NOT NULL,
  `Login` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  PRIMARY KEY (`Id_admin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `animal`
--

CREATE TABLE IF NOT EXISTS `animal` (
  `id_animal` int(10) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(20) NOT NULL,
  `Type` varchar(20) NOT NULL,
  `Age` int(10) NOT NULL,
  PRIMARY KEY (`id_animal`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `annuaire`
--

CREATE TABLE IF NOT EXISTS `annuaire` (
  `id_annuaire` int(10) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(20) NOT NULL,
  `Prenom` varchar(20) NOT NULL,
  `Adresse` varchar(20) NOT NULL,
  `Service` varchar(20) NOT NULL,
  `Tel` int(8) NOT NULL,
  PRIMARY KEY (`id_annuaire`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `id_client` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(20) NOT NULL,
  `Prenom` varchar(20) NOT NULL,
  `Adresse` varchar(20) NOT NULL,
  `Tel` int(8) NOT NULL,
  `Mail` varchar(20) NOT NULL,
  `Login` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  PRIMARY KEY (`id_client`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`id_client`, `Nom`, `Prenom`, `Adresse`, `Tel`, `Mail`, `Login`, `Password`) VALUES
(1, 'kebaier', 'anouar', 'soliman', 20094348, 'anouar1922@live.fr', 'anouar', '0000');

-- --------------------------------------------------------

--
-- Structure de la table `declaration`
--

CREATE TABLE IF NOT EXISTS `declaration` (
  `id-declaration` int(10) NOT NULL AUTO_INCREMENT,
  `Date` date NOT NULL,
  `Type_animal` varchar(20) NOT NULL,
  `Etat` varchar(20) NOT NULL,
  `id_client` int(10) NOT NULL,
  PRIMARY KEY (`id-declaration`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `facture`
--

CREATE TABLE IF NOT EXISTS `facture` (
  `id_facture` int(10) NOT NULL AUTO_INCREMENT,
  `Service` varchar(20) NOT NULL,
  `Montant` float NOT NULL,
  `Date` date NOT NULL,
  `id_client` int(10) NOT NULL,
  PRIMARY KEY (`id_facture`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `offre`
--

CREATE TABLE IF NOT EXISTS `offre` (
  `Id_offre` int(10) NOT NULL AUTO_INCREMENT,
  `Service` varchar(20) NOT NULL,
  `Date_debut` date NOT NULL,
  `Date_fin` date NOT NULL,
  `Montant` float NOT NULL,
  PRIMARY KEY (`Id_offre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
