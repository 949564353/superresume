package com.hongang.superresume.service;

import com.hongang.superresume.common.Constant;
import com.hongang.superresume.common.FileUtils;
import com.hongang.superresume.common.Result;
import com.hongang.superresume.common.vo.*;
import com.hongang.superresume.dao.*;
import com.hongang.superresume.entity.*;
import com.hongang.superresume.common.vo.*;
import com.hongang.superresume.dao.*;
import com.hongang.superresume.entity.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class WordServiceImpl {


    @Autowired
    private WordTypeMapper wordTypeMapper;
    @Autowired
    private WordInfoMapper wordInfoMapper;
    @Autowired
    private WordImgMapper wordImgMapper;
    @Autowired
    private WordCollectMapper collectMapper;
    @Autowired
    private AppSearchMapper searchMapper;
    @Autowired
    private AppPlanMapper planMapper;

    @Autowired
    private AppOrderMapper orderMapper;

    @Value("${app.id}")
    private Long appId;

    /**
     * 新增word类型信息
     *
     * @param wordTypeVo
     * @return
     */
    @Transactional
    public Result saveWordType(WordTypeVo wordTypeVo) {

        List<WordType> typeList = wordTypeMapper.selectByExample(Example.builder(WordType.class).where(Sqls.custom()
                .andEqualTo("typeCode", wordTypeVo.getTypeCode())
                .andEqualTo("isValid", "1")
                .andEqualTo("mainType", wordTypeVo.getMainType())).build());

        if (!CollectionUtils.isEmpty(typeList)) {
            return Result.fail(wordTypeVo.getTypeCode(), "文档类型编码已经存在！");
        }

        WordType wordType = new WordType();
        BeanUtils.copyProperties(wordTypeVo, wordType);
        wordType.setIsValid("1");
        wordType.setAppId(appId);
        wordType.setCreateTime(new Date());
        wordType.setMainType(wordTypeVo.getMainType());
        int i = wordTypeMapper.insertSelective(wordType);
        return i > 0 ? Result.success(wordType, "新增文档类型成功！") : Result.fail("新增文档类型失败！");
    }


    /**
     * 查询所有的文档类型
     *
     * @return
     */
    public Result findAll(String mainType) {
        List<WordType> typeList = wordTypeMapper.selectByExample(Example.builder(WordType.class).where(Sqls.custom()
                .andEqualTo("isValid", "1")
                .andEqualTo("appId", appId)
                .andEqualTo("mainType", mainType)).build());
        return Result.success(typeList, "查询文档类型成功！");
    }

    /**
     * 查询热门文档信息
     *
     * @return
     */
    public Result findHotFileList() {
        List<WordSearchInfoVo> rtnList = new ArrayList<>();
        List<WordType> typeList = wordTypeMapper.selectByExample(Example.builder(WordType.class).where(Sqls.custom()
                .andEqualTo("isValid", "1")
                .andEqualTo("appId", appId)
                .andEqualTo("typeCode", "rmkc")).build());

        if (!CollectionUtils.isEmpty(typeList)) {
            Long typeId = typeList.get(0).getId();
            Sqls sqls = Sqls.custom().andEqualTo("typeId", typeId)
                    .andEqualTo("isValid", "1");
            List<WordInfo> wordInfos = wordInfoMapper.selectByExample(Example.builder(WordInfo.class).where(sqls).build());
            List<WordImg> imgList = wordImgMapper.selectByExample(Example.builder(WordImg.class).where(Sqls.custom().andEqualTo("isValid", "1")
                    .andEqualTo("appId", appId).andEqualTo("imgType", 1)).orderByAsc("id").build());
            Random random = new Random();
            for (int i = 0; i < wordInfos.size(); i++) {
                WordInfo wordInfo = wordInfos.get(i);
                if (i < 4) {
                    WordSearchInfoVo searchInfoVo = new WordSearchInfoVo();
                    BeanUtils.copyProperties(wordInfo, searchInfoVo);
//                    int n = random.nextInt(imgList.size());
                    String imgUrl = imgList.get(i).getImgUrl();
                    searchInfoVo.setWordImgUrl(imgUrl);
                    rtnList.add(searchInfoVo);
                }
            }
        }
        return Result.success(rtnList, "查询热门课程成功！");
    }


    /**
     * 查询推荐课程信息
     *
     * @return
     */
    public Result findGoodFileList() {
        List<WordSearchInfoVo> rtnList = new ArrayList<>();
        List<WordType> typeList = wordTypeMapper.selectByExample(Example.builder(WordType.class).where(Sqls.custom()
                .andEqualTo("isValid", "1")
                .andEqualTo("appId", appId)
                .andEqualTo("typeCode", "tjkc")).build());

        if (!CollectionUtils.isEmpty(typeList)) {
            Long typeId = typeList.get(0).getId();
            Sqls sqls = Sqls.custom().andEqualTo("typeId", typeId)
                    .andEqualTo("isValid", "1");
            List<WordInfo> wordInfos = wordInfoMapper.selectByExample(Example.builder(WordInfo.class).where(sqls).build());
            List<WordImg> imgList = wordImgMapper.selectByExample(Example.builder(WordImg.class).where(Sqls.custom().andEqualTo("isValid", "1")
                    .andEqualTo("appId", appId).andEqualTo("imgType", 2)).build());

            List<WordImg> randomImgList = FileUtils.GetRandomList(imgList, wordInfos.size());
            for (int i = 0; i < wordInfos.size(); i++) {
                WordInfo wordInfo = wordInfos.get(i);
                WordSearchInfoVo searchInfoVo = new WordSearchInfoVo();
                BeanUtils.copyProperties(wordInfo, searchInfoVo);
                int n = i;
                if (i >= randomImgList.size()) {
                    n = i % randomImgList.size();
                }
                String imgUrl = randomImgList.get(n).getImgUrl();
                searchInfoVo.setWordImgUrl(imgUrl);
                rtnList.add(searchInfoVo);
            }
        }
        return Result.success(rtnList, "查询推荐课程成功！");
    }


    /**
     * 查询视频信息
     *
     * @param videoVo
     * @return
     */
    public Result findVideoList(WordVideoVo videoVo) {
        List<WordSearchInfoVo> rtnList = new ArrayList<>();
        Sqls sqls = Sqls.custom().andEqualTo("typeId", videoVo.getTypeId()).andEqualTo("isValid", "1");
        List<WordInfo> wordInfos = wordInfoMapper.selectByExample(Example.builder(WordInfo.class).where(sqls).build());

        List<WordImg> imgList = wordImgMapper.selectByExample(Example.builder(WordImg.class).where(Sqls.custom().andEqualTo("isValid", "1")
                .andEqualTo("appId", appId).andEqualTo("imgType", 2)).build());


        List<WordImg> randomImgList = FileUtils.GetRandomList(imgList, wordInfos.size());
        for (int i = 0; i < wordInfos.size(); i++) {
            WordInfo wordInfo = wordInfos.get(i);
            WordSearchInfoVo searchInfoVo = new WordSearchInfoVo();
            BeanUtils.copyProperties(wordInfo, searchInfoVo);
            int n = i;
            if (i >= randomImgList.size()) {
                n = i % randomImgList.size();
            }
            String imgUrl = randomImgList.get(n).getImgUrl();
            searchInfoVo.setWordImgUrl(imgUrl);
            rtnList.add(searchInfoVo);
        }

        return Result.success(rtnList, "查询视频课程成功！");
    }

    /**
     * 查询文档信息
     *
     * @param searchVo
     * @return
     */
    public Result findFileList(WordSearchVo searchVo) {
        List<WordSearchInfoVo> rtnList = new ArrayList<>();

        Sqls sqls = Sqls.custom().andEqualTo("isValid", "1");

        //判断是否为周卡用户
        Boolean isWeek = isWeekUser(searchVo);
        String imgType = isWeek ? "3" : "4";
        String isWeekUser = isWeek ? "1" : "0";

        //类型的文档
        if (searchVo.getTypeId() != null && searchVo.getTypeId().intValue() != 0) {       //文档分类查询
            sqls.andEqualTo("typeId", searchVo.getTypeId());
        } else {      //查询文档

            List<WordImg> imgList = wordImgMapper.selectByExample(Example.builder(WordImg.class).where(Sqls.custom().andEqualTo("isValid", "1")
                    .andEqualTo("appId", appId).andEqualTo("imgType", imgType)).build());

            Random r = new Random();//随机数
            List<String> imgUrlList = new ArrayList<>();
            int size = imgList.size();
            for (int i = 0; i < size; i++) {
                imgUrlList.add(imgList.remove(r.nextInt(imgList.size())).getImgUrl());
            }

            if (!isWeek) {
                for (int i = 0; i < imgUrlList.size(); i++) {
                    String imgUrl = imgUrlList.get(i);
                    WordSearchInfoVo searchInfoVo = new WordSearchInfoVo();
                    searchInfoVo.setId(0l);
                    searchInfoVo.setWordName("");
                    searchInfoVo.setWordShort("");
                    searchInfoVo.setWordSize("");
                    searchInfoVo.setWordUrl("");
                    searchInfoVo.setIsVip("");
                    searchInfoVo.setWordImgUrl(imgUrl);
                    searchInfoVo.setIsWeekUser(isWeekUser);
                    rtnList.add(searchInfoVo);
                }
                return Result.success(rtnList, "查询文档列表成功！");
            }

            List<WordType> wordTypeList = wordTypeMapper.selectByExample(Example.builder(WordType.class).where(Sqls.custom().andEqualTo("isValid", "1")
                    .andEqualTo("mainType", 2)).build());
            List<Long> typeIdList = wordTypeList.stream().map(WordType::getId)
                    .collect(Collectors.toList());
            sqls.andIn("typeId", typeIdList);
            if (!"".equals(searchVo.getWordName())) {
                sqls.andLike("wordName", "%" + searchVo.getWordName() + "%");
                //增加查询的记录
                AppSearch search = new AppSearch();
                search.setAppId(appId);
                search.setContent(searchVo.getWordName());
                search.setCreateTime(new Date());
                search.setIsValid("1");
                searchMapper.insertSelective(search);
            }
        }

        List<WordImg> imgList = wordImgMapper.selectByExample(Example.builder(WordImg.class).where(Sqls.custom().andEqualTo("isValid", "1")
                .andEqualTo("appId", appId).andEqualTo("imgType", 3)).build());
        //文件信息
        List<WordInfo> wordInfos = wordInfoMapper.selectByExample(Example.builder(WordInfo.class).where(sqls).build());


        List<WordImg> randomImgList = FileUtils.GetRandomList(imgList, wordInfos.size());
        for (int i = 0; i < wordInfos.size(); i++) {
            WordInfo wordInfo = wordInfos.get(i);
            WordSearchInfoVo searchInfoVo = new WordSearchInfoVo();
            BeanUtils.copyProperties(wordInfo, searchInfoVo);
            int n = i;
            if (i >= randomImgList.size()) {
                n = i % randomImgList.size();
            }
            String imgUrl = randomImgList.get(n).getImgUrl();
            searchInfoVo.setWordImgUrl(imgUrl);
            rtnList.add(searchInfoVo);
        }

//        Random random = new Random();
//        for(WordInfo wordInfo:wordInfos){
//            WordSearchInfoVo searchInfoVo = new WordSearchInfoVo();
//            BeanUtils.copyProperties(wordInfo,searchInfoVo);
//            int n = random.nextInt(imgList.size());
//            String imgUrl = imgList.get(n).getImgUrl();
//            searchInfoVo.setWordImgUrl(imgUrl);
//            searchInfoVo.setIsWeekUser(isWeekUser);
//            rtnList.add(searchInfoVo);
//        }
        return Result.success(rtnList, "查询文档列表成功！");
    }


    /**
     * 判断是否为周卡用户
     *
     * @param searchVo
     * @return
     */
    public Boolean isWeekUser(WordSearchVo searchVo) {
        //判断是否买个周卡
        List<AppPlan> appPlanList = planMapper.selectByExample(Example.builder(AppPlan.class).where(Sqls.custom().andEqualTo("isValid", "1")
                .andEqualTo("appId", appId).andEqualTo("version", searchVo.getVersion())
                .andEqualTo("planDays", 7)).build());
        if (!CollectionUtils.isEmpty(appPlanList)) {
            List<AppOrder> appOrders = orderMapper.selectByExample(Example.builder(AppOrder.class).where(Sqls.custom().andEqualTo("isValid", "1")
                    .andEqualTo("appId", appId).andEqualTo("planId", appPlanList.get(0).getId()).andEqualTo("phoneIden", searchVo.getPhoneIden())).build());
            if (!CollectionUtils.isEmpty(appOrders)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 查询收藏文件
     *
     * @param searchCollectVo
     * @return
     */
    public Result findCollectFile(WordSearchCollectVo searchCollectVo) {
        List<WordSearchInfoVo> rtnList = new ArrayList<>();
        Sqls sqls = Sqls.custom().andEqualTo("collectType", searchCollectVo.getCollectType()).andEqualTo("phoneIden", searchCollectVo.getPhoneIden()).andEqualTo("isValid", "1");
        List<WordCollect> wordCollectList = collectMapper.selectByExample(Example.builder(WordCollect.class).where(sqls).build());

        if (CollectionUtils.isEmpty(wordCollectList)) {
            return Result.success(rtnList, "查询收藏文件成功！");
        }

        List<Long> wordIdList = wordCollectList.stream().map(WordCollect::getWordId)
                .collect(Collectors.toList());


        List<WordInfo> wordInfoList = wordInfoMapper.selectByExample(Example.builder(WordInfo.class).where(Sqls.custom().andEqualTo("isValid", "1")
                .andIn("id", wordIdList)).build());

        //图片信息
        List<WordImg> imgList = wordImgMapper.selectByExample(Example.builder(WordImg.class).where(Sqls.custom().andEqualTo("isValid", "1")
                .andEqualTo("appId", appId).andEqualTo("imgType", 2)).build());

        Random random = new Random();
        for (WordInfo wordInfo : wordInfoList) {
            WordSearchInfoVo searchInfoVo = new WordSearchInfoVo();
            BeanUtils.copyProperties(wordInfo, searchInfoVo);
            int n = random.nextInt(imgList.size());
            String imgUrl = imgList.get(n).getImgUrl();
            searchInfoVo.setWordImgUrl(imgUrl);
            rtnList.add(searchInfoVo);
        }
        return Result.success(rtnList, "查询收藏文件成功！");
    }

    /**
     * 新增文档类型图片
     *
     * @param file   文件内容
     * @param typeId 文档类型
     * @return
     */
    @Transactional
    public Result saveTypeImg(MultipartFile file, Long typeId) {
        try {
            //TODO:对文件的大小进行限制
            String fileName = file.getOriginalFilename();
            String uuidName = FileUtils.getUUIDFileName(fileName);
            File dest = new File(Constant.PRE_FILE_PATH + uuidName);
            file.transferTo(dest);

            WordType wordType = wordTypeMapper.selectByPrimaryKey(typeId);
            wordType.setTypeImg(Constant.PPT_PATH + uuidName);
            wordTypeMapper.updateByPrimaryKey(wordType);
            return Result.success("上传文档成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.fail("上传文档失败！！！");
    }


    /**
     * 保存文档信息
     *
     * @param file   文件内容
     * @param typeId 文档类型
     * @return
     */
    @Transactional
    public Result saveWordInfo(MultipartFile file, Long typeId, String fileShort) {
        try {
            WordType wordType = wordTypeMapper.selectByPrimaryKey(typeId);
            String isVip = wordType.getIsVip();
            //TODO:对文件的大小进行限制
            String fileName = file.getOriginalFilename();
            String uuidName = FileUtils.getUUIDFileName(fileName);
            File dest = new File(Constant.PRE_FILE_PATH + uuidName);
            file.transferTo(dest);

            WordInfo wordInfo = new WordInfo();
            wordInfo.setTypeId(typeId);
            wordInfo.setCreateTime(new Date());
            wordInfo.setIsValid("1");
            wordInfo.setWordName(fileName);
            wordInfo.setWordUrl(Constant.PPT_PATH + uuidName);
            wordInfo.setIsVip(isVip);
            wordInfo.setWordShort(fileShort);
            //文件大小限制
//            Boolean flag = FileUtils.checkFileSize(file.getSize(),100,"M");
//            if(flag){
//                return Result.fail("上传文件大小不能超过100M！");
//            }
            wordInfo.setWordSize(FileUtils.getFileSizeStr(file.getSize()));

            int i = wordInfoMapper.insertSelective(wordInfo);
            return i > 0 ? Result.success("上传文档成功！") : Result.fail("上传文档失败！");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.fail("上传文档失败！！！");
    }


    /**
     * 新增首页图片
     *
     * @param file    文件内容
     * @param imgType 文档类型
     * @return
     */
    @Transactional
    public Result saveIndexImg(MultipartFile file, String imgType) {
        try {
            //TODO:对文件的大小进行限制
            String fileName = file.getOriginalFilename();
            String uuidName = FileUtils.getUUIDFileName(fileName);
            File dest = new File(Constant.PRE_FILE_PATH + uuidName);
            file.transferTo(dest);

            WordImg wordImg = new WordImg();
            wordImg.setImgType(imgType);
            wordImg.setImgUrl(Constant.PPT_PATH + uuidName);
            wordImg.setCreateTime(new Date());
            wordImg.setIsValid("1");
            wordImg.setAppId(appId);
            int i = wordImgMapper.insertSelective(wordImg);
            return i > 0 ? Result.success("上传首页图片成功！") : Result.fail("上传首页图片失败！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.fail("上传首页失败！！！");
    }

    /**
     * 文件收藏
     *
     * @param collectVo 收藏文件内容
     * @return
     */
    @Transactional
    public Result collectFile(WordCollectVo collectVo) {
        try {
            WordInfo wordInfo = wordInfoMapper.selectByPrimaryKey(collectVo.getWordId());
            WordType wordType = wordTypeMapper.selectByPrimaryKey(wordInfo.getTypeId());
            WordCollect wordCollect = new WordCollect();
            wordCollect.setPhoneIden(collectVo.getPhoneIden());
            wordCollect.setWordId(collectVo.getWordId());
            wordCollect.setIsValid("1");
            wordCollect.setCreateTime(new Date());
            if ("1".equals(wordType.getMainType()) || "0".equals(wordType.getMainType())) {
                wordCollect.setCollectType("1");
            } else {
                wordCollect.setCollectType(wordType.getMainType());
            }
            int i = collectMapper.insertSelective(wordCollect);
            return i > 0 ? Result.success("收藏文档成功！") : Result.fail("收藏文档失败！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.fail("上传首页失败！！！");
    }


}
