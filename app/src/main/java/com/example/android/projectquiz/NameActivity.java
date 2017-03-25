package com.example.android.projectquiz;

/**
 * Created by Iria on 24/03/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.R.string.yes;


/**
 * Created by Iria on 14/03/2017.
 */

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

    }







    public void submitAnswers(View view) {

        String reply0 = "Q3. " + "";
        String reply1 = "Q4. " + "";
        String reply2 = "Q5. " + "";
        String reply3 = "Q6. " + "";
        String reply4 = "Q7. " + "";

        /**
         * Inputs the name of the employee. Question 1
         */
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();



        /**
         * Inputs the name of the employer. Question 2
         */
        EditText companyField = (EditText) findViewById(R.id.company_field);
        String company = companyField.getText().toString();

        // Inputs and answer Question 3
        RadioButton lookQ31 = (RadioButton) findViewById(R.id.experience_yes);
        RadioButton lookQ32 = (RadioButton) findViewById(R.id.experience_no);
        boolean lookAQ31 = lookQ31.isChecked();
        boolean lookAQ32 = lookQ32.isChecked();
        if (lookAQ31) {
            lookQ31.setTextColor(Color.GREEN);
            reply0 += "Accepted";
        } else if (lookAQ32) {
            lookQ31.setTextColor(Color.GREEN);
            lookQ32.setTextColor(Color.RED);
            reply0 += "Rejected";
        }


        // Inputs and answer Question 4
        RadioButton lookQ41 = (RadioButton) findViewById(R.id.cscs_yes);
        RadioButton lookQ42 = (RadioButton) findViewById(R.id.cscs_no);
        boolean lookAQ41 = lookQ41.isChecked();
        boolean lookAQ42 = lookQ42.isChecked();
        if (lookAQ41) {
            lookQ41.setTextColor(Color.GREEN);
            reply1 += "Accepted";
        } else if (lookAQ42) {
            lookQ41.setTextColor(Color.GREEN);
            lookQ42.setTextColor(Color.RED);
            reply1 += "Rejected";
        }






        // Inputs and answer Question 5
    RadioButton lookQ51 = (RadioButton) findViewById(R.id.answer_blue);
    RadioButton lookQ52 = (RadioButton) findViewById(R.id.answer_green);
    RadioButton lookQ53 = (RadioButton) findViewById(R.id.answer_red);
    RadioButton lookQ54 = (RadioButton) findViewById(R.id.answer_yellow);
    boolean lookAQ51 = lookQ51.isChecked();
    boolean lookAQ52 = lookQ52.isChecked();
    boolean lookAQ53 = lookQ53.isChecked();
    boolean lookAQ54 = lookQ54.isChecked();
        if (lookAQ51){
            lookQ51.setTextColor(Color.GREEN);
            reply2 += "Accepted";
    }
        else if (lookAQ52){
            lookQ51.setTextColor(Color.GREEN);
            lookQ52.setTextColor(Color.RED);
            lookQ53.setTextColor(Color.RED);
            lookQ54.setTextColor(Color.RED);
            reply2 += "Rejected";
    }

        else if (lookAQ53){
            lookQ51.setTextColor(Color.GREEN);
            lookQ52.setTextColor(Color.RED);
            lookQ53.setTextColor(Color.RED);
            lookQ54.setTextColor(Color.RED);
            reply2 += "Rejected";
        }
        else if (lookAQ54){
            lookQ51.setTextColor(Color.GREEN);
            lookQ52.setTextColor(Color.RED);
            lookQ53.setTextColor(Color.RED);
            lookQ54.setTextColor(Color.RED);
            reply2 += "Rejected";
        }


        // Inputs and answer Question 6
        RadioButton lookQ61 = (RadioButton) findViewById(R.id.induction_yes);
        RadioButton lookQ62 = (RadioButton) findViewById(R.id.induction_no);
        boolean lookAQ61 = lookQ61.isChecked();
        boolean lookAQ62 = lookQ62.isChecked();
        if (lookAQ61) {
            lookQ61.setTextColor(Color.GREEN);
            reply3 += "Accepted";
        } else if (lookAQ62) {
            lookQ61.setTextColor(Color.GREEN);
            lookQ62.setTextColor(Color.RED);
            reply3 += "Rejected";
        }




        // Inputs and answer Question 7
    RadioButton lookQ71 = (RadioButton) findViewById(R.id.iff_yes);
    RadioButton lookQ72 = (RadioButton) findViewById(R.id.iff_no);
    boolean lookAQ71 = lookQ71.isChecked();
    boolean lookAQ72 = lookQ72.isChecked();
        if (lookAQ71) {
            lookQ71.setTextColor(Color.GREEN);
            reply4 += "Accepted";
    } else if (lookAQ72) {
            lookQ71.setTextColor(Color.GREEN);
            lookQ72.setTextColor(Color.RED);
            reply4 += "Rejected";
    }


        // Show the score and the answers by pressing the button
        Button finishQuestions = (Button) findViewById(R.id.finish);
        finishQuestions.setClickable(true);

        // Display the final score in a toast message
        Toast.makeText(this, "\n" + "NAME: " + name + "\n" + "COMPANY: " + company + "\n"+ reply1 +  "\n" + reply2 +  "\n" + reply3 +  "\n" + reply4 +"\n" + reply0 , Toast.LENGTH_LONG).show();
    }
}



