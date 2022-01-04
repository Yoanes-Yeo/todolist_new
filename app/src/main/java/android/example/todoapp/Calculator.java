package android.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    TextView answer, Main;
    EditText editText1, editText2;
    Button add, subtract, multiply, divide, ANS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        answer = findViewById(R.id.answer);
        Main = findViewById(R.id.Main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);

        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        ANS = findViewById(R.id.ANS);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operation op = new Operation();
                if (editText1.getText().toString().isEmpty() || editText2.getText().toString().isEmpty()) {
                    Toast toast = Toast.makeText(getApplicationContext(),"Please enter a value...",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(),"Perform Addition",Toast.LENGTH_SHORT);
                    toast.show();
                    op.Add();
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operation op = new Operation();
                if (editText1.getText().toString().isEmpty() || editText2.getText().toString().isEmpty()) {
                    Toast toast = Toast.makeText(getApplicationContext(),"Please enter a value...",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(),"Perform Subtraction",Toast.LENGTH_SHORT);
                    toast.show();
                    op.Subtract();
                }

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operation op = new Operation();
                if (editText1.getText().toString().isEmpty() || editText2.getText().toString().isEmpty()) {
                    Toast toast = Toast.makeText(getApplicationContext(),"Please enter a value...",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(),"Perform Multiplication",Toast.LENGTH_SHORT);
                    toast.show();
                    op.Multiply();
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operation op = new Operation();
                if (editText1.getText().toString().isEmpty() || editText2.getText().toString().isEmpty()) {
                    Toast toast = Toast.makeText(getApplicationContext(),"Please enter a value...",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(),"Perform Division",Toast.LENGTH_SHORT);
                    toast.show();
                    op.Divide();
                }
            }
        });

        ANS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer.getText().toString() != "") {
                    editText1.setText(answer.getText());
                    editText2.setText("");
                }
            }
        });
    }

    public class Operation {

        String input1 = editText1.getText().toString();
        String input2 = editText2.getText().toString();

        public void Add() {
            double pos1 = Double.parseDouble(input1);
            double pos2 = Double.parseDouble(input2);
            double sum = pos1 + pos2;
            answer.setText("" + sum);
        }

        public void Subtract() {
            double pos1 = Double.parseDouble(input1);
            double pos2 = Double.parseDouble(input2);
            double difference = pos1 - pos2;
            answer.setText("" + difference);
        }

        public void Multiply() {
            double pos1 = Double.parseDouble(input1);
            double pos2 = Double.parseDouble(input2);
            double product = pos1 * pos2;
            answer.setText("" + product);
        }

        public void Divide() {
            double pos1 = Double.parseDouble(input1);
            double pos2 = Double.parseDouble(input2);
            double quotient = pos1 / pos2;
            answer.setText("" + quotient);
        }

    }
}
