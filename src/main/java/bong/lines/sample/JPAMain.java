package bong.lines.sample;

import bong.lines.comm.TransactionTemplate;
import bong.lines.sample.entity.MemberBasic;
import bong.lines.sample.entity.RSVNDTLEntity;
import bong.lines.sample.entity.RSVNMSTEntity;
import bong.lines.sample.operation.BasicSample;

public class JPAMain {
    public static void main(String[] args) {
        //Basic sample
//        new TransactionTemplate(new BasicSample()).process();

//        new TransactionTemplate(entityManager -> {
//            MemberBasic memberBasic = new MemberBasic();
//            memberBasic.setUsername("Seung Hwa");
//            entityManager.persist(memberBasic);
//            entityManager.merge(memberBasic);
//        });

        new TransactionTemplate((entityManager -> {
            RSVNMSTEntity rsvnmstEntity = new RSVNMSTEntity();
            rsvnmstEntity.setRsvnNo(1L);

            entityManager.persist(rsvnmstEntity);

            RSVNDTLEntity rsvndtlEntity = new RSVNDTLEntity();
            rsvndtlEntity.setRsvnmstEntity(rsvnmstEntity);
            rsvndtlEntity.setId(5L);

            entityManager.persist(rsvndtlEntity);

            RSVNDTLEntity rsvnEntity = entityManager.find(RSVNDTLEntity.class, 5L);
            rsvnEntity.getRsvnmstEntity();

            System.out.println("rsvnEntity.getRsvnmstEntity = "+ rsvnEntity.getRsvnmstEntity().getRsvnNo());
            //RSVNDTLEntity rsvndtlEntity = entityManager.find(RSVNDTLEntity.class, rsvnEntity.getRsvnNo());
        })).process();
    }
}
