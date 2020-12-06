package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Calculate;
    EditText Height;
    EditText Weight;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculate=findViewById(R.id.Calculate);
        Weight=findViewById(R.id.Weight);
        Height=findViewById(R.id.Height);
        Result=findViewById(R.id.Result);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String getW=Weight.getText().toString();
                String getH=Height.getText().toString();

                float W=Float.parseFloat(getW);
                float H=Float.parseFloat(getH);

                float newH=H/100;
                float bmi=W/(newH*newH);

                if (bmi<18.5){
                    Result.setText("Underweight\n"+String.format("\t\t\t\t\t\t%.2f",bmi));
                }else if (bmi>18.5 && bmi<25){
                    Result.setText("Normal Range\n"+String.format("\t\t\t\t\t\t\t\t%.2f",bmi));
                }else{

                    Result.setText("Obese\n"+String.format("\t%.2f",bmi));
                }

            }
        });



    }
}