package designpatterns.adapter;

public class PhonePe { // application code
    private IBankAPI iBankAPI; // dependency

    public PhonePe(IBankAPI iBankAPI) {
        this.iBankAPI = iBankAPI;
    }

    public void doSomething(){
        //iBankAPI.checkBalance()
        //iBankAPI.......
    }
}
//