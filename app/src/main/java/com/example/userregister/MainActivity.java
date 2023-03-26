package com.example.userregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText firstname;
    private EditText lastname;
    private EditText email;
    private RadioButton radiobutton;
    UserStorage us = UserStorage.getInstance();
    User user = new User(null,null,null,null,0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstname = findViewById(R.id.fname);
        lastname = findViewById(R.id.lname);
        email = findViewById(R.id.mail);
    }

    public void switchToListing(View view){
        Intent intent = new Intent(this, ListUsersActivity.class);
        startActivity(intent);
    }


    public void adduser(View view){
        System.out.println(us.users.size());
        RadioGroup selectedDegree = findViewById(R.id.degrees);
        RadioGroup picture = findViewById(R.id.pictures);
        if (picture.getCheckedRadioButtonId() == R.id.pTriangle){
            user.photo = R.drawable.kolmio;
        }else if(picture.getCheckedRadioButtonId() == R.id.pSquare){
            user.photo = R.drawable.square;
        }else if (picture.getCheckedRadioButtonId() == R.id.pShout){
            user.photo = R.drawable.huutomerkki;
        }else {
            user.photo = 0;
        }
        user.firstname = firstname.getText().toString();
        user.lastname = lastname.getText().toString();
        user.email = email.getText().toString();
        switch (selectedDegree.getCheckedRadioButtonId()){
            case R.id.late:
                radiobutton = selectedDegree.findViewById(R.id.late);
                user.degree = radiobutton.getText().toString();
                us.addUser(new User(user.firstname, user.lastname, user.email, user.degree,user.photo));
                break;
            case R.id.tite:
                radiobutton = selectedDegree.findViewById(R.id.tite);
                user.degree = radiobutton.getText().toString();
                us.addUser(new User(user.firstname, user.lastname, user.email, user.degree,user.photo));
                break;
            case R.id.tuta:
                radiobutton = selectedDegree.findViewById(R.id.tuta);
                user.degree = radiobutton.getText().toString();
                us.addUser(new User(user.firstname, user.lastname, user.email, user.degree,user.photo));
                break;
            case R.id.sate:
                radiobutton = selectedDegree.findViewById(R.id.sate);
                user.degree = radiobutton.getText().toString();
                us.addUser(new User(user.firstname, user.lastname, user.email, user.degree,user.photo));
                break;
        }


    }
}