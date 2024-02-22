package sn.esmt.inscription;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AccueilActivity extends AppCompatActivity {
    private Button inscriptionbt;
    private Button visualisationbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        inscriptionbt = (Button) findViewById(R.id.inscriptionbt);
        visualisationbt =(Button) findViewById(R.id.visualisationbt);

        inscriptionbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccueilActivity.this,InformationActivity.class);
                startActivity(intent);
            }
        });

        visualisationbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccueilActivity.this,ListeActivity.class);
                startActivity(intent);
            }
        });
    }
}