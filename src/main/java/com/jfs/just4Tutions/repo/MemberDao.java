package com.jfs.just4Tutions.repo;

import java.util.List;

import com.jfs.just4Tutions.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
