package com.sanjiang.gmall.service;

import com.sanjiang.gmall.bean.PmsBaseCatalog1;
import com.sanjiang.gmall.bean.PmsBaseCatalog2;
import com.sanjiang.gmall.bean.PmsBaseCatalog3;

import java.util.List;

/**
 * @author suncheng
 * @create 2020/3/19- 15:09
 */
public interface CatalogService {
    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
