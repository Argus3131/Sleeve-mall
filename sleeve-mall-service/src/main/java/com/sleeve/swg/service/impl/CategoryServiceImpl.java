package com.sleeve.swg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sleeve.swg.entity.CategoryEntity;
import com.sleeve.swg.mapper.CategoryMapper;
import com.sleeve.swg.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品分类  服务实现类
 * </p>
 *
 * @author argus
 * @since 2022-01-13
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, CategoryEntity> implements CategoryService {

}
