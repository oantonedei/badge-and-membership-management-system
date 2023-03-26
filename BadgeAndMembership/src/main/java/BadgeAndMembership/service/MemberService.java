package BadgeAndMembership.service;

import BadgeAndMembership.model.Member;
import contracts.dto.MemberDto;
import edu.miu.common.service.BaseReadService;

public interface MemberService extends BaseReadService<MemberDto, Member, Integer> {
    public void add(String firstName, String lastName, String email);
}
