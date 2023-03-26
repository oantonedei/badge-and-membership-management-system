package BadgeAndMembership.controller;

import BadgeAndMembership.model.Member;
import contracts.dto.MemberDto;
import edu.miu.common.controller.BaseReadController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MemberController extends BaseReadController<MemberDto, Member, Integer> {
}
