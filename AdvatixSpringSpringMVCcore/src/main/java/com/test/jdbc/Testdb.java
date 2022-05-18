package com.test.jdbc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Testdb {
    public static void main(String[] args) {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
            Employe e = new Employe();
            EmployeDAOim em = (EmployeDAOim) ctx.getBean("edao");
            e.setEmpno(100);
            e.setEname("Ramya");
            e.setEsal(20000);
            e.setEdept(2);
            em.insertemp(e);
            em.selectall1(); //em.modify(); //em.save(e); //em.update(e);
            System.out.println("Done");
            }
            }
