package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.Goodsinfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

/**
 * GoodsinfoDAO继承基类
 */
@Repository
public interface GoodsinfoDAO extends MyBatisBaseDao<Goodsinfo,Integer> {
   public List<Goodsinfo> findAll();
   public List<Goodsinfo> findAllGoodsByPropery(@Param("goods")Map map);
}