package pl.coderslab.day1.s3ex3;

public class AtmApi {
    private BankAccount bankAccount;
    private Loan loan;
    private PhoneCard phoneCard;
    private Transfer transfer;

    public AtmApi() {
        this.bankAccount = new BankAccount();
        this.loan = new Loan();
        this.phoneCard = new PhoneCard();
        this.transfer = new Transfer();
    }
    public void deposit() {
        this.bankAccount.deposit();
    }

    public void payOut() {
        this.bankAccount.payOut();
    }

    public void getLoan() {
        this.loan.getLoan();
    }

    public void recharge() {
        this.phoneCard.recharge();
    }

    public void transferMoney() {
        this.transfer.transferMoney();
    }

}
