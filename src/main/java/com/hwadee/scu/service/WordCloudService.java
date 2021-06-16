package com.hwadee.scu.service;

import com.hwadee.scu.common.domain.CdComNum;
import com.hwadee.scu.common.domain.GdsnaqgsComNum;
import com.hwadee.scu.common.domain.QflComNum;
import com.hwadee.scu.common.domain.XwzydrComNum;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WordCloudService {
    public List<GdsnaqgsComNum> findAllGd();
    public List<CdComNum> findAllCd();
    public List<XwzydrComNum> findAllMe();
    public List<QflComNum> findAllQfl();
}
