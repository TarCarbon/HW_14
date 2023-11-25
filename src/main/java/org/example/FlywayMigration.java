package org.example;

import org.apache.log4j.Logger;
import org.flywaydb.core.Flyway;

public class FlywayMigration {

    final private static Logger logger = Logger.getLogger(FlywayMigration.class);
    final private static String URL = "jdbc:h2:~/db/spacetravel.trace.db";
    final private static String USER = "user";
    final private static String PASSWORD = "password";
    public static void migration(){
        try {
            Flyway.configure().dataSource(URL, USER, PASSWORD)
                    .load()
                    .migrate();
            logger.info("migration is successful");
        } catch (Exception e) {
            logger.error("Migration fatal: " + e);
        }
    }
}
