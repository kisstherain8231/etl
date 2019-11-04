package app;

import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.PayService;

public class App {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
            = new AnnotationConfigApplicationContext(AppConfig.class);

       PayService payService = (PayService) annotationConfigApplicationContext.getBean("payService");

       payService.pay("", "");
    }

}
