// Jason's product
package com.cjt.quantity.search.controller;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Api(tags = "EsProductController")
@Tag(name = "EsProductController",description = "Search Product")
@RequestMapping("/esProduct")
public class EsProductController {


}
