package com.cjt.quantity.search.service;

import com.cjt.quantity.search.domain.EsProduct;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * Created by Jason on 2023/01/05
 */
public interface EsProductService {

    int importAllProduct();

    void delete(Long id);

    EsProduct create(Long id);

    void delete(List<Long> ids);

    Page<EsProduct> search(String keyword, Integer pagenum, Integer pageSize);
}
