INSERT INTO pirate(pirate_name, strength, drunk_level, can_fight, weapon)
VALUES('Tibi', 100, 10, true, 'dagger'),
('Gyuri', 100, 100, true, 'musket'),
('Laci', 100, 200, true, 'sword'),
('Józsi', 100, 100, true, 'dagger'); /*or number: 1,2,3, or 4*/

INSERT INTO captain(captain_name, captain_weapon, ship, rum_owned)
VALUES('Zoltán', 'sword', 'Lujzi', 1000)
('Tibor', 'sword', 'Mari', 2000),
('Joseph', 'sword', 'Réka', 1000)

INSERT INTO ship(ship_name, attack_power, state, ship_weapon, cannon damage)
VALUES('Lujzi', 100, 100, 'cannon', 25),
('Mari', 100, 100, 'cannon', 25),
('Réka', 100, 100, 'undefined', 25)