import org.junit.Test;
import org.smart4j.framework.HelperLoader;
import org.smart4j.framework.helper.BeanHelper;
import org.smart4j.framework.helper.ControllerHelper;
import org.smart4j.framework.helper.IocHelper;

import java.net.URL;
import java.util.Enumeration;

/**
 * Created by win8 on 2017/11/1.
 */
public class DeBugTest {

    public static void main(String[] args) throws Exception{
        testContainer();
    }

    public static void testContainer() throws Exception {
        HelperLoader.init();
        System.out.println(BeanHelper.getBean(IocHelper.class));
    }

    public static void testUrl() throws Exception{
        Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources(
                "org/smart4j/example");
        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            String packagePath = url.getPath().replaceAll("%20", "");

            System.out.println(packagePath);
        }
    }
}
