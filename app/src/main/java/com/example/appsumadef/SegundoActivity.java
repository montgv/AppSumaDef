package com.example.appsumadef;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.appsumadef.databinding.ActivityMainBinding;
import com.example.appsumadef.databinding.ActivitySegundoBinding;

public class SegundoActivity extends AppCompatActivity {

    private ActivitySegundoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySegundoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle datos = getIntent().getExtras();
        int result = datos.getInt("resultado");

        binding.textView.setText("" + result);
    }
}