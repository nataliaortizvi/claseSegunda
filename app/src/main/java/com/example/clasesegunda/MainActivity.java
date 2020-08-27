package com.example.clasesegunda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView operacion;
    private TextView numPuntaje;
    private Button responder;
    private EditText respuesta;

    private ArrayList <Pregunta> preguntas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referenciar
        operacion = findViewById(R.id.operacion);
        numPuntaje = findViewById(R.id.numPuntaje);
        responder = findViewById(R.id.responder);
        respuesta = findViewById(R.id.respuesta);


        //arreglo preguntas
        preguntas = new ArrayList<Pregunta>();
        for(int i = 0; i < 20; i ++){
            preguntas.add(new Pregunta());
            preguntas.get(i).operar();
            operacion.setText(""+preguntas.get(i).getPregu());
        }

        responder.setOnClickListener(
                (view) -> {
                   //accion

                    String answer = respuesta.getText().toString();

                    for(int i = 0; i < preguntas.size(); i ++){
                    if(preguntas.get(i).getRespu().equals(answer)){
                        preguntas.get(i).operar();
                        operacion.setText(""+preguntas.get(i).getPregu());
                        respuesta.setText("");

                        }else{

                    }
                    }
                }
        );

        Log.d("pruebaaaaaaaaaaaaaaaa", "preg"+preguntas);



    }




}