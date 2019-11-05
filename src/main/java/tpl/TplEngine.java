package tpl;

import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TplEngine {

    public void transform(String key,
        String srcStatus, String destStatus, Context context,
        AnnotationConfigApplicationContext annotationConfigApplicationContext) {
        FlowTemplate flowTemplate = (FlowTemplate) annotationConfigApplicationContext.getBean(key);

        Map<String, Transform> transformMap = flowTemplate.getTransformMap();

        StringBuilder status = new StringBuilder();
        status.append(srcStatus).append("_").append(destStatus);
        Transform actions = transformMap.get(status.toString());

        for (Action action : actions.getActionList()) {
            action.process(context);
        }

        HashMap map = (HashMap) annotationConfigApplicationContext.getBean(key + ".transform");

        if (!actions.isContinueTransform()) {

            return;
        }

        String nextStatus = (String) map.get(destStatus);

        if (nextStatus == null) {

            return;
        }

        transform(key, destStatus, nextStatus, context, annotationConfigApplicationContext);

    }

}
