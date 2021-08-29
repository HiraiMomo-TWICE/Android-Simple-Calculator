package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Skeleton of an Android Things activity.
 * <p>
 * Android Things peripheral APIs are accessible through the PeripheralManager
 * For example, the snippet below will open a GPIO pin and set it to HIGH:
 * <p>
 * PeripheralManager manager = PeripheralManager.getInstance();
 * try {
 * Gpio gpio = manager.openGpio("BCM6");
 * gpio.setDirection(Gpio.DIRECTION_OUT_INITIALLY_LOW);
 * gpio.setValue(true);
 * } catch (IOException e) {
 * Log.e(TAG, "Unable to access GPIO");
 * }
 * <p>
 * You can find additional examples on GitHub: https://github.com/androidthings
 */
public class MainActivity extends Activity implements View.OnClickListener {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAddition, buttonSubtract, buttonMultiply,
            buttonDivision, buttonReset, buttonEqual, buttonDot, buttonAbsolute, buttonPercentage;

    TextView txtView;

    Double oldNumber, newNumber;

    boolean addition, subtract, multiply, division, decidot = true, newOperator = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //#region Create number buttons
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        //#endregion

        //#region Create formula buttons
        buttonAddition = (Button) findViewById(R.id.addition);
        buttonSubtract = (Button) findViewById(R.id.subtract);
        buttonMultiply = (Button) findViewById(R.id.multiply);
        buttonDivision = (Button) findViewById(R.id.division);
        buttonAbsolute = (Button) findViewById(R.id.absolute);
        buttonPercentage = (Button) findViewById(R.id.percentage);
        buttonEqual = (Button) findViewById(R.id.equal);
        buttonDot = (Button) findViewById(R.id.dot);
        //#endregion

        //#region Create reset button
        buttonReset = (Button) findViewById(R.id.reset);
        //#endregion

        //#region Text View
        txtView = (TextView) findViewById(R.id.textView);
        //#endregion

        //#region Set EventListener for number buttons
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        //#endregion

        //#region Set EventListener for formula buttons
        buttonAddition.setOnClickListener(this);
        buttonSubtract.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);
        buttonAbsolute.setOnClickListener(this);
        buttonPercentage.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        //#endregion

        //#region SetEventListener for reset buttons
        buttonReset.setOnClickListener(this);
        //#endregion
    }

    // One function for multiple buttons event click
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0:
                if (txtView.getText().length() < 10) {
                    txtView.setText(txtView.getText() + "0");
                    newOperator = true;
                    break;
                }
                break;
            case R.id.button1:
                if (txtView.getText().length() < 10) {
                    txtView.setText(txtView.getText() + "1");
                    newOperator = true;
                    break;
                }
                break;
            case R.id.button2:
                if (txtView.getText().length() < 10) {
                    txtView.setText(txtView.getText() + "2");
                    newOperator = true;
                    break;
                }
                break;
            case R.id.button3:
                if (txtView.getText().length() < 10) {
                    txtView.setText(txtView.getText() + "3");
                    newOperator = true;
                    break;
                }
                break;
            case R.id.button4:
                if (txtView.getText().length() < 10) {
                    txtView.setText(txtView.getText() + "4");
                    newOperator = true;
                    break;
                }
                break;
            case R.id.button5:
                if (txtView.getText().length() < 10) {
                    txtView.setText(txtView.getText() + "5");
                    newOperator = true;
                    break;
                }
                break;
            case R.id.button6:
                if (txtView.getText().length() <= 10) {
                    txtView.setText(txtView.getText() + "6");
                    newOperator = true;
                    break;
                }
                break;
            case R.id.button7:
                if (txtView.getText().length() < 10) {
                    txtView.setText(txtView.getText() + "7");
                    newOperator = true;
                    break;
                }
                break;
            case R.id.button8:
                if (txtView.getText().length() < 10) {
                    txtView.setText(txtView.getText() + "8");
                    newOperator = true;
                    break;
                }
                break;
            case R.id.button9:
                if (txtView.getText().length() < 10) {
                    txtView.setText(txtView.getText() + "9");
                    newOperator = true;
                    break;
                }
                break;
            case R.id.addition:
                if (txtView == null || newOperator == false) {
                    txtView.setText("");
                } else {
                    oldNumber = Double.parseDouble(txtView.getText() + "");
                    addition = true;
                    txtView.setText(null);
                    decidot = true;
                    newOperator = false;
                }
                break;
            case R.id.subtract:
                if (txtView == null || newOperator == false) {
                    txtView.setText("");
                } else {
                    oldNumber = Double.parseDouble(txtView.getText() + "");
                    subtract = true;
                    txtView.setText(null);
                    decidot = true;
                    newOperator = false;
                }
                break;
            case R.id.multiply:
                if (txtView == null || newOperator == false) {
                    txtView.setText("");
                } else {
                    oldNumber = Double.parseDouble(txtView.getText() + "");
                    multiply = true;
                    txtView.setText(null);
                    decidot = true;
                    newOperator = false;
                }
                break;
            case R.id.division:
                if (txtView == null || newOperator == false) {
                    txtView.setText("");
                } else {
                    oldNumber = Double.parseDouble(txtView.getText() + "");
                    division = true;
                    txtView.setText(null);
                    decidot = true;
                    newOperator = false;
                }
                break;
            case R.id.absolute:
                if (txtView == null || newOperator == false) {
                    txtView.setText("");
                } else {
                    Double temp = Double.parseDouble(txtView.getText() + "");
                    txtView.setText(temp * (-1) + "");
                    newOperator = false;
                }
                break;
            case R.id.percentage:
                if (txtView == null || newOperator == false) {
                    txtView.setText("");
                } else {
                    Double temp = Double.parseDouble(txtView.getText() + "");
                    txtView.setText(temp * 0.01 + "");
                    decidot = true;
                    newOperator = false;
                }
                break;
            case R.id.equal:
                newNumber = Double.parseDouble(txtView.getText() + "");

                if (addition) {
                    txtView.setText(oldNumber + newNumber + "");
                    addition = false;
                } else if (subtract) {
                    txtView.setText(oldNumber - newNumber + "");
                    subtract = false;
                } else if (multiply) {
                    txtView.setText(oldNumber * newNumber + "");
                    multiply = false;
                } else if (division) {
                    txtView.setText(oldNumber / newNumber + "");
                    division = false;
                }
                decidot = true;
                newOperator = true;

                break;

            case R.id.reset:
                txtView.setText("");
                decidot = true;
                newOperator = true;
                break;

            case R.id.dot:
                if (decidot) {
                    if (txtView.getText() == null) {
                        txtView.setText("0.");
                    } else {
                        txtView.setText(txtView.getText() + ".");
                    }
                }
                decidot = false;
                break;
        }
    }
}