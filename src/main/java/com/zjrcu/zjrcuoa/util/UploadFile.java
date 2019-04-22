package com.zjrcu.zjrcuoa.util;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class UploadFile {
    public static String saveFiles(MultipartFile realFile, String path) throws IOException{
        String fileName = "";
        String name = realFile.getOriginalFilename();
        if(name.contains("\\")){
            Integer num = name.lastIndexOf("\\")+1;
            name = name.substring(num);
        }
        fileName = "file"+System.currentTimeMillis() + "-qwe987wsx"  + name;
        File file = new File(realFile.getName());
        FileUtils.copyInputStreamToFile(realFile.getInputStream(),file);
        saveFile(file,fileName,path);
        return fileName;
    }

    public static void saveFile(File realFile,String fileName,String path) throws IOException {
        if (realFile != null) {
            File target = new File(path, fileName);
            FileUtils.copyFile(realFile, target);
        }
    }
}
