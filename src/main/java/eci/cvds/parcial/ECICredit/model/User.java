package eci.cvds.parcial.ECICredit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private List<String> facturasIds;

    public User(String nombre, String email) {
        this.id = UUID.randomUUID().toString();
        this.name = nombre;
        this.email = email;
        this.facturasIds = new ArrayList<>();
    }

    public void agregarPago(String pagoId) {
        this.facturasIds.add(pagoId);
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
}
