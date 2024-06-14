package com.aqiu.pattern.bridge;

public class RmvbFile implements VideoFile{
    @Override
    public void decode(String filename) {
        System.out.printf("rmvb视频文件%s\n",filename);
    }
}
