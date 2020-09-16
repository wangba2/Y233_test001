package cn.bdqn.Servlet;

import cn.bdqn.domain.Accout;

import java.util.List;

public interface AccoutSerlet {

    //查询所有账号
    public List<Accout> querAll();

    //保存账号
    public void save(Accout accout);

}
