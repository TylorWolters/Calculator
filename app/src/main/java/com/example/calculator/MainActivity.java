package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button  ceBtn, cBtn, exponentBtn, sevenBtn, equalsBtn,
            eightBtn, nineBtn, divideBtn, fourBtn, fiveBtn,
            sixBtn, multiplyBtn, oneBtn, twoBtn, threeBtn,
            minusBtn, zeroBtn, dotBtn, plusBtn;
    EditText numberEntry, operatorChoice;
    Double numOne, numTwo, numOneIsSet, numTotal;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result.findViewById(R.id.result);
        ceBtn.findViewById(R.id.cE);
        ceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                numOne.equals(0.0);
                numOneIsSet.equals(0.0);
                numTwo.equals(0.0);
                numberEntry.setText("");
            }
        });

        cBtn.findViewById(R.id.c);
        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                numberEntry.setText("");
            }
        });

        equalsBtn.findViewById(R.id.equals);
        equalsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numOneIsSet!=1.0)
                {
                    result.setText(numberEntry+"");
                }
                else
                {
                    numTwo.equals(numberEntry);
                    switch (operatorChoice.toString()) {
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
                            result.setText(numTotal+"");
                            break;
                        case "-":
                            numTotal = (numOne - numTwo);
                            result.setText(numTotal + "");
                            break;
                        default:
                            result.setText("error!");
                    }
                }}
        });
        divideBtn.findViewById(R.id.divide);
        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numOneIsSet!=1.0) {
                    numOne.equals(numberEntry);
                    operatorChoice.setText("/");
                    numOneIsSet.equals(1.0);
                    numberEntry.equals(0.0);
                }
            }
        });
        multiplyBtn.findViewById(R.id.multiply);
        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numOneIsSet!=1.0) {
                    numOne.equals(numberEntry);
                    operatorChoice.setText("*");
                    numOneIsSet.equals(1.0);
                    numberEntry.equals(0.0);
                }
            }
        });
        minusBtn.findViewById(R.id.minus);
        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numOneIsSet!=1.0) {
                    numOne.equals(numberEntry);
                    operatorChoice.setText("-");
                    numOneIsSet.equals(1.0);
                    numberEntry.equals(0.0);
                }
            }
        });
        plusBtn.findViewById(R.id.plus);
        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numOneIsSet!=1.0) {
                    numOne.equals(numberEntry);
                    operatorChoice.setText("+");
                    numOneIsSet.equals(1.0);
                    numberEntry.equals(0.0);
                }
            }
        });
        exponentBtn.findViewById(R.id.exponent);
        exponentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numOneIsSet!=1.0) {
                    numOne.equals(numberEntry);
                    operatorChoice.setText("^");
                    numOneIsSet.equals(1.0);
                    numberEntry.equals(0.0);
                }
            }
        });

        dotBtn.findViewById(R.id.point);
        dotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEntry.append(".");
                result.setText(numberEntry+"");
            }
        });
        zeroBtn.findViewById(R.id.zero);
        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEntry.append("0");
                result.setText(numberEntry+"");
            }
        });
        oneBtn.findViewById(R.id.one);
        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEntry.append("1");
                result.setText(numberEntry+"");
            }
        });
        twoBtn.findViewById(R.id.two);
        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEntry.append("2");
                result.setText(numberEntry+"");
            }
        });
        threeBtn.findViewById(R.id.three);
        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEntry.append("3");
                result.setText(numberEntry+"");
            }
        });
        fourBtn.findViewById(R.id.four);
        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEntry.append("4");
                result.setText(numberEntry+"");
            }
        });
        fiveBtn.findViewById(R.id.five);
        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEntry.append("5");
                result.setText(numberEntry+"");
            }
        });
        sixBtn.findViewById(R.id.six);
        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEntry.append("6");
                result.setText(numberEntry+"");
            }
        });
        sevenBtn.findViewById(R.id.seven);
        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEntry.append("7");
                result.setText(numberEntry+"");
            }
        });
        eightBtn.findViewById(R.id.eight);
        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEntry.append("8");
                result.setText(numberEntry+"");
            }
        });
        nineBtn.findViewById(R.id.nine);
        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEntry.append("9");
                result.setText(numberEntry+"");
            }
        });






    }}
