package io.github.codejanovic.ebean.example.persistence.main;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "main_city")
public class DbMainCity extends DbMainBaseEntity {
    private String cityName;
    private String cityCountryCode;
    private String cityDistrict;
    private long cityPopulation;
    private String cityLocalName;

    public String getCityName() {
        return cityName;
    }

    public String getCityCountryCode() {
        return cityCountryCode;
    }

    public String getCityDistrict() {
        return cityDistrict;
    }

    public long getCityPopulation() {
        return cityPopulation;
    }

    public String getCityLocalName() {
        return cityLocalName;
    }
}
