package com.example.appandroidyouarethehero;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button demarrerButton;
    private Button auteursButton;
    private Button quitterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialisation des boutons
        demarrerButton = findViewById(R.id.demarrerButton);
        auteursButton = findViewById(R.id.auteursButton);
        quitterButton = findViewById(R.id.quitterButton);

        // Ajout des listeners aux boutons
        demarrerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Action lorsque le bouton "Démarrer" est cliqué
                // Ajoute ici le code pour démarrer l'activité correspondante
            }
        });

        auteursButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Action lorsque le bouton "Auteurs" est cliqué
                // Ajoute ici le code pour démarrer l'activité correspondante
            }
        });

        quitterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Action lorsque le bouton "Quitter" est cliqué
                finish(); // Termine l'activité et quitte l'application
            }
        });
    }
}
