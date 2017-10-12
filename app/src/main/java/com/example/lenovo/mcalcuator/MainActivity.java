package com.example.lenovo.mcalcuator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView tvresult;
    Button button1;
    Button button2;
    Button button3;
    Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);

        tvresult=(TextView)findViewById(R.id.tvresult);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Intent i=new Intent(Main2Activity.this, Main2Activity.class);
                //startActivity(i);
                float n1=0,n2=0,rs=0;
                if(TextUtils.isEmpty(num1.getText().toString()) || TextUtils.isEmpty(num2.getText().toString()))
                    return;
                n1=Float.parseFloat(num1.getText().toString());
                n2=Float.parseFloat(num2.getText().toString());
                switch(v.getId())
                {
                    case R.id.button1: rs=n1+n2; break;
                    case R.id.button2: rs=n1-n2; break;
                    case R.id.button3: rs=n1*n2; break;
                    case R.id.button4: rs=n1/n2; break;
                    default: break;
                }


                tvresult.setText("Answer: " + rs);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent i=new Intent(Main2Activity.this, Main2Activity.class);
                //startActivity(i);
               float n1=0,n2=0,rs=0;
                if(TextUtils.isEmpty(num1.getText().toString()) || TextUtils.isEmpty(num2.getText().toString()))
                   return;
               n1=Float.parseFloat(num1.getText().toString());
               n2=Float.parseFloat(num2.getText().toString());
               switch(v.getId())
               {
                case R.id.button1: rs=n1+n2; break;
                case R.id.button2: rs=n1-n2; break;
                case R.id.button3: rs=n1*n2; break;
                case R.id.button4: rs=n1/n2; break;
                   default: break;
               }


               tvresult.setText("Answer: " + rs);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent i=new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
                //float n1=0,n2=0,rs=0;
                //if(TextUtils.isEmpty(num1.getText().toString()) || TextUtils.isEmpty(num2.getText().toString()))
                  //  return;
                //n1=Float.parseFloat(num1.getText().toString());
                //n2=Float.parseFloat(num2.getText().toString());
                //switch(v.getId())
                //{
                  //  case R.id.button1: rs=n1+n2; break;
                    //case R.id.button2: rs=n1-n2; break;
                    //case R.id.button3: rs=n1*n2; break;
                    //case R.id.button4: rs=n1/n2; break;
                    //default: break;
               // }


                //tvresult.setText("Answer: " + rs);

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Intent i=new Intent(Main2Activity.this, Main2Activity.class);
                //startActivity(i);
                float n1=0,n2=0,rs=0;
                if(TextUtils.isEmpty(num1.getText().toString()) || TextUtils.isEmpty(num2.getText().toString()))
                    return;
                n1=Float.parseFloat(num1.getText().toString());
                n2=Float.parseFloat(num2.getText().toString());
                switch(v.getId())
                {
                    case R.id.button1: rs=n1+n2; break;
                    case R.id.button2: rs=n1-n2; break;
                    case R.id.button3: rs=n1*n2; break;
                    case R.id.button4: rs=n1/n2; break;
                    default: break;
                }


                tvresult.setText("Answer: " + rs);

            }
        });

    }



}
