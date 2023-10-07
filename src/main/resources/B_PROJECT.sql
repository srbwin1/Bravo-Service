-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Oct 07, 2023 at 04:24 AM
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
-- Table structure for table `B_PROJECT`
--

CREATE TABLE `B_PROJECT` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `url_on_catalog` varchar(255) NOT NULL,
  `url_external` varchar(255) NOT NULL,
  `description` varchar(5000) NOT NULL,
  `keywords` varchar(500) NOT NULL,
  `fields_of_science` varchar(500) NOT NULL,
  `isActive` tinyint(1) NOT NULL DEFAULT '0',
  `agency_sponsor` varchar(255) DEFAULT NULL,
  `agency_sponsor_other` varchar(255) DEFAULT NULL,
  `gov_contact` varchar(255) DEFAULT NULL,
  `gov_contact_email` varchar(255) DEFAULT NULL,
  `geographic_scope` varchar(255) DEFAULT NULL,
  `participant_age` varchar(255) NOT NULL,
  `participation_tasks` varchar(255) NOT NULL,
  `scistarter` tinyint(1) DEFAULT '0',
  `email` varchar(255) NOT NULL,
  `start_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `project_goals` varchar(255) NOT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `B_PROJECT`
--

INSERT INTO `B_PROJECT` (`id`, `name`, `url_on_catalog`, `url_external`, `description`, `keywords`, `fields_of_science`, `isActive`, `agency_sponsor`, `agency_sponsor_other`, `gov_contact`, `gov_contact_email`, `geographic_scope`, `participant_age`, `participation_tasks`, `scistarter`, `email`, `start_date`, `project_goals`, `created_at`, `updated_at`) VALUES
(4, 'Florida Keys Water Watch', 'https://www.citizenscience.gov/catalog/4/', 'http://monroe.ifas.ufl.edu/pdf/environment/fkww.pdf', 'The University of Florida IFAS Monroe County Extension developed Florida Keys Water Watch, a community-based volunteer water quality monitoring program to promote awareness of the importance of water quality, reduce nonpoint source pollution, and involve students and citizens to monitor coastal habitats from man-made canals to bays to  beaches.  Florida Keys Water Watch teaches volunteers to test a site of their choice for dissolved oxygen, pH, salinity and temperature after attending a 4-hour workshop.', 'water quality, dissolved oxygen, pH, salinity, Florida Keys, South Florida, coastal', 'Chemistry,  Ecology and environment,  Nature and outdoors, Ocean/water and marine', 1, 'U.S. Environmental Protection Agency (EPA)', '', 'Jay Benforado', 'benforado.jay@epa.gov', 'Florida', 'elementary_school_children, families, general_public, seniors', 'data_entry, identification, learning, measurement, observation, sample_analysis, site_selection_description, specimen_sample_collection', 1, 'shellykrueger@ufl.edu', '2014-10-17 04:00:00', '', '2023-10-07 03:55:21', '2023-10-07 03:55:21'),
(6, 'System for Mapping and Predicting Species of Concern', 'https://www.citizenscience.gov/catalog/6/', 'http://www.dri.edu/', 'The purpose of SMAP-SOC is to provide BLM natural resource managers with an application to model the current and future distributions of freshwater species of concern (SOC), across large management regions. These models will be based on occurrences from both crowdsourced data and detections using environmental DNA (e-DNA). These occurrences will then be related to Earth observations and other spatial data so distributions can be predicted across landscapes.', 'freshwater, fish, Alaska, rivers, lakes, threatened and endangered', 'Animals, Ecology and environment,  Nature and outdoors', 1, 'National Aeronautics and Space Administration (NASA), Bureau of Land Management (BLM) ', '', 'Heidi Hadley', 'hhadley@blm.gov', 'Alaska', 'general_public', 'geolocation, specimen_sample_collection', 1, 'john.olson@dri.edu', '2014-02-14 05:00:00', '', '2023-10-07 03:54:58', '2023-10-07 03:54:58'),
(13, 'The Advanced Rapid Imaging and Analysis Project (ARIA) Damage Validation Project', 'https://www.citizenscience.gov/catalog/13/', 'http://aria.jpl.nasa.gov/', 'The Advanced Rapid Imaging and Analysis Project at NASA&#39;s Jet Propulsion Laboratory and the California Institute of Technology develops algorithms and a system to automatically respond to natural disaster events and rapidly produce decision support information, using Synthetic Aperture Radar (SAR), Global Positioning System (GPS), and seismic data.  The ARIA Damage Validation Project combines change detection maps derived from SAR data and optical data using human brains through a mobile-friendly web interface. The crowdsourcing produces improved versions of damage detection maps decreasing the number of false positives.', 'Proof of concept, disaster_response, damage maps, natural disaster, remote sensing, Synthetic Aperture Radar', 'Astronomy and space, Climate and weather,  Computers and technology,  Ecology and environment,  Geology and earth science,  Ocean/water and marine, Science policy', 1, 'U.S. Geological Survey (USGS)', 'FEMA, NASA Jet Propulsion Laboratory', 'Amy Kaminski', 'amy.p.kaminski@nasa.gov', 'International', 'general_public', 'data_entry, geolocation, classification_tagging, finding_entities, ', 1, 'Sang-Ho.Yun@jpl.nasa.gov', '2013-10-01 04:00:00', '', '2023-10-07 03:52:55', '2023-10-07 03:52:55'),
(14, 'Did You Feel It?', 'https://www.citizenscience.gov/catalog/14/', 'http://earthquake.usgs.gov/dyfi', 'The Did You Feel It? (DYFI) project is designed to gather information available about earthquakes from the people who experience them. By tapping the immense number of users online, DYFI can get a detailed characterization of what people were experiencing, the impacts of the earthquake, and the amount of damage it incurred, beyond the scope traditional information gathering techniques. Data input from users is immediately available on the website, and its interactive platform encourages users to gain a deeper understanding of earth sciences while they participate.', 'Earthquakes, Natural hazards', 'Geology and earth science,  Disaster response', 1, 'U.S. Geological Survey (USGS)', '', '', '', 'International', 'general_public, targeted_group', 'observation, site_selection_description, classification_tagging, data_entry, geolocation, identification', 1, 'wald@usgs.gov', '2003-01-01 05:00:00', '', '2023-10-07 03:56:08', '2023-10-07 03:56:08'),
(16, 'The Delaware Bay Horseshoe Crab Survey', 'https://www.citizenscience.gov/catalog/16/', 'http://horseshoecrabsurvey.com', 'The Delaware Bay Horseshoe Crab Survey was founded in 1990, and received government support beginning in 1999. Volunteers collect data on Horseshoe crabs through beach surveys, providing critical information for scientists and policymakers about Horseshoe crab populations in the Delaware Bay. Data from the survey has helped the Atlantic States Marine Fisheries Commission (ASMFC) set protocols for commercial fishing. Limuli Labs, a company that relies on horseshoe crabs to support medical research and practice, provides funding for the project website.', 'Environmental Survey, Conservation Policy, Biodiversity, ecosystem ecology, human pharmacology', 'Animals, Biology, Ecology and environment,  Health and medicine,  Nature and outdoors, Ocean/water and marine, Science policy', 1, 'National Oceanic and Atmospheric Administration (NOAA), U.S. Geological Survey (USGS), U.S. Fish and Wildlife Service', '', 'Sophia B. Liu', 'sophialiu@usgs.gov', 'Regional (13 beaches in Delaware and 12 beaches in New Jersey)', 'general_public, families, middle_school_children, teens', 'data_entry, observation, measurement, learning, site_selection_description', 1, 'bhall@udel.edu', '1990-01-01 05:00:00', '', '2023-10-07 03:56:38', '2023-10-07 03:56:38'),
(20, 'Image Detective', 'https://www.citizenscience.gov/catalog/20/', 'http://eol.jsc.nasa.gov/BeyondThephotography/ImageDetective/', 'Use your geography skills to geolocate Astronaut photography of Earth!  If you have always wanted to associate those amazing photographs of our beautiful planet taken from space with their locations on the Earth, Image Detective is the perfect tool for you!  By doing so, you will help to locate hundreds of thousands of images and also enhance your geography skills at the same time. You can gauge how high your skill level is by accumulating points as you submit each image, then checking out the Who Has High Score? icon on the front page.', 'Astronaut photography, imagery, ISS, International Space Station, Space Shuttle, earth science, remote sensing, Geography,  center point', 'Education, Geology and earth science', 1, 'National Aeronautics and Space Administration (NASA)', '', 'Amy Kaminski', 'amy.p.kaminski@nasa.gov', 'International', 'elementary_school_children, families, general_public, middle_school_children, seniors, teens', 'annotation, classification_tagging, data_analysis, data_entry, finding_entities, geolocation, identification, learning', 1, 'jsc-earthweb@mail.nasa.gov', '2012-05-01 04:00:00', '', '2023-10-07 03:56:56', '2023-10-07 03:56:56'),
(21, 'Florida Microplastic Awareness Project', 'https://www.citizenscience.gov/catalog/21/', 'http://www.plasticaware.org', 'Citizen scientists are collecting coastal water samples and filtering them to look for the presence of microplastics (using a microscope). They are also helping to educate stakeholders about the sources of and problems caused by microplastics in order to encourage people to read labels to avoid purchasing plastics when non-plastic alternatives are available, and to recycle/reuse as much as possible.', 'microplastic, marine, water,', 'Ecology and environment,  Nature and outdoors, Ocean/water and marine', 1, 'National Oceanic and Atmospheric Administration (NOAA)', '', 'John McLaughlin', 'john.mclaughlin@noaa.gov', 'Local', 'general_public, middle_school_children, seniors, teens', 'data_entry, observation, other, sample_analysis, specimen_sample_collection', 1, 'mpmcg@ufl.edu', '2015-09-01 04:00:00', '', '2023-10-07 03:57:09', '2023-10-07 03:57:09'),
(22, 'Student Watershed Research Project', 'https://www.citizenscience.gov/catalog/22/', 'https://capstone.unst.pdx.edu/partners/student-watershed-research-project-swrp', 'The Student Watershed Research Project involves high school students in the collection of stream monitoring data such as water quality samples, biological data, and physical observations. Monitoring occurs mostly near the Portland, Oregon metro area but is also scattered throughout Oregon and southwest Washington.', 'Biology, Stream monitoring, Water quality', 'Biology, Ecology and environment,  Education, Nature and outdoors, Ocean/water and marine', 1, 'National Science Foundation (NSF), U.S. Geological Survey (USGS)', '', 'Sophia B Liu', 'sophialiu@usgs.gov', 'Regional (Portland, Oregon area)', 'teens', 'learning, measurement, observation, sample_analysis, data_analysis, specimen_sample_collection, site_selection_description, classification_tagging, finding_entities, geolocation, audio_video_recording', 0, 'sarounds@usgs.gov', '1991-01-01 05:00:00', '', '2023-10-07 03:57:35', '2023-10-07 03:57:35'),
(28, 'Shoreline Debris Monitoring', 'https://www.citizenscience.gov/catalog/28/', 'http://olympiccoast.noaa.gov/protect/marinedebris/marinedebris.html', 'Olympic Coast National Marine Sanctuary (OCNMS), funded by a grant from NOAA’s Marine Debris Program, initiated shoreline debris monitoring in 2012 following NOAA’s Marine Debris Shoreline Survey Field Guide methods published in 2012.  OCNMS volunteers originally initiated shoreline debris monitoring in 2001 using data categories standardized by the U.S. Environmental Protection Agency and Ocean Conservancy.  Heightened interest in shoreline debris data associated with concerns about materials originating from the March 2011 Japan tsunami coincided with release of the new NOAA methods, which prompted significant modification of OCNMS’ shoreline debris monitoring program.  Shoreline debris data will be used to document temporal, spatial, and composition patterns in debris deposition on Washington’s coastline, and to the extent possible to identify changes in debris types and volumes associated with the March 2011 tsunami debris.  In 2012, new shoreline debris monitoring methods were initiated at 6 sites on the outer coast of Washington state.  By 2014 there were nine coast sites and seven sites on the Strait of Juan de Fuca.  The goal for FY 2015 is to continue this monitoring effort and expand the effort to teachers and their students within walking distance of coast sites.', 'marine debris, survey, beaches, coast,', 'Biology, Ecology and environment,  Nature and outdoors, Ocean/water and marine', 1, 'National Oceanic and Atmospheric Administration (NOAA)', 'Olympic Coast National Marine Sanctuary', 'John McLaughlin', 'john.mclaughlin@noaa.gov', 'Local', 'families, general_public, seniors, teens', 'classification_tagging, identification, learning, measurement, observation, photography', 1, 'Heidi.Pedersen@noaa.gov', '2012-01-01 05:00:00', '', '2023-10-07 03:57:58', '2023-10-07 03:57:58'),
(38, 'DISCOVER-AQ', 'https://www.citizenscience.gov/catalog/38/', 'http://www.epa.gov/nerl/features/discover-aq.html', 'DISCOVER-AQ is a NASA led Earth Venture Mission which involved many organizations over a 4 year period (2011-2014). The study aimed at improving the use of satellites in air quality characterization. During the last 2 field campaigns in Houston, TX (September 2013) and Denver, CO (July to August 2014), emerging, low-cost sensor technologies were evaluated alongside other equipment to measure air quality. As communities and individuals have become very interested in these new technologies, citizen scientists were recruited to help collect ground-based air quality measurements using sensors.', 'Citizen Science, DISCOVER-AQ, low-cost sensors, CairClip, ozone, nitrogen dioxide', 'Ecology and environment', 0, 'U.S. Environmental Protection Agency (EPA),  National Aeronautics and Space Administration (NASA), National Oceanic and Atmospheric Administration (NOAA)', '', 'Jay Benforado', 'benforado.jay@epa.gov', 'U.S.', 'elementary_school_children, families, general_public, middle_school_children, seniors, teens', 'data_entry, measurement, observation, specimen_sample_collection', 0, 'duvall.rachelle@epa.gov', '2013-09-04 04:00:00', '', '2023-10-07 03:59:04', '2023-10-07 03:59:04'),
(39, 'Nonindigenous Aquatic Species (NAS) Program', 'https://www.citizenscience.gov/catalog/39/', 'http://nas.er.usgs.gov/', 'The Nonindigenous Aquatic Species (NAS) Program provides a central repository for spatially referenced biogeographic accounts of nonindigenous aquatic species in the USA. It includes verified occurrences, distribution maps, and species profiles for freshwater nonindigenous aquatic animal and plant species. Citizens can report a nonnative species through an online reporting form.', 'Aquatic species, Freshwater organisms, Invasive species, Nonnative, Nonindigenous, Plants', 'Animals, Biology, Ecology and environment,  Nature and outdoors, Ocean/water and marine', 1, 'U.S. Geological Survey (USGS), U.S. Fish and Wildlife Service, National Science Foundation (NSF), National Park Service (NPS)', 'NOAA, NASA', 'Sophia B Liu', 'sophialiu@usgs.gov', 'National', 'general_public', 'geolocation, observation, photography, specimen_sample_collection, identification, site_selection_description', 1, 'pfuller@usgs.gov', '1990-01-01 05:00:00', '', '2023-10-07 03:59:59', '2023-10-07 03:59:59');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `B_PROJECT`
--
ALTER TABLE `B_PROJECT`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `B_PROJECT`
--
ALTER TABLE `B_PROJECT`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
