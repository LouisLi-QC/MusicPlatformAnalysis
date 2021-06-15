package com.hwadee.scu.service;

import com.hwadee.scu.common.domain.GdsnaqgsComNum;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WordCloudService {
    public List<GdsnaqgsComNum> findAllGd();
}
