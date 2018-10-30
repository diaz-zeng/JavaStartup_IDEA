package edu.diaz.exam.day18;

import java.io.*;
import java.nio.file.AccessDeniedException;
import java.util.Scanner;

public class Exam5 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("请指定一个源文件");
            String pathIn = new Scanner(System.in).nextLine();
            System.out.println("请指定一个目标目录");
            String pathOut = new Scanner(System.in).nextLine();
            try {
                File fileIn = new File(pathIn);
                if (!fileIn.exists())
                    throw new FileNotFoundException("文件不存在");
                if (fileIn.isDirectory())
                    throw new AccessDeniedException("源文件不能为目录，拒绝访问");
                FileInputStream fis = new FileInputStream(fileIn);
                File fileOut = new File(pathOut + pathIn.split("/")[pathIn.split("/").length - 1]);
                if (!fileOut.exists())
                    fileOut.createNewFile();
                else
                    throw new AccessDeniedException("文件已经存在");
                FileOutputStream fos = new FileOutputStream(fileOut, true);
                if (fis.available() > 10240) {
                    if (paceByPace(fos, fis))
                        System.out.println("分割复制成功");
                    else
                        throw new IOException("复制失败");
                } else {
                    if (onceForAll(fos, fis))
                        System.out.println("整体复制成功");
                    else
                        throw new IOException("复制失败");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean paceByPace(FileOutputStream fileOutputStream, FileInputStream fileInputStream) {
        BufferedInputStream bis = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);
        byte[] buffer = new byte[10240];
        int len = -1;
        try {
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            closeStream(bis, bos);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean onceForAll(FileOutputStream fileOutputStream, FileInputStream fileInputStream) {
        try {
            BufferedInputStream bis = new BufferedInputStream(fileInputStream);
            BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);
            byte[] buffer = new byte[fileInputStream.available()];
            bis.read(buffer);
            bos.write(buffer);
            closeStream(bis, bos);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void closeStream(BufferedInputStream fileInputStream, BufferedOutputStream fileOutputStream) {
        try {
            fileOutputStream.flush();
            fileInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
