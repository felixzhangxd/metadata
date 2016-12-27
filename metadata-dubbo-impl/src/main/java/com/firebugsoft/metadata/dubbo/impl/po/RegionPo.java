package com.firebugsoft.metadata.dubbo.impl.po;

import java.sql.Timestamp;

import com.firebugsoft.metadata.dubbo.api.vto.RegionVto;

public class RegionPo extends RegionVto {
    private static final long serialVersionUID = -86584570781885363L;
    private Timestamp         updateAt;

    public Timestamp getUpdateAt() {
        return this.updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }
}
