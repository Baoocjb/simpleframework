package com.bao.service.solo.impl;

import com.bao.entity.bo.entity.ShopCategory;
import com.bao.entity.dto.Result;
import com.bao.service.solo.ShopCategoryService;

import java.util.List;

public class ShopCategoryImpl implements ShopCategoryService {
    @Override
    public Result<Boolean> addShopCategory(ShopCategory shopCategory) {
        return null;
    }

    @Override
    public Result<Boolean> removeShopCategory(int shopCategoryId) {
        return null;
    }

    @Override
    public Result<Boolean> modifyShopCategory(ShopCategory shopCategory) {
        return null;
    }

    @Override
    public Result<ShopCategory> queryShopCategoryById(int shopCategoryId) {
        return null;
    }

    @Override
    public Result<List<ShopCategory>> queryShopCategoryByCondition(ShopCategory shopCategoryCondition, int pageIndex, int pageSize) {
        return null;
    }
}
