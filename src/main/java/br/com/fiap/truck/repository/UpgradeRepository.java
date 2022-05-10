package br.com.fiap.truck.repository;

import br.com.fiap.truck.model.Upgrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpgradeRepository extends JpaRepository<Upgrade, Integer> {
}
