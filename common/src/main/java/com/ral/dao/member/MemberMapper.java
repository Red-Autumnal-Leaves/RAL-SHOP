package com.ral.dao.member;

import java.util.List;

import com.ral.model.dto.member.MemberDto;
import com.ral.model.entity.member.Member;
import com.ral.model.entity.member.MemberExample;
import com.ral.model.query.member.MemberQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberMapper {

    int countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExample(MemberExample example);

    Member selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);

    int queryCount(MemberQuery query);

    List<MemberDto> query(MemberQuery query);

    MemberDto getMemberDto(@Param("id")Long id);

}