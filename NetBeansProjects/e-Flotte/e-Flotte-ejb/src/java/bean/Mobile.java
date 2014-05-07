/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author weddou
 */
@Entity
public class Mobile implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String immatriculation;
    private String constructeur;
    private String model;
    private String type;
    private String moteur;
    private String annee;
    private String transmission;
    private String kilometrage;
    private String description;
    
  
    @ManyToMany
    private List<Region> regions = new ArrayList<Region>();
    
    
    @ManyToOne
    private Etat_Mobile etat_Mobile = new Etat_Mobile();
    
   
    @OneToOne
    private Conducteur conducteur = new Conducteur();
    
   
    @OneToOne
     private GPS gPS = new GPS();   
   
    
    @ManyToOne
    private Carburant carburant = new Carburant();
    
   
    @OneToMany(mappedBy = "mobile")
    private List<Entretien> entretiens = new ArrayList<Entretien>();
    
    
    @OneToMany
    private List<Alerte> alertes = new ArrayList<Alerte>();
    
   
    @OneToMany(mappedBy = "mobile")
    private List<MobileManager> mobileManagers = new ArrayList<MobileManager>();

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getConstructeur() {
        return constructeur;
    }

    public void setConstructeur(String constructeur) {
        this.constructeur = constructeur;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMoteur() {
        return moteur;
    }

    public void setMoteur(String moteur) {
        this.moteur = moteur;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(String kilometrage) {
        this.kilometrage = kilometrage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public Etat_Mobile getEtat_Mobile() {
        return etat_Mobile;
    }

    public void setEtat_Mobile(Etat_Mobile etat_Mobile) {
        this.etat_Mobile = etat_Mobile;
    }

    public Conducteur getConducteur() {
        return conducteur;
    }

    public void setConducteur(Conducteur conducteur) {
        this.conducteur = conducteur;
    }

    public GPS getgPS() {
        return gPS;
    }

    public void setgPS(GPS gPS) {
        this.gPS = gPS;
    }

    public Carburant getCarburant() {
        return carburant;
    }

    public void setCarburant(Carburant carburant) {
        this.carburant = carburant;
    }

    public List<Entretien> getEntretiens() {
        return entretiens;
    }

    public void setEntretiens(List<Entretien> entretiens) {
        this.entretiens = entretiens;
    }

    public List<Alerte> getAlertes() {
        return alertes;
    }

    public void setAlertes(List<Alerte> alertes) {
        this.alertes = alertes;
    }

    public List<MobileManager> getMobileManagers() {
        return mobileManagers;
    }

    public void setMobileManagers(List<MobileManager> mobileManagers) {
        this.mobileManagers = mobileManagers;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mobile)) {
            return false;
        }
        Mobile other = (Mobile) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Mobile[ id=" + id + " ]";
    }
    
}
