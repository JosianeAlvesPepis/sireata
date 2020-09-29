package br.edu.utfpr.dv.sireata.dao;

import java.sql.SQLException;

public interface SuperDAO<T> {
  T buscarPorId(int id) throws SQLException;
  List T listarPorAta(int idAta) throws SQLException;
  int salvar(T t) throws SQLException;
  void excluir(T t) throws Exception{
}