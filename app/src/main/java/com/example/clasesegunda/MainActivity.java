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
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private TextView operacion;
    private TextView numPuntaje;
    private Button responder;
    private Button intentar;
    private EditText respuesta;
    private int puntos;

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
        intentar = findViewById(R.id.intentar);
        puntos = 0;


        //arreglo preguntas
        preguntas = new ArrayList<Pregunta>();
        for(int i = 0; i < 1; i ++){
            preguntas.add(new Pregunta());
            preguntas.get(i).operar();
            operacion.setText(""+preguntas.get(i).getPregu());

        }


        responder.setOnClickListener(
                (view) -> {
                    //accion

                    for(int i = 0; i < preguntas.size(); i ++){
                        String answer = respuesta.getText().toString();

                        //si responde bien
                        if(preguntas.get(i).getRespu().equals(answer)){
                            preguntas.get(i).operar();
                            operacion.setText(""+preguntas.get(i).getPregu());
                            respuesta.setText("");

                            Log.d(">>>>>>>>>>>>>>>>>>", "BIENNNNNNNNN");

                            puntos += 15;
                            numPuntaje.setText(""+puntos);

                            //si responde mal
                        }else{
                            Log.d(">>>>>>>>>>>>>>>>>>", "MAAAAAALLLLL");
                            Log.d("PREGUNTAAAAAA", ""+preguntas.get(i).getPregu()+ "RESPUESTAAAAA"+preguntas.get(i).getRespu());
                        }
                    }
                }
        );





    }
}