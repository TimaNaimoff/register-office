package dao;

import domain.MarriageSertificate;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MarriageDaoTest {
    @Test
    public void findMarriageCertificates(){
        MarriageDao dao=new MarriageDao();
        List<MarriageSertificate> list=dao.findMarriageCertificate();
        list.forEach(mr->{
            System.out.println(mr.getMarriageCertificateId());
            System.out.println(mr.getHusband());
            System.out.println(mr.getWife());
        });
    }

}