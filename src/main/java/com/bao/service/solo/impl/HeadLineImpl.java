package com.bao.service.solo.impl;

import com.bao.entity.bo.HeadLine;
import com.bao.entity.dto.Result;
import com.bao.service.solo.HeadLineService;
import org.simpleframework.core.annotation.Service;

import java.util.List;

@Service
public class HeadLineImpl implements HeadLineService {

    @Override
    public Result<Boolean> addHeadLine(HeadLine headLine) {
        return null;
    }

    @Override
    public Result<Boolean> removeHeadLine(int headLineId) {
        return null;
    }

    @Override
    public Result<Boolean> modifyHeadLine(HeadLine headLine) {
        return null;
    }

    @Override
    public Result<Boolean> queryHeadLineById(int headLineId) {
        return null;
    }

    @Override
    public Result<List<HeadLine>> queryHeadLineByCondition(HeadLine headLineCondition, int pageIndex, int pageSize) {
        return null;
    }
}
