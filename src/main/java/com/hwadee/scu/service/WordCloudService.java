package com.hwadee.scu.service;

import com.hwadee.scu.common.domain.CdComNum;
import com.hwadee.scu.common.domain.GdsnaqgsComNum;
import com.hwadee.scu.common.domain.QflComNum;
import com.hwadee.scu.common.domain.XwzydrComNum;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WordCloudService {
    List<GdsnaqgsComNum> findAllGd();
    List<CdComNum> findAllCd();
    List<XwzydrComNum> findAllMe();
    List<QflComNum> findAllQfl();
}
