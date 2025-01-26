package com.wusihao.monkeypicturebackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wusihao.monkeypicturebackend.model.entity.Picture;
import com.wusihao.monkeypicturebackend.service.PictureService;
import com.wusihao.monkeypicturebackend.mapper.PictureMapper;
import org.springframework.stereotype.Service;

/**
* @author 吴思豪
* @description 针对表【picture(图片)】的数据库操作Service实现
* @createDate 2025-01-26 22:30:42
*/
@Service
public class PictureServiceImpl extends ServiceImpl<PictureMapper, Picture>
    implements PictureService{

}




