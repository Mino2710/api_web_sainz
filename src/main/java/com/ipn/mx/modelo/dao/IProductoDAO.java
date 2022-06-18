package com.ipn.mx.modelo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import com.ipn.mx.modelo.entidades.Producto;

public interface IProductoDAO  extends JpaRepository<Producto, Long>{

	@Query("from Producto")
	public List<Producto> findAllCategoria();
}
