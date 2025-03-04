import io.ebean.annotation.Platform;
import io.ebean.dbmigration.DbMigration;

import java.io.IOException;

public class GenerateDbMigration {

    public static void main(String[] args) throws IOException {

        DbMigration dbMigration = DbMigration.create();
        dbMigration.setPlatform(Platform.POSTGRES);
        //dbMigration.setServer(DB.getDefault());

        dbMigration.generateMigration();
    }
}
