package BadgeAndMembership.repository;

import BadgeAndMembership.model.Badge;
import edu.miu.common.repository.BaseRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Repository
public interface BadgeRepository extends BaseRepository<Badge, Integer> {
    @Modifying
    @Query("update Badge b set b.isActive = ?1, b.modifiedDate = ?2 where b.id = ?3")
    public void updateBadgeStatus(@Param("isActive") boolean isActive, @Param("modifiedDate")LocalDateTime modifiedDate, @Param("id") int id);
}
