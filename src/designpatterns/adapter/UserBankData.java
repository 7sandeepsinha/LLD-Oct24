package designpatterns.adapter;

public class UserBankData {
    private String accountName;
    private String accountNumber;
    private String ifscCode;
    private String bankName;
    private String phoneNumber;
    private String debitCardDetails;

    public String getDebitCardDetails() {
        return debitCardDetails;
    }

    public void setDebitCardDetails(String debitCardDetails) {
        this.debitCardDetails = debitCardDetails;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
