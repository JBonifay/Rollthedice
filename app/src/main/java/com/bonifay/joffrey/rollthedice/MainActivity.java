package com.bonifay.joffrey.rollthedice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

      private Button button6;
      private Button button20;


      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            button6 = findViewById(R.id.button6);
            button20 = findViewById(R.id.button20);

            button6.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {

                        Intent intent = new Intent(MainActivity.this, DiceActivity.class);
                        intent.putExtra("max", 6);
                        startActivity(intent);

                  }
            });

            button20.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {

                        Intent intent = new Intent(MainActivity.this, DiceActivity.class);
                        intent.putExtra("max", 20);
                        startActivity(intent);

                  }
            });


      }


}
