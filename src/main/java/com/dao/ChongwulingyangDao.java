package com.dao;

import com.entity.ChongwulingyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwulingyangView;

/**
 * 宠物领养 Dao 接口
 *
 * @author 
 */
public interface ChongwulingyangDao extends BaseMapper<ChongwulingyangEntity> {

   List<ChongwulingyangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
