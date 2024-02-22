package sn.esmt.inscription;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ConnexionActivity extends AppCompatActivity {
    private EditText emailtxt;
    private EditText mdptxt;
    private Button loginbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        emailtxt = (EditText) findViewById(R.id.emailtxt);
        mdptxt = (EditText) findViewById(R.id.mdptxt);
        loginbt = (Button) findViewById(R.id.loginbt);

        loginbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailtxt.getText().toString();
                String mdp = mdptxt.getText().toString();
                if(email.equals("admin") && mdp.equals("admin")){
                    Intent intent = new Intent(ConnexionActivity.this,AccueilActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(ConnexionActivity.this,"Email ou mot de passe incorrecte",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}