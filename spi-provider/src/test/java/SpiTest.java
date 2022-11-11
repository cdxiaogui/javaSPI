import com.syw.cd.spi.SpiProvider;
import com.syw.cd.spi.SpiService;
import com.syw.cd.spi.test.SpiServiceDemo;
import org.junit.Test;

import java.util.ServiceLoader;

/**
 * todo
 *
 * @author sunyawei3
 * 创建时间 2022/11/11 3:52 下午
 */
public class SpiTest {

    @Test
    public void testSpiLocal(){
        ServiceLoader<SpiServiceDemo> serviceLoader = ServiceLoader.load(SpiServiceDemo.class);

        for (SpiServiceDemo spiServiceDemo :serviceLoader){

            spiServiceDemo.doThing();
        }

    }

    @Test
    public void testSpiAPI(){
        ServiceLoader<SpiService> serviceLoader = ServiceLoader.load(SpiService.class);

        for (SpiService service :serviceLoader){

            service.doSomeThing();
        }

    }
}
