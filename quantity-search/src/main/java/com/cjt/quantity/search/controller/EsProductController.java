// Jason's product
package com.cjt.quantity.search.controller;

import com.cjt.quantity.search.service.EsProductService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "EsProductController")
@Tag(name = "EsProductController", description = "Search Product")
@RequestMapping("/esProduct")
public class EsProductController {

    @Autowired
    private EsProductService esProductService;

    @RequestMapping(value="/importAll", method = RequestMethod.POST)
    @ResponseBody
    public void importAllList() {
        int count = esProductService.importAllProduct();
    }

}
