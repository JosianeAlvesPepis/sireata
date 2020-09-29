package br.edu.utfpr.dv.sireata.dao;

import java.sql.SQLException;

public interface SuperDAO<T> {
  T buscarPorId(int id) throws SQLException;
}