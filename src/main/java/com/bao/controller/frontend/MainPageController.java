package com.bao.controller.frontend;

import com.bao.entity.dto.MainPageInfoDto;
import com.bao.entity.dto.Result;
import com.bao.service.combine.HeadLineShopCategoryCombineService;
import org.simpleframework.core.annotation.Controller;

@Controller
public class MainPageController {

    private HeadLineShopCategoryCombineService headLineShopCategoryCombineService;

    public Result<MainPageInfoDto> getMainPageInfo(){
        return headLineShopCategoryCombineService.getMainPageInfo();
    }
}
