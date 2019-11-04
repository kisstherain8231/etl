package service;


import org.springframework.stereotype.Component;

@Component("payService")
public class PayService {


    public void pay(String payerId, String payeeId) {
        System.out.print("pay");
    }

}
