package com.eduardo.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        EditText textValor1, textValor2;
        RadioGroup RdGrup;
        TextView lblResultado;


        private double txtValor1, txtValor2, dResultado;
        int Op;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textValor1 = findViewById(R.id.txtValor1);
        textValor2 = findViewById(R.id.txtValor2);
        RdGrup = findViewById(R.id.RdGrup);
        lblResultado = findViewById(R.id.lblResultado);


        RdGrup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.optSoma)
                    Op=1;
                else {
                    if(i == R.id.optSubtrai)
                      Op=2;
                    else {
                        if (i == R.id.optMultiplica)
                            Op=3;
                        else {
                            Op=4;
                        }

                    }
                }
            }
        });

    }

    public void calcular(View v){

        txtValor1 = Double.parseDouble(textValor1.getText().toString());
        txtValor2 = Double.parseDouble(textValor2.getText().toString());

        if (Op == 1){
            dResultado = txtValor1 + txtValor2;
        }else {
            if (Op == 2){
                dResultado = txtValor1 - txtValor2;
            }else {
                if (Op == 3){
                    dResultado = txtValor1 * txtValor2;
                }else {
                    dResultado = txtValor1 / txtValor2;
                }

            }
        }
        lblResultado.setText("=" + dResultado);

    }
    public void limpar(View v){

        textValor1.setText("");
        textValor2.setText("");
        lblResultado.setText("");
    }
}