package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.Orderinfo;
import org.springframework.stereotype.Repository;

/**
 * OrderinfoDAO继承基类
 */
@Repository
public interface OrderinfoDAO extends MyBatisBaseDao<Orderinfo, Integer> {
}