package cn.bdqn.mapper;

import cn.bdqn.domain.Accout;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AccountMapper {

    //查询所有账号
    public List<Accout> selectAll();

    //保存账号
    public void insert(Accout accout);
}
