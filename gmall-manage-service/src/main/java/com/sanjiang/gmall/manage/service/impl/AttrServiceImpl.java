package com.sanjiang.gmall.manage.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.sanjiang.gmall.bean.PmsBaseAttrInfo;
import com.sanjiang.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.sanjiang.gmall.manage.mapper.PmsBaseAttrValueMapper;
import com.sanjiang.gmall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author suncheng
 * @create 2020/3/20- 21:22
 */
@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {

        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
        return pmsBaseAttrInfos;
    }
}
