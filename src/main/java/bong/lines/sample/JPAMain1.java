package bong.lines.sample;

import bong.lines.sample.entity.Member;

import javax.persistence.*;

public class JPAMain1 {
/*
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("wings-persistence");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        try{

//            Member member1 = entityManager.find(Member.class, 1L);

//            Member member = new Member();
//           // member.setId(2L);
//            member.setUsername("Hong Gil Dong");
//            entityManager.persist(member);

//         ------------ update
            // from Member에서 Member는 객체임
//            Member member = entityManager.createQuery("select m from Member as m", Member.class)
//                    .setFirstResult(1)
//                    .setMaxResults(10)
//                    .getResultList().get(0);
//            member.setUsername("Seung Hwa");

//            ----------- 삭제
            Member member = entityManager.find(Member.class, 1L); //삭제할 것을 먼저 찾고 삭제함

            entityManager.remove(member);

            //detach 준영속상태로 만듦

            entityTransaction.commit();

        }catch (Exception exception){

            System.err.println(exception.getLocalizedMessage());

            entityTransaction.rollback();
        }finally {
            System.out.println("처리완료");
            entityManager.close();
        }

        entityManagerFactory.close();
    }

 */
}