package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.Collectioninfo;
import org.springframework.stereotype.Repository;

/**
 * CollectioninfoDAO继承基类
 */
@Repository
public interface CollectioninfoDAO extends MyBatisBaseDao<Collectioninfo, Integer> {
}