package designpatterns.adapter.thirdParty;

public class YesBankAPI {

    public double getBalance(String upiID, int pin){
        return 0;
    }

    public String accountAddition(String bankAccNo, String ifscCode, String pin, String debitCardDetails){
        return "SUCCESS";
    }

    public char transaction(String fromUPIId, String toUPIId, int pin, double amount){
        return 'Y';
    }

}

//check balance
// add account
// transfer