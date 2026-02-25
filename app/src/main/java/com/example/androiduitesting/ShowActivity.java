package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    private TextView text;
    private Bundle info;
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);

        text = findViewById(R.id.textholder);
        back = findViewById(R.id.back_button);
        info = getIntent().getExtras();

        text.setText(info.getString("show"));

        back.setOnClickListener(v->{
            finish();
        });
    }    

}
