package tech.buildrun.picpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.buildrun.picpay.entity.TipoCarteira;

@Repository
public interface TipoCarteiraRepository extends JpaRepository<TipoCarteira, Long> {

}
