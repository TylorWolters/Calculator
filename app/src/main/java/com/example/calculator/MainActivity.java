package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button  ceBtn, cBtn, exponentBtn, sevenBtn, equalsBtn,
            eightBtn, nineBtn, divideBtn, fourBtn, fiveBtn,
            sixBtn, multiplyBtn, oneBtn, twoBtn, threeBtn,
            minusBtn, zeroBtn, dotBtn, plusBtn;
    String operatorChoice;
    Double numOne, numTwo, numOneIsSet, isCalculated, numTotal;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numOne = 0.0;
        numTwo = 0.0;
        isCalculated = 0.0;
        numOneIsSet = 0.0;
        result = findViewById(R.id.result);
        ceBtn = findViewById(R.id.cE);
        ceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                numOne = 0.0;
                numOneIsSet = 0.0;
                numTwo = 0.0;
                isCalculated = 0.0;
            }
        });

        cBtn = findViewById(R.id.c);
        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                if(isCalculated == 1.0){
                    numOne = 0.0;
                    numOneIsSet = 0.0;
                    numTwo = 0.0;
                }
            }
        });

        equalsBtn = findViewById(R.id.equals);
        equalsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numOneIsSet!=1.0){
                }
                else
                {
                    numTwo = Double.parseDouble(result.getText().toString());
                    switch (operatorChoice) {
                        case "*":
                            numTotal = (numOne * numTwo);
                            result.setText(numTotal+"");
                            break;
                        case "/":
                            if (numTwo == 0)
                                result.setText("divide by 0 error");
                            else {
                                numTotal = (numOne / numTwo);
                                result.setText(numTotal + "");
                            }
                            break;
                        case "+":
                            numTotal = (numOne + numTwo);
                            result.setText(numTotal + "");
                            break;
                        case "^":
                            numTotal = Math.pow(numOne,numTwo);
                            result.setText(numTotal + "");
                            break;
                        case "-":
                            numTotal = (numOne - numTwo);
                            result.setText(numTotal + "");
                            break;
                        default:
                            result.setText("error!");
                    }
                    isCalculated = 1.0;
                }}
        });
        divideBtn = findViewById(R.id.divide);
        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numOneIsSet!=1.0) {
                    numOne = Double.parseDouble(result.getText().toString());
                    operatorChoice = "/";
                    numOneIsSet =1.0;
                    result.setText("");
                }
            }
        });
        multiplyBtn = findViewById(R.id.multiply);
        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numOneIsSet!=1.0) {
                    numOne = Double.parseDouble(result.getText().toString());
                    operatorChoice = "*";
                    numOneIsSet =1.0;
                    result.setText("");
                }
            }
        });
        minusBtn = findViewById(R.id.minus);
        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numOneIsSet!=1.0) {
                    numOne = Double.parseDouble(result.getText().toString());
                    operatorChoice = "-";
                    numOneIsSet = 1.0;
                    result.setText("");
                }
            }
        });
        plusBtn = findViewById(R.id.plus);
        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numOneIsSet!=1.0) {
                    numOne = Double.parseDouble(result.getText().toString());
                    operatorChoice = "+";
                    numOneIsSet = 1.0;
                    result.setText("");
                }
            }
        });
        exponentBtn = findViewById(R.id.exponent);
        exponentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numOneIsSet!=1.0) {
                    numOne = Double.parseDouble(result.getText().toString());
                    operatorChoice = "^";
                    numOneIsSet =1.0;
                    result.setText("");
                }
            }
        });

        dotBtn = findViewById(R.id.point);
        dotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append(".");
            }
        });
        zeroBtn = findViewById(R.id.zero);
        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("0");
            }
        });
        oneBtn = findViewById(R.id.one);
        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("1");
            }
        });
        twoBtn = findViewById(R.id.two);
        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("2");
            }
        });
        threeBtn = findViewById(R.id.three);
        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("3");
            }
        });
        fourBtn = findViewById(R.id.four);
        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("4");
            }
        });
        fiveBtn = findViewById(R.id.five);
        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("5");
            }
        });
        sixBtn = findViewById(R.id.six);
        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("6");
            }
        });
        sevenBtn = findViewById(R.id.seven);
        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("7");
            }
        });
        eightBtn = findViewById(R.id.eight);
        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("8");
            }
        });
        nineBtn = findViewById(R.id.nine);
        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("9");
            }
        });






    }}
