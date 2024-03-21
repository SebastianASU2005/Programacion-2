package Classes;

public class CurrentAccount extends Account {
    protected float overdraft=0;

    public CurrentAccount(float balance, float annualRate) {
        super(balance, annualRate);
    }

    @Override
    public void withdraw(float amount) {
        if (balance>amount){
            super.withdraw(amount);
        }else{
            balance=0;
            amount-=balance;
            overdraft=amount;
            System.out.println("Retiro realizado, deuda aumentada por falta de saldo");
        }

    }

    @Override
    public void consign(float amount) {
        if (overdraft>0){
            if (overdraft<amount){
                amount-=overdraft;
                overdraft=0;
            }else{
                overdraft-=amount;
                amount-=overdraft;
            }

        }
        if (amount > 0) {
            super.consign(amount);
        }else{
            numberConsignments++;
        }

    }

    @Override
    public void monthlyStatement() {
        super.monthlyStatement();
    }

    @Override
    public String toString() {
        return
                "Sobregiro=" + overdraft +
                ", Saldo=" + balance +
                ", Numero de transacciones=" +(numberConsignments+numberWithdrawals)+
                ", Tasa anual=" + annualRate +
                ", Comision mensual=" + monthlyCommission +
                '}';
    }
}
