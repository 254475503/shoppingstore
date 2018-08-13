package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.dao.AdvertisementDAO;
import cn.edu.jxufe.entity.Advertisement;
import cn.edu.jxufe.service.AdvertisementService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by 程 on 2018/8/8.
 */
@Service
public class AdvertisementServiceImpl implements AdvertisementService {
    @Autowired
    private AdvertisementDAO advertisementDAO;
    @Override
    public List<Advertisement> findOnLineList(){
        Map map=new HashMap();
        map.put("adv_offline",1);
        return advertisementDAO.findOnLineList(map);
    }
    public  List<Advertisement> findOnLineTop(int n){
        PageHelper.startPage(1,n);
        return findOnLineList();
    }
}
