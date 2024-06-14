package com.aqiu.pattern.combination;

public class Client {
    public static void main(String[] args) {
        MenuComponent menu1=new Menu("系统管理",1);

        MenuComponent menu2=new Menu("菜单管理",2);
        MenuComponent menu3=new Menu("权限配置",2);
        MenuComponent menu4=new Menu("角色管理",2);

        menu1.add(menu2,menu3,menu4);

        MenuComponent menu5=new MenuItem("页面访问",3);
        MenuComponent menu6=new MenuItem("展开菜单",3);
        MenuComponent menu7=new MenuItem("编辑菜单",3);
        MenuComponent menu8=new MenuItem("删除菜单",3);
        MenuComponent menu9=new MenuItem("新增菜单",3);

        menu2.add(menu5,menu6,menu7,menu8,menu9);

        MenuComponent menu10=new MenuItem("页面提交",3);
        MenuComponent menu11=new MenuItem("提交保存",3);

        menu3.add(menu10,menu11);

        MenuComponent menu12=new MenuItem("页面访问",3);
        MenuComponent menu13=new MenuItem("新增角色",3);
        MenuComponent menu14=new MenuItem("修改角色",3);
        menu4.add(menu12,menu13,menu14);

        menu1.print();
    }
}
