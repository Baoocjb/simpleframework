package com.bao.controller.superadmin;

import com.bao.entity.bo.ShopCategory;
import com.bao.entity.dto.Result;
import com.bao.service.solo.ShopCategoryService;
import org.simpleframework.core.annotation.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class ShopCategoryOperationController {

    private ShopCategoryService shopCategoryService;

    public Result<Boolean> addShopCategory(HttpServletRequest req, HttpServletResponse resp){
        // TODO 参数校验以及请求参数转化
        return shopCategoryService.addShopCategory(new ShopCategory());
    }
    public Result<Boolean> removeShopCategory(HttpServletRequest req, HttpServletResponse resp){
        // TODO 参数校验以及请求参数转化
        return shopCategoryService.removeShopCategory(1);
    }
    public Result<Boolean> modifyShopCategory(HttpServletRequest req, HttpServletResponse resp){
        // TODO 参数校验以及请求参数转化
        return shopCategoryService.modifyShopCategory(new ShopCategory());
    }
    public Result<ShopCategory> queryShopCategoryById(HttpServletRequest req, HttpServletResponse resp){
        // TODO 参数校验以及请求参数转化
        return shopCategoryService.queryShopCategoryById(1);
    }
    public Result<List<ShopCategory>> queryShopCategoryByCondition(HttpServletRequest req, HttpServletResponse resp){
        // TODO 参数校验以及请求参数转化
        return shopCategoryService.queryShopCategoryByCondition(null, 1, 100);
    }
}
