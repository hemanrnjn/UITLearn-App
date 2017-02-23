package com.heman.afinal;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Himanshu on 19-02-2017.
 */

public class UserActivity extends AppCompatActivity {

    public static String item="";
    private Button btnsem;
    String branchName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);


        /*Intent intent = getIntent();*/
        String username = getIntent().getStringExtra("user");
        String branch = getIntent().getStringExtra("branch");

        TextView tvBranch = (TextView) findViewById(R.id.tvBranch);
        TextView tvUser = (TextView) findViewById(R.id.tvUser);
        btnsem = (Button) findViewById(R.id.btnsem);

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
}
