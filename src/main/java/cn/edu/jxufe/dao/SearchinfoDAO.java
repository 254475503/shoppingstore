package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.Searchinfo;
import org.springframework.stereotype.Repository;

/**
 * SearchinfoDAO继承基类
 */
@Repository
public interface SearchinfoDAO extends MyBatisBaseDao<Searchinfo, Integer> {
}