package com.example.cashofficeapp21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    private Button Calculate,Next;
    private EditText etCC,etCheq,etLoyal,etExpen;
    private TextView tvTot3;
    double a,send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        if(getIntent().hasExtra("totcash")) { //to bring cash value along
            a = getIntent().getExtras().getDouble("totcash");
        }

        Calculate=(Button)findViewById(R.id.thirdCalcBtn);
        Next=(Button)findViewById(R.id.thirdNextBtn);

        etCC=(EditText)findViewById(R.id.etCC);
        etCheq=(EditText)findViewById(R.id.etCheq);
        etLoyal=(EditText)findViewById(R.id.etLoyal);
        etExpen=(EditText)findViewById(R.id.etExpen);

        tvTot3=(TextView)findViewById(R.id.tvTot3);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etCC.getText().toString();
                etCheq.getText().toString();
                etExpen.getText().toString();
                etLoyal.getText().toString();

                double i1=Double.valueOf(etCC.getText().toString());
                double i2=Double.valueOf(etCheq.getText().toString());
                double i3=Double.valueOf(etExpen.getText().toString());
                double i4=Double.valueOf(etLoyal.getText().toString());

                double sol;
                sol=i1+i2+i3+i4;
                send=sol;
                tvTot3.setText(String.valueOf(sol));
            }
        });

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent= new Intent(getApplicationContext(),FourthActivity.class);
                startIntent.putExtra("totcash",a);
                startIntent.putExtra("totextras",send);
                startActivity(startIntent);
            }
        });

    }
}