package com.study.socket.repository;

import com.study.socket.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Object> {
    Member findByEmailId(String emailId);
}
