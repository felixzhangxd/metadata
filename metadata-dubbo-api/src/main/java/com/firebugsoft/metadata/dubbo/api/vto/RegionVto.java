package com.firebugsoft.metadata.dubbo.api.vto;

import java.io.Serializable;

public class RegionVto implements Serializable {
    private static final long serialVersionUID = -1682234349566305176L;
    private String            code;                                    // 地区编号
    private String            pcode;                                   // 上一级地区编号
    private String            name;                                    // 地区名字
    private Integer           level;                                   // 地区树状结构的层级
    private String            firstSpell;                              // 首字母
    private String            simpleSpell;                             // 拼音简拼
    private String            intactSpell;                             // 拼音全拼

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPcode() {
        return this.pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getFirstSpell() {
        return this.firstSpell;
    }

    public void setFirstSpell(String firstSpell) {
        this.firstSpell = firstSpell;
    }

    public String getSimpleSpell() {
        return this.simpleSpell;
    }

    public void setSimpleSpell(String simpleSpell) {
        this.simpleSpell = simpleSpell;
    }

    public String getIntactSpell() {
        return this.intactSpell;
    }

    public void setIntactSpell(String intactSpell) {
        this.intactSpell = intactSpell;
    }
}
