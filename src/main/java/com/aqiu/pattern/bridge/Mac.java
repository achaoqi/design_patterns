package com.aqiu.pattern.bridge;

public class Mac extends OperatingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String filename) {
        videoFile.decode(filename);
    }
}
