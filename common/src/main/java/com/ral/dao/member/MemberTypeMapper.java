package com.ral.dao.member;

import com.ral.model.entity.member.MemberType;
import com.ral.model.entity.member.MemberTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_type
     *
     * @mbggenerated
     */
    int countByExample(MemberTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_type
     *
     * @mbggenerated
     */
    int deleteByExample(MemberTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_type
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_type
     *
     * @mbggenerated
     */
    int insert(MemberType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_type
     *
     * @mbggenerated
     */
    int insertSelective(MemberType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_type
     *
     * @mbggenerated
     */
    List<MemberType> selectByExample(MemberTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_type
     *
     * @mbggenerated
     */
    MemberType selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_type
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MemberType record, @Param("example") MemberTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_type
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MemberType record, @Param("example") MemberTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MemberType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MemberType record);
}