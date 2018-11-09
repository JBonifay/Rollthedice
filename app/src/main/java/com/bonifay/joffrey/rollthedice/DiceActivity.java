package com.bonifay.joffrey.rollthedice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

public class DiceActivity extends AppCompatActivity implements View.OnClickListener {

      private TextView textTitle;
      private TextView textResult;
      private Button   buttonRoll;
      private int      max;

      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_dice);

            textTitle = findViewById(R.id.textTitle);
            textResult = findViewById(R.id.textResult);
            buttonRoll = findViewById(R.id.buttonRoll);
            buttonRoll.setOnClickListener(this);

            max = getIntent().getIntExtra("max", 0);
            textTitle.setText(max + " sided dice");
            textResult.setText("");

      }


      public void onClick(View v) {
            SecureRandom random = new SecureRandom();
            int result = random.nextInt(max) + 1;
            textResult.setText(String.valueOf(result));

      }


}
