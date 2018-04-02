package com.example.ionut_000.exemplucolocviu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText leftEditText = null;
    private EditText rightEditText = null;
    private EditText ultimEditText = null;
    private Button leftButton = null;
    private Button rightButton = null;
    private Button navigateToSecondaryActivity = null;
    private final static int SECONDARY_ACTIVITY_REQUEST_CODE = 1;
    private Button navigateToSecondaryActivityButton = null;


    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {


            switch (view.getId()) {
                case R.id.submit_button_1:
                    int primulNumar = Integer.parseInt(leftEditText.getText().toString());
                    int alDoileaNumar = Integer.parseInt(rightEditText.getText().toString());
                    int rezultat = primulNumar + alDoileaNumar;
                    ultimEditText.setText(String.valueOf(primulNumar + " + " + alDoileaNumar + " = " + rezultat));
                    break;
                case R.id.submit_button_2:
                    int primulNumar_ = Integer.parseInt(leftEditText.getText().toString());
                    int alDoileaNumar_ = Integer.parseInt(rightEditText.getText().toString());
                    int rezultat_ = primulNumar_ * alDoileaNumar_;
                    ultimEditText.setText(String.valueOf(primulNumar_  + " * " + alDoileaNumar_ + " = " + rezultat_));
                    break;
                default:
                    int resultCode = -1;

                    Toast.makeText( MainActivity.this, "The activity returned with result " + resultCode, Toast.LENGTH_LONG).show();

            }
        }}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        leftEditText = (EditText)findViewById(R.id.introduce_yourself_edit_text_1); //iau referinta catre butonul 1
        rightEditText = (EditText)findViewById(R.id.introduce_yourself_edit_text_2);
        ultimEditText = (EditText)findViewById(R.id.introduce_yourself_edit_text_3);


        leftButton = (Button)findViewById(R.id.submit_button_1);
        rightButton = (Button)findViewById(R.id.submit_button_2);

        leftButton.setOnClickListener(buttonClickListener);
        rightButton.setOnClickListener(buttonClickListener);



    }
}
