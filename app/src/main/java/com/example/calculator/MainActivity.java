package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bSub,bDiv,bMul,bClear,bE;
    Boolean plus= false, minus=false, mul=false,div=false;
    EditText et;
    int num1=0,num2=0,calculated_result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = (Button) findViewById(R.id.btn0);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);
        b9 = (Button) findViewById(R.id.btn9);
        bAdd = (Button) findViewById(R.id.btnAdd);
        bDiv = (Button) findViewById(R.id.btnDiv);
        bSub = (Button) findViewById(R.id.btnDiv);
        bMul = (Button) findViewById(R.id.btnMul);
        bE = (Button) findViewById(R.id.btnEqual);
        bClear = (Button) findViewById(R.id.btnC);
        et = (EditText)findViewById(R.id.inputField);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"0");
            }
        });
        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //num1 = Float.parseFloat(et.getText().toString());

                et.setText("");
            }
        });
        bE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Integer.parseInt(et.getText().toString());
                if(plus){
                    calculated_result = num1+num2;
                }
                else if(minus){
                    calculated_result = num1-num2;
                }
                else if(mul){
                    calculated_result = num1*num2;
                }
                else if(div){
                    if(num2==0)
                    {
                        et.setText("Zero division error!");
                        return;
                    }
                    calculated_result = num1*num2;
                }

                et.setText(Integer.toString(calculated_result));
            }
        });
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(et.getText().toString());
                plus = true;
                minus = false;
                mul = false;
                div = false;
                et.setText("");
            }
        });
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // num1 = Float.parseFloat(et.getText().toString());
                plus = false;
                minus = false;
                mul = false;
                div = true;
                et.setText("");
            }
        });


        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(et.getText().toString());
                plus = false;
                minus = true;
                mul = false;
                div = false;
                et.setText("");
            }

        });


        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(et.getText().toString());
                plus = false;
                minus = false;
                mul = true;
                div = false;
                et.setText("");
            }
        });

    }
}