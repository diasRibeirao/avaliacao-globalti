package br.com.globalti.controller.validation;

import br.com.globalti.controller.exceptions.FieldMessage;
import br.com.globalti.model.dto.TransferenciaAgendarDTO;
import br.com.globalti.utils.Utils;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class TransferenciaAgendarValidator implements ConstraintValidator<TransferenciaAgendar, TransferenciaAgendarDTO> {

    @Override
    public void initialize(TransferenciaAgendar ann) {
        // do nothing
    }

    @Override
    public boolean isValid(TransferenciaAgendarDTO transferenciaAgendarDTO, ConstraintValidatorContext context) {
        List<FieldMessage> list = new ArrayList<>();

        if (!StringUtils.isBlank(transferenciaAgendarDTO.getDataTransferencia())) {
            Long diasAteTransferencia = ChronoUnit.DAYS.between(
                    LocalDate.now(),
                    Utils.stringToLocalDate(transferenciaAgendarDTO.getDataTransferencia())
            );
            if (diasAteTransferencia < 0L) {
                list.add(new FieldMessage("dataTransferencia", "A data da da transferência não pode ser menor que a data atual"));
            }
        }

        if (transferenciaAgendarDTO.getContaOrigem().equalsIgnoreCase(transferenciaAgendarDTO.getContaDestino())) {
            list.add(new FieldMessage("contaDestino", "A conta de origem e de destino não devem ser a mesma"));
        }

        for (FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMessage())
                    .addPropertyNode(e.getFieldName())
                    .addConstraintViolation();
        }

        return list.isEmpty();
    }

}
