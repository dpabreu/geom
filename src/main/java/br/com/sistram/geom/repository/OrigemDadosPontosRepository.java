package br.com.sistram.geom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.sistram.geom.model.OrigemDadosPontos;

public interface OrigemDadosPontosRepository extends JpaRepository<OrigemDadosPontos, Integer>{


	@Query("select o from OrigemDadosPontos o where o.idOrigemDados = :idOrigemDados order by nomeNavio")
	List<OrigemDadosPontos> findByIdOrigemDados(@Param("idOrigemDados") Integer idOrigemDados);
	
	//TODO mudar para 2404
	@Query(value = "SELECT 	poi.* FROM areas pol JOIN origem_dados_pontos poi ON (ST_Within(poi.the_geom, pol.the_geom)) "+ 
				   "where pol.id_area=45 and poi.id_origem_dados=55", nativeQuery = true)
	List<OrigemDadosPontos> findByAreasOrigemDados();	
}
