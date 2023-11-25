INSERT INTO client (client_name) VALUES
                              ('Client 1'),
                              ('Client 2'),
                              ('Client 3'),
                              ('Client 4'),
                              ('Client 5'),
                              ('Client 6'),
                              ('Client 7'),
                              ('Client 8'),
                              ('Client 9'),
                              ('Client 10');

INSERT INTO planet (id, planet_name) VALUES
                                  ('MARS', 'Mars'),
                                  ('VEN', 'Venus'),
                                  ('EARTH', 'Earth'),
                                  ('JUP', 'Jupiter'),
                                  ('SAT', 'Saturn');

INSERT INTO ticket (client_id, from_planet_id, to_planet_id) VALUES
                                                                 (1, 'MARS', 'EARTH'),
                                                                 (2, 'VEN', 'MARS'),
                                                                 (3, 'EARTH', 'JUP'),
                                                                 (4, 'SAT', 'MARS'),
                                                                 (5, 'EARTH', 'SAT'),
                                                                 (6, 'MARS', 'EARTH'),
                                                                 (7, 'VEN', 'JUP'),
                                                                 (8, 'MARS', 'SAT'),
                                                                 (9, 'JUP', 'EARTH'),
                                                                 (10, 'MARS', 'VEN');