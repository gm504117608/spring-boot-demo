package com.guonima.service.menu.impl;

import com.guonima.dao.menu.MenuDAO;
import com.guonima.domain.MenuDO;
import com.guonima.exception.SystemException;
import com.guonima.mapper.MenuMapper;
import com.guonima.service.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author guonima
 * @create 2017-09-04 15:33
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDAO menuDAO;

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<MenuDO> getMenusInfo() {
        return menuDAO.getMenusInfo();
    }

    @Override
    public List<MenuDO> getMenusInfoMybatis() {
        return menuMapper.getMenusInfo();
    }

    @Override
    @Transactional
    public int save(MenuDO menuDO) {
        try {
            menuMapper.insert(menuDO);
            menuMapper.update(menuDO);
            menuMapper.delete(menuDO);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SystemException(e.getMessage());
        }
    }


}
