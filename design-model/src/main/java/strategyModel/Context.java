package strategyModel;

/**
 * Context class
 *
 * @author qianlei.xu
 * @date 2021/2/23
 */
public class Context {

    CashSuper cashSuper = null;

    public Context(String type) {
        switch (type) {
            case "正常收费":
                CashNormal cashNormal = new CashNormal();
                cashSuper = cashNormal;
                break;
            case "满300反100":
                CashReturn cashReturn = new CashReturn(300d, 100d);
                cashSuper = cashReturn;
                break;
            case "8折":
                CashRebate cashRebate = new CashRebate(0.8d);
                cashSuper = cashRebate;
                break;
            default:
                CashNormal defaultCash = new CashNormal();
                cashSuper = defaultCash;
        }
    }

    public Double ContextInterface(Double cash) {
        return cashSuper.acceptCash(cash);
    }
}
