package com.guonima.service.menu;

import com.guonima.domain.MenuDO;

import java.util.List;

/**
 * @author guonima
 * @create 2017-09-04 15:32
 */
public interface MenuService {

    public List<MenuDO> getMenusInfo();

    public List<MenuDO> getMenusInfoMybatis();
}
