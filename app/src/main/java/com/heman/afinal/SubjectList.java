package com.heman.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Himanshu on 20-02-2017.
 */

public class SubjectList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjectlist);

        String branch = getIntent().getStringExtra("branch");
        String sem = getIntent().getStringExtra("sem");

        TextView sub1 = (TextView) findViewById(R.id.sub1);
        TextView sub2 = (TextView) findViewById(R.id.sub2);
        TextView sub3 = (TextView) findViewById(R.id.sub3);
        TextView sub4 = (TextView) findViewById(R.id.sub4);
        TextView sub5 = (TextView) findViewById(R.id.sub5);

        if(branch.equals("COMPUTER SCIENCE & ENGINEERING")) {
            if(sem.equals("1st Semester")){
                sub1.setText("Engineering Chemistry");
                sub2.setText("Engineering Mathematics I");
                sub3.setText("Communication Skills");
                sub4.setText("Basic Electrical Engineering");
                sub5.setText("Engineering Graphics");
            }
            else if(sem.equals("2nd Semester")){
                sub1.setText("Engineering Physics");
                sub2.setText("Engineering Mathematics II");
                sub3.setText("Basic Mechanical Engineering");
                sub4.setText("Basic Civil Engineering");
                sub5.setText("Basic Computer Engineering");
            }
            else if(sem.equals("3rd Semester")){
                sub1.setText("Data Structures");
                sub2.setText("EDC");
                sub3.setText("Discrete Structures");
                sub4.setText("EEES");
                sub5.setText("DCS");
            }
            else if(sem.equals("4th Semester")){
                sub1.setText("TOC");
                sub2.setText("OOT");
                sub3.setText("CSO");
                sub4.setText("ADC");
                sub5.setText("ADA");
            }
            else if(sem.equals("5th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("6th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("7th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else{
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
        }
        if(branch.equals("INFORMATION TECHNOLOGY")) {
            if(sem.equals("1st Semester")){
                sub1.setText("Engineering Chemistry");
                sub2.setText("Engineering Mathematics I");
                sub3.setText("Communication Skills");
                sub4.setText("Basic Electrical Engineering");
                sub5.setText("Engineering Graphics");
            }
            else if(sem.equals("2nd Semester")){
                sub1.setText("Engineering Physics");
                sub2.setText("Engineering Mathematics II");
                sub3.setText("Basic Mechanical Engineering");
                sub4.setText("Basic Civil Engineering");
                sub5.setText("Basic Computer Engineering");
            }
            else if(sem.equals("3rd Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("4th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("5th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("6th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("7th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else{
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
        }
        if(branch.equals("ELECTRONICS &a COMMUNICATION ENGINEERING")) {
            if(sem.equals("1st Semester")){
                sub1.setText("Engineering Chemistry");
                sub2.setText("Engineering Mathematics I");
                sub3.setText("Communication Skills");
                sub4.setText("Basic Electrical Engineering");
                sub5.setText("Engineering Graphics");
            }
            else if(sem.equals("2nd Semester")){
                sub1.setText("Engineering Physics");
                sub2.setText("Engineering Mathematics II");
                sub3.setText("Basic Mechanical Engineering");
                sub4.setText("Basic Civil Engineering");
                sub5.setText("Basic Computer Engineering");
            }
            else if(sem.equals("3rd Semester")){
                sub1.setText("CSO");
                sub2.setText("Electronic Instrumentation");
                sub3.setText("Electronic Devices");
                sub4.setText("Mathematics III");
                sub5.setText("Network Analysis");
            }
            else if(sem.equals("4th Semester")){
                sub1.setText("Digital Electronics");
                sub2.setText("Energy, Environment, Ethics and Society");
                sub3.setText("Electromagnetic Theory");
                sub4.setText("Electronic Circuits");
                sub5.setText("Signal And Systems");
            }
            else if(sem.equals("5th Semester")){

                sub1.setText("CN & T");
                sub2.setText("Communication System");
                sub3.setText("Microprocessors & ES");
                sub4.setText("Voice and Data Communication");
                sub5.setText("");
            }
            else if(sem.equals("6th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("7th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else{
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
        }
        if(branch.equals("ELECTRICAL & ELECTRONICS ENGINEERING")) {
            if(sem.equals("1st Semester")){
                sub1.setText("Engineering Chemistry");
                sub2.setText("Engineering Mathematics I");
                sub3.setText("Communication Skills");
                sub4.setText("Basic Electrical Engineering");
                sub5.setText("Engineering Graphics");
            }
            else if(sem.equals("2nd Semester")){
                sub1.setText("Engineering Physics");
                sub2.setText("Engineering Mathematics II");
                sub3.setText("Basic Mechanical Engineering");
                sub4.setText("Basic Civil Engineering");
                sub5.setText("Basic Computer Engineering");
            }
            else if(sem.equals("3rd Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("4th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("5th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("6th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("7th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else{
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
        }
        if(branch.equals("MECHANICAL ENGINEERING")) {
            if(sem.equals("1st Semester")){
                sub1.setText("Engineering Chemistry");
                sub2.setText("Engineering Mathematics I");
                sub3.setText("Communication Skills");
                sub4.setText("Basic Electrical Engineering");
                sub5.setText("Engineering Graphics");
            }
            else if(sem.equals("2nd Semester")){
                sub1.setText("Engineering Physics");
                sub2.setText("Engineering Mathematics II");
                sub3.setText("Basic Mechanical Engineering");
                sub4.setText("Basic Civil Engineering");
                sub5.setText("Basic Computer Engineering");
            }
            else if(sem.equals("3rd Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("4th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("5th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("6th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("7th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else{
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
        }
        if(branch.equals("CIVIL ENGINEERING")) {
            if(sem.equals("1st Semester")){
                sub1.setText("Engineering Chemistry");
                sub2.setText("Engineering Mathematics I");
                sub3.setText("Communication Skills");
                sub4.setText("Basic Electrical Engineering");
                sub5.setText("Engineering Graphics");
            }
            else if(sem.equals("2nd Semester")){
                sub1.setText("Engineering Physics");
                sub2.setText("Engineering Mathematics II");
                sub3.setText("Basic Mechanical Engineering");
                sub4.setText("Basic Civil Engineering");
                sub5.setText("Basic Computer Engineering");
            }
            else if(sem.equals("3rd Semester")){
                sub1.setText("Engineering Geology");
                sub2.setText("Transportation Engineering");
                sub3.setText("Strength of Materials");
                sub4.setText("BDD");
                sub5.setText("EEES");
            }
            else if(sem.equals("4th Semester")){
                sub1.setText("Mathematics III");
                sub2.setText("Concrete Technology");
                sub3.setText("Surveying");
                sub4.setText("CMT");
                sub5.setText("Fluid Mechanics I");
            }
            else if(sem.equals("5th Semester")){
                sub1.setText("Advanced Surveying");
                sub2.setText("Fluid Mechanics II");
                sub3.setText("Transportation Engineering");
                sub4.setText("Theory of Structures");
                sub5.setText("");
            }
            else if(sem.equals("6th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("7th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else{
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
        }
        if(branch.equals("AUTOMOBILE ENGINEERING")) {
            if(sem.equals("1st Semester")){
                sub1.setText("Engineering Chemistry");
                sub2.setText("Engineering Mathematics I");
                sub3.setText("Communication Skills");
                sub4.setText("Basic Electrical Engineering");
                sub5.setText("Engineering Graphics");
            }
            else if(sem.equals("2nd Semester")){
                sub1.setText("Engineering Physics");
                sub2.setText("Engineering Mathematics II");
                sub3.setText("Basic Mechanical Engineering");
                sub4.setText("Basic Civil Engineering");
                sub5.setText("Basic Computer Engineering");
            }
            else if(sem.equals("3rd Semester")){
                sub1.setText("Mathematics III");
                sub2.setText("Production Process");
                sub3.setText("Strength and Mechanics of Materials");
                sub4.setText("Thermodynamics");
                sub5.setText("");
            }
            else if(sem.equals("4th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("5th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("6th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("7th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else{
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
        }
        if(branch.equals("PETROCHEMICAL ENGINEERING")){
            if(sem.equals("1st Semester")){
                sub1.setText("Engineering Chemistry");
                sub2.setText("Engineering Mathematics I");
                sub3.setText("Communication Skills");
                sub4.setText("Basic Electrical Engineering");
                sub5.setText("Engineering Graphics");
            }
            else if(sem.equals("2nd Semester")){
                sub1.setText("Engineering Physics");
                sub2.setText("Engineering Mathematics II");
                sub3.setText("Basic Mechanical Engineering");
                sub4.setText("Basic Civil Engineering");
                sub5.setText("Basic Computer Engineering");
            }
            else if(sem.equals("3rd Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("4th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("5th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("6th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else if(sem.equals("7th Semester")){
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
            else{
                sub1.setText("TO BE ADDED SOON!!!");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
            }
        }


        if(!sub1.getText().equals("TO BE ADDED SOON!!!")) {
            sub1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SubjectList.this, LoadImage.class);
                    startActivity(intent);
                }
            });
        }

        if(!sub2.getText().equals("")) {
            sub2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SubjectList.this, LoadImage.class);
                    startActivity(intent);
                }
            });
        }

        if(!sub3.getText().equals("")) {
            sub3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SubjectList.this, LoadImage.class);
                    startActivity(intent);
                }
            });
        }

        if(!sub4.getText().equals("")) {
            sub4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SubjectList.this, LoadImage.class);
                    startActivity(intent);
                }
            });
        }

        if(!sub5.getText().equals("")) {
            sub5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SubjectList.this, LoadImage.class);
                    startActivity(intent);
                }
            });
        }



    }
}
