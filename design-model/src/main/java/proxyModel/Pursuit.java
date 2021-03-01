package proxyModel;

/**
 * Pursuit class
 *
 * @author qianlei.xu
 * @date 2021/3/1
 */
public class Pursuit implements GiveGift{

    private Girl girl;

    public Pursuit(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void giveIqoo() {
        System.out.println(girl.name + ",送你一台Iqoo");
    }

    @Override
    public void giveRealme() {
        System.out.println(girl.name + ",送你一台Realme");
    }
}
