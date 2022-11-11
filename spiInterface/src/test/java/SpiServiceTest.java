import com.sun.tools.javac.util.ServiceLoader;

import com.syw.cd.spi.SpiService;
import com.syw.cd.spi.*;
import com.syw.cd.spi.test.*;

/**
 * todo
 *
 * @author sunyawei3
 * 创建时间 2022/11/11 3:37 下午
 */
public class SpiServiceTest {

    public static void main(String[] args) {
        ServiceLoader<SpiService> loader = ServiceLoader.load(SpiService.class);
        for (SpiService service : loader) {
            System.out.println("提供者为：" + service.getClass().getSimpleName());
            service.doSomeThing();
        }

        ServiceLoader<SpiServiceDemo> loader2 = ServiceLoader.load(SpiServiceDemo.class);
        for (SpiServiceDemo service : loader2) {
            System.out.println("提供者为：" + service.getClass().getSimpleName());
        }
        System.out.println("end");
    }
}
