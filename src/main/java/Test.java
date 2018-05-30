import com.example.design.singleton.Singleton;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 类描述
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println(Singleton.getSingleton());
        System.out.println(Singleton.getSingleton());
        System.out.println(Singleton.getSingleton());
    }
}
