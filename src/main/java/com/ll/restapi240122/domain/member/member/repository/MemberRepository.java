package com.ll.restapi240122.domain.member.member.repository;

import com.ll.restapi240122.domain.member.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}