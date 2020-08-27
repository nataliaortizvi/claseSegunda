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
    private TextView counter;
    private Button responder;
    private Button intentar;
    private EditText respuesta;
    private int puntos;
    private int contador = 30;

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
        counter = findViewById(R.id.counter);
        puntos = 0;


        //arreglo preguntas
        preguntas = new ArrayList<Pregunta>();
        for(int i = 0; i < 1; i ++){
            preguntas.add(new Pregunta());
            preguntas.get(i).operar();
            operacion.setText(""+preguntas.get(i).getPregu());

        }

        //contador
        new Thread(
                ()->{
                    while(contador > 0){
                        contador --;

                        runOnUiThread( ()-> {
                            counter.setText(""+contador);
                            if (contador > 0 ){
                                intentar.setVisibility(View.GONE);
                            }else{
                                intentar.setVisibility(View.VISIBLE);
                            }
                            Log.d(">>>>>>>>>>>>>>>>>>", "CONTADOR"+contador);
                        });

                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
        ).start();




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