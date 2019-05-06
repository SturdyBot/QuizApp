package com.example.android.quiz_android;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   String text;
   int correctAnswers;
   int wrongAnswers;
   String review;

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// Working Of The Gender - RadioButton
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioMale:
                if (checked)
                    text="Male";
                    Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG).show();
                break;
            case R.id.radioFemale:
                if (checked)
                    text="Female";
                    Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG).show();
                break;
        }
    }
 // Working Of the Questions and Answers - RadioButton
 public void onbuttonClicked(View view) {
     boolean checked = ((RadioButton) view).isChecked();
     // Check which radio button was clicked
     switch(view.getId()) {
         case R.id.Question1_a:
             if (checked)
             wrongAnswers++;
             break;
         case R.id.Question1_b:
             if (checked)
            wrongAnswers++;
             break;
         case R.id.Question1_c:
             if (checked)
                 correctAnswers++;
             break;
         case R.id.Question1_d:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question2_a:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question2_b:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question2_c:
             if (checked)
                 correctAnswers++;
             break;
         case R.id.Question2_d:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question3_a:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question3_b:
             if (checked)
                 correctAnswers++;
             break;
         case R.id.Question3_c:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question3_d:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question4_a:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question4_b:
             if (checked)
                 correctAnswers++;
             break;
         case R.id.Question4_c:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question4_d:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question5_a:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question5_b:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question5_c:
             if (checked)
                 correctAnswers++;
             break;
         case R.id.Question5_d:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question6_a:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question6_b:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question6_c:
             if (checked)
                 correctAnswers++;
             break;
         case R.id.Question6_d:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question7_a:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question7_b:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question7_c:
             if (checked)
                 correctAnswers++;
             break;
         case R.id.Question7_d:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question8_a:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question8_b:
             if (checked)
                 correctAnswers++;
             break;
         case R.id.Question8_c:
             if (checked)
                 wrongAnswers++;
             break;
         case R.id.Question8_d:
             if (checked)
                 wrongAnswers++;
             break;

     }

 }

    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.Review_Yes:
                if (checked)
                    review ="*Thanks for the Review | We are glad that you are Happy*";
                Toast.makeText(getApplicationContext(),"Thanks for the Review",Toast.LENGTH_LONG).show();
                break;
            case R.id.Review_No:
                if (checked)
                    review ="*Oops! | We will definitely improve in the next app*";
                Toast.makeText(getApplicationContext(),"Thanks for the Review",Toast.LENGTH_LONG).show();
                break;

        }
    }

    public void submit(View view){

        //Name of the Customer
        EditText editText=(EditText)findViewById(R.id.editText);
        String customerName = editText.getText().toString();

        String message = Summary(customerName);
        displayMessage(message);

    }

    private String Summary(String customerName) {
        String editText = "Name: " + customerName;
        editText = editText + "\nGender: "+text;
        editText = editText + "\nTotal number of Correct Answers: "+correctAnswers;
        editText = editText + "\nTotal number of Wrong Answers: "+wrongAnswers;
        editText += "\n\n"+review;
        return editText;
    }

    private void displayMessage(String message) {
        TextView submitSummary = (TextView) findViewById(R.id.Summary);
        submitSummary.setText("SUMMARY\n"+message);
    }

}


