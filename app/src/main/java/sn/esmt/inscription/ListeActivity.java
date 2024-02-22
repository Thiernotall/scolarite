package sn.esmt.inscription;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListeActivity extends AppCompatActivity {
    private Button  retourbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste);

        retourbt = (Button) findViewById(R.id.retourbt);
        retourbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListeActivity.this,AccueilActivity.class);
                startActivity(intent);
            }
        });


    }
}