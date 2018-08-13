package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.Memberinfo;

import org.springframework.stereotype.Repository;

/**
 * MemberinfoDAO继承基类
 */
@Repository
public interface MemberinfoDAO extends MyBatisBaseDao<Memberinfo, Integer> {
}