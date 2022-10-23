package com.bao.service.solo;

import com.bao.entity.bo.HeadLine;
import com.bao.entity.dto.Result;

import java.util.List;

public interface HeadLineService {
    Result<Boolean> addHeadLine(HeadLine headLine);
    Result<Boolean> removeHeadLine(int headLineId);
    Result<Boolean> modifyHeadLine(HeadLine headLine);
    Result<Boolean> queryHeadLineById(int headLineId);
    Result<List<HeadLine>> queryHeadLineByCondition(HeadLine headLineCondition, int pageIndex, int pageSize);
}
