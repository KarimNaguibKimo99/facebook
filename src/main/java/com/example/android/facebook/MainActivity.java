package com.example.android.facebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.facebook4); //This is the TextView that we want to add underline style to it
        SpannableString content = new SpannableString("Sign up for facebook"); //We create this object and assign text value to it
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0); // now we give the object a new style which is underline
        textView.setText(content);//put the object inside the textview...Done!
    }
}
