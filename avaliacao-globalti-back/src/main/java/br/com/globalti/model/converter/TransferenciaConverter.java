package br.com.globalti.model.converter;

import br.com.globalti.model.Transferencia;
import br.com.globalti.model.dto.TransferenciaAgendarDTO;
import br.com.globalti.model.dto.TransferenciaDTO;
import br.com.globalti.model.enums.StatusTransferencia;
import br.com.globalti.utils.Utils;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TransferenciaConverter {

    public TransferenciaDTO parse(Transferencia origin) {
        if (origin == null)
            return null;

        return TransferenciaDTO.builder()
                .id(origin.getId())
                .contaOrigem(origin.getContaOrigem())
                .contaDestino(origin.getContaDestino())
                .valorTransferencia(origin.getValorTransferencia())
                .valorTaxa(origin.getValorTaxa())
                .dataTransferencia(origin.getDataTransferencia())
                .dataAgendamento(origin.getDataAgendamento())
                .status(origin.getStatus())
                .build();
    }

    public List<TransferenciaDTO> parse(List<Transferencia> origin) {
        if (origin == null)
            return Collections.emptyList();

        return origin.stream().map(this::parse).collect(Collectors.toList());
    }

    public Transferencia parseTransferenciaAgendarDTO(TransferenciaAgendarDTO origin) {
        if (origin == null)
            return null;

        return Transferencia.builder()
                .contaOrigem(origin.getContaOrigem())
                .contaDestino(origin.getContaDestino())
                .valorTransferencia(origin.getValorTransferencia())
                .dataTransferencia(Utils.stringToLocalDate(origin.getDataTransferencia()))
                .dataAgendamento(LocalDate.now())
                .status(StatusTransferencia.AGENDADA)
                .build();
    }

}
