package cafe.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("customer")
public class Chat {



/* 
- id : Integer
- nom : String
- race : string
- age : integer (en année et par quart d'année genre 1,25 1,5 1,75 2)
- sexe : String
- niveau_faim : int (0-100)
- niveau_soif : int (0-100)
- niveau_humeur : int (0-100)
- niveau_sommeil : int (0-100)
- niveau_hygiène : int (0-100)
- niveau_vaccin : double (0-100)
- adopted : bool 
- date_veto : locaDate
*/
}
