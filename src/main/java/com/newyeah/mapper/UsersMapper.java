package com.newyeah.mapper;

import com.newyeah.entity.Users;
import com.newyeah.entity.UsersSelective;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface UsersMapper {
    long countByExample(UsersSelective example);

    int deleteByExample(UsersSelective example);

    int deleteByPrimaryKey(String name);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExampleWithRowbounds(UsersSelective example, RowBounds rowBounds);

    List<Users> selectByExample(UsersSelective example);

    Users selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersSelective example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersSelective example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}