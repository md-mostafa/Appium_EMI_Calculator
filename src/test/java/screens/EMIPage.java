package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EMIPage {
    @FindBy(id = "com.continuum.emi.calculator:id/btnStart")
    public
    WebElement btnStart;
    @FindBy(id = "com.continuum.emi.calculator:id/etLoanAmount")
    WebElement txtLoanAmount;
    @FindBy(id = "com.continuum.emi.calculator:id/etInterest")
    WebElement txtInterest;
    @FindBy(id = "com.continuum.emi.calculator:id/etFee")
    WebElement txtProcessingFee;
    @FindBy(id="com.continuum.emi.calculator:id/etMonths")
    public
    WebElement txtMonth;
    @FindBy(id="com.continuum.emi.calculator:id/etYears")
    public
    WebElement txtYear;
    @FindBy(id="com.continuum.emi.calculator:id/etEMI")
    WebElement txtEmi;
    @FindBy(id = "com.continuum.emi.calculator:id/btnCalculate")
    WebElement btnCalculate;

    @FindBy(id = "com.continuum.emi.calculator:id/monthly_emi_result")
    public
    WebElement txtEMIMonthlyAmountResult;
    @FindBy(id = "com.continuum.emi.calculator:id/total_interest_result")
    public
    WebElement txtTotalInterestResult;
    @FindBy(id = "com.continuum.emi.calculator:id/processing_fee_result")
    public
    WebElement txtProcessingFeeResult;
    @FindBy(id = "com.continuum.emi.calculator:id/total_payment_result")
    public
    WebElement txtTotalPaymentResult;
    @FindBy(id="com.continuum.emi.calculator:id/rbPeriod")
    WebElement btnPeriod;
    @FindBy(id="com.continuum.emi.calculator:id/rbLoanAmount")
    WebElement btnAmount;

    @FindBy(id = "com.continuum.emi.calculator:id/btnReset")
    public
    WebElement btnReset;

    public EMIPage(AndroidDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void calculateEMI(double loanAmount, double interest, double emi, double fee ){
        btnPeriod.click();
        txtLoanAmount.sendKeys(""+loanAmount+"");
        txtInterest.sendKeys(""+interest+"");
        txtEmi.sendKeys(""+emi+"");
        txtProcessingFee.sendKeys(""+fee+"");
        btnCalculate.click();
        btnAmount.click();

    }
}
