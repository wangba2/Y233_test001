import cn.bdqn.domain.Accout;
import cn.bdqn.mapper.AccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.InputStream;
import java.util.List;

public class AccountMapperTest {

    @Test
    public void Select() throws Exception{

        InputStream is = Resources.getResourceAsStream("mybaits-config.xml");

        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);

        SqlSession session = ssf.openSession();

        AccountMapper accountMapper = session.getMapper(AccountMapper.class);
        List<Accout> accouts = accountMapper.selectAll();
        System.out.println(accouts);

        is.close();
        session.close();

    }
}
