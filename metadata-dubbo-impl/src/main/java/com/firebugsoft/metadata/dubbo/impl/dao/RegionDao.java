package com.firebugsoft.metadata.dubbo.impl.dao;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.firebugsoft.metadata.dubbo.impl.po.RegionPo;

@Repository
public class RegionDao {
    private Logger              logger = LoggerFactory.getLogger("sql");
    private RowMapper<RegionPo> mapper = BeanPropertyRowMapper.newInstance(RegionPo.class);
    @Resource
    private JdbcTemplate        jdbcTemplate;

    public RegionPo findByCode(String code) {
        String sql = "select code,pcode,name,level,first_spell,simple_spell,intact_spell,update_at from t_region where code=?";
        Object[] args = new Object[] { code };
        logger.info("{}; {}", sql, args);
        return jdbcTemplate.queryForObject(sql, args, mapper);
    }

    public List<RegionPo> findByPcode(String pcode) {
        String sql = "select code,pcode,name,level,first_spell,simple_spell,intact_spell,update_at from t_region where pcode=?";
        Object[] args = new Object[] { pcode };
        logger.info("{}; {}", sql, args);
        return jdbcTemplate.query(sql, args, mapper);
    }
}
