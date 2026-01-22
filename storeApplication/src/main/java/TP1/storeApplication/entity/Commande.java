package TP1.storeApplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Commande {

    @Id @GeneratedValue
    private Long id;
    private String titre;

    @ManyToOne
    Customer customer;

    public Commande(String titre, Customer customer) {
        this.titre = titre;
        this.customer = customer;
    }

    public Commande() {
    }

    public Long getId() {
        return id;
    }

    public Customer getCustomer(){
        return customer;
    }

    public String getTitre() {
        return titre;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

}
