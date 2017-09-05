package com.guonima.controller;

import com.alibaba.fastjson.JSONObject;
import com.guonima.domain.MenuDO;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MenuControllerTest {

    @Autowired
    private MockMvc mvc;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getMenusInfo()
     */
    @Test
    public void testGetMenusInfo() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/menus/jdbcTemplate"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    /**
     * Method: getMenusInfoMybatis()
     */
    @Test
    public void testGetMenusInfoMybatis() throws Exception {
    }

    /**
     * Method: save(MenuDO menuDO)
     */
    @Test
    public void testSave() throws Exception {
        MenuDO menu = new MenuDO();
        menu.setSort(10);
        menu.setName("Test");
        menu.setMenuKey(11111);
        menu.setRouter("/test/test");
        ResultActions mvcResult = mvc.perform(MockMvcRequestBuilders.post("/menus").content(JSONObject.toJSONString(menu)))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }


} 
