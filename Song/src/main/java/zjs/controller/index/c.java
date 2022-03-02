package zjs.controller.index;

import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import zjs.entity.User;
import zjs.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class c {

    @Autowired
    public UserService userServiceimpl;

    @RequestMapping("/login")
    public Map login(User user, HttpServletRequest request, HttpServletResponse response) {
        User account = userServiceimpl.selectByAccount(user.getAccount());

        Map map=new HashMap();
        if (account != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", account);
            map.put("message","登陆成功");
            map.put("code","200");
            map.put("data",account);
        }
        //根据用户名和密码查询user，如果存在，则跳转到 success.jsp 页面
        else {
            //如果不存在，则跳转到 login.jsp页面重新登录
            map.put("message","登录失败");
            map.put("code","500");
            map.put("data","");
        }
        return map;
    }

    @RequestMapping("/")
    public String index() {
        return ("login");
    }
    @RequestMapping("/index")
    public String home() {
        return ("index");

    }
}
