package jpabook.jpashop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//class MemberRepositoryTest {
//
//    @Autowired MemberRepository memberRepository;
//
//    @Test
//    @Transactional
//    @Rollback(false)
//    public void testMember() throws Exception {
////        //given
////        Member member = new Member();
////        member.setUsername("memberA");
////
////        //when
////        Long save = memberRepository.save(member);
////        Member member1 = memberRepository.find(save);
////
////        //then
////        assertThat(member1.getId()).isEqualTo(member.getId());
////        assertThat(member1.getUsername()).isEqualTo(member.getUsername());
////        assertThat(member1).isEqualTo(member);
//    }
//}