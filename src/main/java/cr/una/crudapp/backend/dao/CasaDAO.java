package cr.una.crudapp.backend.dao;

import com.google.common.base.Preconditions;
import org.springframework.stereotype.Repository;
import cr.una.crudapp.backend.excepcion.CasaNotFoundException;
import cr.una.crudapp.backend.modelo.Casa;

@Repository
public class CasaDAO extends AbstractHibernateDao   implements ICasaDAO  {
    @Override
    public Casa encuentraPorId(final long id_casa) throws CasaNotFoundException {
        Casa casa = (Casa) getCurrentSession().get(Casa.class, id_casa);
        if (casa == null) {
            throw new CasaNotFoundException("Casa no fue encontrada");
        } else {
            return casa;
        }
    }
    
        @Override
    public Casa crearCasa(Casa casa) {
        Preconditions.checkNotNull(casa);
        getCurrentSession().saveOrUpdate(casa);

        return casa;
    }
}
