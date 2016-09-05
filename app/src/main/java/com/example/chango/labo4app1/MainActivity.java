package com.example.chango.labo4app1;

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

    public void mostrarAlerta(View view){
        Toast toast = Toast.makeText(getApplicationContext(),
                "¡Has pulsado el botón!",
                Toast.LENGTH_LONG);
        toast.show();
    }
}
