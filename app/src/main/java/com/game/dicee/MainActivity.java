package com.game.dicee;

import android.media.Image;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // Views declaration
    private Button rollButton;
    private  ImageView image_rightDice,image_leftDice;
    private final int[] diceArray ={
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6
         };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // View's affectation
        rollButton = (Button) findViewById(R.id.rollButton);
        image_leftDice = (ImageView) findViewById(R.id.image_leftDice);
        image_rightDice = (ImageView) findViewById(R.id.image_rightDice);

       // Setting the onClick listener
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomGenerator = new Random();
                // we pick the magic number
                int num = randomGenerator.nextInt(6);
                // setting randomly our dice image :
                image_leftDice.setImageResource(diceArray[num]);
                image_rightDice.setImageResource(diceArray[randomGenerator.nextInt(6)]);
                Log.d("Dice","The random number : "+num);
            }
        });
    }
}
