package com.javatpoint.areacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CubeArea extends AppCompatActivity {

    EditText t1,t2,t3;
    TextView area,per;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube_area);
    }

    public  void dev(View view)
    {
        Intent i=new Intent(this,Dev.class);
        startActivity(i);
    }

    public void cal(View View){
        t1=(EditText)findViewById(R.id.editText6);
        t2=(EditText)findViewById(R.id.editText7);
        t3=(EditText)findViewById(R.id.editText8);
        area=(TextView)findViewById(R.id.AreaAns);
        per=(TextView)findViewById(R.id.textView8);

        double x=Double.parseDouble(t1.getText().toString());
        double y=Double.parseDouble(t2.getText().toString());
        double z=Double.parseDouble(t3.getText().toString());

        double vol=x*y*z;
        double sarea=2*((x*y)+(y*z)+(x*z));

        area.setText(Double.toString(sarea));
        per.setText(Double.toString(vol));

    }
}
