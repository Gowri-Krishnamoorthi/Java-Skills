package app.skills;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Skill s1 = new Skill();
    	Skill s2 = new Skill();
    	Skill s3 = new Skill();
    	Skill s4 = new Skill();

    	List list1=new ArrayList();
    	list1.add(s1);
    	list1.add(s2);
    	
    	List list2=new ArrayList();
    	list2.add(s3);
    	list2.add(s4);

    	Students stu1 = new Students(001,"Gowri",list1);
    	Students stu2 = new Students(002,"Karthik",list2);

         s1.setSkillname("Java Developer");
         s1.setEfficiency(9);
         s1.setStu(stu1);
         
         s2.setSkillname("Python Developer");
         s2.setEfficiency(8);
         s2.setStu(stu1);
         
         s3.setSkillname("Human Resource");
         s3.setEfficiency(9);
         s3.setStu(stu2);
         
         s4.setSkillname("Employee Management");
         s4.setEfficiency(9);
         s4.setStu(stu2);
         
         Configuration cfg= new Configuration();
         cfg.configure();
         SessionFactory factory=cfg.buildSessionFactory();
         Session s=factory.openSession();
          
         Transaction t=s.beginTransaction();
         
         s.save(stu1);
         s.save(stu2);
         s.save(s1);
         s.save(s2);
         s.save(s3);
         s.save(s4);

         t.commit();
         
         
    }
}
