package practice;
import java.util.Scanner;

public class Persons {
    private int number;/*学号*/
    private String name;

    public Persons() {

    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.number;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
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
                Persons person = new Persons();
                int number = 0;
                String name = null;
                System.out.println("请输入名字，学号");
                name = sc.next();
                number = sc.nextInt();
                if (new operater().add(name, number)) {
                    System.out.println("成功");
                } else {
                    System.out.println("失败");
                }
            } else if (a == 2) {
                System.out.println("请输入删除id：");
                int id = sc.nextInt();
                if (new operater().delete(id)) {
                    System.out.println("成功");
                } else {
                    System.out.println("失败");
                }
            } else if (a == 3) {
                System.out.println("请输入修改学生");
                int id = sc.nextInt();
                System.out.println("请输入姓名");
                String name = sc.next();
                System.out.println("学号");
                int number = sc.nextInt();
                if (new operater().change(id, name, number)) {
                    System.out.println("成功");
                } else {
                    System.out.println("失败");
                }
            } else if (a == 4) {
                Scanner scan = new Scanner(System.in);
                String name = "";
                int id = -1;

                while (true) {
                    System.out.println("请输入按哪种方法查找1、编号/2、名");
                    int choose = scan.nextInt();
                    if (choose == 1) {
                        System.out.println("请输入要查找人：");
                        id = scan.nextInt();
                        if (id > -1) {
                            Select.show(id, name);
                        } else {
                            System.out.println("输入错误！");
                        }
                    } else if (choose == 2) {
                        System.out.println("请输入您要查找人名：");
                        name = scan.next();
                        if (name != "") {
                            operater.show(id, name);
                        }
                    } else if (choose == 3) {

                        break;
                    } else {
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




