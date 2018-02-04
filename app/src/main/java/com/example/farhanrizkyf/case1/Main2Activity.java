package com.example.farhanrizkyf.case1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    public static final String EXTRA_Restoran =
            "com.example.android.studycase.extra.Restoran";
    public static final String EXTRA_Menu =
            "com.example.android.studycase.extra.Menu";
    public static final String EXTRA_Banyak =
            "com.example.android.studycase.extra.Porsi";
    public static final String EXTRA_Harga =
            "com.example.android.studycase.extra.Harga";

    EditText inputNamaMenu, inputPorsi ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
