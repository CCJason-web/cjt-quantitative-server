package com.cjt.quantity.search.service.impl;

import com.cjt.quantity.search.dao.EsProductDao;
import com.cjt.quantity.search.domain.EsProduct;
import com.cjt.quantity.search.service.EsProductService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Jason on 2023/01/05
 */
@Service
public class EsProductServiceImpl implements EsProductService{

    @Autowired
    private EsProductDao esProductDao;

    @Override
    public int importAllProduct() {
        List<EsProduct> esProducts = esProductDao.getAllEsProductList(null);
        return 0;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public EsProduct create(Long id) {
        return null;
    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public Page<EsProduct> search(String keyword, Integer pagenum, Integer pageSize) {
        return null;
    }
}
