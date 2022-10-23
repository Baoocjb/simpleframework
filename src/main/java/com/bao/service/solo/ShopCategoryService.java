package com.bao.service.solo;

import com.bao.entity.bo.ShopCategory;
import com.bao.entity.dto.Result;

import java.util.List;

public interface ShopCategoryService {
    Result<Boolean> addShopCategory(ShopCategory shopCategory);
    Result<Boolean> removeShopCategory(int shopCategoryId);
    Result<Boolean> modifyShopCategory(ShopCategory shopCategory);
    Result<ShopCategory> queryShopCategoryById(int shopCategoryId);
    Result<List<ShopCategory>> queryShopCategoryByCondition(ShopCategory shopCategoryCondition, int pageIndex, int pageSize);

}
