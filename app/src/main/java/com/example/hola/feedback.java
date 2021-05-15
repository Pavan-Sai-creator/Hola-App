package com.example.hola;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class feedback extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }
    public void sendMail(View view) {

        editText = findViewById(R.id.editTextTextMultiLine);
        String feedback = editText.getText().toString();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String[] array = {"pava.hanuma@gmail.com","naveenatla9866@gmail.com"};
        intent.putExtra(intent.EXTRA_TEXT,feedback);
        intent.putExtra(intent.EXTRA_EMAIL,array);
        intent.putExtra(intent.EXTRA_SUBJECT,"Feedback");
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }


    }


}