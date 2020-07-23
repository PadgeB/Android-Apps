package com.example.cashofficeapp21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private Button Calculate,Next;
    private EditText et100,et50,et20,et10,et5,etLifts;
    private TextView cashTV;
    private double send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Calculate=(Button)findViewById(R.id.calcCashBtn);
        Next=(Button)findViewById(R.id.notesNextBtn);

        et100=(EditText)findViewById(R.id.et100);
        et50=(EditText)findViewById(R.id.et50);
        et20=(EditText)findViewById(R.id.et20);
        et10=(EditText)findViewById(R.id.et10);
        et5=(EditText)findViewById(R.id.et5);
        etLifts=(EditText)findViewById(R.id.etLifts);

        cashTV=(TextView)findViewById(R.id.cashTV);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et100.getText().toString();
                et50.getText().toString();
                et20.getText().toString();
                et10.getText().toString();
                et5.getText().toString();
                etLifts.getText().toString();

                double i1=Double.valueOf(et100.getText().toString());
                double i2=Double.valueOf(et50.getText().toString());
                double i3=Double.valueOf(et20.getText().toString());
                double i4=Double.valueOf(et10.getText().toString());
                double i5=Double.valueOf(et5.getText().toString());
                double i6=Double.valueOf(etLifts.getText().toString());

                double ans;
                ans=i1+i2+i3+i4+i5+i6;
                send=ans;
                cashTV.setText(String.valueOf(ans));
            }
        });

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent= new Intent(getApplicationContext(),ThirdActivity.class);
                startIntent.putExtra("totcash",send);
                startActivity(startIntent);
            }
        });

    }
}