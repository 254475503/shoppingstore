package cn.edu.jxufe.service;

import cn.edu.jxufe.entity.Admin;
import cn.edu.jxufe.entity.GoodsComment;

import java.util.List;

/**
 * Created by 程 on 2018/8/7.
 */
public interface GoodsCommentService {
    Object  insertComment(GoodsComment goodsComment);
    List<GoodsComment> findAll();
    GoodsComment  findCommentById(int commentId);
    List<GoodsComment> findByGoodsId(int goodsid);

}
