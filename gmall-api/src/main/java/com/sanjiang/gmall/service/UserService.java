package com.sanjiang.gmall.service;


import com.sanjiang.gmall.bean.UmsMember;
import com.sanjiang.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author suncheng
 * @create 2020/3/15- 13:08
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
