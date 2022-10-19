package com.bao.service.combine;

import com.bao.entity.dto.MainPageInfoDto;
import com.bao.entity.dto.Result;

public interface HeadLineShopCategoryCombineService {
    Result<MainPageInfoDto> getMainPageInfo();
}
