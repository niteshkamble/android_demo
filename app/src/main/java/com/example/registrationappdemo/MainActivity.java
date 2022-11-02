package com.example.registrationappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText userNameEdt, EmailEdt;
    private Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing our edit text  and buttons.
        userNameEdt = findViewById(R.id.idEdtUserName);
        EmailEdt = findViewById(R.id.idEdtEmail);
        registerBtn = findViewById(R.id.idBtnRegister);


        // adding on click listener for our button.
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // on below line we are getting data from our edit text.
                String userName = userNameEdt.getText().toString();
                String email = EmailEdt.getText().toString();

                // checking if the entered text is empty or not.
                if (TextUtils.isEmpty(userName) && TextUtils.isEmpty(email)) {
                     Toast.makeText(MainActivity.this, "Please enter user name and email", Toast.LENGTH_SHORT).show();
                }else{
                    // calling a method to register a user.
                    registerUser(userName, email);
                }
            }
        });
    }

    private void registerUser(String userName, String email) {
//        User user = new User();
//        user.setName(userName);
//        user.setEmail(email);

        //logic for registration

        //passing data to next home activity
        Toast.makeText(MainActivity.this, "User Registered successfully", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this, Home.class);
        i.putExtra("username", userName);
        i.putExtra("date", "12-09-98");
        i.putExtra("email", email);
        startActivity(i);
    }
}