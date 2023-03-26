package BadgeAndMembership.service;

import BadgeAndMembership.model.Badge;
import BadgeAndMembership.repository.BadgeRepository;
import contracts.dto.BadgeDto;
import edu.miu.common.service.BaseReadServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@Transactional
public class BadgeServiceImpl extends BaseReadServiceImpl<BadgeDto, Badge, Integer> implements BadgeService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private BadgeRepository badgeRepository;

    @Override
    public void addBadge(BadgeDto badge) {
        Badge newBadge = modelMapper.map(badge, Badge.class);
        badgeRepository.save(newBadge);
    }

    @Override
    public void updateBadge(BadgeDto badge) {
        Badge updateValue = modelMapper.map(badge, Badge.class);
        boolean isActive = !updateValue.isActive();
        LocalDateTime modifiedDate = LocalDateTime.now();
        badgeRepository.updateBadgeStatus(isActive, modifiedDate,updateValue.getId());
    }

    @Override
    public void deleteBadge(Integer id) {
        badgeRepository.deleteById(id);
    }
}
