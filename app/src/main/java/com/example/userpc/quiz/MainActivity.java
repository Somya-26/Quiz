package com.example.userpc.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void countScore(View view)
    {
        RadioButton radioButton=(RadioButton)findViewById(R.id.field_option);
        if(radioButton.isChecked())
            score++;
        RadioButton radioButton1=(RadioButton)findViewById(R.id.movie_option);
        if(radioButton1.isChecked())
            score++;
        CheckBox checkBox=(CheckBox)findViewById(R.id.jpeg_option);
        CheckBox checkBox1=(CheckBox)findViewById(R.id.jpg_option);
        CheckBox checkBox2=(CheckBox)findViewById(R.id.png_option);
        if(checkBox.isChecked()&&checkBox1.isChecked()&&checkBox2.isChecked())
            score++;
        EditText editText=(EditText)findViewById(R.id.bit_text);
        String s=editText.getText().toString();
        if(s.equals("8")||s.equals("Eight"))
            score++;
        EditText editText1=(EditText)findViewById(R.id.row_text);
        s=editText1.getText().toString();
        if(s.equals("Tuples")||s.equals("Tuple"))
            score++;
        EditText editText2=(EditText)findViewById(R.id.os_text);
        s=editText2.getText().toString();
        if(s.equals("Operating System")||s.equals("Operatingsystem"))
            score++;
        Toast toast=Toast.makeText(this,"Your score is " + score,Toast.LENGTH_LONG);
        toast.show();
        score=0;

    }
}
