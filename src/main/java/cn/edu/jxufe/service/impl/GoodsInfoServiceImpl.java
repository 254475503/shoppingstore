package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.dao.GoodsinfoDAO;
import cn.edu.jxufe.entity.Goodsinfo;
import cn.edu.jxufe.service.GoodsInfoService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 程 on 2018/8/7.
 */
@Service
public class GoodsInfoServiceImpl implements GoodsInfoService{
    @Autowired
    private GoodsinfoDAO goodsinfoDAO;
    @Override
    public List<Goodsinfo> findAll(){
        return  goodsinfoDAO.findAll();
    }
    @Override
    public Goodsinfo findGoodsById(int goodid){
        return goodsinfoDAO.selectByPrimaryKey(goodid);
    }
    @Override
    public List<Goodsinfo> findByCategory(Integer categoryid){
        Map map=new HashMap();
        map.put("gcId",categoryid);
        return goodsinfoDAO.findAllGoodsByPropery(map);
    }
    @Override
    public List<Goodsinfo> findGoodsByCategory(Integer categoryid,String orderby,int page){
        PageHelper.startPage(page,10);
        PageHelper.orderBy(orderby);
        return findByCategory(categoryid);
    }
}
