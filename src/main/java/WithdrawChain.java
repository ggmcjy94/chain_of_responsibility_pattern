public interface WithdrawChain {

    void setNextChain(WithdrawChain withNextChain);
    void withdraw(Currency currency);
}
