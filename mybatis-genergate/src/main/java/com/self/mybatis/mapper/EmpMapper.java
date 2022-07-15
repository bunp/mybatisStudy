package com.self.mybatis.mapper;

import com.self.mybatis.entity.Emp;
import com.self.mybatis.entity.EmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    long countByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    int deleteByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    int deleteByPrimaryKey(Integer empNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    int insert(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    int insertSelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    List<Emp> selectByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    Emp selectByPrimaryKey(Integer empNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    int updateByPrimaryKeySelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Fri Jul 15 17:31:18 CST 2022
     */
    int updateByPrimaryKey(Emp record);
}