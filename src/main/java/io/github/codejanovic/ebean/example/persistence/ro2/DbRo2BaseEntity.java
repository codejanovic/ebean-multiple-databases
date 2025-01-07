package io.github.codejanovic.ebean.example.persistence.ro2;

import io.ebean.Model;
import io.ebean.annotation.DbName;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@DbName("ro2")
@MappedSuperclass
public class DbRo2BaseEntity extends Model {
    @Id
    private long id;

    public long getId() {
        return id;
    }
}
