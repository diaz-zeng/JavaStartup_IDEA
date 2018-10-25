package edu.diaz.exam.day14.exam1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static BookService service = BookService.getInstance();

    public static void main(String[] args) {
        while (true) {
            try {

                System.out.println("欢迎来到图书管理系统");
                System.out.println("请选择操作");
                System.out.println("1.添加");
                System.out.println("2.查询");
                System.out.println("3.删除");
                System.out.println("4.显示所有书籍信息");
                System.out.println("5.退出");
                System.out.print("请选择：");
                switch (new Scanner(System.in).nextInt())
                {
                    case 1:{
                        add();
                        break;
                    }
                    case 2:{
                        get();
                        break;
                    }
                    case 3:{
                        remove();
                        break;
                    }
                    case 4:{
                        showAllDatas();
                        break;
                    }
                    case 5:{
                        System.exit(0);
                    }
                }
            } catch (Exception e) {
                System.err.println("输入错误请重试！");
                continue;
            }
        }
    }


    private static void add() {
        while (true) {
            try {
                System.out.println("请输入书籍信息（书名/价格/ISBN,退出请输入#exit）");
                String userInput = new Scanner(System.in).nextLine();
                if ("#exit".equals(userInput))
                    break;
                String[] sDatas = userInput.split("/");
                int price;
                String title, isbn;
                title = sDatas[0];
                price = Integer.parseInt(sDatas[1]);
                isbn = sDatas[2];
                BookInfo bookInfo = new BookInfo(title, price, isbn);
                if (service.add(bookInfo)) {
                    System.out.println("添加成功");
                } else {
                    System.err.println("添加失败，可能信息存在重复");
                    System.err.println("冲突的信息：" + service.get(bookInfo.getIsbn()));
                }
            } catch (Exception e) {
                System.err.println("输入错误请重试！");
            }
        }

    }

    private static void get() {
        while (true) {
            try {
                System.out.print("请输入要查询的书籍的ISBN（退出请输入#exit）：");
                String userInput = new Scanner(System.in).nextLine();
                if("#exit".equals(userInput))
                    break;
                BookInfo result = service.get(userInput);
                if (null != result) {
                    System.out.println(result);
                } else {
                    System.out.println("为查找到相关的书籍信息");
                }
            } catch (Exception e) {
                System.err.println("输入错误请重试！");
            }
        }
    }

    private static void remove() {
        while (true) {
            try {
                System.out.print("请输入要删除的书籍的ISBN（退出请输入#exit）：");
                String userInput = new Scanner(System.in).nextLine();
                if("#exit".equals(userInput))
                    break;
                BookInfo result = service.get(userInput);
                if (null != result) {
                    service.removeBookInfo(userInput);
                    System.out.println("条目："+result+"已被删除");

                } else {
                    System.out.println("为查找到相关的书籍信息");
                }
            } catch (Exception e) {
                System.err.println("输入错误请重试！");
            }
        }
    }

    private static void showAllDatas()
    {
        Collection<BookInfo> books = service.getAllBookInfo();
        Iterator<BookInfo> iterator = books.iterator();
        System.out.println("共有图书："+books.size());
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }


}
