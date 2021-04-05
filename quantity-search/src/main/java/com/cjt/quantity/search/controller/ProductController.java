package com.cjt.quantity.search.controller;

import com.cjt.quantity.search.dao.ProductDao;
import com.cjt.quantity.search.dao.UserDao;
import com.cjt.quantity.search.domain.Product;
import com.cjt.quantity.search.domain.User;
import io.swagger.annotations.ApiOperation;
import org.apache.lucene.queryparser.flexible.core.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cjt.quantity.common.api.ResultCode;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/search")
public class ProductController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private ProductDao productDao;

    @RequestMapping(value = "/addCount", method = RequestMethod.POST)
    @ResponseBody
    public String create(@RequestBody String request) {
        System.out.println("test");
        return "";
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    @ResponseBody
    public List getProduct() {
        List<Product> allProduct = productDao.getAllProduct();
        return allProduct;
    }
}
