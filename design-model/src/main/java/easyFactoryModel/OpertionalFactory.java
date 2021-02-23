package easyFactoryModel;

/**
 * OpertionalFactory class
 *
 * @author qianlei.xu
 * @date 2021/2/23
 */
public class OpertionalFactory {

    public Opertional createOpertional(String opertion) {
        Opertional opertional = null;
        switch (opertion){
            case "+":
                opertional = new AddOpertional();
                break;
            case "*":
                opertional = new MultOpertional();
                break;
            default:
                break;
        }
        return opertional;
    }
}
