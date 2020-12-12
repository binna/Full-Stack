package com.lec.android.a003_widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText etResult;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btn_div, btn_mul, btn_sub, btn_add;
    Button btn_et_result, btn_del;

    // 피연산자
    String cal1 = "";
    String cal2 = "";

    // 연산자
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etResult = findViewById(R.id.etResult);

        // 숫자
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        // 연산자
        btn_div = findViewById(R.id.btn_div);
        btn_mul = findViewById(R.id.btn_mul);
        btn_sub = findViewById(R.id.btn_sub);
        btn_add = findViewById(R.id.btn_add);

        // 결과, 지우기
        btn_et_result = findViewById(R.id.btn_et_result);
        btn_del = findViewById(R.id.btn_del);

        btn_et_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal2 = etResult.getText().toString();
                if (operator.equals("") || cal1.equals("") || cal2.equals("")) {
                    return;
                }
                double result = 0;

                try {
                    if (operator.equals("+")) {
                        result = Double.parseDouble(cal1) + Double.parseDouble(cal2);
                        etResult.setText(String.valueOf(result));
                    } else if (operator.equals("-")) {
                        result = Double.parseDouble(cal1) - Double.parseDouble(cal2);
                        etResult.setText(String.valueOf(result));
                    } else if (operator.equals("X")) {
                        result = Double.parseDouble(cal1) * Double.parseDouble(cal2);
                        etResult.setText(String.valueOf(result));
                    } else {
                        result = Double.parseDouble(cal1) / Double.parseDouble(cal2);
                        etResult.setText(String.valueOf(result));
                    }

                } catch (Exception e) {
                    etResult.setText("");

                } finally {
                    cal1 = "";
                    cal2 = "";
                    operator = "";
                }
            }
        });

        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText("");
            }
        });

        // 숫자 버튼 리스너
        class numberListener implements View.OnClickListener {
            @Override
            public void onClick(View v) {
                String text = (String) ((Button) v).getText();
                etResult.setText(etResult.getText().append(text));
            }
        }

        // 피연산자 리스너
        class calListener implements View.OnClickListener {
            @Override
            public void onClick(View v) {
                cal1 = etResult.getText().toString();
                operator = (String) ((Button) v).getText();
                etResult.setText("");
            }
        }

        btn0.setOnClickListener(new numberListener());
        btn1.setOnClickListener(new numberListener());
        btn2.setOnClickListener(new numberListener());
        btn3.setOnClickListener(new numberListener());
        btn4.setOnClickListener(new numberListener());
        btn5.setOnClickListener(new numberListener());
        btn6.setOnClickListener(new numberListener());
        btn7.setOnClickListener(new numberListener());
        btn8.setOnClickListener(new numberListener());
        btn9.setOnClickListener(new numberListener());
        btn_add.setOnClickListener(new calListener());
        btn_sub.setOnClickListener(new calListener());
        btn_mul.setOnClickListener(new calListener());
        btn_div.setOnClickListener(new calListener());

    } // end onCreate()

} // end Activity