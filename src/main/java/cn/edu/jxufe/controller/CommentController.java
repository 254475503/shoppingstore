package cn.edu.jxufe.controller;

import cn.edu.jxufe.entity.Admin;
import cn.edu.jxufe.entity.GoodsComment;
import cn.edu.jxufe.service.GoodsCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by 程 on 2018/8/7.
 */
@Controller
public class CommentController {
    @Autowired
    private GoodsCommentService goodsCommentService;


}
