package io.espy.tac;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "service-account", path = "service-account")
public interface ServiceAccountRepository extends MongoRepository<ServiceAccount, String> {

	List<ServiceAccount> findBySaAdName(@Param("saAdName") String saAdName);

}