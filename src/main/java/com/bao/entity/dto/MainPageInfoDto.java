package com.bao.entity.dto;

import com.bao.entity.bo.entity.HeadLine;
import com.bao.entity.bo.entity.ShopCategory;
import lombok.Data;

import java.util.List;

@Data
public class MainPageInfoDto {
    private List<HeadLine> headLines;
    private List<ShopCategory> shopCategories;
}
