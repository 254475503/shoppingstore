package cn.edu.jxufe.controller;

import cn.edu.jxufe.service.AdvertisementService;
import cn.edu.jxufe.service.impl.AdvertisementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 程 on 2018/8/8.
 */
@Controller
public class AdvertisementController {
    @Autowired
    AdvertisementService advertisementService;
    @RequestMapping("adv")
    @ResponseBody
    public Object viewAd(){
        return advertisementService.findOnLineList();
    }
}
