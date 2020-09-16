import cn.bdqn.Servlet.AccoutSerlet;
import cn.bdqn.domain.Accout;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TEXT {

    @Test
    public void spring() throws Exception {

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

        AccoutSerlet accoutSerlet = (AccoutSerlet)ac.getBean("accoutSerlet");

        List<Accout> accouts = accoutSerlet.querAll();

        System.out.println(accouts);
    }
}
