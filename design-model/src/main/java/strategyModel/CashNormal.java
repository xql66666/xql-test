package strategyModel;

/**
 * CashNormal class
 *
 * @author qianlei.xu
 * @date 2021/2/23
 */
public class CashNormal implements CashSuper{

    //原价
    @Override
    public Double acceptCash(Double cash) {
        return cash;
    }
}
