package cn.bdqn.controller;

import cn.bdqn.Servlet.AccoutSerlet;
import cn.bdqn.domain.Accout;
import cn.bdqn.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AccoutController {

    @Autowired
    private AccoutSerlet accoutSerlet;

    @GetMapping("/account/quserAll")
    @ResponseBody
    public List<Accout> quserAll(){
        List<Accout> accouts = accoutSerlet.querAll();
        return accouts;
    }


}
