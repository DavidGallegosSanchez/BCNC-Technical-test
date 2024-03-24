package com.gallegos.bcnc.domain.repository;

import com.gallegos.bcnc.domain.model.Price;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IProductRepository extends CrudRepository<Price, Integer> {

    @Query("select p from Price p where " +
            "(:applicationDate between p.startDate and p.endDate) " +
            "and  p.productId = :productIdentifier " +
            "and p.brandId = :brandIdentifier order by p.priority desc ")
    List<Price> getProductByConditions(LocalDateTime applicationDate, int productIdentifier, int brandIdentifier);
}
