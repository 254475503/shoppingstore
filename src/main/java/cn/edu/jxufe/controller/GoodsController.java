package cn.edu.jxufe.controller;

import cn.edu.jxufe.entity.Goodsinfo;
import cn.edu.jxufe.service.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

/**
 * Created by 程 on 2018/8/7.
 */
@Controller
public class GoodsController {
    int colum=0;
    @Autowired
    private GoodsInfoService goodsInfoService;
    @RequestMapping("goodsinfo{gid}")
    public String toGoods(@PathVariable("gid")int goodid,ModelMap map,HttpSession httpSession){

        httpSession.setAttribute("刷新次数",colum++);
        Goodsinfo goodsinfo=goodsInfoService.findGoodsById(goodid);
        map.put("g",goodsinfo);
        return "product";
    }

    @RequestMapping("get")
    @ResponseBody
    public Object getColum(HttpSession httpSession){
        return httpSession.getAttribute("cart");
    }

}
