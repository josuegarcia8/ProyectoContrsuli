package com.contrasuli.service;

import com.contrasuli.domain.SanjosePuriscalK;
import java.util.List;


public interface SanjosePuriscalKService {
    
    public List<SanjosePuriscalK> getSanjosePuriscalKes();
    
    public void save(SanjosePuriscalK sanjosePuriscalK);
    
    public void delete(SanjosePuriscalK sanjosePuriscalK);
    
    public SanjosePuriscalK getSanjosePuriscalK(SanjosePuriscalK sanjosePuriscalK);
    
}
