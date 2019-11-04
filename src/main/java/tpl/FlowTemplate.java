package tpl;

import java.util.Map;

public class FlowTemplate {


    Map<String, Transformer> transformMap;


    public Map<String, Transformer> getTransformMap() {
        return transformMap;
    }

    public void setTransformMap(Map<String, Transformer> transformMap) {
        this.transformMap = transformMap;
    }
}
