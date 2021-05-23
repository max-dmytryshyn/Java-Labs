package ua.lviv.iot.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.saws.models.Saw;

@Repository
public interface SawRepository extends JpaRepository<Saw, Integer> {
}
