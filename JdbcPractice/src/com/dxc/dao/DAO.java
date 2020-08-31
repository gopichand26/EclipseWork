package com.dxc.dao;

import java.io.FileNotFoundException;
import java.util.List;

public interface DAO <E> {
	boolean save(E e) throws Exception;
	boolean edit(E e) throws Exception;
	boolean delete(int id1, int id2) throws Exception;
	E find(int id) throws Exception;
	E find(int studentID,int examId) throws Exception;
	List<E> findAll() throws Exception;
	boolean delete(int id) throws Exception;
}