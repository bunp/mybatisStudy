package com.self.mybatis.mapper;

import com.self.mybatis.entity.ClassName;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassNameMapper {

    ClassName selectByClassId(@Param("classId") int classId);
    ClassName selectonetomany(@Param("classId") int classId);

}
