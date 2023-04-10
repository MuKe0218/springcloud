package com.kql.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kql.entity.DishFlavor;
import com.kql.mapper.DishFlavorMapper;
import com.kql.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
