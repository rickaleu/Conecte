package br.com.adagency.conecte;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginSignInView extends AppCompatActivity {

    private Context context;
    private Button buttonEnter;
    private TextView textRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sign_in);

        context = this;

        buttonEnter = (Button) findViewById(R.id.login_signin_enter);
        textRegister = (TextView) findViewById(R.id.login_signin_register);

        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, Home.class);
                startActivity(intent);
                finish();

            }
        });

        textRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, LoginRegisterView.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
