package com.firebugsoft.metadata.api.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firebugsoft.common.mvc.json.Body;
import com.firebugsoft.metadata.dubbo.api.IRegionService;

@RestController
@RequestMapping(value = { "/region" })
public class RegionController {
    @Resource
    private IRegionService regionService;
    
    @RequestMapping(value = { "/code" })    
    public Body findByCode(String code) {
        return Body.newInstance(regionService.findByCode(code));
    }
    
    @RequestMapping(value = { "/pcode" })    
    public Body findByPcode(String pcode) {
        return Body.newInstance(regionService.findByPcode(pcode));
    }
}
