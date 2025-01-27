package com.wusihao.monkeypicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wusihao.monkeypicturebackend.model.dto.picture.PictureQueryRequest;
import com.wusihao.monkeypicturebackend.model.dto.picture.PictureReviewRequest;
import com.wusihao.monkeypicturebackend.model.dto.picture.PictureUploadRequest;
import com.wusihao.monkeypicturebackend.model.entity.Picture;
import com.wusihao.monkeypicturebackend.model.entity.User;
import com.wusihao.monkeypicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
* @author 吴思豪
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-01-26 22:30:42
*/
public interface PictureService extends IService<Picture> {
    /**
     * 上传图片
     *
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

    /**
     * 通过条件查询图片信息
     *
     * @param pictureQueryRequest
     * @return {@link null}
     * @author wusihao
     * @date 2025/1/27 20:32
     */
    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    /**
     * 分页获取图片封装(单条)
     */
    PictureVO getPictureVO(Picture picture, HttpServletRequest request);
    /**
     * 分页获取图片封装(多条)
     */
    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    void validPicture(Picture picture);

    /**
     * 图片审核
     *
     * @param pictureReviewRequest
     * @param loginUser
     */
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);

    /**
     * 编辑图片 管理员自动过审, 其他人待审核
     *
     * @param picture
     * @return {@link null}
     * @author wusihao
     * @date 2025/1/27 22:15
     */
    void fillReviewParams(Picture picture, User loginUser);
}
