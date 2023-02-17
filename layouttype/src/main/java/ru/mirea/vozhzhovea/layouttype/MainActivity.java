package ru.mirea.vozhzhovea.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.textView);
        TextView myTextView = (TextView) findViewById(R.id.textViewNew);
        myTextView.setText("New text in MIREA");

        Button button = findViewById(R.id.button26);
        button.setText("MIREAButton");

        CheckBox checkBox = findViewById(R.id.checkBox2);
        checkBox.setChecked(true);

    }
}