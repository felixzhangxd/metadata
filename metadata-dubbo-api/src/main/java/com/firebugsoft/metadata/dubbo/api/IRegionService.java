package com.firebugsoft.metadata.dubbo.api;

import java.util.List;

import com.firebugsoft.metadata.dubbo.api.vto.RegionVto;

/**
 * 地区服务
 * @author felix
 */
public interface IRegionService {
    /** 地区编号查询 */
    RegionVto findByCode(String code);
    /** 子地区查询 */
    List<RegionVto> findByPcode(String pcode);
}
