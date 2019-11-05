package app;

import config.AppConfig;
import groovy.GroovyEngine;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.statemachine.StateMachine;
import script.Processor;
import tpl.Context;
import tpl.TplEngine;
import util.SpringContextUtils;

public class App {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
            = new AnnotationConfigApplicationContext(AppConfig.class);

       /* PayService payService = (PayService) annotationConfigApplicationContext
            .getBean("payService");

        payService.pay("", "");*/

        SpringContextUtils.setContext(annotationConfigApplicationContext);

        Processor processor =   GroovyEngine.getBean();

        SpringContextUtils.autowireBean(processor);

        String result = processor.process();
        System.out.println(result);

        TplEngine tplEngine = new TplEngine();

        tplEngine.transform("normalFlow", "NULL",
            "AC", new Context(), annotationConfigApplicationContext);


        StateMachine stateMachine = (StateMachine) annotationConfigApplicationContext.getBean("stateMachine");




    }

}
