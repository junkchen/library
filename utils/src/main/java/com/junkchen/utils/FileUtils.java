package com.junkchen.utils;

import java.io.File;

/**
 * Created by JunkChen on 2015/10/15 0015.
 */
public class FileUtils {
    public static String fileSize(String path) {
        File file = new File(path);
        float size = file.length();
        if (size > 1024 * 1024) {
            return size / 1024f / 1024 + "M";
        } else if (size > 1024) {
            return size / 1024f + "K";
        } else {
            return size + "B";
        }
    }
}
