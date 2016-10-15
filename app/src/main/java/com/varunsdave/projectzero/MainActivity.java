package com.varunsdave.projectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view){
        Button b = (Button)findViewById(view.getId());
        String buttonText = b.getText().toString();
        Toast.makeText(getApplicationContext(), "This will launch my " + buttonText, Toast.LENGTH_SHORT).show();
    }
}
