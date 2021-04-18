package com.wzc.whattoeat.controller;

import com.wzc.whattoeat.constant.ResponseConstant;
import com.wzc.whattoeat.domain.BaseResponse;
import com.wzc.whattoeat.dto.DiningHallDishDto;
import com.wzc.whattoeat.dto.DiningHallDto;
import com.wzc.whattoeat.service.intf.WteService;
import com.wzc.whattoeat.utils.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 〈吃什么Controller〉<br>
 * 〈功能详细描述〉
 *
 * @author PrinceCheng
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@RestController
@RequestMapping("/wte")
public class WteController extends BaseController{

    private static final Logger LOGGER = LoggerFactory.getLogger(WteController.class);

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
     * @return
     */
    @RequestMapping("/queryAllDiningHall")
    public String queryAllDiningHall(HttpServletRequest request, HttpServletResponse response) {
        BaseResponse r = BaseResponse.ok();
        try {
            // 查询所有餐厅
            List<DiningHallDto> allDiningHall = wteService.findAllDiningHall();
            r.put("data", allDiningHall);
        } catch (Exception e) {
            LOGGER.error("WteController queryAllDiningHall 发生异常", e);
            r = BaseResponse.error(ResponseConstant.RETRUN_EXCEPTION, "查询所有餐厅发生异常");
        }
        return ajaxJson(response, JsonUtils.toJSON(r));
    }

    /**
     * 根据餐厅查询菜品
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/queryDishByHall")
    public String queryDishByHall(HttpServletRequest request, HttpServletResponse response) {
        BaseResponse r = BaseResponse.ok();
        String diningHallCode = request.getParameter("diningHallCode");
        try {
            List<DiningHallDishDto> dishList = wteService.findDishByHall(diningHallCode);
            r.put("data", dishList);
        } catch (Exception e) {
            LOGGER.error("WteController queryAllDiningHall 发生异常", e);
            r = BaseResponse.error(ResponseConstant.RETRUN_EXCEPTION, "根据餐厅查询菜品发生异常");
        }
        return ajaxJson(response, JsonUtils.toJSON(r));
    }

}
