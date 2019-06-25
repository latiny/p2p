package com.latiny.p2p.service.impl;

import com.latiny.p2p.domain.UserDomain;
import com.latiny.p2p.mapper.UserDomainMapper;
import com.latiny.p2p.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liujinwei
 * @version 1.0
 * @description: Demo implement
 * @date 2019/6/24 22:12
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private UserDomainMapper userDomainMapper;

    @Override
    public String test() {
        UserDomain userDomain = userDomainMapper.selectByPrimaryKey(1);
        String name = userDomain.getName();
        return name;
    }
}
