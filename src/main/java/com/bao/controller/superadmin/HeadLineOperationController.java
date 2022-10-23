package com.bao.controller.superadmin;

import com.bao.entity.bo.HeadLine;
import com.bao.entity.dto.Result;
import com.bao.service.solo.HeadLineService;
import org.simpleframework.core.annotation.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class HeadLineOperationController {

    private HeadLineService headLineService;

    public Result<Boolean> addHeadLine(HttpServletRequest req, HttpServletResponse resp){
        // TODO 参数校验以及请求参数转化
        return headLineService.addHeadLine(new HeadLine());
    }
    public Result<Boolean> removeHeadLine(HttpServletRequest req, HttpServletResponse resp){
        // TODO 参数校验以及请求参数转化
        return headLineService.removeHeadLine(1);
    }
    public Result<Boolean> modifyHeadLine(HttpServletRequest req, HttpServletResponse resp){
        // TODO 参数校验以及请求参数转化
        return headLineService.modifyHeadLine(new HeadLine());
    }
    public Result<Boolean> queryHeadLineById(HttpServletRequest req, HttpServletResponse resp){
        // TODO 参数校验以及请求参数转化
        return headLineService.queryHeadLineById(1);
    }
    public Result<List<HeadLine>> queryHeadLineByCondition(HttpServletRequest req, HttpServletResponse resp){
        // TODO 参数校验以及请求参数转化
        return headLineService.queryHeadLineByCondition(null, 1, 100);
    }

}
