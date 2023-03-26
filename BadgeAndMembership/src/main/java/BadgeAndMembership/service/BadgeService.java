package BadgeAndMembership.service;

import BadgeAndMembership.model.Badge;
import contracts.dto.BadgeDto;
import edu.miu.common.exception.ResourceNotFoundException;
import edu.miu.common.service.BaseReadService;

public interface BadgeService extends BaseReadService<BadgeDto, Badge, Integer> {
    public void addBadge(BadgeDto badge);
    public void updateBadge(BadgeDto badge) throws ResourceNotFoundException;
    public void deleteBadge(Integer id);
}
