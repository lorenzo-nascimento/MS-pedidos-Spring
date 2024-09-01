package br.com.fiap.ms_pedidos.controller;

import br.com.fiap.ms_pedidos.dto.PedidoDTO;
import br.com.fiap.ms_pedidos.service.PedidoService;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping
    public ResponseEntity<List<PedidoDTO>> findAll(){
        List<PedidoDTO> dto = service.findALl();
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoDTO> findById(@PathVariable @NotNull long id) {
        PedidoDTO dto = service.findById(id);
        return ResponseEntity.ok(dto);
    }





}
