CREATE SCHEMA IF NOT EXISTS spacetravel;

CREATE TABLE client
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    client_name VARCHAR (200) CHECK (length(client_name) >= 3)
);

CREATE TABLE planet
(
    id VARCHAR(10) PRIMARY KEY CHECK (id = UPPER(id) AND id REGEXP '^[A-Z]*$' ),
    planet_name VARCHAR(100) CHECK (length(planet_name >= 1))
);

CREATE TABLE ticket
(
    id int AUTO_INCREMENT PRIMARY KEY,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP(),
    client_id INT,
    from_planet_id VARCHAR(10),
    to_planet_id VARCHAR(10),
    FOREIGN KEY (client_id) REFERENCES client(id),
    FOREIGN KEY (from_planet_id) REFERENCES planet(id),
    FOREIGN KEY (to_planet_id) REFERENCES planet(id)
);