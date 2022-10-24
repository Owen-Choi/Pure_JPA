package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
//            Member findMember = em.find(Member.class, 1L);
////            findMember.setName("HelloJPA");
//            // setName만 해두고 persist를 하지 않아도 DB에 값이 바뀌는 이유는
//            // JPA가 트랜잭션을 커밋하기 전에 값이 바꼈는지 확인해보고 바뀐 값이 있다면 자동으로 바꿔주기 때문이다.
//
//            // JPQL : JPA에서 쿼리를 짤때 대상은 테이블이 절대 아니다. 객체가 대상이 된다.
//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                    .setFirstResult(5)
//                    .setMaxResults(8)
//                    .getResultList();
//            // JPQL을 활용하면 위처럼 페이징도 아주 간단하게 할 수 있다!

            // 비영속
            Member member = new Member();
            member.setId(100L);
            member.setName("James");

            // 영속
            System.out.println("=== Before ===");
            em.persist(member);
            System.out.println("=== After ===");

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
