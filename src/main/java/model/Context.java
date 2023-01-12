package model;

import daoImpl.CountryDaoImpl;
import daoImpl.EmpDaoImpl;
import daoInter.EmpDaoInter;
import daoImpl.SkillDaoImpl;
import daoInter.SkillDaoInter;
import daoImpl.UserDaoImpl;
import daoInter.UserDaoInter;
import daoImpl.UserSkillDaoImpl;
import daoInter.CountryDaoInter;
import daoInter.UserSkillDaoInter;

public class Context {
    public static UserDaoInter getInstanceUserDao(){
        return new UserDaoImpl();
    }

    public static UserSkillDaoInter getInstanceUserSkillDao(){
        return new UserSkillDaoImpl();
    }

    public static EmpDaoInter getInstanceEmployedHistoryDao(){
        return new EmpDaoImpl();
    }

    public static SkillDaoInter getInstanceSkillDao(){
        return new SkillDaoImpl();
    }
    
    public static CountryDaoInter getInstanceCountryDao(){
        return new CountryDaoImpl();
    }

}
