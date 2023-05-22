
CREATE TABLE IF NOT EXISTS `resultado_conversao`(
`id` bigint NOT NULL AUTO_INCREMENT,
`moeade_base` varchar(255),
`resultado`  double,
`acesso` datetime(6),
`moda_conversao` varchar(255),
PRIMARY KEY(`id`)

) ENGINE=InnoDB DEFAULT CHARSET=UTF8;