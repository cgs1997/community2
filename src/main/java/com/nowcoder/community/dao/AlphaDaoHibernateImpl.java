package com.nowcoder.community.dao;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import org.springframework.stereotype.Repository;

/**
 * @param
 * @author Cao
 * @description
 * @return
 * @date 2022/5/16-10:25
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao {
    @Override
    public String select() {
        return "Hibernate";
    }
}
