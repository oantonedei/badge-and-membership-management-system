package BadgeAndMembership.repository;

import BadgeAndMembership.model.Member;
import edu.miu.common.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends BaseRepository<Member,Integer> {
}
