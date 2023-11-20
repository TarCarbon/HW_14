INSERT INTO client ( client_name ) VALUES
                                       ( "З'брилок" ),
                                       ( "Крілумпі" ),
                                       ( "Глорбалакс" ),
                                       ( "Йотакс" ),
                                       ( "Фрегліндрік" ),
                                       ( "Зентарі" ),
                                       ( "Ксілопетія" ),
                                       ( "Іксільон" ),
                                       ( "Умбрілекс" ),
                                       ( "Вріллекс" );

INSERT INTO planet (id, planet_name ) VALUES
                                          ( "SIR", "Сіріус") ,
                                          ( "ALFC", "Альфа Центавра"),
                                          ( "ANDR", "Андромеда"),
                                          ( "ORI", "Оріон"),
                                          ( "VMH", "Велика Магелланова Хмара" );

INSERT INTO ticket ( client_id, from_planet_id, to_planet_id  ) VALUES
                                                                    ( 1, "SIR", "ORI"),
                                                                    ( 3, "ANDR", "VMH"),
                                                                    ( 2, "ALFC", "SIR"),
                                                                    ( 5, "ORI", "VMH"),
                                                                    ( 3, "VHM", "ALFC");