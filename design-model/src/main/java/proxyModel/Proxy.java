package proxyModel;

/**
 * Proxy class
 *
 * @author qianlei.xu
 * @date 2021/3/1
 */
public class Proxy implements GiveGift{

    private Pursuit pursuit;

    public Proxy(Girl girl) {
        this.pursuit = new Pursuit(girl);
    }

    @Override
    public void giveIqoo() {
        pursuit.giveIqoo();
    }

    @Override
    public void giveRealme() {
        pursuit.giveRealme();
    }
}
