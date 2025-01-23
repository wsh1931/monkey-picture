package com.wusihao.monkeypicturebackend.controller;

import com.wusihao.monkeypicturebackend.common.BaseResponse;
import com.wusihao.monkeypicturebackend.common.ResultUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Api(tags = "测试")
public class MainController {

    /**
     * 健康检查
     */
    @GetMapping("/health")
    @ApiOperation("健康检查")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}
