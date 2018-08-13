package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.Admin;
import org.springframework.stereotype.Repository;

/**
 * AdminDAO继承基类
 */
@Repository
public interface AdminDAO extends MyBatisBaseDao<Admin, Integer> {
}