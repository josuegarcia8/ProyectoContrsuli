package com.contrasuli.service;

import com.contrasuli.domain.SanjosePuriscalK;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.contrasuli.dao.SanjosePuriscalKDao;


@Service
public class SanjosePuriscalKServicempl implements SanjosePuriscalKService{
    
    //Se crea en tiempo de ejecución si aún no se ha creado...
    @Autowired
    private SanjosePuriscalKDao sanjosePuriscalKDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<SanjosePuriscalK> getSanjosePuriscalKes() {
        var lista = (List<SanjosePuriscalK>) sanjosePuriscalKDao.findAll();
        return lista;
    }

    @Override
    @Transactional
    public void save(SanjosePuriscalK sanjosePuriscalK) {
        sanjosePuriscalKDao.save(sanjosePuriscalK);
    }

    @Override
    @Transactional
    public void delete(SanjosePuriscalK sanjosePuriscalK) {
        sanjosePuriscalKDao.delete(sanjosePuriscalK);
    }

    @Override
    @Transactional(readOnly = true)
    public SanjosePuriscalK getSanjosePuriscalK(SanjosePuriscalK sanjosePuriscalK) {
        return sanjosePuriscalKDao.findById(sanjosePuriscalK.getIdSpwk145()).orElse(null);
    }
    
    
}
