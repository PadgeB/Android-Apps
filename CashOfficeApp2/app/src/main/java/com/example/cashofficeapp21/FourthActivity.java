package com.example.cashofficeapp21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FourthActivity extends AppCompatActivity {
    double a,b,send;
    EditText etSammy;
    Button Save,Finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        if(getIntent().hasExtra("totextras")) { //to bring cash value along
            b = getIntent().getExtras().getDouble("totextras");
        }

        if(getIntent().hasExtra("totcash")) { //to bring cash value along
            a = getIntent().getExtras().getDouble("totcash");
        }

        Save=(Button)findViewById(R.id.SaveBtn);
        Finish=(Button)findViewById(R.id.finishBtn);

        etSammy=(EditText)findViewById(R.id.etSammy);

        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etSammy.getText().toString();
                send=Double.valueOf(etSammy.getText().toString());
            }
        });

        Finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent= new Intent(getApplicationContext(),FifthActivity.class);
                startIntent.putExtra("totcash",a);
                startIntent.putExtra("totextras",b);
                startIntent.putExtra("SammyReads",send);
                startActivity(startIntent);
            }
        });
    }
}