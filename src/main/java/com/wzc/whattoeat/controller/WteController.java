package com.wzc.whattoeat.controller;

import com.wzc.whattoeat.service.intf.WteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 〈吃什么Controller〉<br>
 * 〈功能详细描述〉
 *
 * @author 88449524
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@RestController
@RequestMapping("/wte")
public class WteController {

    private static final String VIEW_PATH = "whatToEat";

    @Autowired
    private WteService wteService;

    /**
     * 主页展示
     *
     * @return
     */
    @RequestMapping("/index")
    public ModelAndView showIndex() {
        return new ModelAndView(VIEW_PATH);
    }

    /**
     * 查询所有餐厅
     *
     * @param page
     * @param pageSize
     * @return
     */
    @RequestMapping("/queryAllDiningHall")
    public ModelAndView queryAllDiningHall() {

        ModelAndView modelAndView = new ModelAndView(VIEW_PATH);
//        Page<Comment> commentList = wteService.findAll(page, pageSize);
//        modelAndView.addObject("commentList", commentList);
//        int count = wteService.queryTotalCount();
//        modelAndView.addObject("count",count);
        return modelAndView;
    }

}
