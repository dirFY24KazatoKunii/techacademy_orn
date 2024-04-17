package action;

import javax.persistence.EntityManager;

import entity.City;
import util.DButil;

public class jpaTest {

    public static void main(String[] args) {
        // EntityManagerのオブジェクトを生成
        EntityManager em = DButil.createEntityManager();

        // 1件取得して名前を表示する
        City city = em.find(City.class, 1);
        System.out.println(city.getName());

        // EntityManagerの利用を終了する
        em.close();
    }
}