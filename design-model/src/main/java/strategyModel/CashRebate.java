package strategyModel;

/**
 * CashRebate class
 *
 * @author qianlei.xu
 * @date 2021/2/23
 */
public class CashRebate implements CashSuper{

    public Double rebate = 1d;

    public CashRebate(Double rebate) {
        this.rebate = rebate;
    }

    //打折消费
    @Override
    public Double acceptCash(Double cash) {
        return cash * rebate;
    }
}
