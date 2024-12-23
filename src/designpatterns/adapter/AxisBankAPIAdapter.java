package designpatterns.adapter;

import designpatterns.adapter.thirdParty.AxisBankAPI;

public class AxisBankAPIAdapter implements IBankAPI{
    private AxisBankAPI axisBankAPI;

    public AxisBankAPIAdapter() {
        this.axisBankAPI = new AxisBankAPI();
    }

    @Override
    public double checkBalance(UPIDetails upiDetails, int pin) {
        return 0;
    }

    @Override
    public boolean addBankAccount(UserBankData userBankData, int pin) {
        return false;
    }

    @Override
    public int transfer(UPIDetails fromUPIDetails, UPIDetails toUPIDetails, int pin, double amount) {
        return 0;
    }
}
