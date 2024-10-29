package ua.ucu.edu.apps.lab8_forever.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.ucu.edu.apps.lab8_forever.model.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Repository> {
}
