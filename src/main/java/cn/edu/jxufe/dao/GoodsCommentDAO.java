package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.GoodsComment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * GoodsCommentDAO继承基类
 */
@Repository
public interface GoodsCommentDAO extends MyBatisBaseDao<GoodsComment, Integer> {
    public List<GoodsComment> findAll();
    public List<GoodsComment> findByGoodsId(@Param("goodid")int goodsid);
}