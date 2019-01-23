package edu.monash.fit2081.squareapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/*
    public void calculateSquare(View view){
        // Get a reference to the input edit text (i.e. number)
        EditText number=findViewById(R.id.number);
        //Get a reference to the output text view (i.e. result)
        TextView result=findViewById(R.id.result);
        //Integer.parseInt is a function that converts a string into an integer value
        int theNumber=Integer.parseInt(number.getText().toString());
        int theSquare=theNumber*theNumber;
        //Integer.toString() is a function that convert an integer value into a string
        result.setText(Integer.toString(theSquare));
    }
*/

    public void button_1_click (View ClickedView) {
        Button button1 = (Button)findViewById(R.id.calcBtn);
        TextView number1 = (TextView)findViewById(R.id.number1);
        TextView number2 = (TextView)findViewById(R.id.number2);
        TextView name1 = (TextView)findViewById(R.id.name1);
        TextView max_num = (TextView)findViewById(R.id.textView4);
        TextView ave_num = (TextView)findViewById(R.id.textView5);
        TextView message1 = (TextView)findViewById(R.id.MessageBox);

        //get the max number
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        if (num1 > num2) {
            max_num.setText(getString(R.string.max, num1));
        }
        else {
            max_num.setText(getString(R.string.max, num2));
        }

        //get the average number
        float average = 1.0f * ( num1 + num2 ) / 2;
        ave_num.setText(getString(R.string.ave, average));

        //hello, name.
        String name = name1.getText().toString();
        message1.setText(getString(R.string.hello, name));

    }

}
