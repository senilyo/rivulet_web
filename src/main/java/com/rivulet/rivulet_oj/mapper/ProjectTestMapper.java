package com.rivulet.rivulet_oj.mapper;

import com.rivulet.rivulet_oj.entity.Code;
import com.rivulet.rivulet_oj.entity.Topic;
import com.rivulet.rivulet_oj.entity.User_topic;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ProjectTestMapper {

    /**
     * @sql 查询topic表中所有记录
     * @return
     */
    @Select("select * from topic")
    Topic[] searchTopic();

    /**
     * @sql 添加用户提交信息
     * @param userTopic
     */
    @Insert("insert into user_topic (ut_topic_id,ut_user_id,ut_time) values(#{ut_topic_id},#{ut_user_id},#{ut_time})")
    void addSubmit(User_topic userTopic);

    /**
     * @sql 保存用户代码
     * @param code
     */
    @Insert("insert into code (code_user_id,code_topic_id,code_state,code_details) values(#{code_user_id},#{code_topic_id},#{code_state},#{code_details})")
    @Options(useGeneratedKeys = true,keyProperty = "code_id")
    void addCode(Code code);

    @Select("select * from code where code_id = #{code_id}")
    Code searchCode(int Code_id);
}
