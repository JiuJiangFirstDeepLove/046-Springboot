package com.dao;

import com.entity.ChongwurenlingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwurenlingView;

/**
 * 宠物认领 Dao 接口
 *
 * @author 
 */
public interface ChongwurenlingDao extends BaseMapper<ChongwurenlingEntity> {

   List<ChongwurenlingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
