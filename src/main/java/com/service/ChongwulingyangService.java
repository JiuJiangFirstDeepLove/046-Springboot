package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwulingyangEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 宠物领养 服务类
 */
public interface ChongwulingyangService extends IService<ChongwulingyangEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}