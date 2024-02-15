package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl(memberRepository);

        Member mamber = new Member(1L, "mamberA", Grade.VIP);
        memberService.join(mamber);

        Member findeMember = memberService.findMember(1L);
        System.out.println("mamber = " + mamber.getGrade());
        System.out.println("findeMember = " + findeMember.getGrade());
    }
}
