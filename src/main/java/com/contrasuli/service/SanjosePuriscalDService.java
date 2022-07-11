package com.contrasuli.service;

import com.contrasuli.domain.SanjosePuriscalD;
import java.util.List;


public interface SanjosePuriscalDService {
    
    public List<SanjosePuriscalD> getSanjosePuriscalDes();
    
    public void save(SanjosePuriscalD sanjosePuriscalD);
    
    public void delete(SanjosePuriscalD sanjosePuriscalD);
    
    public SanjosePuriscalD getSanjosePuriscalD(SanjosePuriscalD sanjosePuriscalD);
    
}
