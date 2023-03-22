package com.example.projetofragments;

import androidx.appcompat.app.AppCompatActivity;

import android.app.UiAutomation;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnEnviarDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviarDados = findViewById(R.id.btnEnviarDados);

        btnEnviarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                //Instanciar o objeto
                Usuario usuario = new Usuario("Jackiany", "jackiany14@gmail.com");
                //Passar dados
                intent.putExtra("nome", "Jackiany Silva");
                intent.putExtra("idade", "28");
                intent.putExtra("objeto", usuario);
                startActivity( intent);

            }
        });

        //Primeiro metodo chamdo no ciclo de vida de uma Activity, esse ciclo de vida abrange desde o momento que abri a activity até o momento que encerra ela.
        //Quando for hamdo o metodo onCreate vamos exibir a mensagem
        //Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    /*@Override
    protected void onStart() {
        //Chamando a implemetação

        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {

        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }*/
}