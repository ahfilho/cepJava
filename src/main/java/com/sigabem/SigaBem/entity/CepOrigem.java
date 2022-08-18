package com.sigabem.SigaBem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "sigaBem")
public class CepOrigem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long id;

    @Column(name = "nome_destinatario")
    private String nomeDestinatario;

    @Column(name = "cep_origem")
    private String cepOrigem;

    @Column(name = "cep_destino")
    private String cepDestino;

    @Column(name = "peso")
    private float peso;

    //    @Column(name = "cep")
    private String cep;

    //    @Column(name = "logradouro/rua")
    private String logradouro;

    //    @Column(name = "complemento/casa")
    private String complemento;

    //    @Column(name = "bairro")
    private String bairro;

    //    @Column(name = "localidade/cidade")
    private String localidade;

    //    @Column(name = "uf/estado")
    private String uf;

    //    @Column(name = "gia")
    private String gia;

    //    @Column(name = "ibge")
    private String igbe;

    //    @Column(name = "ddd")
    private String ddd;

    //    @Column(name = "siafi")
    private String siafi;


}
