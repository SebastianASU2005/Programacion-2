package Classes;

public abstract class Account {
    protected float balance;
    protected int numberConsignments=0;
    protected int numberWithdrawals=0;
    protected float annualRate;
    protected float monthlyCommission=0;

    public Account(float balance, float annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
    }

    public void consign(float amount){
        balance += amount;
        numberConsignments++;
        System.out.println("Ingreso realizado correctamente");
    }

    public void withdraw(float amount){
        float newBalance = balance - amount;
        if(newBalance >= 0){
            balance -= amount;
            numberWithdrawals++;
            System.out.println("Retiro realizado correctamente");
        }else{
            System.out.println("La cantidad a retirar excede el saldo actual.");
        }
    }

    public void calculateInterest(){
        float monthlyRate = annualRate / 12;
        float monthlyInterest = balance * monthlyRate;
        balance += monthlyInterest;
    }

    public void monthlyStatement(){
        balance -= monthlyCommission;
        calculateInterest();
    }

    @Override
    public String toString() {
        return
                "Saldo=" + balance +
                ", Numero de consiganciones=" + numberConsignments +
                ", Numero de retiros=" + numberWithdrawals +
                ", Tasa Anual=" + annualRate +
                ", Comision Mesnsual=" + monthlyCommission +
                '}';
    }
}
