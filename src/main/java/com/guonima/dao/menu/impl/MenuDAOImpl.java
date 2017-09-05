package com.guonima.dao.menu.impl;

import com.guonima.dao.menu.MenuDAO;
import com.guonima.domain.MenuDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author guonima
 * @create 2017-09-04 15:36
 */
@Repository("menuDAO")
public class MenuDAOImpl implements MenuDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<MenuDO> getMenusInfo() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from menu");
        List<MenuDO> menus = new ArrayList<MenuDO>();
        MenuDO menu = null;
        for (Map map : list) {
            menu = new MenuDO();
            menu.setId((Long) map.get("id"));
            menu.setName((String) map.get("name"));
            menu.setMenuKey((Integer) map.get("menu_key"));
            menu.setRouter((String) map.get("router"));
            menu.setCreateTime((Date) map.get("create_time"));
            menu.setEnabled((Integer) map.get("enabled"));
            menu.setParentId((Long) map.get("parent_id"));
            menu.setSort((Integer) map.get("sort"));
            menu.setLevel((Integer) map.get("level"));
            menu.setIcon((String) map.get("icon"));
            menu.setRemark((String) map.get("remark"));
            menus.add(menu);
        }
        return menus;
    }
}
