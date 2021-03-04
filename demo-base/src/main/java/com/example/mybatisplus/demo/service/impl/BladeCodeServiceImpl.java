package com.example.mybatisplus.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplus.demo.mapper.BladeCodeMapper;
import com.example.mybatisplus.demo.model.BladeCode;
import com.example.mybatisplus.demo.service.BladeCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description :
 * @Author : gaoyu
 * 2021/3/3
 */
@Service
public class BladeCodeServiceImpl extends ServiceImpl<BladeCodeMapper,BladeCode> implements BladeCodeService {
    @Autowired
    private BladeCodeMapper bladeCodeMapper;

    public List<BladeCode> getList() {
        return bladeCodeMapper.selectList(null);
    }

    public int insert(BladeCode bladeCode) {
        return bladeCodeMapper.insert(bladeCode);
    }

    public int delete(Long id) {
        return bladeCodeMapper.deleteById(id);
    }
}
