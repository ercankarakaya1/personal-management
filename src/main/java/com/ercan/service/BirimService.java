package com.ercan.service;


import com.ercan.entity.Birim;

import java.util.List;

public interface BirimService {
    public List<Birim> findAll();

    public Birim getbyId(Long birim_id);

    public Birim saveBirim(Birim birim);


}
