package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.dao.GoodsCategoryDAO;
import cn.edu.jxufe.entity.GoodsCategory;
import cn.edu.jxufe.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 程 on 2018/8/8.
 */
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private GoodsCategoryDAO goodsCategoryDAO;
   @Override
    public List<GoodsCategory> findAllCategory(){
       return goodsCategoryDAO.findAllCategory();
    }
}
