package com.dpo;

import java.io.File;

/**
 * Created by dpeinado on 03/11/2017.
 */
public class FolderSize
{
    public static void main(String [] args)
    {
        System.out.println("HELLO");
        long length = getFolderSize(new File("C://fotos"));
        System.out.print(length);
    }




    public static long getFolderSize(File dir) {
        long size = 0;
        for (File file : dir.listFiles()) {
            if (file.isFile()) {
                System.out.println(file.getName() + " " + file.length());
                size += file.length();
            }
            else
                size += getFolderSize(file);
        }
        return size;
    }


}