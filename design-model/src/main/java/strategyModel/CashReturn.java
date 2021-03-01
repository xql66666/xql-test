package strategyModel;

/**
 * CashReturn class
 *
 * @author qianlei.xu
 * @date 2021/2/23
 */
public class CashReturn implements CashSuper{

    public Double full;
    public Double lose;

    public CashReturn(Double full, Double lose) {
        this.full = full;
        this.lose = lose;
    }

    //满减
    @Override
    public Double acceptCash(Double cash) {
        if (cash >= full) {
            return cash - lose;
        }
        return cash;
    }
}
