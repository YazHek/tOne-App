package com.lvivdroiddev.toneapp.reg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.lvivdroiddev.toneapp.R;

public class regActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView logoView;
    private EditText log_input, pass_input;
    private Button regButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_reg_activity);



        logoView = findViewById(R.id.logo_image);
        log_input = findViewById(R.id.email_editText);
        pass_input = findViewById(R.id.pass_editText);
        regButton = findViewById(R.id.reg_button);
        regButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.reg_button:
                Intent i = new Intent(regActivity.this, turnOnActivity.class);
                startActivity(i);
                break;
        }

    }
}
