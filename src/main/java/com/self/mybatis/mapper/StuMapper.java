package com.self.mybatis.mapper;

import com.self.mybatis.entity.Stu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuMapper {

    Stu selectByStuId(@Param("stuId") int stuId);
    List<Stu> selectByClassId(@Param("classId") int classId);

    int batchInsert(List<Stu> stus);
}
