package com.example.osman.fireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {
private Button mybutton;
private EditText text;
private EditText text1;
private Firebase mRootRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        mRootRef=new Firebase("https://fireapp-883fe.firebaseio.com/Users");
        mybutton=(Button) findViewById(R.id.AddString);
        text=(EditText) findViewById(R.id.AddText);
        text1=(EditText) findViewById(R.id.AddText1);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=text.getText().toString();
                String key=text1.getText().toString();
                Firebase mRefChild=mRootRef.child(key);
                mRefChild.push().setValue(value);
            }
        });
    }
}
