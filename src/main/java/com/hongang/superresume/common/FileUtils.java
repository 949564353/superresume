package com.hongang.superresume.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class FileUtils {

    /**
     * 判断文件大小
     *
     * @param len
     *            文件长度
     * @param size
     *            限制大小
     * @param unit
     *            限制单位（B,K,M,G）
     * @return
     */
    public static boolean checkFileSize(Long len, int size, String unit) {
//        long len = file.length();
        double fileSize = 0;
        if ("B".equals(unit.toUpperCase())) {
            fileSize = (double) len;
        } else if ("K".equals(unit.toUpperCase())) {
            fileSize = (double) len / 1024;
        } else if ("M".equals(unit.toUpperCase())) {
            fileSize = (double) len / 1048576;
        } else if ("G".equals(unit.toUpperCase())) {
            fileSize = (double) len / 1073741824;
        }
        if (fileSize > size) {
            return false;
        }
        return true;
    }

    /**
     * 生成唯一的文件名:
     */
    public static String getUUIDFileName(String fileName) {
        // 将文件名的前面部分进行截取：xx.jpg   --->   .jpg
        int idx = fileName.lastIndexOf(".");
        String extention = fileName.substring(idx);
        String uuidFileName = UUID.randomUUID().toString().replace("-","") + extention;
        return uuidFileName;
    }

    /**
     * 转化文件大小展示方式
     * @param len
     * @return
     */
    public static String getFileSizeStr(Long len){
        java.text.DecimalFormat   df   =new   java.text.DecimalFormat("#.00");
        double fileSize = 0;
        if(len<1024){
            fileSize = (double) len;
            return df.format(fileSize)+"B";
        }else if(len<1048576){
            fileSize = (double) len / 1024;
            return df.format(fileSize)+"K";
        }else if(len<1073741824){
            fileSize = (double) len / 1048576;
            return df.format(fileSize)+"M";
        }else{
            fileSize = (double) len / 1073741824;
            return df.format(fileSize)+"G";
        }
    }

    public static List GetRandomList(List list, int count) {
        List rtnList = new ArrayList<>();
        if (list.size() <= count) {
            return list;
        } else {
            Random random = new Random();
            for (int i = 0 ;i<count;i++){
                int intRandom = random.nextInt(list.size() - 1);
                rtnList.add(list.get(intRandom));
                list.remove(list.get(intRandom));
            }
            return rtnList;
        }
    }

    public static void main(String[] args) {
        System.out.println(getUUIDFileName("aeer.edf.doc"));
    }


}
