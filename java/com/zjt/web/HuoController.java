package com.zjt.web;

import com.zjt.entity.Trole;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/n")
public class HuoController extends BaseContrller{

    @RequestMapping("/k")
    @ResponseBody
    public int User1(){

       return 1;
    }
@RequestMapping("/j")
    @ResponseBody
    public String getSession(){
        return getUser().getUserName();
}
}
