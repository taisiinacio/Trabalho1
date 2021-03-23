package com.example.trabalho1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void onLoginClick(View view) {
        TextView textNome = findViewById(R.id.editNome);
        TextView textSenha = findViewById(R.id.editSenha);
        String nome = textNome.getText().toString();
        String senha = textSenha.getText().toString();

        if(nome.equals(senha)) {
            Intent intent = new Intent(this, PrincipalActivity.class);
            startActivity(intent);
        } else{
            Toast.makeText(getApplicationContext(), "Login inválido", Toast.LENGTH_SHORT).show();
        }
    }
}