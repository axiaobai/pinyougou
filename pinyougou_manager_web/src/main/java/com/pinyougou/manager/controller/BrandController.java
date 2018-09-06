package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandSevice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/brand")
public class BrandController {
    @Reference
    private BrandSevice brandService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }


}
