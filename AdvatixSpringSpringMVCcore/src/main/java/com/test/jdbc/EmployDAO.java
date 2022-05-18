package com.test.jdbc;

interface EmployDAO {
    public int Insertemp(Employe e);
    public int selectall();
    public int updateEmp(double esal, int empno);
}