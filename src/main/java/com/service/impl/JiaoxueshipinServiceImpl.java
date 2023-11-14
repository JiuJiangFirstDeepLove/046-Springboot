package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.JiaoxueshipinDao;
import com.entity.JiaoxueshipinEntity;
import com.service.JiaoxueshipinService;
import com.entity.view.JiaoxueshipinView;

/**
 * 教学视频 服务实现类
 */
@Service("jiaoxueshipinService")
@Transactional
public class JiaoxueshipinServiceImpl extends ServiceImpl<JiaoxueshipinDao, JiaoxueshipinEntity> implements JiaoxueshipinService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<JiaoxueshipinView> page =new Query<JiaoxueshipinView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
