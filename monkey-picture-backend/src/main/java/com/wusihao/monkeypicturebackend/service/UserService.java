package com.wusihao.monkeypicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wusihao.monkeypicturebackend.model.dto.user.UserQueryRequest;
import com.wusihao.monkeypicturebackend.model.entity.User;
import com.wusihao.monkeypicturebackend.model.vo.LoginUserVO;
import com.wusihao.monkeypicturebackend.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author 吴思豪
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-01-24 21:50:19
*/
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 返回脱敏后的用户信息
     *
     * @param user
     * @return {@link null}
     * @author wusihao
     * @date 2025/1/25 18:33
     */
    UserVO getUserVO(User user);

    /**
     * 返回脱敏后的用户列表
     *
     * @param userList
     * @return {@link null}
     * @author wusihao
     * @date 2025/1/25 18:33
     */
    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 获取查询条件
     *
     * @param userQueryRequest
     * @return {@link null}
     * @author wusihao
     * @date 2025/1/25 18:35
     */
    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

    boolean isAdmin(User user);

    /**
     * 获取加密方法
     *
     * @param userPassword
     * @return {@link null}
     * @author wusihao
     * @date 2025/1/24 22:24
     */
    String getEncryptPassword(String userPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);


    /**
     * 返回用户登录脱敏信息
     *
     * @return {@link null}
     * @author wusihao
     * @date 2025/1/24 22:41
     */
    LoginUserVO getLoginUserVO(User user);


}
