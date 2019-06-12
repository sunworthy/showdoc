package com.josh.doc.controller;

import com.josh.doc.common.resp.Result;
import com.josh.doc.req.ItemParam;
import com.josh.doc.service.impl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/item")
public class ItemController {

    @Autowired
    ItemServiceImpl itemService;

    @GetMapping("/list")
    public Result list(Integer uid){
        return  Result.success(itemService.findByUid(uid));
    }


    @PostMapping("info")
    public Result info(@RequestBody ItemParam param){
        return Result.success(itemService.findById(param.getItemId()));
    }

}
