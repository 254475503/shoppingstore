package cn.edu.jxufe.controller;

import cn.edu.jxufe.entity.Advertisement;
import cn.edu.jxufe.entity.GoodsCategory;
import cn.edu.jxufe.entity.GoodsComment;
import cn.edu.jxufe.entity.Goodsinfo;
import cn.edu.jxufe.service.AdvertisementService;
import cn.edu.jxufe.service.CategoryService;
import cn.edu.jxufe.service.GoodsCommentService;
import cn.edu.jxufe.service.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by 程 on 2018/8/7.
 */
@Controller
public class PageController {
    int colum=0;

    @Autowired
    AdvertisementService advertisementService;
    @Autowired
    GoodsInfoService goodsInfoService;
    @Autowired
    GoodsCommentService goodsCommentService;
    @Autowired
    CategoryService categoryService;
    @RequestMapping("index")
    public String toIndex(ModelMap map,ModelMap maps){
        List<Advertisement> list=advertisementService.findOnLineTop(6);
        List<Goodsinfo> listGoods=goodsInfoService.findAll();
        map.put("advlist",list);
        maps.put("goodslist",listGoods);
        return  "index";
    }

    @RequestMapping("commentinfo{gid}")
    public String toComment(@PathVariable("gid")int goodid,ModelMap map){
        List<GoodsComment> goodsComment=goodsCommentService.findByGoodsId(goodid);
        map.put("comments",goodsComment);
        return "comment";
    }
    @RequestMapping("commentTest")
    @ResponseBody
    public String putComment(@PathVariable("context")String context,int goodsid,String username){
        GoodsComment goodsComment=new GoodsComment();
        goodsComment.setScommMembername(username);
        goodsComment.setGoodisId(goodsid);
        goodsComment.setScommContent(context);
        goodsCommentService.insertComment(goodsComment);
        return "commentinfo"+goodsid;

    }

    @RequestMapping("category")
    public String toCategory(ModelMap modelMap){
        List<GoodsCategory> list=categoryService.findAllCategory();
        modelMap.put("catelist",list);
        return "category";
    }
    @RequestMapping("goodsinfobycategory{cid}")
    @ResponseBody
    public  Object getGoodsByCategory(@PathVariable("cid")int cid){
        return goodsInfoService.findByCategory(cid);
    }
}
