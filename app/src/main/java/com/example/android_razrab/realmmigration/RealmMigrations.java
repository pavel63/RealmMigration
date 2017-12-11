package com.example.android_razrab.realmmigration;

import io.realm.DynamicRealm;
import io.realm.RealmMigration;
import io.realm.RealmObjectSchema;
import io.realm.RealmSchema;

/**
 * Created by android_razrab on 11/12/2017.
 */
public class RealmMigrations implements RealmMigration {

        @Override
        public void migrate(DynamicRealm realm, long oldVersion, long newVersion) {
            final RealmSchema schema = realm.getSchema();

            if (oldVersion==2){

                schema.create( "NewTable" ).  addField( "node" ,String.class) .addPrimaryKey("node"). addField( "alias", String.class );

            }
        }
    }

