package com.demo.composite;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        ManagerDepartment root = new ManagerDepartment(0, "北京总公司");
        root.addDepartment(new SalesDepartment(1, "北京销售部"));
        root.addDepartment(new FinancialDepartment(2, "北京财务部"));

        ManagerDepartment shanghai = new ManagerDepartment(0, "上海分公司");
        shanghai.addDepartment(new SalesDepartment(1, "上海销售部"));
        shanghai.addDepartment(new FinancialDepartment(2, "上海财务部"));
        root.addDepartment(shanghai);

        ManagerDepartment xian = new ManagerDepartment(0, "西安分公司");
        xian.addDepartment(new SalesDepartment(1, "西安销售部"));
        xian.addDepartment(new FinancialDepartment(2, "西安财务部"));
        root.addDepartment(xian);

        root.printDepartmentName();
    }
}
