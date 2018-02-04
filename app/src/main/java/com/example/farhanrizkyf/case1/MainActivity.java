package com.example.farhanrizkyf.case1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String idRestoran = "package com.example.farhanrizkyf.case1.extra.ID_RESTORAN";
    public final static String UANG = "package com.example.farhanrizkyf.case1.extra.UANG";

    public final static String menuNama = "package com.example.farhanrizkyf.case1.extra.MENU_NAMA";
    public final static String menuPorsi = "package com.example.farhanrizkyf.case1.extra.MENU_PORSI";

    EditText Input_Menu;
    EditText Input_Banyak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Input_Menu = (EditText)findViewById(R.id.Input_Menu);
        Input_Banyak = (EditText)findViewById(R.id.Input_Banyak);


    }

    void menuEatbus (View V){
        String nama_menu = Input_Menu.getText().toString();
        String banyak_porsi = Input_Banyak.getText().toString();

        Intent intent = new Intent(this,Main2Activity.class);
    }
}
