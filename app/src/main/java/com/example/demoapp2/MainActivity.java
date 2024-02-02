package com.example.demoapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);


//---------------------------------------------------------
//            BUTTON-CLICK AND ADDITION
//---------------------------------------------------------


        //getting the values
//        EditText numA = findViewById(R.id.num1);
//        EditText numB = findViewById(R.id.num1);
//        Button add  = findViewById(R.id.add);
//        Button multi  = findViewById(R.id.multi);
//        Button sub  = findViewById(R.id.sub);
//        Button div  = findViewById(R.id.div);
//        TextView result = findViewById(R.id.result);

        //making onClick listener
//        add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                int num1 = Integer.valueOf(numA.getText().toString());
//                int num2 = Integer.valueOf(numB.getText().toString());
//                Toast.makeText(MainActivity.this, String.valueOf(num1 + num2), Toast.LENGTH_SHORT).show();
//                result.setText("Addition is : " + String.valueOf(num1 + num2));
//                numA.setText("");
//                numB.setText("");
//            }
//        });
//
//        multi.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int num1 = Integer.valueOf(numA.getText().toString());
//                int num2 = Integer.valueOf(numB.getText().toString());
//                Toast.makeText(MainActivity.this, String.valueOf(num1 - num2), Toast.LENGTH_SHORT).show();
//                result.setText("Multiplication is : " + String.valueOf(num1 * num2));
//                numA.setText("");
//                numB.setText("");
//            }
//        });
//
//        sub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int num1 = Integer.valueOf(numA.getText().toString());
//                int num2 = Integer.valueOf(numB.getText().toString());
//                Toast.makeText(MainActivity.this, String.valueOf(num1 - num2), Toast.LENGTH_SHORT).show();
//                result.setText("Subtraction is :" + String.valueOf(num1 - num2));
//                numA.setText("");
//                numB.setText("");
//            }
//        });
//
//        div.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                double num1 = Integer.valueOf(numA.getText().toString());
//                double num2 = Integer.valueOf(numB.getText().toString());
//                Toast.makeText(MainActivity.this, String.valueOf(num1 / num2), Toast.LENGTH_SHORT).show();
//                result.setText("Division is :" + String.valueOf(num1 / num2));
//                numA.setText("");
//                numB.setText("");
//            }
//        });

//---------------------------------------------------------
//            BUTTON-CLICK AND ADDITION END
//---------------------------------------------------------


//---------------------------------------------------------
//                      LIST-VIEW
//---------------------------------------------------------


        ListView list = findViewById(R.id.list);
        Spinner spinner = findViewById(R.id.spinner1);
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoComplete);



        ArrayList <String> items = new ArrayList<>();
        String[] spinnerElemets =  {"Wadapav","Kachi Dabelo","Pizza","Pasta","Kachori"};
        items.add("Wadapav");


        ArrayAdapter <String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,items);
        ArrayAdapter <String> spinnerAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,spinnerElemets);

        list.setAdapter(adapter);
        spinner.setAdapter(spinnerAdapter);
        autoCompleteTextView.setAdapter(spinnerAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "List Click at position" + i , Toast.LENGTH_SHORT).show();
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        EditText itemData = findViewById(R.id.addElement);

        Button addElementBtn = findViewById(R.id.addElementBtn);

        addElementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                items.add(itemData.getText().toString());
                adapter.notifyDataSetChanged();
                itemData.setText("");
            }
        });

        EditText num = findViewById(R.id.positiveInput);
        Button checkPositiveBtn = findViewById(R.id.checkPositive);

        checkPositiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.valueOf(num.getText().toString());
                if(number < 0){
                    Toast.makeText(MainActivity.this, "Number is Not Valid", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Number Acccepted", Toast.LENGTH_SHORT).show();
                    int fact = 1;
                    int factOf = number;
                    while(number > 0){
                        fact =  number * fact;
                        number--;
                    }
                    Toast.makeText(MainActivity.this,"Factorial of " + factOf +" is " + fact , Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}