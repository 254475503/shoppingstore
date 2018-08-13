package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.dao.GoodsCommentDAO;
import cn.edu.jxufe.dao.GoodsinfoDAO;
import cn.edu.jxufe.entity.Admin;
import cn.edu.jxufe.entity.GoodsComment;
import cn.edu.jxufe.service.GoodsCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 程 on 2018/8/7.
 */
@Service
public class GoodsCommentServiceImpl implements GoodsCommentService {
    @Autowired
    private GoodsCommentDAO goodsCommentDAO;
    @Override
    public Object insertComment(GoodsComment goodsComment){
        return goodsCommentDAO.insert(goodsComment);
    }

    @Override
    public List<GoodsComment> findAll(){
        return goodsCommentDAO.findAll();
    }
    @Override
    public GoodsComment findCommentById(int commentId){
        return goodsCommentDAO.selectByPrimaryKey(commentId);
    }
    @Override
    public List<GoodsComment> findByGoodsId(int goodsid){
        return goodsCommentDAO.findByGoodsId(goodsid);
    }
}
