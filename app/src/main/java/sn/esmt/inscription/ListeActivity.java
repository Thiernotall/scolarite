package sn.esmt.inscription;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class ListeActivity extends AppCompatActivity {
    private Button  retourbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste);

        retourbt = (Button) findViewById(R.id.retourbt);


    }
}