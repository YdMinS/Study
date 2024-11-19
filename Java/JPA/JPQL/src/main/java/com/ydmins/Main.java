package com.ydmins;

import javax.persistence.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{
            Team team = new Team();
            team.setName("teamA");
            em.persist(team);

            Member member = new Member();
            member.setUsername("member1");
            member.setAge(10);

            member.setTeam(team);

            em.persist(member);

            // TypedQuery vs. Query
            TypedQuery<Member> typedQuery = em.createQuery("SELECT m FROM Member M", Member.class);
            Query query = em.createQuery("SELECT m.username FROM Member m");

            // setParameter()
            TypedQuery<Member> typedQuery2 =
                    em.createQuery("SELECT m.username FROM Member m where m.username=:username", Member.class).setParameter(
                    "username","member1");
            Member singleResult = typedQuery2.getSingleResult();

            // Projection
            // select m from Member m
            // select m.team from Member m
            // select m.address from Member m
            // select m.username, m.age from Member m

            // 여러값 조회
            // String이기 때문에 com.ydmins 다 써줘야 한다
            List<MemberDTO> result = em.createQuery("select new com.ydmins.MemberDTO(m.username, m.age) from Member m",
                    MemberDTO.class).getResultList();
            MemberDTO memberDTO = result.get(0);

            // 페이징
            List<Member> list =
                    em.createQuery("select m from Member m order by m.age desc", Member.class).setFirstResult(0).setMaxResults(10).getResultList();

            // Join
            String joinQuery = "select m from Member m inner join m.team t";
            List<Member> joinResult = em.createQuery(joinQuery, Member.class)
                    .setFirstResult(1)
                    .setMaxResults(10)
                    .getResultList();

            // Case
            String caseQuery = "select " +
                    "case when m.age <= 10 then '학생요금'" +
                         "when m.age >=60 then '경로요금'" +
                         "else '일반요금' end" +
                    " from Member m";
            List<String> caseResult = em.createQuery(caseQuery, String.class).getResultList();

            // Fetch Join
            String fetchJoinQuery = "select m from Member m join fetch m.team";

            // Collection Fetch Join
            String collectionFetchJoinQuery = "select t from Team t join fetch t.members";

            // NamedQuery
            List<Member> namedQueryResult = em.createNamedQuery("Member.findByUsername", Member.class)
                            .setParameter("username", "member1")
                            .getResultList();

            // Bulk Execution
            int resultCount = em.createQuery("update Member m set m.age=20").executeUpdate();

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
        emf.close();
    }
}