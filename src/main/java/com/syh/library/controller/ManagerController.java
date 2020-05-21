package com.syh.library.controller;

import com.syh.library.mapper.ManagerMapper;
import com.syh.library.pojo.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManagerController {

    @Autowired
    private ManagerMapper managerMapper;

    @RequestMapping("/manager")
    public List<Manager> findAll(){
        return managerMapper.findAllManager();
    }
}
