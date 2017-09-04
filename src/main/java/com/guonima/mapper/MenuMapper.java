package com.guonima.mapper;

import com.guonima.domain.MenuDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author guonima
 * @create 2017-09-04 16:52
 */
//  使用Mapper注解或者在启动类Application中使用MapperScan扫描mapper接口
@Mapper
public interface MenuMapper {
    public List<MenuDO> getMenusInfo();
}
