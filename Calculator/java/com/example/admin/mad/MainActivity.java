package com.example.admin.mad;

import android.app.ProgressDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button ad,sub,mul,div;
    Button ne,clo;
    EditText n1,n2;
    TextView res;
    int a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ad=(Button)findViewById(R.id.Button);
        sub=(Button)findViewById(R.id.Button2);
        mul=(Button)findViewById(R.id.Button3);
        div=(Button)findViewById(R.id.Button4);


        ne =(Button)findViewById(R.id.button5);
        clo=(Button)findViewById(R.id.button6);


        n1=(EditText) findViewById(R.id.edittext);
        n2=(EditText) findViewById(R.id.edittext2);
        res=(TextView)findViewById(R.id.textview3);
        ad.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
             a=Integer.parseInt(n1.getText().toString());
             b=Integer.parseInt(n2.getText().toString());
             c=a+b;
             res.setText(Integer.toString(c));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                a=Integer.parseInt(n1.getText().toString());
                b=Integer.parseInt(n2.getText().toString());
                c=a-b;
                res.setText(Integer.toString(c));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                a=Integer.parseInt(n1.getText().toString());
                b=Integer.parseInt(n2.getText().toString());
                c=a*b;
                res.setText(Integer.toString(c));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                a=Integer.parseInt(n1.getText().toString());
                b=Integer.parseInt(n2.getText().toString());
                c=a/b;
                res.setText(Integer.toString(c));
            }
        });


        ne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                n1.setText("");
                n2.setText("");
                res.setText("Result");
            }
        });

        clo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}