package com.hongang.superresume.controller;


import com.hongang.superresume.common.Result;
import com.hongang.superresume.common.vo.*;
import com.hongang.superresume.common.vo.*;
import com.hongang.superresume.service.WordServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

//@RestController
//@RequestMapping("info")
//@ApiSort(3)
//@Api(value = "info", tags = "format文档接口", description = "format文档接口")
public class WordController {

    @Autowired
    private WordServiceImpl wordService;

    @ApiOperation(value = "新增文档类型", position = 1)
    @PostMapping(value = "/saveWordType")
    public Result saveWordType(@Valid @RequestBody WordTypeVo wordTypeVo) {
        return wordService.saveWordType(wordTypeVo);
    }

    @ApiOperation(value = "查询文档类型", position = 2)
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public Result findAll(@RequestParam("mainType") String mainType) {
        return wordService.findAll(mainType);
    }

    @ApiOperation(value = "上传文档类型图片（小图标）", position = 3)
    @PostMapping(value = "/saveTypeImg")
    public Result saveTypeImg(@RequestParam("typeImg") MultipartFile imgFile, @RequestParam("typeId") Long typeId) {
        if (imgFile.isEmpty()) {
            return Result.fail("上传失败，请选择文件");
        }
        return wordService.saveTypeImg(imgFile, typeId);
    }

    @ApiOperation(value = "上传文档", position = 5)
    @PostMapping(value = "/saveWordInfo")
    public Result saveWordInfo(@RequestParam("file") MultipartFile file, @RequestParam("typeId") Long typeId, @RequestParam("fileShort") String fileShort) {
        if (file.isEmpty()) {
            return Result.fail("上传失败，请选择文件");
        }
        return wordService.saveWordInfo(file, typeId, fileShort);
    }

    @ApiOperation(value = "上传首页图片", position = 4)
    @PostMapping(value = "/saveIndexImg")
    public Result saveIndexImg(@RequestParam("indexImg") MultipartFile indexImg, @RequestParam("imgType") String imgType) {
        if (indexImg.isEmpty()) {
            return Result.fail("上传失败，请选择文件");
        }
        return wordService.saveIndexImg(indexImg, imgType);
    }

    @ApiOperation(value = "查询热门课程列表", position = 7)
    @RequestMapping(value = "/findHotFileList", method = RequestMethod.POST)
    public Result findHotFileList() {
        return wordService.findHotFileList();
    }


    @ApiOperation(value = "查询推荐课程列表", position = 8)
    @RequestMapping(value = "/findGoodFileList", method = RequestMethod.POST)
    public Result findGoodFileList() {
        return wordService.findGoodFileList();
    }

    @ApiOperation(value = "查询文档信息", position = 6)
    @RequestMapping(value = "/findFileList", method = RequestMethod.POST)
    public Result findFileList(@Valid @RequestBody WordSearchVo searchVo) {
        return wordService.findFileList(searchVo);
    }

    @ApiOperation(value = "查询视频信息", position = 9)
    @RequestMapping(value = "/findVideoList", method = RequestMethod.POST)
    public Result findVideoList(@Valid @RequestBody WordVideoVo videoVo) {
        return wordService.findVideoList(videoVo);
    }

    @ApiOperation(value = "收藏视频或文档", position = 10)
    @RequestMapping(value = "/collectFile", method = RequestMethod.POST)
    public Result collectFile(@Valid @RequestBody WordCollectVo collectVo) {
        return wordService.collectFile(collectVo);
    }

    @ApiOperation(value = "查询收藏信息", position = 11)
    @RequestMapping(value = "/findCollectFile", method = RequestMethod.POST)
    public Result findCollectFile(@Valid @RequestBody WordSearchCollectVo searchCollectVo) {
        return wordService.findCollectFile(searchCollectVo);
    }


}
