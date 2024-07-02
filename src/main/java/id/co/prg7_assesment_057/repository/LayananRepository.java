package id.co.prg7_assesment_057.repository;

import id.co.prg7_assesment_057.model.Layanan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LayananRepository extends  JpaRepository<Layanan, Integer>{
    List<Layanan> findAll();
}
