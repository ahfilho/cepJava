package com.sigabem.SigaBem.service;

import com.google.gson.Gson;
import com.sigabem.SigaBem.entity.CepOrigem;
import com.sigabem.SigaBem.repository.SigaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

@Service
@Transactional
public class SigaService {

    @Autowired
    private SigaRepository sigaRepository;

    public void consultaCep(CepOrigem encomenda) throws IOException {

        URL url = new URL("http://viacep.com.br/ws/" + encomenda.getCepOrigem() + "/json/");
        URLConnection connection = url.openConnection();
        InputStream is = connection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

        String cep = "";
        StringBuilder jsonCep = new StringBuilder();
        while ((cep = br.readLine()) != null) {
            jsonCep.append(cep);

        }
        System.out.println(encomenda.getCepOrigem() + "ORIGEM AQUI");


        this.sigaRepository.save(encomenda);
    }

    public List<CepOrigem> encomendaList() {
        List<CepOrigem> l = this.sigaRepository.findAll();
        for (CepOrigem e : l
        ) {
            System.out.println(e.getCepDestino());
            if (e.getCepDestino() == e.getCepOrigem()) {
                System.out.println("");
            }

        }


        return this.sigaRepository.findAll();
    }
}
