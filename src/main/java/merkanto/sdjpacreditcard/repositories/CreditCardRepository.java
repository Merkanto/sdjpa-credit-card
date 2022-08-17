package merkanto.sdjpacreditcard.repositories;

import merkanto.sdjpacreditcard.domain.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
}
