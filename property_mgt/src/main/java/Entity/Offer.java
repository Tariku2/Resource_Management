package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Offer {
    @Id
    private long OfferId;
    private String offerName;

}
