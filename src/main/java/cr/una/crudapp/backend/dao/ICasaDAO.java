package cr.una.crudapp.backend.dao;

import cr.una.crudapp.backend.excepcion.CasaNotFoundException;
import cr.una.crudapp.backend.modelo.Casa;

public interface ICasaDAO {
    public Casa encuentraPorId (final long id_casa) throws CasaNotFoundException;
        public Casa crearCasa (final Casa casa);
}
