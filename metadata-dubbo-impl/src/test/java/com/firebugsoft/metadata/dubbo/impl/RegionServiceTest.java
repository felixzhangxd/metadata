package com.firebugsoft.metadata.dubbo.impl;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.firebugsoft.metadata.dubbo.api.IRegionService;
import com.firebugsoft.metadata.dubbo.api.vto.RegionVto;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml")
public class RegionServiceTest {
    @Resource
    private IRegionService regionService;

    @Test
    public void pk() {
        RegionVto vto = regionService.findByCode("310113");
        Assert.assertNotNull(vto);
        Assert.assertEquals("宝山", vto.getName());
    }
}
