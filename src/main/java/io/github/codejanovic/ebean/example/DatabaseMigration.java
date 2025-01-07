package io.github.codejanovic.ebean.example;

import io.avaje.config.Config;
import io.ebean.migration.MigrationConfig;
import io.ebean.migration.MigrationRunner;

public class DatabaseMigration {

    public void run() {
        var newsletterDatabaseConfig = Config.forPath("datasource.db");
        var migrationConfig = new MigrationConfig();
        migrationConfig.setDbUsername(newsletterDatabaseConfig.get("username"));
        migrationConfig.setDbPassword(newsletterDatabaseConfig.get("password"));
        migrationConfig.setDbUrl(newsletterDatabaseConfig.get("url"));
        migrationConfig.setDbSchema("public");

        var migrationRunner = new MigrationRunner(migrationConfig);
        migrationRunner.run();
    }
}
