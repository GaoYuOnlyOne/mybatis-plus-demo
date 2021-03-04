package com.example.mybatisplus.demo.controller;

import com.example.mybatisplus.demo.common.R;
import com.example.mybatisplus.demo.model.BladeCode;
import com.example.mybatisplus.demo.service.BladeCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description :
 * @Author : gaoyu
 * 2021/3/3
 */
@RestController
@RequestMapping(value = "blade_code")
public class BladeCodeController {
    @Autowired
    private BladeCodeService bladeCodeService;

    @GetMapping("test")
    public String test(){
        return "我是test";
    }

    @GetMapping("list")
    public R getList(){
        return R.ok(bladeCodeService.getList());
    }

    @PutMapping("insert")
    public R insert(@RequestBody BladeCode bladeCode){
        return R.ok(bladeCodeService.insert(bladeCode));
    }

    @DeleteMapping("delete")
    public R delete(@RequestBody BladeCode bladeCode){
        return R.ok(bladeCodeService.delete(bladeCode.getId()));
    }

}
