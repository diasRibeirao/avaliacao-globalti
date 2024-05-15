package br.com.globalti.repository;

import br.com.globalti.model.Transferencia;
import br.com.globalti.model.enums.StatusTransferencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {

    List<Transferencia> findByDataTransferenciaAndStatus(LocalDate dataTransferencia, StatusTransferencia status);

}
