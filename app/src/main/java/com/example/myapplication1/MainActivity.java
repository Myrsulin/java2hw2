package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication1.R;

public class MainActivity extends AppCompatActivity {

    private EditText gmail, pin;
    private Button btn1;
    private TextView textView1, textView2,textView3, textView4;
    String email = "admin@gmail.com";
    String pincod = "admin" ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        onClick();


    }




    private void onClick() {
        btn1.setOnClickListener(view -> {
            if (gmail.getText().toString().equals(email)&&pin.getText().toString().equals(pincod)){
                gmail.setVisibility(View.GONE);
                pin.setVisibility(View.GONE);
                btn1.setVisibility(View.GONE);
                textView1.setVisibility(View.GONE);
                textView2.setVisibility(View.GONE);
                textView3.setVisibility(View.GONE);
                textView4.setVisibility(View.GONE);
                Toast.makeText(this,"вы  успешно зашли ",Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(this, "Неправильные данные!",Toast.LENGTH_SHORT).show();
            }
        });
        gmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if  (gmail.getText().toString().length()>0){
                    btn1.setBackgroundColor(getColor(R.color.gray));
                }else{
                    btn1.setBackgroundColor(getColor(R.color.ser));
                }
            }
        });
    }

    private void initView() {
        gmail = findViewById(R.id.pochta);
        pin = findViewById(R.id.parol);
        btn1 = findViewById(R.id.button);
        textView1 = findViewById(R.id.zabylparol);
        textView2 = findViewById(R.id.najmisuda);
        textView3 = findViewById(R.id.vhod);
        textView4 = findViewById(R.id.vhod_1);
        gmail = findViewById(R.id.pochta);
        gmail = findViewById(R.id.pochta);
        gmail = findViewById(R.id.pochta);
    }
}