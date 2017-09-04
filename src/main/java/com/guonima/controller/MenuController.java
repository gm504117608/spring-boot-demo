package com.guonima.controller;

import com.guonima.domain.MenuDO;
import com.guonima.service.menu.MenuService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author guonima
 * @create 2017-09-04 15:36
 */
@RestController
@RequestMapping("/menus")
public class MenuController {

    private Logger logger = LoggerFactory.getLogger(MenuController.class);

    @Autowired
    private MenuService menuService;

    @ApiOperation(value="获取系统菜单列表", notes="获取系统中定义的所有菜单信息")
    @RequestMapping(value = "/jdbcTemplate", method = {RequestMethod.GET})
    public List<MenuDO> getMenusInfo(){
        logger.info("jdbcTemplate获取数据");
        return menuService.getMenusInfo();
    }

    @RequestMapping(value = "/mybatis", method = {RequestMethod.GET})
    public List<MenuDO> getMenusInfoMybatis(){
        logger.info("mybatis获取数据");
        return menuService.getMenusInfoMybatis();
    }
}
