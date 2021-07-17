package com.example.masabcalculatorr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText e1, e2;
    TextView t1;
    int editText, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean getNumbers() {

        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText2);
        t1 = findViewById(R.id.textView);

        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();

        if ((s1.equals(null) && s2.equals(null)) || (s1.equals("") && s2.equals(""))) {
            String result = "Please enter a value";
            t1.setText(result);

            return false;
        } else {

            editText = Integer.parseInt(e1.getText().toString());

            editText2 = Integer.parseInt(e2.getText().toString());

            return true;

        }



    }

    public void doSum(View view) {

        if(getNumbers()){
            int sum = editText + editText2;
            t1.setText(Integer.toString(sum));
        }
    }


    public void doSub(View view) {

        if(getNumbers()){
            int sum = editText - editText2;
            t1.setText(Integer.toString(sum));
        }
    }


    public void doMul(View view) {
        if(getNumbers()){
            int sum = editText * editText2;
            t1.setText(Integer.toString(sum));
        }
    }


    public void doDiv(View view) {
        if(getNumbers()){
            int sum = editText / editText2;
            t1.setText(Integer.toString(sum));
        }
    }
}