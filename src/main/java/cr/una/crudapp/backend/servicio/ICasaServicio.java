package cr.una.crudapp.backend.servicio;

import cr.una.crudapp.backend.excepcion.CasaNotFoundException;
import cr.una.crudapp.backend.modelo.Casa;

public interface ICasaServicio {
    public Casa encuentraPorId (final long casa_id) throws CasaNotFoundException;
   
    
            /**
     * Metodo que sirve para calcular el area de una casa especifica
     * 
     * @return el area en tipo double.
     */
    public double calculaArea (final long casa_id) throws CasaNotFoundException;
    

    public Casa crear (final Casa casa);
   
}

