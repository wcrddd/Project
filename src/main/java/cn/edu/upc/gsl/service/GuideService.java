package cn.edu.upc.gsl.service;

import cn.edu.upc.manage.model.Guide;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author gsl
 * @date
 */
public interface GuideService {

    /**
     * 获取指南列表
     * @param guideTitle
     * @param guideNumber
     * @return
     */
    List<Guide> getGuideList(String guideTitle, String guideNumber);


}
