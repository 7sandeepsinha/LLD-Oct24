package designpatterns.adapter;

public interface IBankAPI {
    double checkBalance(UPIDetails upiDetails, int pin);
    boolean addBankAccount(UserBankData userBankData, int pin);
    int transfer(UPIDetails fromUPIDetails, UPIDetails toUPIDetails, int pin, double amount);
}
//break -> 10:32 PM