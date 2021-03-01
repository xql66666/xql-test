package strategyModel;

import java.util.Scanner;

/**
 * Main class
 * 策略模式  超市收银系统
 * @author qianlei.xu
 * @date 2021/2/23
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        double v = scanner.nextDouble();
        Double aDouble = new Context(type).ContextInterface(v);
        System.out.println("价格是: " + aDouble);

    }
}

