package designpatterns.adapter.thirdParty;

public class AxisBankAPI {

    public int getBalance(String phoneNumber, String upiID, String pin){
        return 0;
    }

    public boolean addAccount(BankDetails bankDetails){
        return false;
    }

    public int transfer(BankDetails fromDetails, BankDetails toDetails, int pin, int amount){
        return 1;
    }
}
