package com.dao;

import com.entity.ChongwurenlingshenheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwurenlingshenheView;

/**
 * 宠物认领审核 Dao 接口
 *
 * @author 
 */
public interface ChongwurenlingshenheDao extends BaseMapper<ChongwurenlingshenheEntity> {

   List<ChongwurenlingshenheView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
