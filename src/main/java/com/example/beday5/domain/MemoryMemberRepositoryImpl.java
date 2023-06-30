package com.example.beday5.domain;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class MemoryMemberRepositoryImpl implements MemberRepository{

    List<Member> memberList = new ArrayList<>();

    @Override
    public Member create(Member member) {
        memberList.add(member);
        return member;
    }

    @Override
    public Member findById(Long id) {
        return memberList.get(id.intValue()-1);
    }

    @Override
    public Member update(Long id, Member member) {
        memberList.set(id.intValue()-1,member);
        return member;
    }

    @Override
    public Long delete(Long id) {
        memberList.remove(id.intValue()-1);
        return id;
    }
}
