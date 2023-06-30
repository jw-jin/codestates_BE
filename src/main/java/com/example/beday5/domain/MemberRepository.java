package com.example.beday5.domain;

public interface MemberRepository {
    Member create(Member member);
    Member findById(Long id);
    Member update(Long id, Member member);
    Long delete(Long id);

}
