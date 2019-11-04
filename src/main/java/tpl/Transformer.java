package tpl;

import java.util.List;

public class Transformer {

    private boolean continueTransform;

    private List<Action> actionList;


    public List<Action> getActionList() {
        return actionList;
    }

    public void setActionList(List<Action> actionList) {
        this.actionList = actionList;
    }

    public void setContinueTransform(boolean continueTransform) {
        this.continueTransform = continueTransform;
    }

    public boolean isContinueTransform() {
        return continueTransform;
    }
}
