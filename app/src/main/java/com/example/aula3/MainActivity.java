package com.example.aula3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPrecessar(View view){

        Toast mss=Toast.makeText(this,"Boa Noite - Horacio",Toast.LENGTH_SHORT);

        mss.show();

    }
}
