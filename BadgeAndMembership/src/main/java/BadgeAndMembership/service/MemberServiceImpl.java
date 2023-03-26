package BadgeAndMembership.service;

import BadgeAndMembership.model.Member;
import BadgeAndMembership.repository.MemberRepository;
import contracts.dto.MemberDto;
import edu.miu.common.service.BaseReadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl extends BaseReadServiceImpl<MemberDto, Member, Integer> implements MemberService {
    @Autowired
    private MemberRepository memberRepository;
    @Override
    public void add(String firstName, String lastName, String email) {
        Member member = new Member();
        member.setFirstName(firstName);
        member.setLastName(lastName);
        member.setEmail(email);

        memberRepository.save(member);
    }
}
