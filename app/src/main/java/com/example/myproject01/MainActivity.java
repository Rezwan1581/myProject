package com.example.myproject01;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    private Button busButton,trainButton,airplaneButton,confirmButton,submitButton,selectButton,exitButton;
    private TextView travelText,confirmResultText,submitText,dateText;
    private CheckBox dhakaCheckBox,rajshahiCheckBox,khulnaCheckBox,chittagongCheckBox,sylhetCheckBox,barishalCheckBox;
    private DatePicker datePicker;
    private AlertDialog.Builder alertDialogBuilder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        busButton=(Button) findViewById(R.id.bus);
        trainButton=(Button) findViewById(R.id.train);
        airplaneButton=(Button) findViewById(R.id.airplane);
        submitButton=(Button) findViewById(R.id.submit);
        selectButton=(Button) findViewById(R.id.select);
        exitButton=(Button) findViewById(R.id.exitButton);




        travelText= (TextView)findViewById(R.id.travelText);
        submitText= (TextView)findViewById(R.id.submitText);
        dateText= (TextView)findViewById(R.id.dateText);



        dhakaCheckBox =(CheckBox)findViewById(R.id.dhakaCheck);
        rajshahiCheckBox =(CheckBox)findViewById(R.id.rajshahiCheck);
        khulnaCheckBox =(CheckBox)findViewById(R.id.khulnaCheck);
        chittagongCheckBox =(CheckBox)findViewById(R.id.chittagongCheck);
        sylhetCheckBox =(CheckBox)findViewById(R.id.sylhetCheck);
        barishalCheckBox =(CheckBox)findViewById(R.id.barishalCheck);

        confirmButton=(Button) findViewById(R.id.confirmButton);

        confirmResultText= (TextView)findViewById(R.id.confirmResult);

        datePicker= (DatePicker)findViewById(R.id.datePicker);



        busButton.setOnClickListener(this);
        trainButton.setOnClickListener(this);
        airplaneButton.setOnClickListener(this);
        submitButton.setOnClickListener(this);

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                alertDialogBuilder.setTitle(R.string.title_text);
                alertDialogBuilder.setMessage(R.string.message_text);
                alertDialogBuilder.setIcon(R.mipmap.ic_launcher);
                alertDialogBuilder.setCancelable(false);


                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"You clicked on No",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Toast.makeText(MainActivity.this,"You clicked on Nuetral",Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });
                alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //exit
                        finish();
                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });





        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder=new StringBuilder();

                if(dhakaCheckBox.isChecked()){
                    String value = dhakaCheckBox.getText().toString();
                    stringBuilder.append(value).append(" is confirmed\n");
                }
                if(rajshahiCheckBox.isChecked()){
                    String value = rajshahiCheckBox.getText().toString();
                    stringBuilder.append(value+ " is confirmed\n");
                }
                if(khulnaCheckBox.isChecked()){
                    String value = khulnaCheckBox.getText().toString();
                    stringBuilder.append(value+ " is confirmed\n");
                }
                if(chittagongCheckBox.isChecked()){
                    String value = chittagongCheckBox.getText().toString();
                    stringBuilder.append(value).append(" is confirmed\n");
                }
                if(sylhetCheckBox.isChecked()){
                    String value = sylhetCheckBox.getText().toString();
                    stringBuilder.append(value+ " is confirmed\n");
                }
                if(barishalCheckBox.isChecked()){
                    String value = barishalCheckBox.getText().toString();
                    stringBuilder.append(value+ " is confirmed\n");
                }



            }
        });






    }




    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.bus){
            Toast.makeText(MainActivity.this, "By bus is clicked", Toast.LENGTH_SHORT).show();
            travelText.setText("BY BUS button is clicked ");

        }
        if (v.getId()==R.id.train){
            Toast.makeText(MainActivity.this, "By train is clicked", Toast.LENGTH_SHORT).show();
            travelText.setText("BY TRAIN button is clicked ");

        }
        if (v.getId()==R.id.airplane){
            Toast.makeText(MainActivity.this, "By airplane is clicked", Toast.LENGTH_SHORT).show();
            travelText.setText("BY AIRPLANE button is clicked ");

        }

        if (v.getId()==R.id.submit){
            Toast.makeText(MainActivity.this, "Submit is clicked", Toast.LENGTH_SHORT).show();
          submitText.setText("Submit button is clicked ");

        }



    }
}
