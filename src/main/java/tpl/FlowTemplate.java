package tpl;

import java.util.Map;

public class FlowTemplate {


    Map<TransferStatus, Transform> transformMap;


    public Map<TransferStatus, Transform> getTransformMap() {
        return transformMap;
    }

    public void setTransformMap(Map<TransferStatus, Transform> transformMap) {
        this.transformMap = transformMap;
    }
}
