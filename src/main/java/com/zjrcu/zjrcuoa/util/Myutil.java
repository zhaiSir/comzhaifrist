package com.zjrcu.zjrcuoa.util;

import org.apache.commons.lang3.StringUtils;

public class Myutil {
    public static void main(String[] args) {
        System.out.println(isContentSuffix("123.gif"));
    }


    //只有数组includeSuffix中的后缀才能返回true,不分大小写
    public static boolean isContentSuffix(String fileName){
        String[] includeSuffix = {".png",".gif","jpg",".svg"};
        for(String suffix:includeSuffix){
            if(StringUtils.endsWithIgnoreCase(fileName,suffix)){
                return true;
            }
        }
        return false;
    }



}

