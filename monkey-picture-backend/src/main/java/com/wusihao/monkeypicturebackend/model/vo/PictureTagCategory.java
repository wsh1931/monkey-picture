package com.wusihao.monkeypicturebackend.model.vo;

import lombok.Data;

import java.util.List;

/**
 * @author: wusihao
 * @date: 2025/1/27 21:08
 * @version: 1.0
 * @description:
 */
@Data
public class PictureTagCategory {
    private List<String> tagList;
    private List<String> categoryList;
}
