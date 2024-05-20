package roomescape.reservation.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import roomescape.reservation.domain.Reservation;

public record MemberReservationStatusResponse(
        Long reservationId,
        String theme,
        LocalDate date,
        LocalTime time,
        String status) {

    public MemberReservationStatusResponse(Reservation reservation) {
        this(reservation.getId(),
                reservation.getTheme().getName(),
                reservation.getDate(),
                reservation.getTime().getStartAt(),
                reservation.getStatus().getValue()
        );
    }
}
