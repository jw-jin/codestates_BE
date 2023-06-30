package com.example.beday5.service;

import com.example.beday5.domain.Member;

public interface MemberService {
    Member join(Member member);
    Member findMember(Long id);
    Member updateMember(Long id, Member member);
    Long deleteMember(Long id);
}
