package com.example.owlslubic.activities_intents_lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MadLibsOutput extends AppCompatActivity {
    TextView mMadLibsOutput;
    String mOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_libs_output);


        Intent intent = getIntent();
        String adj1 = intent.getStringExtra("Adj1");
        String adj2 = intent.getStringExtra("Adj2");
        String noun1 = intent.getStringExtra("Noun1");
        String noun2 = intent.getStringExtra("Noun2");
        String animals = intent.getStringExtra("Animals");
        String gameName = intent.getStringExtra("Game Name");


        mOutput = ("A vacation is when you take a trip to some " + adj1.toUpperCase()
                + " place with your " + adj2.toUpperCase() + " family. Usually, you go to some place that is near a "
                + noun1.toUpperCase() + " or up on a " + noun2.toUpperCase() + ". A good vacation place is one where you can ride "
                + animals.toUpperCase() + " or play " + gameName.toUpperCase() + ".");

        //not sure how to do bold

        mMadLibsOutput = (TextView)findViewById(R.id.textview_madlibs_output);
        mMadLibsOutput.setText(mOutput);




    }
}

