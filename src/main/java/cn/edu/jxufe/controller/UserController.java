package cn.edu.jxufe.controller;




import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 程 on 2018/8/3.
 */
@Controller
public class UserController {

    @RequestMapping("boy")
    public  String xiaoshuaige(){
      return "comment";
  }

    @RequestMapping("page")
    public String page404(){
        return "404";
    }
    @RequestMapping("page_{url}")
    public String toPage(@PathVariable("url") String url){
        return url;
    }


}
