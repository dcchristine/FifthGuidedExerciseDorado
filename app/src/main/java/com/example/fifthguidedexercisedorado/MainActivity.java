package com.example.fifthguidedexercisedorado;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioButton red,cyan,violet,pink;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red=findViewById(R.id.redRdo);
        cyan=findViewById(R.id.cyanRdo);
        violet=findViewById(R.id.violetRdo);
        pink=findViewById(R.id.pinkRdo);

        red.setOnClickListener(this::changeBGColor);
        cyan.setOnClickListener(this::changeBGColor);
        violet.setOnClickListener(this::changeBGColor);
        pink.setOnClickListener(this::changeBGColor);


    }

    public void displayColor(){
        if(red.isChecked()){
            Toast.makeText(getApplicationContext(),"The color you selected : RED", Toast.LENGTH_SHORT).show();
        }

        if(cyan.isChecked()){
            Toast.makeText(getApplicationContext(),"The color you selected : CYAN", Toast.LENGTH_SHORT).show();
        }

        if(violet.isChecked()){
            Toast.makeText(getApplicationContext(),"The color you selected : VIOLET", Toast.LENGTH_SHORT).show();
        }

        if(pink.isChecked()){
            Toast.makeText(getApplicationContext(),"The color you selected : PINK", Toast.LENGTH_SHORT).show();
        }
    }

    public void changeColor (int color){
        getWindow().getDecorView().setBackgroundColor(color);
    }

    public void changeBGColor(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getResources().getResourceEntryName(view.getId())){
            case "redRdo":
                if(checked){
                    // this will set the back ground of the layout into RED
                    changeColor(Color.RED);
                    displayColor();
                }
            break;
            case "cyanRdo":
                if(checked){
                    changeColor(Color.CYAN);
                    displayColor();
                }
                break;

            case "pinkRdo":
                if(checked){
                  changeColor(Color.parseColor("#FFC0CB"));
                    displayColor();
                }
                break;
            case"violetRdo":
                if(checked){
                    changeColor(Color.parseColor("#7F00FF"));
                    displayColor();
                }
                break;
        }

    }
}