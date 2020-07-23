package com.example.cashofficeapp21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FifthActivity extends AppCompatActivity {
    double a,b,c;
    TextView tvUitot,tvComptot,tvDiff;
    Button finalCalcBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        if(getIntent().hasExtra("totextras")) { //to bring cash value along
            b = getIntent().getExtras().getDouble("totextras");
        }

        if(getIntent().hasExtra("totcash")) { //to bring cash value along
            a = getIntent().getExtras().getDouble("totcash");
        }

        if(getIntent().hasExtra("SammyReads")) { //to bring cash value along
            c = getIntent().getExtras().getDouble("SammyReads");
        }

        tvUitot=(TextView)findViewById(R.id.tvUitot);
        tvComptot=(TextView)findViewById(R.id.tvComptot);
        tvDiff=(TextView)findViewById(R.id.tvDiff);

        finalCalcBtn=(Button)findViewById(R.id.finalCalcBtn);

        finalCalcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double userTot=a+b;
                double diff=userTot-c;
                tvUitot.setText(String.valueOf(userTot));
                tvComptot.setText(String.valueOf(c));
                tvDiff.setText(String.valueOf(diff));
            }
        });
    }
}