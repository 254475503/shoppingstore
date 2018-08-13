package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.OrderinfoGoods;
import org.springframework.stereotype.Repository;

/**
 * OrderinfoGoodsDAO继承基类
 */
@Repository
public interface OrderinfoGoodsDAO extends MyBatisBaseDao<OrderinfoGoods, Integer> {
}