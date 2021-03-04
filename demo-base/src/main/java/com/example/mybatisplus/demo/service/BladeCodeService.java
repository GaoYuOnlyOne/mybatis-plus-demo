package com.example.mybatisplus.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mybatisplus.demo.model.BladeCode;

import java.util.List;

/**
 * @description :
 * @Author : gaoyu
 * 2021/3/3
 */
public interface BladeCodeService extends IService<BladeCode> {
    List<BladeCode> getList();

    int insert(BladeCode bladeCode);

    int delete(Long id);
}
