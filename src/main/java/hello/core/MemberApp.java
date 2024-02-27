package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member mamber = new Member(1L, "mamberA", Grade.VIP);
        memberService.join(mamber);

        Member findeMember = memberService.findMember(1L);
        System.out.println("mamber = " + mamber.getGrade());
        System.out.println("findeMember = " + findeMember.getGrade());
    }
}
