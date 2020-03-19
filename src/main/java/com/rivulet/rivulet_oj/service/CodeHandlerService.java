package com.rivulet.rivulet_oj.service;

import com.rivulet.rivulet_oj.entity.Code;
import com.rivulet.rivulet_oj.entity.Response;
import com.rivulet.rivulet_oj.entity.Topic;
import org.springframework.stereotype.Service;

import java.util.Map;


public interface CodeHandlerService {
    String test();

    /**
     * 查询题库中所有题目(简略)
     * @param user_id
     * @return
     */
    Response searchTopics(int user_id);

    /**
     * 查询指定题目(根据Topic_id)
     * @param topic_id
     * @return
     */
    Response searchTopic(int topic_id);
    /**
     * 提交代码
     * @param user_id
     * @param topic_id
     * @param code
     * @return
     */
    Response submitCode(int user_id, int topic_id, String code);

    /**
     * 查询代码评判结果
     * @param code_id
     * @return
     */
    Response searchJudge(int code_id);
}
