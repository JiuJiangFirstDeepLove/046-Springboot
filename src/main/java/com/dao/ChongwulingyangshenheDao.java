package com.dao;

import com.entity.ChongwulingyangshenheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwulingyangshenheView;

/**
 * 宠物领养审核 Dao 接口
 *
 * @author 
 */
public interface ChongwulingyangshenheDao extends BaseMapper<ChongwulingyangshenheEntity> {

   List<ChongwulingyangshenheView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
