package com.example.appandroidyouarethehero;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AuteursActivity extends AppCompatActivity {
    private Button retourButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auteurs);

        // Initialisation du bouton de retour
        retourButton = findViewById(R.id.retourButton);

        retourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Action lorsque le bouton "Retour au menu principal" est cliqué
                retourAuMenuPrincipal();
            }
        });
    }

    private void retourAuMenuPrincipal() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish(); // Termine l'activité "AuteursActivity"
    }
}
