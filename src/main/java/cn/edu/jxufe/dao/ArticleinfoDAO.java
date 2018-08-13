package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.Articleinfo;
import org.springframework.stereotype.Repository;

/**
 * ArticleinfoDAO继承基类
 */
@Repository
public interface ArticleinfoDAO extends MyBatisBaseDao<Articleinfo, Integer> {
}