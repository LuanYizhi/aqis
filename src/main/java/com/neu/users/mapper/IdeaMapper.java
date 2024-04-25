package com.neu.users.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neu.users.entity.Idea;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IdeaMapper extends BaseMapper<Idea> {
    //查询未解决的意见
    public List<Idea> selectIdeaByZero(Integer id);
}
