package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @param
 * @author Cao
 * @description
 * @return
 * @date 2022/5/16-10:24
 */

@Repository
@Primary
public class AlphaDaoMyBatisImpl implements AlphaDao{

    @Override
    public String select() {
        return "MyBatis";
    }
}
