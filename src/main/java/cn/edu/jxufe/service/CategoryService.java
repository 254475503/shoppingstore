package cn.edu.jxufe.service;

import cn.edu.jxufe.entity.GoodsCategory;
import java.util.List;

/**
 * Created by 程 on 2018/8/8.
 */
public interface CategoryService {
    List<GoodsCategory> findAllCategory();
}
