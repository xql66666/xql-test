package decorateModel;

/**
 * Tshirt class
 *
 * @author qianlei.xu
 * @date 2021/3/1
 */
public class Tshirt extends Finery{

    @Override
    public void Show() {
        System.out.println("穿上T恤");
        super.Show();
    }
}
