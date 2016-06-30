package com.example.owlslubic.activities_intents_lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MadLibsOutput extends AppCompatActivity {
    TextView mMadLibsOutput;

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

        mMadLibsOutput = (TextView)findViewById(R.id.textview_madlibs_output);
        mMadLibsOutput.setText("This will be the output, it will have" + adj1
                + adj2 + noun1 + noun2 + animals + gameName);

    }
}

