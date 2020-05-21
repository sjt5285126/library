package com.syh.library.mapper;

import com.syh.library.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ManagerMapper {
    List<Manager> findAllManager();
}
