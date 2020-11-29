package com.justDoIt.core.dao;

import org.apache.ibatis.annotations.Param;

public interface ClassDao {
    Class findClassById(@Param("id")int id);
}
