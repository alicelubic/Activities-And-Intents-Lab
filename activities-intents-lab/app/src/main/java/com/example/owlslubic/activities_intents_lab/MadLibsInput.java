package com.example.owlslubic.activities_intents_lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MadLibsInput extends AppCompatActivity {
    EditText mAdj1;
    EditText mAdj2;
    EditText mNoun1;
    EditText mNoun2;
    EditText mAnimals;
    EditText mGameName;
    Button mSumbit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_libs_input);

        mAdj1 = (EditText)findViewById(R.id.edittext_first_adj);
        mAdj2 = (EditText)findViewById(R.id.edittext_second_adj);
        mNoun1 = (EditText)findViewById(R.id.edittext_first_noun);
        mNoun2 = (EditText)findViewById(R.id.edittext_second_noun);
        mAnimals = (EditText)findViewById(R.id.edittext_animals);
        mGameName = (EditText)findViewById(R.id.edittext_game_name);
        mSumbit= (Button)findViewById(R.id.button_submit);


        View.OnClickListener submit = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),MadLibsOutput.class);
                intent.putExtra("Adj1", mAdj1.getText().toString());
                intent.putExtra("Adj2", mAdj2.getText().toString());
                intent.putExtra("Noun1", mNoun1.getText().toString());
                intent.putExtra("Noun2", mNoun2.getText().toString());
                intent.putExtra("Animals", mAnimals.getText().toString());
                intent.putExtra("Game Name", mGameName.getText().toString());



                startActivity(intent);



            }


        };

        //how do you make a toast happen when you hit the button?
       // Toast.makeText(MadLibsInput.this, "Here we go!", Toast.LENGTH_SHORT).show();
        mSumbit.setOnClickListener(submit);





        //dont know how to do this
      //  if(//how do you make it say any input is null){
      //      EditText.setError("please write something!");
        }




    }

