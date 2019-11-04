package tpl;

public abstract class BaseAction  implements Action{

    private boolean isTransaction;



    public boolean isTransaction() {
        return isTransaction;
    }

    public void setTransaction(boolean transaction) {
        isTransaction = transaction;
    }
}
