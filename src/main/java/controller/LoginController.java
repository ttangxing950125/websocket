package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Z
 * @Date: 2019-06-13 09:46
 * @Description:
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String doLogin(@RequestParam("username")String username,@RequestParam("pwd")String password){

        System.out.println(username+"--"+password);


        return "index";
    }
}
