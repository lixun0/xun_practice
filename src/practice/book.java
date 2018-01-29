package practice;


import java.util.Scanner;

public class book {
    private int id;
    private String name;
    private double price;
    private int pagination;

    public book() {

    }

    public String getName() {
        //  TODO Auto-generated method stub
        return this.name;
    }

    public double getPrice() {
        // TODO Auto-generated method stub
        return this.price;
    }

    public int getPagination() {
        // TODO Auto-generated method stub
        return this.pagination;
    }

    public void setName(String string) {
        // TODO Auto-generated method stub
        this.name = string;

    }

    public void setPrice(double d) {
        // TODO Auto-generated method stub
        this.price = d;
    }

    public void setPagination(int d) {
        this.pagination = d;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("请选择：");
        System.out.println("1:添加");
        System.out.println("2:删除");
        System.out.println("3:修改");
        System.out.println("4:查询");
        System.out.println("0:结束");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            if (a == 1) {
                book books = new book();
                String name = null;
                int pagination = 0;
                double price = 0.0;
                System.out.println("请输入信息：");
                System.out.println("名字：");
                name = sc.next();
                books.setName(name);
                System.out.println("页码：");
                pagination = sc.nextInt();
                books.setPagination(pagination);
                System.out.println("价格：");
                price = sc.nextDouble();
                books.setPrice(price);
                if (new Insert().addBooks(books)) {
                    System.out.println("成功");
                } else {
                    System.out.println("失败");
                }
            } else if (a == 2) {
                System.out.println("请输入删除姓名：");
                String name = sc.next();
                if (new Delete().delete(name)) {
                    System.out.println("成功");
                } else {
                    System.out.println("失败");
                }
            } else if (a == 3) {
                System.out.println("请输入修改书名");
                String name = sc.next();
                System.out.println("请输入价格：");
                Double price = sc.nextDouble();
                System.out.println("页码");
                int pagination = sc.nextInt();
                if (new Update().update(name, price, pagination)) {
                    System.out.println("成功");
                } else {
                    System.out.println("失败");
                }
            } else if (a == 4) {
                Scanner scan = new Scanner(System.in);
                String name = "";
                int id = -1;

                while (true) {
                    System.out.println("请输入按哪种方法查找图书：1、编号/2、书名");
                    int choose = scan.nextInt();
                    if (choose == 1) {
                        System.out.println("请输入要查找的书的编号：");
                        id = scan.nextInt();
                        if (id > -1) {
                            Select.show(id, name);
                        } else {
                            System.out.println("输入错误！");
                        }
                    } else if (choose == 2) {
                        System.out.println("请输入您要查找的书名：");
                        name = scan.next();
                        if (name != "") {
                            Select.show(id, name);
                        }
                    } else if (choose == 3) {

                        break; }
                    else
                        {
                            System.out.println("输入非法！");
                        }

                    if (a == 0) {
                        break;
                    } else {
                        System.out.println("输入有误！");
                    }
                }
            }
        }
    }
}
