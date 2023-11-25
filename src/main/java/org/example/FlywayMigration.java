package org.example;

import org.flywaydb.core.Flyway;

public class FlywayMigration {
    final private static String URL = "jdbc:h2:~/db/spacetravel";
    final private static String USER = "user";
    final private static String PASSWORD = "password";
    public static void migration(){
        Flyway.configure()
                .dataSource(URL, USER, PASSWORD)
                .load()
                .migrate();
    }
}
