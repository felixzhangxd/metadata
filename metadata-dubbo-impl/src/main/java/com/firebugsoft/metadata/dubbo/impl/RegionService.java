package com.firebugsoft.metadata.dubbo.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.firebugsoft.metadata.dubbo.api.IRegionService;
import com.firebugsoft.metadata.dubbo.api.vto.RegionVto;
import com.firebugsoft.metadata.dubbo.impl.dao.RegionDao;
import com.firebugsoft.metadata.dubbo.impl.po.RegionPo;

@Service
public class RegionService implements IRegionService {
    @Resource
    private RegionDao regionDao;

    @Override
    @Transactional(isolation=Isolation.READ_COMMITTED, readOnly=true, propagation=Propagation.REQUIRED)
    public RegionVto findByCode(String code) {
        return regionDao.findByCode(code);
    }

    @Override
    @Transactional(isolation=Isolation.READ_COMMITTED, readOnly=true, propagation=Propagation.REQUIRED)
    public List<RegionVto> findByPcode(String pcode) {
        List<RegionPo> pos = regionDao.findByPcode(pcode);
        return new ArrayList<RegionVto>(pos);
    }
}
