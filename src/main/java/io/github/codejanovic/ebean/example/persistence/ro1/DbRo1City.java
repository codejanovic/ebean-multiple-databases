package io.github.codejanovic.ebean.example.persistence.ro1;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ro1_city")
public class DbRo1City extends DbRo1BaseEntity {
    private String name;
    private String countryCode;
    private String district;
    private long population;
    private String localName;

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public long getPopulation() {
        return population;
    }

    public String getLocalName() {
        return localName;
    }
}
