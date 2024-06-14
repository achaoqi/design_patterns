package com.aqiu.pattern.bridge;

public class AviFile implements VideoFile{
    @Override
    public void decode(String filename) {
        System.out.printf("avi视频文件%s\n",filename);
    }
}
