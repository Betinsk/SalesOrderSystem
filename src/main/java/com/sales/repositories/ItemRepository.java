

package com.sales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sales.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>  {

}
