package com.otabekkurbonov.discountcalculator;

import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button fivePercentDiscount, tenPercentDiscount, fiveTeenPercentDiscount, twentyPercentDiscount,
            twentyFivePercentDiscount, thirtyPercentDiscount, thirtyFivePercentDiscount, fortyPercentDiscount,
            fortyFivePercentDiscount, fiftyPercentDiscount, fiftyFivePercentDiscount, sixtyPercentDiscount,
            sixtyFivePercentDiscount, seventyPercentDiscount, seventyFivePercentDiscount, eightyPercentDiscount,

    fivePercentDiscountBotRow, tenPercentDiscountBotRow, fiveTeenPercentDiscountBotRow, twentyPercentDiscountBotRow,
            twentyFivePercentDiscountBotRow, thirtyPercentDiscountBotRow, thirtyFivePercentDiscountBotRow,
            fortyPercentDiscountBotRow, fortyFivePercentDiscountBotRow, fiftyPercentDiscountBotRow, fiftyFivePercentDiscountBotRow,
            sixtyPercentDiscountBotRow, sixtyFivePercentDiscountBotRow, seventyPercentDiscountBotRow,
            seventyFivePercentDiscountBotRow, eightyPercentDiscountBotRow,

    calc, clearOfAllCalc;

    EditText totalPriceGoesHere, manuallyEnteringTaxPercent;

    TextView outComeOfAll;

    private Button discountButton1, discountButton2;

    private double orig_price = 0.0;
    private double orig_Tax = 0.0;
    private double discountOne = 0;
    private double discountTwo = 0;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //top row
        fivePercentDiscount = (Button) findViewById(R.id.fivePercentDiscount);
        tenPercentDiscount = (Button) findViewById(R.id.tenPercentDiscount);
        fiveTeenPercentDiscount = (Button) findViewById(R.id.fiveTeenPercentDiscount);
        twentyPercentDiscount = (Button) findViewById(R.id.twentyPercentDiscount);
        twentyFivePercentDiscount = (Button) findViewById(R.id.twentyFivePercentDiscount);
        thirtyPercentDiscount = (Button) findViewById(R.id.thirtyPercentDiscount);
        thirtyFivePercentDiscount = (Button) findViewById(R.id.thirtyFivePercentDiscount);
        fortyPercentDiscount = (Button) findViewById(R.id.fortyPercentDiscount);
        fortyFivePercentDiscount = (Button) findViewById(R.id.fortyFivePercentDiscount);
        fiftyPercentDiscount = (Button) findViewById(R.id.fiftyPercentDiscount);
        fiftyFivePercentDiscount = (Button) findViewById(R.id.fiftyFivePercentDiscount);
        sixtyPercentDiscount = (Button) findViewById(R.id.sixtyPercentDiscount);
        sixtyFivePercentDiscount = (Button) findViewById(R.id.sixtyFivePercentDiscount);
        seventyPercentDiscount = (Button) findViewById(R.id.seventyPercentDiscount);
        seventyFivePercentDiscount = (Button) findViewById(R.id.seventyFivePercentDiscount);
        eightyPercentDiscount = (Button) findViewById(R.id.eightyPercentDiscount);

        //bot row
        fivePercentDiscountBotRow = (Button) findViewById(R.id.fivePercentDiscountBotRow);
        tenPercentDiscountBotRow = (Button) findViewById(R.id.tenPercentDiscountBotRow);
        fiveTeenPercentDiscountBotRow = (Button) findViewById(R.id.fiveTeenPercentDiscountBotRow);
        twentyPercentDiscountBotRow = (Button) findViewById(R.id.twentyPercentDiscountBotRow);
        twentyFivePercentDiscountBotRow = (Button) findViewById(R.id.twentyFivePercentDiscountBotRow);
        thirtyPercentDiscountBotRow = (Button) findViewById(R.id.thirtyPercentDiscountBotRow);
        thirtyFivePercentDiscountBotRow = (Button) findViewById(R.id.thirtyFivePercentDiscountBotRow);
        fortyPercentDiscountBotRow = (Button) findViewById(R.id.fortyPercentDiscountBotRow);
        fortyFivePercentDiscountBotRow = (Button) findViewById(R.id.fortyFivePercentDiscountBotRow);
        fiftyPercentDiscountBotRow = (Button) findViewById(R.id.fiftyPercentDiscountBotRow);
        fiftyFivePercentDiscountBotRow = (Button) findViewById(R.id.fiftyFivePercentDiscountBotRow);
        sixtyPercentDiscountBotRow = (Button) findViewById(R.id.sixtyPercentDiscountBotRow);
        sixtyFivePercentDiscountBotRow = (Button) findViewById(R.id.sixtyFivePercentDiscountBotRow);
        seventyPercentDiscountBotRow = (Button) findViewById(R.id.seventyPercentDiscountBotRow);
        seventyFivePercentDiscountBotRow = (Button) findViewById(R.id.seventyFivePercentDiscountBotRow);
        eightyPercentDiscountBotRow = (Button) findViewById(R.id.eightyPercentDiscountBotRow);

        calc = (Button) findViewById(R.id.calc);

        totalPriceGoesHere = (EditText) findViewById(R.id.totalPriceGoesHere);
        manuallyEnteringTaxPercent = (EditText) findViewById(R.id.manuallyEnteringTaxPercent);

        outComeOfAll = (TextView) findViewById(R.id.outComeOfAll);

        try {
            fivePercentDiscount.setOnClickListener(this);
            tenPercentDiscount.setOnClickListener(this);
            fiveTeenPercentDiscount.setOnClickListener(this);
            twentyPercentDiscount.setOnClickListener(this);
            twentyFivePercentDiscount.setOnClickListener(this);
            thirtyPercentDiscount.setOnClickListener(this);
            thirtyFivePercentDiscount.setOnClickListener(this);
            fortyPercentDiscount.setOnClickListener(this);
            fortyFivePercentDiscount.setOnClickListener(this);
            fiftyPercentDiscount.setOnClickListener(this);
            fiftyFivePercentDiscount.setOnClickListener(this);
            sixtyPercentDiscount.setOnClickListener(this);
            sixtyFivePercentDiscount.setOnClickListener(this);
            seventyPercentDiscount.setOnClickListener(this);
            seventyFivePercentDiscount.setOnClickListener(this);
            eightyPercentDiscount.setOnClickListener(this);

            fivePercentDiscountBotRow.setOnClickListener(this);
            tenPercentDiscountBotRow.setOnClickListener(this);
            fiveTeenPercentDiscountBotRow.setOnClickListener(this);
            twentyPercentDiscountBotRow.setOnClickListener(this);
            twentyFivePercentDiscountBotRow.setOnClickListener(this);
            thirtyPercentDiscountBotRow.setOnClickListener(this);
            thirtyFivePercentDiscountBotRow.setOnClickListener(this);
            fortyPercentDiscountBotRow.setOnClickListener(this);
            fortyFivePercentDiscountBotRow.setOnClickListener(this);
            fiftyPercentDiscountBotRow.setOnClickListener(this);
            fiftyFivePercentDiscountBotRow.setOnClickListener(this);
            sixtyPercentDiscountBotRow.setOnClickListener(this);
            sixtyFivePercentDiscountBotRow.setOnClickListener(this);
            seventyPercentDiscountBotRow.setOnClickListener(this);
            seventyFivePercentDiscountBotRow.setOnClickListener(this);
            eightyPercentDiscountBotRow.setOnClickListener(this);

            clearOfAllCalc.setOnClickListener(this);
            calc.setOnClickListener(this);
        } catch (Exception e) {
            System.out.print(e);
        }
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onClick(View arg0) {

        switch (arg0.getId()) {

            //top row
            case R.id.fivePercentDiscount:
                discountOne = .05;
                changeDiscount1Color(fivePercentDiscount);
                break;

            case R.id.tenPercentDiscount:
                discountOne = .10;
                changeDiscount1Color(tenPercentDiscount);
                break;

            case R.id.fiveTeenPercentDiscount:
                discountOne = .15;
                changeDiscount1Color(fiveTeenPercentDiscount);
                break;

            case R.id.twentyPercentDiscount:
                discountOne = .20;
                changeDiscount1Color(twentyPercentDiscount);
                break;

            case R.id.twentyFivePercentDiscount:
                discountOne = .25;
                changeDiscount1Color(twentyFivePercentDiscount);
                break;

            case R.id.thirtyPercentDiscount:
                discountOne = .30;
                changeDiscount1Color(thirtyPercentDiscount);
                break;

            case R.id.thirtyFivePercentDiscount:
                discountOne = .35;
                changeDiscount1Color(thirtyFivePercentDiscount);

                break;

            case R.id.fortyPercentDiscount:
                discountOne = .40;
                changeDiscount1Color(fortyPercentDiscount);
                break;

            case R.id.fortyFivePercentDiscount:
                discountOne = .45;
                changeDiscount1Color(fortyFivePercentDiscount);
                break;

            case R.id.fiftyPercentDiscount:
                discountOne = .50;
                changeDiscount1Color(fiftyPercentDiscount);
                break;

            case R.id.fiftyFivePercentDiscount:
                discountOne = .55;
                changeDiscount1Color(fiftyFivePercentDiscount);
                break;

            case R.id.sixtyPercentDiscount:
                discountOne = .60;
                changeDiscount1Color(sixtyPercentDiscount);
                break;

            case R.id.sixtyFivePercentDiscount:
                discountOne = .65;
                changeDiscount1Color(sixtyFivePercentDiscount);
                break;

            case R.id.seventyPercentDiscount:
                discountOne = .70;
                changeDiscount1Color(seventyPercentDiscount);
                break;

            case R.id.seventyFivePercentDiscount:
                discountOne = .75;
                changeDiscount1Color(seventyFivePercentDiscount);
                break;
            case R.id.eightyPercentDiscount:
                discountOne = .80;
                changeDiscount1Color(eightyPercentDiscount);
                break;

            //bot row
            case R.id.fivePercentDiscountBotRow:
                discountTwo = .05;
                changeDiscount2Color(fivePercentDiscountBotRow);
                break;
            case R.id.tenPercentDiscountBotRow:
                discountTwo = .10;
                changeDiscount2Color(tenPercentDiscountBotRow);
                break;

            case R.id.fiveTeenPercentDiscountBotRow:
                discountTwo = .15;
                changeDiscount2Color(fiveTeenPercentDiscountBotRow);
                break;
            case R.id.twentyPercentDiscountBotRow:
                discountTwo = .20;
                changeDiscount2Color(twentyPercentDiscountBotRow);
                break;
            case R.id.twentyFivePercentDiscountBotRow:
                discountTwo = .25;
                changeDiscount2Color(twentyFivePercentDiscountBotRow);
                break;
            case R.id.thirtyPercentDiscountBotRow:
                discountTwo = .30;
                changeDiscount2Color(thirtyPercentDiscountBotRow);
                break;
            case R.id.thirtyFivePercentDiscountBotRow:
                discountTwo = .35;
                changeDiscount2Color(thirtyFivePercentDiscountBotRow);
                break;
            case R.id.fortyPercentDiscountBotRow:
                discountTwo = .40;
                changeDiscount2Color(fortyPercentDiscountBotRow);
                break;
            case R.id.fortyFivePercentDiscountBotRow:
                discountTwo = .45;
                changeDiscount2Color(fortyFivePercentDiscountBotRow);
                break;
            case R.id.fiftyPercentDiscountBotRow:
                discountTwo = .50;
                changeDiscount2Color(fiftyPercentDiscountBotRow);
                break;
            case R.id.fiftyFivePercentDiscountBotRow:
                discountTwo = .55;
                changeDiscount2Color(fiftyFivePercentDiscountBotRow);
                break;
            case R.id.sixtyPercentDiscountBotRow:
                discountTwo = .60;
                changeDiscount2Color(sixtyPercentDiscountBotRow);
                break;
            case R.id.sixtyFivePercentDiscountBotRow:
                discountTwo = .65;
                changeDiscount2Color(sixtyFivePercentDiscountBotRow);
                break;
            case R.id.seventyPercentDiscountBotRow:
                discountTwo = .70;
                changeDiscount2Color(seventyPercentDiscountBotRow);
                break;
            case R.id.seventyFivePercentDiscountBotRow:
                discountTwo = .75;
                changeDiscount2Color(seventyFivePercentDiscountBotRow);
                break;
            case R.id.eightyPercentDiscountBotRow:
                discountOne = .80;
                changeDiscount1Color(eightyPercentDiscountBotRow);
                break;


            case R.id.calc:
                calculate();
                break;

            //case R.id.clearOfAllCalc:clear();
        }

    }

    private void changeDiscount1Color(Button discountBtn) {
        if (discountButton1 != null) {
            discountButton1.setBackgroundResource(android.R.drawable.btn_default);
        }
        discountBtn.setBackgroundColor(Color.YELLOW);
        discountButton1 = discountBtn;
    }

    private void changeDiscount2Color(Button discountBtn2) {
        if (discountButton2 != null) {
            discountButton2.setBackgroundResource(android.R.drawable.btn_default);
        }
        discountBtn2.setBackgroundColor(Color.BLUE);
        discountButton2 = discountBtn2;
    }

    private void calculate() {

        if (totalPriceGoesHere.getText().toString().equals("")) {
            return;
        }

        //ressultWithTax.setText( String.format( "Value of a: %.2f", a ) );

        //Calculating the first Discount
        orig_price = Double.parseDouble(totalPriceGoesHere.getText().toString());
        double result = orig_price - (orig_price * discountOne);

        //Calculating the second Discount on Top of the First Discount
        double result2 = result - (result * discountTwo);

        //See if the tax box is empty also coversion is going on here
        if (!"".equals(manuallyEnteringTaxPercent.getText().toString())) {
            orig_Tax = Double.parseDouble(manuallyEnteringTaxPercent.getText().toString());
        }

        //Calculating the tax amount here
        double resultWithTax = result + (result * orig_Tax / 100);
        outComeOfAll.setText(String.format("%.2f", resultWithTax));

        double resultWithTax2 = result2 + (result2 * orig_Tax / 100);
        outComeOfAll.setText(String.format("%.2f", resultWithTax2));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_item_clearAtActionBar:
                 //User chose the "Settings" item, show the app settings UI...
                clear();
                return true;

            default:
               // If we got here, the user's action was not recognized.
              // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }

    /**
     * this is clear out everything
     * we wont be reseting the tax amount
     * what perferbably would is keeping the tax amount in memory forever
     * when ever someone exit and joins back it would have the same tax amount
     */
    private void clear() {
        /**
         * Original Price goes back to nothing
         */
        orig_price = 0.0;
        discountOne = 0;
        discountTwo = 0;
        totalPriceGoesHere.setText("");
        outComeOfAll.setText("");


    }

    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
