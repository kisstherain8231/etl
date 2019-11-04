package script;

import service.PayService;

public class BSA3G implements Processor {

    PayService payService;

    public String  hello(){

        return "hello world";
    }

    public PayService getPayService() {
        return payService;
    }

    public void setPayService(PayService payService) {
        this.payService = payService;
    }

    @Override
    public String process() {

        return hello();
    }
}
