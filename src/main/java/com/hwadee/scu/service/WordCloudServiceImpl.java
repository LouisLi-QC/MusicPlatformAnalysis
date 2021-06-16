package com.hwadee.scu.service;

import com.hwadee.scu.common.domain.CdComNum;
import com.hwadee.scu.common.domain.GdsnaqgsComNum;
import com.hwadee.scu.common.domain.QflComNum;
import com.hwadee.scu.common.domain.XwzydrComNum;
import com.hwadee.scu.mapper.CdComNumMapper;
import com.hwadee.scu.mapper.GdsnaqgsComNumMapper;
import com.hwadee.scu.mapper.QflComNumMapper;
import com.hwadee.scu.mapper.XwzydrComNumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordCloudServiceImpl implements WordCloudService {
    @Autowired
    private GdsnaqgsComNumMapper gdsnaqgsComNumMapper;
    @Autowired
    private CdComNumMapper cdComNumMapper;
    @Autowired
    private XwzydrComNumMapper xwzydrComNumMapper;
    @Autowired
    private QflComNumMapper qflComNumMapper;

    @Override
    public List<GdsnaqgsComNum> findAllGd() {
        return gdsnaqgsComNumMapper.selectAll();
    }

    @Override
    public List<CdComNum> findAllCd() {
        return cdComNumMapper.findAllCd();
    }

    @Override
    public List<XwzydrComNum> findAllMe() {
        return xwzydrComNumMapper.findAllMe();
    }

    @Override
    public List<QflComNum> findAllQfl() {
        return qflComNumMapper.findAllQfl();
    }

}
