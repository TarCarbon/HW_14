package org.example;

import org.flywaydb.core.Flyway;

public class FlywayMigration {

    public static void migration(){
        Flyway.configure()
                .dataSource(Config.getURL(), Config.getUSER(), Config.getPASSWORD())
                .load()
                .migrate();
    }
}
