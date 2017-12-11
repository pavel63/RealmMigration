package com.example.android_razrab.realmmigration;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by android_razrab on 11/12/2017.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);

       // final RealmConfiguration configuration = new RealmConfiguration.Builder().name("sample.realm").schemaVersion(1).build();


        /*final RealmConfiguration configuration = new RealmConfiguration.Builder()
                .name("sample.realm").schemaVersion(2).migration(new RealmMigrations()).build(); */

        final RealmConfiguration configuration = new RealmConfiguration.Builder()
                .name("sample.realm").schemaVersion(3).migration(new RealmMigrations()).build();

        Realm.setDefaultConfiguration(configuration);
        Realm.getInstance(configuration);




    }

    @Override
    public void onTerminate() {
        Realm.getDefaultInstance().close();
        super.onTerminate();

    }
}
