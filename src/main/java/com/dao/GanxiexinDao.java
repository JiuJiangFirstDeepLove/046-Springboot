package com.dao;

import com.entity.GanxiexinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GanxiexinView;

/**
 * 感谢信 Dao 接口
 *
 * @author 
 */
public interface GanxiexinDao extends BaseMapper<GanxiexinEntity> {

   List<GanxiexinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
