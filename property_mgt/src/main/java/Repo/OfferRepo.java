package Repo;

import Entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepo extends JpaRepository<Offer,Long> {
    Offer findByOfferId(Long offerId) ;
}
