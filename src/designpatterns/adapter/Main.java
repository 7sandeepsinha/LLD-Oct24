package designpatterns.adapter;

public class Main {
    public static void main(String[] args) {
        IBankAPI iBankAPI = new YesBankAPIAdapter(); // 1 line code change is needed to move from yues bank to axis bank
        PhonePe phonePe = new PhonePe(iBankAPI);
    }
}
/*
so basically phone pe code is dependent on IBankApi and IBankApi
gets input from every respective bank adapter which in turn bridges
the gap between bank implementation and our code requirement
 */