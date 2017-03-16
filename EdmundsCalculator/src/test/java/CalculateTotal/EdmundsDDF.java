package CalculateTotal;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by EliteBook on 3/15/2017.
 */
public class EdmundsDDF extends CommonAPI {

    private String monthlyPaymentAmount = "350";
    private String monthlyPaymentField = ".//input[@id='calc_input3']";

    private String goButton = ".//div[@id='calc_index_affordability_calc']//button[@class='medium blue button calculator-go']";

    private String zipcode = "22042";
    private String zipCodeField = "ac_zip_code";

    private String updateZipCode = "ac_zip_code_update";

    private String loanTermSelect = ".//select[@name='ac_loan_term']//option[@value='36']";

    private String financeRate = "3.43";
    private String financeRateField = "ac_market_finance_rate";

    private String valueTradeInAmount = "5000";
    private String valueTradeInField = "ac_vehicle2_price";

    private String tradeInAmountOwed = "800";
    private String tradeInAmountOwedField = "ac_vehicle2_value_owed";

    private String cashDownPaymentAmount = "3000";
    private String getCashDownPaymentAmountField = "ac_cash_down_payment";

    private String calculateButton = ".//button[@id='calculate-button']";

    private String downPaymentResult = ".//span[@id='ac_total_down_payment_result']";
    private String expectedResult = "$7,200";


    @Test
    public void EdmundsCalcDDF() throws InterruptedException {


        //enter monthly payment
        typeByXpath(monthlyPaymentField,monthlyPaymentAmount);


        //click go button
        clickByXpath(goButton);

        //clear zip field and enter zipcode
        clearInputByID(zipCodeField);
        typeByID(zipCodeField,zipcode);

        sleepFor(4);

        //click update zipcode
        clickById(updateZipCode);

        //select loan term
        clickByXpath(loanTermSelect);

        sleepFor(5);


        //clear finance rate field and enter finance rate
        clearInputByID(financeRateField);
        typeByID(financeRateField, financeRate);

        //enter value of trade in
        typeByID(valueTradeInField, valueTradeInAmount);


        // enter amount owed
        typeByID(tradeInAmountOwedField, tradeInAmountOwed);


        //enter cash down payment
        typeByID(getCashDownPaymentAmountField, cashDownPaymentAmount);

        sleepFor(4);
        //click calculate button
        clickByXpath(calculateButton);


        //get text from total down payment and compare expected value vs actual value
        /*THIS WONT WORK?!?!?!*/
        String result1 = getTextByXpath(downPaymentResult);

        System.out.println(result1);

        sleepFor(20);







    }



}
