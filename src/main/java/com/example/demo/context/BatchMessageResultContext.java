package com.example.demo.context;

import com.example.demo.vo.QueryVO;

import java.util.ArrayList;
import java.util.List;

public class BatchMessageResultContext {

    //查询结果列表
    private List<QueryVO> queryResultList;

    //查找结果channel《渠道》
    private String finalResultChannel;

    public List<QueryVO> getQueryResultList() {
        return queryResultList;
    }

    public void setQueryResultList(List<QueryVO> queryResultList) {
        this.queryResultList = queryResultList;
    }

    public String getFinalResultChannel() {
        return finalResultChannel;
    }

    public void setFinalResultChannel(String finalResultChannel) {
        this.finalResultChannel = finalResultChannel;
    }

    public void addQueryVO(QueryVO queryVO){
        if (queryResultList == null){
            queryResultList = new ArrayList<>();
        }
        queryResultList.add(queryVO);
    }
}
