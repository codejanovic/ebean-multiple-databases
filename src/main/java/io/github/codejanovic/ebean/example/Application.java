package io.github.codejanovic.ebean.example;

import io.github.codejanovic.ebean.example.persistence.main.query.QDbMainCity;
import io.github.codejanovic.ebean.example.persistence.ro1.query.QDbRo1City;
import io.github.codejanovic.ebean.example.persistence.ro2.query.QDbRo2City;
import io.github.codejanovic.ebean.example.persistence.ro3.query.QDbRo3City;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    private static final Logger _log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        new Application().start();
    }

    public void start() {
        //new DatabaseMigration().run();
        _log.info("{}", new QDbMainCity().findCount());
        _log.info("{}", new QDbRo1City().findCount());
        _log.info("{}", new QDbRo2City().findCount());
        _log.info("{}", new QDbRo3City().findCount());
        _log.info("Application started!");
        while (true) {
        }
    }
}
