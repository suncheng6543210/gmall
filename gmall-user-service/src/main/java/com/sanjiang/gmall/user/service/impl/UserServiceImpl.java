package com.sanjiang.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sanjiang.gmall.bean.UmsMember;
import com.sanjiang.gmall.bean.UmsMemberReceiveAddress;
import com.sanjiang.gmall.service.UserService;
import com.sanjiang.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.sanjiang.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * @author suncheng
 * @create 2020/3/15- 13:09
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {

//        List<UmsMember> umsMemberList=userMapper.selectAllUser();
        List<UmsMember> umsMemberList = userMapper.selectAll();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        //封装的参数对象

        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

//        Example example = new Example(UmsMemberReceiveAddress.class);
//        example.createCriteria().andEqualTo("memberId", memberId);
//        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(example);
        return umsMemberReceiveAddresses;
    }
}
