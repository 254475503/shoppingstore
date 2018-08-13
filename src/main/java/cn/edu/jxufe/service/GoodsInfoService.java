package cn.edu.jxufe.service;

import cn.edu.jxufe.dao.GoodsinfoDAO;
import cn.edu.jxufe.entity.Goodsinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 程 on 2018/8/7.
 */

public interface GoodsInfoService {
    List<Goodsinfo> findAll();
    Goodsinfo findGoodsById(int goodid);
    List<Goodsinfo> findGoodsByCategory(Integer categoryid,String orderby,int page);
    List<Goodsinfo> findByCategory(Integer categoryid);
}
