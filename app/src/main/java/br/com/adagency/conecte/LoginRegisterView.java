package br.com.adagency.conecte;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;


public class LoginRegisterView extends AppCompatActivity implements com.wdullaer.materialdatetimepicker.date.DatePickerDialog.OnDateSetListener {

    private Context context;
    private Button buttonRegister;
    private TextView textDate;
    private TextView textSignIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);

        context = this;

        buttonRegister = (Button) findViewById(R.id.login_register_enter);
        textDate = (TextView) findViewById(R.id.login_register_label_date);
        textSignIn = (TextView) findViewById(R.id.login_register_signin);


        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog alertDialog = new AlertDialog.Builder(context).create();
                alertDialog.setTitle("Quase lá...");
                alertDialog.setMessage("Enviamos um e-mail com um link para confirmar a sua participação no Samsung Conecte.");
                alertDialog.setButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        Intent intent = new Intent(context, LoginSignInView.class);
                        startActivity(intent);
                    }
                });
                alertDialog.show();

            }
        });

        textSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, LoginSignInView.class);
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    public void onDateSet(com.wdullaer.materialdatetimepicker.date.DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {

        String date = "You picked the following date: "+dayOfMonth+"/"+(monthOfYear+1)+"/"+year;
        textDate.setText(date);

    }
}