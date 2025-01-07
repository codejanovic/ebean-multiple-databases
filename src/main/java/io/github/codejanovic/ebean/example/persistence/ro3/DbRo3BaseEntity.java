package io.github.codejanovic.ebean.example.persistence.ro3;

import io.ebean.Model;
import io.ebean.annotation.DbName;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@DbName("ro3")
@MappedSuperclass
public class DbRo3BaseEntity extends Model {
    @Id
    private long id;

    public long getId() {
        return id;
    }
}
