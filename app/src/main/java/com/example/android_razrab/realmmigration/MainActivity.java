package com.example.android_razrab.realmmigration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.UUID;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Realm realm = Realm.getDefaultInstance();

        realm .beginTransaction();

        NewTable newTable = realm.createObject( NewTable.class , UUID.randomUUID().toString());

        newTable .setAlias( "Babka" );
        realm .commitTransaction();

    }
}
