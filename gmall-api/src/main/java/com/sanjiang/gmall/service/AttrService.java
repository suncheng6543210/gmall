package com.sanjiang.gmall.service;


import com.sanjiang.gmall.bean.PmsBaseAttrInfo;

import java.util.List;

/**
 * @author suncheng
 * @create 2020/3/20- 20:59
 */
public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);
}
