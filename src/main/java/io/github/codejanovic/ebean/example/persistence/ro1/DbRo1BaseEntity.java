package io.github.codejanovic.ebean.example.persistence.ro1;

import io.ebean.Model;
import io.ebean.annotation.DbName;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@DbName("ro1")
@MappedSuperclass
public class DbRo1BaseEntity extends Model {
    @Id
    private long id;

    public long getId() {
        return id;
    }
}
