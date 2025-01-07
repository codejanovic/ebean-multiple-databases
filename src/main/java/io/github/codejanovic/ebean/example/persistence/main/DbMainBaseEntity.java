package io.github.codejanovic.ebean.example.persistence.main;

import io.ebean.Model;
import io.ebean.annotation.DbName;
import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;

import java.time.Instant;

@DbName("db")
@MappedSuperclass
public class DbMainBaseEntity extends Model {
    @Version
    protected long version;

    @WhenCreated
    protected Instant createdAt;

    @WhenModified
    protected Instant updatedAt;

    public long getVersion() {
        return version;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }
}
