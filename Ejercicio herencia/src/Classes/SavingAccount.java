package Classes;

public class SavingAccount extends Account{

    protected Boolean active;

    public SavingAccount(float balance, float annualRate) {
        super(balance, annualRate);
        if (balance>=10000){
            active=true;
        }
    }

    @Override
    public void consign(float amount) {
        if (active){
        super.consign(amount);
        }else{
        System.out.println("No se puede realizar la operacion porque la cuenta esta inactiva por tener saldo menor a 10000");
    }

    }

    @Override
    public void withdraw(float amount) {
       if (active){
           super.withdraw(amount);
           if (numberWithdrawals>=4){
               monthlyExtract();
               System.out.println("Numero de retiros superior o igual a 4, extracto mensual a 1000");

           }
       }else{
           System.out.println("No se puede realizar la operacion porque la cuenta esta inactiva por tener saldo menor a 10000");
       }


    }
    public void monthlyExtract(){
        float newBalance=balance-1000;
        if (newBalance>=0){
            balance-=1000;
        }else
            System.out.println("No se pudo hacer el extracto mensual por insuficiente saldo");
        if (balance<10000){
            active=false;
        }
    }

    @Override
    public String toString() {
        return
                "Activa=" + active +
                ", Saldo=" + balance +
                ", Numero de transacciones="+(numberConsignments+numberWithdrawals)+
                ", Tasa Anual=" + annualRate +
                ", Comsion Mensual=" + monthlyCommission;
    }
}
