/*
package com.zjrcu.zjrcuoa.util;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@Controller
@RequestMapping("/hoopController")
public class hoopController {
    //https://www.cnblogs.com/ipetergo/p/6999831.html
    private String bannerWidth = PropertyUtils.getProperty("uploadApplication","bannerWidth");
    private String bannerHeight = PropertyUtils.getProperty("uploadApplication","bannerHeight");
    private String bannerSize = PropertyUtils.getProperty("uploadApplication","bannerSize");
    private String bannerType = PropertyUtils.getProperty("uploadApplication","bannerType");


    //新增里的文件上传
    @PostMapping("/add")
    @ReponseBody
    public String add (MultipartFile newscover1, MultipartFile newscover2, MultipartFile[] uploadFile, Vo vo, Model model , HttpSession sesssion){
        String uploadUrl = null;
        try {
            uploadUrl = URLDecoder.decode(ClassUtils.getDefaultClassLoader().getResource("").getPath(),"UTF-8")+"Static/filedraft/banner/";
            if(newscover1 !=null &&(!newscover1.isEmpty())){
                String proving = UploadFile.judgeImage(bannerWidth,bannerHeight,bannerSize,bannerType);
                if(!"1".equals(proving)){
                    model.addAttribute("success",Boolean.valueOf(false));
                    model.addAttribute("message","新增失败");
                    return FRAME_SUCCESS;
                }
                vo.setNewsCover(UploadFile.saveFiles(newscover1,uploadUrl));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        newsManager.create(vo);
        model.addAttribute("success",Boolean.valueOf(false));
        model.addAttribute("message","新增成功");
        return FRAME_SUCCESS;
    }
}

*/
