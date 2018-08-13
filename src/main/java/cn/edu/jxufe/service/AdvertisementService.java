package cn.edu.jxufe.service;

import cn.edu.jxufe.entity.Advertisement;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Created by 程 on 2018/8/8.
 */
public interface AdvertisementService {
    public List<Advertisement> findOnLineList();
    List<Advertisement> findOnLineTop(int n);
}
