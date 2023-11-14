package com.dao;

import com.entity.JiaoxueshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoxueshipinView;

/**
 * 教学视频 Dao 接口
 *
 * @author 
 */
public interface JiaoxueshipinDao extends BaseMapper<JiaoxueshipinEntity> {

   List<JiaoxueshipinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
