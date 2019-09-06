package com.example.task08drawer.app.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.UserDictionary;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.task08drawer.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login extends AppCompatActivity {

    EditText email,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        email = (EditText) findViewById(R.id.loginemail);
        password = (EditText) findViewById(R.id.loginpassword);
        login = (Button) findViewById(R.id.btnlogin);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valemail="[a-zA-z0-9\\+\\.\\_\\%\\+]{1,256}"+
                        "\\@"+"[a-zA-z0-9][a-zA-z0-9\\-]{0,64}"
                        +"("+"\\."+"[a-zA-z0-9][a-zA-z0-9]{0,25}"+")";
                String validpass=
                        "^" +
                                "(?=.*[0-9])" + // at least 1 digit
                        //"(?=.*[a-z])" +             // at least 1 lowercase
                         "(?=.*[a-zA-Z])"+              // any letter
                        //"(?=.*[A-Z])" +             // ast least 1 upercase
                        "(?=.*[@#$%^&+=])" +             // at least 1 special character
                        "(?=\\S+$)" +              // no white space
                        ".{8,}" +                  // at least 8 characters
                        "$";
                String inputemail=email.getText().toString();
                String inputpass=email.getText().toString();

                Matcher matcher=Pattern.compile(valemail).matcher(inputemail);


                if(matcher.matches())
                {
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    email.setError("Enter Valid Email");
                   // Toast.makeText(getApplicationContext(), "Enter Valid Email", Toast.LENGTH_SHORT).show();

                }
                //password.setError("Enter Password");

                Matcher matcherpass=Pattern.compile(validpass).matcher(inputpass);
                if(matcherpass.matches())
                {
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    password.setError("set password at least any 8 alphabetic and digit letter and no white space");
                    // Toast.makeText(getApplicationContext(), "Enter Valid Email", Toast.LENGTH_SHORT).show();

                }

            }

        });


    }


}
