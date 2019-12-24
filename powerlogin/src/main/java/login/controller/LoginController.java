package login.controller;

import login.entity.User;
import login.service.LoginService;
import mini.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author peng.liu
 * @data 2019/12/10 9:50
 */
@RestController
@RequestMapping("/logindemo")
public class LoginController {
    @Autowired
    LoginService loginService;
    @RequestMapping("/login")
    public SysResult login(User user){
        if(loginService.check(user))
             {
                 String a= String.valueOf(loginService.get(user));
                 return SysResult.build(200,a,null);
             }
        else {
                return SysResult.build(201,"用户名或密码错误",null);
        }
    }
}
