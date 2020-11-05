package com.hongang.superresume.service;

import com.hongang.superresume.dao.LoginUserMapper;
import com.hongang.superresume.common.Result;
import com.hongang.superresume.common.vo.LoginUserVo;
import com.hongang.superresume.entity.LoginUser;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    private LoginUserMapper loginUserMapper;

    public Result userAdd(LoginUserVo userVo) {
        try {
            //判断用户是否存在
            List<LoginUser> list = loginUserMapper.selectByExample(Example.builder(LoginUser.class).where(Sqls.custom().andEqualTo("phoneNum",userVo.getPhoneNum())
                    .andEqualTo("isValid",1)).build());
            if(!CollectionUtils.isEmpty(list)){
                return Result.fail("当前手机号已注册，请登录！");
            }
            LoginUser loginUser = new LoginUser();
            BeanUtils.copyProperties(userVo,loginUser);
            loginUser.setCreateTime(new Date());
            loginUser.setIsValid(1);
            loginUser.setNikeName("网盘VIP用户");
            loginUser.setUserDesc("这家伙很懒，什么都没有留下！");
            //TODO:对上传的密码进行加密操作
            int i = loginUserMapper.insertSelective(loginUser);
            //密码不应该返回，置空
            loginUser.setPassword(null);
            return i > 0 ? Result.success(loginUser, "注册成功！") : Result.fail("注册失败！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.fail("注册失败！！！");
    }

    public Result userLogin(LoginUserVo userVo) {
        try {
            //只判断用户是否存在，不进行用户名和密码的校验
            LoginUser loginUser = loginUserMapper.selectOneByExample(Example.builder(LoginUser.class).where(Sqls.custom().andEqualTo("phoneNum",userVo.getPhoneNum())
                    .andEqualTo("isValid",1)).build());
            if(loginUser!=null){
                loginUser.setPassword(null);
                return Result.success(loginUser, "登录成功！");
            }else{
                return Result.fail("登录失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.fail("登录失败！！！");
    }

}
