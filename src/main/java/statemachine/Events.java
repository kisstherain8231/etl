package statemachine;


public enum Events {
    /**
     * 支付   会触发状态从待支付 UNPAID 状态到待收货 WAITING_FOR_RECEIVE 状态的迁移，
     */
    PAY,
    /**
     * 收货   会触发状态从待收货 WAITING_FOR_RECEIVE 状态到结束 DONE 状态的迁移。
     */
    RECEIVE
}
