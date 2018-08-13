package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.GoodsCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * GoodsCategoryDAO继承基类
 */
@Repository
public interface GoodsCategoryDAO extends MyBatisBaseDao<GoodsCategory, Integer> {
      public List<GoodsCategory> findAllCategory();
}