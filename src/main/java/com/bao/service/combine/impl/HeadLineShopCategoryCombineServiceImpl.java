package com.bao.service.combine.impl;

import com.bao.entity.bo.entity.HeadLine;
import com.bao.entity.bo.entity.ShopCategory;
import com.bao.entity.dto.MainPageInfoDto;
import com.bao.entity.dto.Result;
import com.bao.service.combine.HeadLineShopCategoryCombineService;
import com.bao.service.solo.HeadLineService;
import com.bao.service.solo.ShopCategoryService;

import java.util.List;

public class HeadLineShopCategoryCombineServiceImpl implements HeadLineShopCategoryCombineService {
    private HeadLineService headLineService;
    private ShopCategoryService shopCategoryService;

    @Override
    public Result<MainPageInfoDto> getMainPageInfo() {
        HeadLine headLineCondition = new HeadLine();
        headLineCondition.setEnableStatus(1);
        Result<List<HeadLine>> headLines = headLineService.queryHeadLineByCondition(headLineCondition, 1, 4);

        // parent为空
        ShopCategory shopCategoryCondition = new ShopCategory();
        Result<List<ShopCategory>> shopCategorys = shopCategoryService.queryShopCategoryByCondition(shopCategoryCondition, 1, 100);
        Result<MainPageInfoDto> result = mergeMainPageInfo(headLineService, shopCategorys);
        return result;
    }

    private  Result<MainPageInfoDto> mergeMainPageInfo(HeadLineService headLineService, Result<List<ShopCategory>> shopCategorys) {
        return null;
    }
}
