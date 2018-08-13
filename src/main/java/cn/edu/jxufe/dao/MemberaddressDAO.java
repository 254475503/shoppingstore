package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.Memberaddress;
import org.springframework.stereotype.Repository;

/**
 * MemberaddressDAO继承基类
 */
@Repository
public interface MemberaddressDAO extends MyBatisBaseDao<Memberaddress, Integer> {
}