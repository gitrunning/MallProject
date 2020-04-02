package com.ldgroup.ldmall.ldmallproductservice.dao.mapper;

import com.ldgroup.ldmall.ldmallproductservice.dao.MyBaseDao;
import com.ldgroup.ldmall.ldmallproductservice.dao.entity.SBox;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/4/2 14:40
 **/
@Repository
public interface SboxDao extends MyBaseDao<SBox> {

    List<SBox> selectSboxesBySlineId(@Param("slineId") String slineId, @Param("start") LocalDateTime start, @Param("end") LocalDateTime end);
}
