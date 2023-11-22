import freemarker.template.Configuration;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author: Toys
 * @date: 2023年11月22 12:58
 **/
public class FreeMarkerTest {

    @Test
    public void test() throws IOException {
        // new 出 Configuration 对象，参数为版本号
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);

        // 指定模板文件所在的路径
        configuration.setDirectoryForTemplateLoading(new File("src/main/resource/templates"));

        // 设置模板文件的字符集
        configuration.setDefaultEncoding("utf-8");
    }
}
