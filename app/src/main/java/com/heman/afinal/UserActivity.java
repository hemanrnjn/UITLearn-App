package com.heman.afinal;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Himanshu on 19-02-2017.
 */

public class UserActivity extends AppCompatActivity {

    public static String item="";
    private Button btnsem;
    String branchName = "";

    SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);


        /*Intent intent = getIntent();*/
        String username = getIntent().getStringExtra("user");
        String branch = getIntent().getStringExtra("branch");

        TextView tvBranch = (TextView) findViewById(R.id.tvBranch);
        TextView tvUser = (TextView) findViewById(R.id.tvUser);
        TextView tvLogout = (TextView) findViewById(R.id.tvLogout);
        btnsem = (Button) findViewById(R.id.btnsem);

        session = new SessionManager(getApplicationContext());

        tvLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                session.logoutUser();
                finish();
            }
        });

        // Display user details
        tvUser.setText(username.toUpperCase());

        if(branch.equals("CSE")) {
            branchName = "COMPUTER SCIENCE & ENGINEERING";
        }
        if(branch.equals("IT")) {
            branchName = "INFORMATION TECHNOLOGY";
        }
        if(branch.equals("ECE")) {
            branchName = "ELECTRONICS &a COMMUNICATION ENGINEERING";
        }
        if(branch.equals("EE")) {
            branchName = "ELECTRICAL & ELECTRONICS ENGINEERING";
        }
        if(branch.equals("ME")) {
            branchName = "MECHANICAL ENGINEERING";
        }
        if(branch.equals("CE")) {
            branchName = "CIVIL ENGINEERING";
        }
        if(branch.equals("AU")) {
            branchName = "AUTOMOBILE ENGINEERING";
        }
        if(branch.equals("PCT")){
            branchName = "PETROCHEMICAL ENGINEERING";
        }

        tvBranch.setText(branchName);

        final String branchValue = branchName;


        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.semester, R.layout.spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                UserActivity.item = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        btnsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),SubjectList.class);
                intent.putExtra("branch", branchValue);
                intent.putExtra("sem",item);
                startActivity(intent);
            }
        });

    }


    private Boolean exit = false;
    @Override
    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity
        } else {
            Toast.makeText(this, "Press Back again to Exit",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }

    }


}
