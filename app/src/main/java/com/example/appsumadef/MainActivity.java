package com.example.appsumadef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;

import com.example.appsumadef.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        /*
        OTRA MANERA DE GESTIONAR LOS CLICK
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor1 = binding.txtNum1.getText().toString();
                String valor2 = binding.txtNum2.getText().toString();

                int num1 = Integer.parseInt(valor1);
                int num2 = Integer.parseInt(valor2);

                int suma = num1 + num2;

                binding.txtResultado.setText(String.valueOf(suma));
            }
        });*/

        // LA TERCERA OPCION DE GESTIONAR LOS CLICK
        binding.button.setOnClickListener(this);
    }

    /*
    PRIMERA FORMA
    public void Sumar (View view) {
        String valor1 = binding.txtNum1.getText().toString();
        String valor2 = binding.txtNum2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;

        binding.txtResultado.setText(String.valueOf(suma));
    }*/

    //PARTE DE LA TERCERA FORMA
    @Override
    public void onClick(View view) {
        /*String valor1 = binding.txtNum1.getText().toString();
        String valor2 = binding.txtNum2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;

        Intent intent = new Intent(this, SegundoActivity.class);
        intent.putExtra("resultado", suma);
        startActivity(intent);*/

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "Ir al trabajo")
                .putExtra(AlarmClock.EXTRA_HOUR, 11)
                .putExtra(AlarmClock.EXTRA_MINUTES, 30);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}