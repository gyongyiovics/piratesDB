DROP DATABASE IF EXISTS piratesDB;
CREATE DATABASE piratesDB;

USE piratesDB;

CREATE TABLE pirate(
	id INT UNSIGNED AUTO_INCREMENT,
    pirate_name VARCHAR(100) UNIQUE,
    strength INT,
    drunk_level INT,
    can_fight BOOL,
    weapon ENUM('musket', 'sword', 'dagger'),
	PRIMARY KEY(id)
);
CREATE TABLE captain(
	id INT UNSIGNED AUTO_INCREMENT,
    captain_name VARCHAR(100),
    captains_weapon VARCHAR(100),
    ship VARCHAR(100),
    rum_owned INT,
    PRIMARY KEY(id),
    FOREIGN KEY (ship_id) REFERENCES ship(id)
);
CREATE TABLE ship(
	id INT UNSIGNED AUTO_INCREMENT,
    ship_name VARCHAR(250),
    attack_power INT,
    state INT,
    ship_weapon VARCHAR(100),
    cannon_damage INT,
    /*,
    pirate_names VARCHAR(100)
    */
	PRIMARY KEY(id),
    FOREIGN KEY (captain_id) REFERENCES captain(id)
);
