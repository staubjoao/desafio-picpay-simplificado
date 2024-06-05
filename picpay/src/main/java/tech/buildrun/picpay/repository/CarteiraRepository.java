package tech.buildrun.picpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.buildrun.picpay.entity.Carteira;

public interface CarteiraRepository extends JpaRepository<Carteira, Long> {

}
