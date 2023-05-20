package com.example.appandroidyouarethehero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = (Button)findViewById(R.id.buttonToast);

        myButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        // TODO Auto-generated method stub
            Toast.makeText(MainActivity.this, "mon message", Toast.LENGTH_SHORT).show();
            Log.d("StoryApp", "ClickMe");
        }});

    }
}