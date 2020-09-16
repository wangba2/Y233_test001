import cn.bdqn.Servlet.AccoutSerlet;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void spring() throws Exception {

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

        AccoutSerlet accoutSerlet = (AccoutSerlet)ac.getBean("accoutSerlet");

        System.out.println(accoutSerlet);
    }

}
