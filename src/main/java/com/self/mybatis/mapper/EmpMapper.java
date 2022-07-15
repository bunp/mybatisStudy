package com.self.mybatis.mapper;

import com.self.mybatis.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    /**
     * 添加员工
     * @return
     */
    Integer insertEmp(Emp emp);

    List<Emp> selectAllEmp();

    int deleteByEmpNo(@Param("empNo") Integer empNo);

    List<Emp> selectmplike(@Param("ename") String ename);

    int batchDelete(@Param("empnos") int[] empnos);

    List<Emp> selectByTableName(@Param("tableName") String tableName);

    List<Emp> selectByCondition(Emp emp);

}
