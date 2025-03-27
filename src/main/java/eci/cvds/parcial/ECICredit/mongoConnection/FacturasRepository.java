package eci.cvds.parcial.ECICredit.mongoConnection;

import eci.cvds.parcial.ECICredit.model.Factura;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturasRepository extends MongoRepository<Factura,String> {

    Factura findByFacturaId(String facturaId);
}
