package com.sanjiang.gmall.user.mapper;

import com.sanjiang.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author suncheng
 * @create 2020/3/15- 13:11
 */
public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();
}
