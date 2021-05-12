package vn.techmaster.demohipster.repository.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import vn.techmaster.demohipster.domain.User;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {}
