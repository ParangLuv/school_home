package kr.or.dgit.school_homework.dao;

import java.util.List;

public interface InterfaceDao<T> {
	int insertItem(T item);
	void deleteItemAll(int no);
	List<T> selectItemByAll();
}

















