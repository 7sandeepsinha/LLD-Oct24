package designpatterns.adapter;

import designpatterns.adapter.thirdParty.YesBankAPI;

public class YesBankAPIAdapter implements IBankAPI{

    private YesBankAPI yesBankAPI;

    public YesBankAPIAdapter() {
        this.yesBankAPI = new YesBankAPI();
    }

    @Override
    public double checkBalance(UPIDetails upiDetails, int pin) {
        return yesBankAPI.getBalance(upiDetails.getUpiId(), pin);
    }

    @Override
    public boolean addBankAccount(UserBankData userBankData, int pin) {
        String result = yesBankAPI.accountAddition(
                userBankData.getAccountNumber(),
                userBankData.getIfscCode(),
                String.valueOf(pin),
                userBankData.getDebitCardDetails()
                );
        if(result.equalsIgnoreCase("SUCCESS")){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int transfer(UPIDetails fromUPIDetails, UPIDetails toUPIDetails, int pin, double amount) {
        char result =  yesBankAPI.transaction(fromUPIDetails.getUpiId(), toUPIDetails.getUpiId(), pin, amount);
        if(result == 'Y'){
            return 1;
        } else if(result == 'N'){
            return 0;
        } else {
            return 2;
        }
    }
}
