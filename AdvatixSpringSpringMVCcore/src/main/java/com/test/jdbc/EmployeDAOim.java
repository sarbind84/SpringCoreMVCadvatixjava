package com.test.jdbc;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeDAOim implements EmployDAO {
    private JdbcTemplate jt;
    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }
    
    
    public int insertemp(Employe e) {
        int empno = e.getEmpno();
        String ename = e.getEname();
        float esal = e.getEsal();
        int dept = e.getEdept();
        Object[] param = {
            empno,
            ename,
            esal,
            dept
        };
        int k = jt.update("insert into Employe values(?,?,?,?)", param);
        return k;
    }
    public void selectall1() {
        List < Map < String, Object >> l = jt.queryForList("select * from Employe");
        Iterator < Map < String, Object >> it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }


	public int Insertemp(Employe e) {
		// TODO Auto-generated method stub
		return 0;
	}


	public int selectall() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int updateEmp(double esal, int empno) {
		// TODO Auto-generated method stub
		return 0;
	} 
}
    //selectall //update public int Insertemp(Employe e) { // TODO Auto-generated method stub return 0; } public int selectall() { // TODO Auto-generated method stub return 0; } public int updateEmp(double esal, int empno) { // TODO Auto-generated method stub return 0; } } /public class Emprow implements RowMapper { object MapRow(Results rs, int index) }/