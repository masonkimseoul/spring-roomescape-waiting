package roomescape.time.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import roomescape.time.dto.ReservationTimeWithBookStatusResponse;

public interface ReservationTimeRepository extends CrudRepository<ReservationTime, Long> {

    List<ReservationTimeWithBookStatusResponse> findByDateAndThemeIdWithBookStatus(LocalDate date, Long themeId);

    boolean existByStartAt(LocalTime startAt);
}
