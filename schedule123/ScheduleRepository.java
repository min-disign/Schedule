package schedule123;

import java.time.LocalDate;
import java.util.List;

public interface ScheduleRepository<Schedule> extends JpaRepository<Schedule, Long> {

    List<Schedule> findByUpdatedAtAndAuthorContainingIgnoreCaseOrderByUpdatedAtDesc(LocalDate updatedAt, String author);

    List<Schedule> findAllByOrderByUpdatedAtDesc();
}
