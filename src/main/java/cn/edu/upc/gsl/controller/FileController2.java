package cn.edu.upc.gsl.controller;

import cn.edu.upc.dzh.controller.FileController;
import cn.edu.upc.gsl.service.FileService2;
import cn.edu.upc.gsl.service.GuideService;
import cn.edu.upc.manage.common.CommonReturnType;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>文件操作</p>
 *
 * @author : gsl
 * @date : 2020-05-19 16:17
 **/
@CrossOrigin
@Controller
@RequestMapping(value = "/file2", method = {RequestMethod.GET, RequestMethod.POST})
public class FileController2 {

    @Autowired
    GuideService guideService;

    @Autowired
    FileService2 fileService2;
    /**
     * 前端传文件路径来下载文件
     *
     * @param path 文件路径，如 /guide/appendix.doc
     * @param response
     * @return
     */
    @RequestMapping(value = "/download")
    @ResponseBody
    public CommonReturnType downloadAppendix(@Param("path") String path, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("路径："+path);
        path= FileController.saveUrl+path;
        fileService2.downloadFile(path,request,response);
        return CommonReturnType.create(null, "下载完成");
    }

}
