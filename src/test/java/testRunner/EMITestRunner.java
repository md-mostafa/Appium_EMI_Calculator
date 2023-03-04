package testRunner;

import dataProviders.DataSet;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.EMIPage;
import setup.Setup;

public class EMITestRunner extends Setup {
    @BeforeTest
    public void startEMICalc(){
        EMIPage emiPage = new EMIPage(Setup.driver);
        emiPage.btnStart.click();
    }
    @Test(dataProvider = "data-provider", dataProviderClass = DataSet.class, priority = 1, description = "Verify EMI Period With different types of data")
    public void calculateEMI(double loanAmount, double interest, double emi, double fee, double monthlyEMI, double totalInterest, double processfingFee, double totalPayment, int year, int month) {
        EMIPage emiPage = new EMIPage(Setup.driver);
        emiPage.calculateEMI(loanAmount, interest, emi, fee);

        double monthlyEMIActual = Double.parseDouble(emiPage.txtEMIMonthlyAmountResult.getText().replace(",", ""));
        double totalInterestActual = Double.parseDouble(emiPage.txtTotalInterestResult.getText().replace(",", ""));
        double totalProcessingFeeActual = Double.parseDouble(emiPage.txtProcessingFeeResult.getText().replace(",", ""));
        double totalPaymentActual = Double.parseDouble(emiPage.txtTotalPaymentResult.getText().replace(",", ""));
        int totalYearActual = Integer.parseInt(emiPage.txtYear.getText());
        int totalMonthActual = Integer.parseInt(emiPage.txtMonth.getText());

        Assert.assertEquals(monthlyEMIActual, monthlyEMI, "Monthly emi didn't match");
        Assert.assertEquals(totalInterestActual, totalInterest, "Total interest didn't match");
        Assert.assertEquals(totalProcessingFeeActual, processfingFee, "Processing fee didn't match");
        Assert.assertEquals(totalPaymentActual, totalPayment, "Total payment didn't match");

        Assert.assertEquals(totalYearActual, year, "Period year didn't match");
        Assert.assertEquals(totalMonthActual, month, "Period month didn't match");
        emiPage.btnReset.click();
    }

}
