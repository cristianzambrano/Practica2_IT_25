package com.example.practica2_it_2024;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void clickBotonIngresar(View view){

        TextInputLayout tilUsario = findViewById(R.id.tilUsuario);
        TextInputEditText txtCedula = findViewById(R.id.txtCedula);
        String cedula = txtCedula.getText().toString();
        if (cedula.equals("") || cedula.length()!=10){
            tilUsario.setError("Ingrese una cédula válida");
        }else
            tilUsario.setError("");
    }
    public void clickBotonCancelar(View view){

    }
}