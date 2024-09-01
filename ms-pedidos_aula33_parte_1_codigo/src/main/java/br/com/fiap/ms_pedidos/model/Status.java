package br.com.fiap.ms_pedidos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
public enum Status {
    CANCELADO,
    REALIZADO,
    PAGO,
    ENTREGUE,
    CONFIRMADO,
    PRONTO,
    NAO_AUTORIZADO
}
