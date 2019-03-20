package com.sanayard.mybatis;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserService {

    @Resource
    private SmpUserDao smpUserDao;

    public void test(){
        SmpUserPo smpUserPo = smpUserDao.getByUserId(1L);
        System.out.println("name "+smpUserPo.getUserName());
        smpUserPo.setUpdateDate(525521L);
        smpUserDao.updateByUserId(smpUserPo);
    }
}
