package vn.techmaster.demohipster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.techmaster.demohipster.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
