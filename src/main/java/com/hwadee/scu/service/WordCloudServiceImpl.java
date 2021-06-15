package com.hwadee.scu.service;

import com.hwadee.scu.common.domain.GdsnaqgsComNum;
import com.hwadee.scu.mapper.GdsnaqgsComNumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordCloudServiceImpl implements WordCloudService {
    @Autowired
    private GdsnaqgsComNumMapper gdsnaqgsComNumMapper;

    @Override
    public List<GdsnaqgsComNum> findAllGd() {
        return gdsnaqgsComNumMapper.selectAll();
    }

}
