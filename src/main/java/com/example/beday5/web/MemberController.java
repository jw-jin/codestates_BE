package com.example.beday5.web;


import com.example.beday5.domain.Member;
import com.example.beday5.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/join")
    public ResponseEntity<String> join(@RequestBody Member member) {
        memberService.join(member);
        System.out.println("member.getId() = " + member.getId());
        return ResponseEntity.ok("가입 완료");
    }

    @GetMapping("/info/{id}")
    public ResponseEntity<Member> memberInfo(@PathVariable Long id) {
        Member member1 = memberService.findMember(id);
        System.out.println("member1 = " + member1);
        return ResponseEntity.ok(member1);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody Member member) {
        memberService.updateMember(id, member);
        return ResponseEntity.ok("수정 완료");
    }

    @DeleteMapping("/withdraw/{id}")
    public ResponseEntity<String> withdraw(@PathVariable Long id) {
        memberService.deleteMember(id);
        return ResponseEntity.ok("탈퇴 완료");
    }
}
