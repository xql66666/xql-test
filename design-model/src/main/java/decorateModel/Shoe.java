package decorateModel;

/**
 * shoe class
 *
 * @author qianlei.xu
 * @date 2021/3/1
 */
public class Shoe extends Finery {

    @Override
    public void Show() {
        System.out.println("穿上鞋子");
        super.Show();
    }
}
