package com.tt.teach.service.impl;

import com.tt.teach.dao.StudentDao;
import com.tt.teach.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService{
    @Resource
    private StudentDao studentDao;
}
