package com.latiny.p2p.mapper;

import com.latiny.p2p.domain.UserDomain;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDomainMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(UserDomain record);

    int insertSelective(UserDomain record);

    UserDomain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserDomain record);

    int updateByPrimaryKey(UserDomain record);
}