package cn.bdqn.Servlet.Impl;

import cn.bdqn.Servlet.AccoutSerlet;
import cn.bdqn.domain.Accout;
import cn.bdqn.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accoutSerlet")
public class AccoutSerletImpl implements AccoutSerlet {

    @Autowired
    private AccountMapper accountMapper;

    public List<Accout> querAll() {
        return accountMapper.selectAll();
    }

    public void save(Accout accout) {

    }
}
