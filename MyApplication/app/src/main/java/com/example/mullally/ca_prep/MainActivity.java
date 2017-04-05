package com.example.mullally.ca_prep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.color.holo_blue_bright;
import static com.example.mullally.ca_prep.R.id.imageView;

public class MainActivity extends AppCompatActivity {

    TextView userName,gender,locationTv,tvgender,tvLocation,tvUsername;
    EditText etUsername;
    RadioGroup radioGroup;
    Spinner location;
    Button btn,btnClear;
    Toast Toast;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        userName = (TextView) findViewById(R.id.textView);
        tvgender = (TextView) findViewById(R.id.tvGender);
        tvLocation = (TextView) findViewById(R.id.tvLocation);
        tvUsername = (TextView) findViewById(R.id.tvUsername);
        gender = (TextView) findViewById(R.id.textView2);
        locationTv = (TextView) findViewById(R.id.textView3);

        etUsername = (EditText) findViewById(R.id.editText);

        radioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);

        location = (Spinner) findViewById(R.id.spinner);

        btn = (Button) findViewById(R.id.btnSubmit);
        btnClear = (Button) findViewById(R.id.btnClear);

        image = (ImageView) findViewById(imageView);


        tvgender.setVisibility(View.GONE);
        tvLocation.setVisibility(View.GONE);
        tvUsername.setVisibility(View.GONE);
        image.setVisibility(View.GONE);

        //DOING IT THE SET ON CLICK LISTENER WAY
//        //OnClickListener for the submit button
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                //getting the index of the selected radio button in the radio group
//                int selectedId = radioGroup.indexOfChild(findViewById(radioGroup.getCheckedRadioButtonId()));
//
//                //setting the Text view for the username to the value enterd in the Edit text box for username
//                tvUsername.setText("Username: " + etUsername.getText());
//
//                //using a switch statement to deternmine the value to display based off the index of the radio button selected within the radio group
//
//                switch (selectedId) {
//                    case 0:
//                        // do operations specific to Male
//                        tvgender.setText("Gender: Male");
//                        image.setImageResource(R.drawable.male);
//
//                        break;
//                    case 1:
//                        // do operations specific to female
//                        tvgender.setText("Gender: Female");
//                        image.setImageResource(R.drawable.female);
//
//
//                        break;
//                }
//
//                //getting the value of the item selected from the spinner (dropdown list) and setting the text view for location to it.
//                tvLocation.setText("Location: " + location.getItemAtPosition(location.getSelectedItemPosition()).toString());
//
//                //setting the text views to visible once the submit button is clicked.
//                tvgender.setVisibility(View.VISIBLE);
//                tvLocation.setVisibility(View.VISIBLE);
//                tvUsername.setVisibility(View.VISIBLE);
//                image.setVisibility(View.VISIBLE);
//            }
//        });
//
//        btnClear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //setting all the Text views down the bottom to hidden
//                tvgender.setVisibility(View.GONE);
//                tvLocation.setVisibility(View.GONE);
//                tvUsername.setVisibility(View.GONE);
//                image.setVisibility(View.GONE);
//                //resetting the value within the Edit txt box for username
//                etUsername.setText("");
//                etUsername.setHint("Username");
//            }
//        });
//
    }
    //garys way
        public void getDetails(View v ){
            //getting the index of the selected radio button in the radio group
            int selectedId = radioGroup.indexOfChild(findViewById(radioGroup.getCheckedRadioButtonId()));

            //setting the Text view for the username to the value enterd in the Edit text box for username
            tvUsername.setText("Username: " + etUsername.getText());

            //using a switch statement to deternmine the value to display based off the index of the radio button selected within the radio group

            switch (selectedId) {
                case 0:
                    // do operations specific to Male
                    tvgender.setText("Gender: Male");
                    image.setImageResource(R.drawable.male);

                    break;
                case 1:
                    // do operations specific to female
                    tvgender.setText("Gender: Female");
                    image.setImageResource(R.drawable.female);


                    break;
            }

            //getting the value of the item selected from the spinner (dropdown list) and setting the text view for location to it.
            tvLocation.setText("Location: " + location.getItemAtPosition(location.getSelectedItemPosition()).toString());

            //setting the text views to visible once the submit button is clicked.
            tvgender.setVisibility(View.VISIBLE);
            tvLocation.setVisibility(View.VISIBLE);
            tvUsername.setVisibility(View.VISIBLE);
            image.setVisibility(View.VISIBLE);
        }

        public void clearDetails(View view){
            //setting all the Text views down the bottom to hidden
            tvgender.setVisibility(View.GONE);
            tvLocation.setVisibility(View.GONE);
            tvUsername.setVisibility(View.GONE);
            image.setVisibility(View.GONE);
            //resetting the value within the Edit txt box for username
            etUsername.setText("");
            etUsername.setHint("Username");
        }


    }
