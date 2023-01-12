import daoInter.EmpDaoInter;
import daoInter.SkillDaoInter;
import daoInter.UserDaoInter;
import daoInter.UserSkillDaoInter;
import model.Context;
import model.Country;
import model.User;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDaoInter userDaoInter = Context.getInstanceUserDao();
        UserSkillDaoInter userSkillDaoInter = Context.getInstanceUserSkillDao();
        EmpDaoInter empDaoInter = Context.getInstanceEmployedHistoryDao();
        SkillDaoInter skillDaoInter = Context.getInstanceSkillDao();

        User em=new User();
        em.setName("Murad");
        em.setSurname("Mirzeyev");
        em.setEmail("murad@gmail.com");
        em.setPhone("9564788");
        em.setAddress("Volstread");
        String birthdateStr = "1999-04-03";
        Date birthdate = DateTest.strConvertDate(birthdateStr);
        em.setBirthdate((java.sql.Date) birthdate);
        em.setProfileDescription("heyatda her seyin en yaxsisi iyi");
        Country c=new Country();
        c.setId(1);
        c.setCountry("Latviya");
        c.setNationality("polyak");
        em.setCountry(c);
        em.setNationality(c);
        em.setId(1);
        userDaoInter.update(em);

        System.out.println(userDaoInter.getAll());

    }
}
