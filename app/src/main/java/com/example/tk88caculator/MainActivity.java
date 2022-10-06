package com.example.tk88caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine,
            btnPlus, btnMinus, btnMultiply, btnDivide, btnResult, btn_phay, btnC, btnBracketLeft, btnBracketRight;
    private EditText edInput;
    private ImageButton btnAC;
    private TextView tvResult;

    private StringBuilder sbInput;
    private int countBracketLeft = 0;
    private int countBracketRight = 0;
    private int isCheck = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sbInput = new StringBuilder();
        init();
    }

    private void init() {
        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnResult = findViewById(R.id.btnResult);
        btn_phay = findViewById(R.id.btn_phay);
        btnC = findViewById(R.id.btnC);
        btnAC = findViewById(R.id.btnAC);
        btnBracketLeft = findViewById(R.id.btnBracketLeft);
        btnBracketRight = findViewById(R.id.btnBracketRight);
        edInput = findViewById(R.id.edInput);
        tvResult = findViewById(R.id.tvResult);

        btnZero.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnResult.setOnClickListener(this);
        btn_phay.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnAC.setOnClickListener(this);
        btnBracketLeft.setOnClickListener(this);
        btnBracketRight.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnZero:
                if (sbInput.length() == 0) {
                    sbInput.append("0");
                } else {
                    if (sbInput.charAt(sbInput.length() - 1) == ')') {
                        sbInput.append("*0");
                    } else {
                        sbInput.append("0");
                    }
                }
                edInput.setText(sbInput.toString());
                break;
            case R.id.btnOne:
                if (sbInput.length() == 0) {
                    sbInput.append("1");
                } else {
                    if (sbInput.charAt(sbInput.length() - 1) == ')') {
                        sbInput.append("*1");
                    } else {
                        sbInput.append("1");
                    }
                }
                edInput.setText(sbInput.toString());
                break;
            case R.id.btnTwo:
                if (sbInput.length() == 0) {
                    sbInput.append("2");
                } else {
                    if (sbInput.charAt(sbInput.length() - 1) == ')') {
                        sbInput.append("*2");
                    } else {
                        sbInput.append("2");
                    }
                }
                edInput.setText(sbInput.toString());
                break;
            case R.id.btnThree:
                if (sbInput.length() == 0) {
                    sbInput.append("3");
                } else {
                    if (sbInput.charAt(sbInput.length() - 1) == ')') {
                        sbInput.append("*3");
                    } else {
                        sbInput.append("3");
                    }
                }
                edInput.setText(sbInput.toString());
                break;
            case R.id.btnFour:
                if (sbInput.length() == 0) {
                    sbInput.append("4");
                } else {
                    if (sbInput.charAt(sbInput.length() - 1) == ')') {
                        sbInput.append("*4");
                    } else {
                        sbInput.append("4");
                    }
                }
                edInput.setText(sbInput.toString());
                break;
            case R.id.btnFive:
                if (sbInput.length() == 0) {
                    sbInput.append("5");
                } else {
                    if (sbInput.charAt(sbInput.length() - 1) == ')') {
                        sbInput.append("*5");
                    } else {
                        sbInput.append("5");
                    }
                }
                edInput.setText(sbInput.toString());
                break;
            case R.id.btnSix:
                if (sbInput.length() == 0) {
                    sbInput.append("6");
                } else {
                    if (sbInput.charAt(sbInput.length() - 1) == ')') {
                        sbInput.append("*6");
                    } else {
                        sbInput.append("6");
                    }
                }
                edInput.setText(sbInput.toString());
                break;
            case R.id.btnSeven:
                if (sbInput.length() == 0) {
                    sbInput.append("7");
                } else {
                    if (sbInput.charAt(sbInput.length() - 1) == ')') {
                        sbInput.append("*7");
                    } else {
                        sbInput.append("7");
                    }
                }
                edInput.setText(sbInput.toString());
                break;
            case R.id.btnEight:
                if (sbInput.length() == 0) {
                    sbInput.append("8");
                } else {
                    if (sbInput.charAt(sbInput.length() - 1) == ')') {
                        sbInput.append("*8");
                    } else {
                        sbInput.append("8");
                    }
                }
                edInput.setText(sbInput.toString());
                break;
            case R.id.btnNine:
                if (sbInput.length() == 0) {
                    sbInput.append("9");
                } else {
                    if (sbInput.charAt(sbInput.length() - 1) == ')') {
                        sbInput.append("*9");
                    } else {
                        sbInput.append("9");
                    }
                }
                edInput.setText(sbInput.toString());
                break;
            case R.id.btnPlus:
                if (sbInput.length() != 0) {
                    if (sbInput.charAt(sbInput.length() - 1) >= '0' && sbInput.charAt(sbInput.length() - 1) <= '9' || sbInput.charAt(sbInput.length() - 1) == '.') {
                        if (sbInput.charAt(sbInput.length() - 1) >= '0' && sbInput.charAt(sbInput.length() - 1) <= '9') {
                            sbInput.append("+");
                        }
                        if (sbInput.charAt(sbInput.length() - 1) == '.') {
                            sbInput.append("0+");
                        }
                    }
                    if (sbInput.charAt(sbInput.length() - 1) == ')') {
                        sbInput.append("+");
                    }
                }
                edInput.setText(sbInput.toString());
                break;
            case R.id.btnMinus:
                if (sbInput.length() != 0) {
                    if (sbInput.charAt(sbInput.length() - 1) >= '0' && sbInput.charAt(sbInput.length() - 1) <= '9' || sbInput.charAt(sbInput.length() - 1) == '.') {
                        if (sbInput.charAt(sbInput.length() - 1) >= '0' && sbInput.charAt(sbInput.length() - 1) <= '9') {
                            sbInput.append("-");
                        }
                        if (sbInput.charAt(sbInput.length() - 1) == '.') {
                            sbInput.append("0-");
                        }
                    } else if (sbInput.charAt(sbInput.length() - 1) == ')') {
                        sbInput.append("-");
                    } else if (sbInput.charAt(sbInput.length() - 1) == '(') {
                        sbInput.append("(-");
                    } else if (sbInput.charAt(sbInput.length() - 1) == '+' || sbInput.charAt(sbInput.length() - 1) == '-' || sbInput.charAt(sbInput.length() - 1) == '*' || sbInput.charAt(sbInput.length() - 1) == '/') {
                        sbInput.append("(-");
                    }
                } else {
                    sbInput.append("(-");
                }
                edInput.setText(sbInput.toString());
                break;
            case R.id.btnMultiply:
                if (sbInput.length() != 0) {
                    if (sbInput.charAt(sbInput.length() - 1) >= '0' && sbInput.charAt(sbInput.length() - 1) <= '9' || sbInput.charAt(sbInput.length() - 1) == '.') {
                        if (sbInput.charAt(sbInput.length() - 1) >= '0' && sbInput.charAt(sbInput.length() - 1) <= '9') {
                            sbInput.append("*");
                        }
                        if (sbInput.charAt(sbInput.length() - 1) == '.') {
                            sbInput.append("0*");
                        }
                    }
                    if (sbInput.charAt(sbInput.length() - 1) == ')') {
                        sbInput.append("*");
                    }
                }
                edInput.setText(sbInput.toString());
                break;
            case R.id.btnDivide:
                if (sbInput.length() != 0) {
                    if (sbInput.charAt(sbInput.length() - 1) >= '0' && sbInput.charAt(sbInput.length() - 1) <= '9' || sbInput.charAt(sbInput.length() - 1) == '.') {
                        if (sbInput.charAt(sbInput.length() - 1) >= '0' && sbInput.charAt(sbInput.length() - 1) <= '9') {
                            sbInput.append("/");
                        }
                        if (sbInput.charAt(sbInput.length() - 1) == '.') {
                            sbInput.append("0/");
                        }
                    }
                    if (sbInput.charAt(sbInput.length() - 1) == ')') {
                        sbInput.append("/");
                    }
                }
                edInput.setText(sbInput.toString());
                break;
            case R.id.btnC:
                sbInput = sbInput.delete(0, sbInput.length());
                edInput.setText(sbInput.toString());
                tvResult.setText("0");
                break;
            case R.id.btnAC:
                if (sbInput.length() != 0 && isCheck == 0) {
                    if (sbInput.charAt(sbInput.length() - 1) == '-' && sbInput.charAt(sbInput.length() - 2) == '(' || sbInput.charAt(sbInput.length() - 1) == '.' && sbInput.charAt(sbInput.length() - 2) == '0') {
                        sbInput = sbInput.deleteCharAt(sbInput.length() - 1);
                        sbInput = sbInput.deleteCharAt(sbInput.length() - 1);
                    } else {
                        sbInput = sbInput.deleteCharAt(sbInput.length() - 1);
                    }
                } else if (sbInput.length() != 0 && isCheck == 1) {
                    sbInput = sbInput.delete(0, sbInput.length());
                }
                edInput.setText(sbInput.toString());
                isCheck = 0;
                break;
            case R.id.btnBracketLeft:
                if (sbInput.length() > 0 && (sbInput.charAt(sbInput.length() - 1) >= '0' && sbInput.charAt(sbInput.length() - 1) <= '9')) {
                    sbInput = sbInput.append("*(");
                }
                sbInput.append("(");
                if (sbInput.length() > 0 && (sbInput.charAt(sbInput.length() - 1) == '*' || sbInput.charAt(sbInput.length() - 1) == '/' || sbInput.charAt(sbInput.length() - 1) == '+' || sbInput.charAt(sbInput.length() - 1) == '-')) {
                    sbInput = sbInput.append("(");
                }
                edInput.setText(sbInput.toString());
                break;
            case R.id.btnBracketRight:
                int count_num = 0;
                countBracketLeft = countBracketRight = 0;
                if (sbInput.length() != 0) {
                    for (int i = sbInput.length() - 1; i >= 0; i--) {
                        if (countBracketLeft == 0 && (sbInput.charAt(i) >= '0' && sbInput.charAt(i) <= '9')) {
                            count_num++;
                        }
                        if (sbInput.charAt(i) == '(') {
                            countBracketLeft++;

                        }
                        if (sbInput.charAt(i) == ')') {
                            countBracketRight++;
                        }
                    }
                    if ((countBracketLeft > countBracketRight) && count_num > 0) {
                        if (sbInput.charAt(sbInput.length() - 1) != '-' && sbInput.charAt(sbInput.length() - 1) != '+' && sbInput.charAt(sbInput.length() - 1) != '*' && sbInput.charAt(sbInput.length() - 1) != '/') {
                            sbInput.append(")");
                        }
                    }
                }
                edInput.setText(sbInput.toString());
                break;
            case R.id.btn_phay:
                int apps = 0;
                if (sbInput.length() != 0) {
                    if (sbInput.charAt(sbInput.length() - 1) >= '0' && sbInput.charAt(sbInput.length() - 1) <= '9') {
                        for (int i = sbInput.length() - 2; i >= 0; i--) {
                            if (sbInput.charAt(i) == '.') {
                                apps = 1;
                                break;
                            } else if (sbInput.charAt(i) == '(' || sbInput.charAt(i) == '+' || sbInput.charAt(i) == '-' || sbInput.charAt(i) == '*' || sbInput.charAt(i) == '/') {
                                break;
                            }
                        }
                        if (apps == 0) {
                            sbInput.append(".");
                        }
                    }
                    if (sbInput.charAt(sbInput.length() - 1) == '(' || sbInput.charAt(sbInput.length() - 1) == ')') {
                        if (sbInput.charAt(sbInput.length() - 1) == ')') {
                            sbInput.append("*0.");
                        } else {
                            sbInput.append("0.");
                        }
                    }
                    if (sbInput.charAt(sbInput.length() - 1) == '*' || sbInput.charAt(sbInput.length() - 1) == '/' || sbInput.charAt(sbInput.length() - 1) == '+' || sbInput.charAt(sbInput.length() - 1) == '-') {
                        sbInput.append("0.");
                    }
                } else {
                    sbInput.append("0.");
                }
                edInput.setText(sbInput.toString());
                break;
            case R.id.btnResult:
                int count_left = 0;
                int count_right = 0;
                if (sbInput.length() != 0) {
                    for (int i = sbInput.length() - 1; i >= 0; i--) {
                        if (sbInput.charAt(i) == ')') {
                            count_right++;
                        }
                        if (sbInput.charAt(i) == '(') {
                            count_left++;
                        }
                    }
                    if (count_left != count_right) {
                        Toast.makeText(MainActivity.this, "Vui lòng kiểm tra dấu ngoặc !!!", Toast.LENGTH_SHORT).show();
                    }
                    if (count_left == count_right && (sbInput.charAt(sbInput.length() - 1) >= '0' && sbInput.charAt(sbInput.length() - 1) <= '9') || sbInput.charAt(sbInput.length() - 1) == ')') {
                        try {
                            tvResult.setText("= " + Calculator.isCalculator(Calculator.isSuffix(sbInput)));
                            isCheck = 1;
                            sbInput = sbInput.delete(0, sbInput.length());
                            sbInput.append(tvResult.getText().toString());
                        } catch (Exception e) {
                            tvResult.setText("Error!!!");
                            sbInput = sbInput.delete(0, sbInput.length());
                        }
                    }
                }
                break;
        }
    }
}