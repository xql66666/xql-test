package easyFactoryModel;

/**
 * Main class
 * 简单工厂模式, 计算器
 * @author qianlei.xu
 * @date 2021/2/23
 */
public class Main {
    public static void main(String[] args) {
        OpertionalFactory opertionalFactory = new OpertionalFactory();
        Opertional add = opertionalFactory.createOpertional("+");
        add.setNumberA(10D);
        add.setNumberB(5D);
        System.out.println(add.getResult());


        Opertional add1 = opertionalFactory.createOpertional("*");
        add1.setNumberA(10D);
        add1.setNumberB(5D);
        System.out.println(add1.getResult());
    }
}
