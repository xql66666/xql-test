package proxyModel;

/**
 * Main class
 *
 * @author qianlei.xu
 * @date 2021/3/1
 */
public class Main {
    public static void main(String[] args) {
        Girl girl = new Girl("小美");
        Proxy proxy = new Proxy(girl);
        proxy.giveIqoo();
        proxy.giveRealme();
    }
}
