package com.contrasuli.service;

import com.contrasuli.domain.SanjosePuriscalD;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.contrasuli.dao.SanjosePuriscalDDao;


@Service
public class SanjosePuriscalDServicempl implements SanjosePuriscalDService{
    
    //Se crea en tiempo de ejecución si aún no se ha creado...
    @Autowired
    private SanjosePuriscalDDao sanjosePuriscalDDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<SanjosePuriscalD> getSanjosePuriscalDes() {
        var lista = (List<SanjosePuriscalD>) sanjosePuriscalDDao.findAll();
        return lista;
    }

    @Override
    @Transactional
    public void save(SanjosePuriscalD sanjosePuriscalD) {
        sanjosePuriscalDDao.save(sanjosePuriscalD);
    }

    @Override
    @Transactional
    public void delete(SanjosePuriscalD sanjosePuriscalD) {
        sanjosePuriscalDDao.delete(sanjosePuriscalD);
    }

    @Override
    @Transactional(readOnly = true)
    public SanjosePuriscalD getSanjosePuriscalD(SanjosePuriscalD sanjosePuriscalD) {
        return sanjosePuriscalDDao.findById(sanjosePuriscalD.getIdSpwd145()).orElse(null);
    }
    
    
}
