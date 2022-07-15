package com.self.mybatis.mapper;

import com.self.mybatis.entity.Stu;
import com.self.mybatis.entity.StuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu
     *
     * @mbg.generated Fri Jul 15 17:28:39 CST 2022
     */
    long countByExample(StuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu
     *
     * @mbg.generated Fri Jul 15 17:28:39 CST 2022
     */
    int deleteByExample(StuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu
     *
     * @mbg.generated Fri Jul 15 17:28:39 CST 2022
     */
    int deleteByPrimaryKey(Integer stuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu
     *
     * @mbg.generated Fri Jul 15 17:28:39 CST 2022
     */
    int insert(Stu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu
     *
     * @mbg.generated Fri Jul 15 17:28:39 CST 2022
     */
    int insertSelective(Stu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu
     *
     * @mbg.generated Fri Jul 15 17:28:39 CST 2022
     */
    List<Stu> selectByExample(StuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu
     *
     * @mbg.generated Fri Jul 15 17:28:39 CST 2022
     */
    Stu selectByPrimaryKey(Integer stuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu
     *
     * @mbg.generated Fri Jul 15 17:28:39 CST 2022
     */
    int updateByExampleSelective(@Param("record") Stu record, @Param("example") StuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu
     *
     * @mbg.generated Fri Jul 15 17:28:39 CST 2022
     */
    int updateByExample(@Param("record") Stu record, @Param("example") StuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu
     *
     * @mbg.generated Fri Jul 15 17:28:39 CST 2022
     */
    int updateByPrimaryKeySelective(Stu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu
     *
     * @mbg.generated Fri Jul 15 17:28:39 CST 2022
     */
    int updateByPrimaryKey(Stu record);
}