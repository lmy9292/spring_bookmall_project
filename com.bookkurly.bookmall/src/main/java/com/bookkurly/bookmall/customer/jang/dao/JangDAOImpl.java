package com.bookkurly.bookmall.customer.jang.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookkurly.bookmall.customer.jang.dto.JangDeleteInfo;
import com.bookkurly.bookmall.customer.jang.dto.JangInfo;
import com.bookkurly.bookmall.customer.jang.dto.JangUpdate;
import com.bookkurly.bookmall.customer.jang.dto.OrderDetail;
import com.bookkurly.bookmall.customer.jang.entity.JangEntity;

@Repository
public class JangDAOImpl implements JangDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public void insertToJang(JangEntity entity) {
		sqlSession.insert("JangDAO.insertJangBook", entity);
		
	}

	@Override
	public List<JangEntity> getCustomerJangList(JangInfo jangInfo) {
		return sqlSession.selectList("JangDAO.getCustomerJangList", jangInfo);
	}

	@Override
	public Integer updateOrder(JangUpdate jangUpdate) {
		return sqlSession.update("JangDAO.updateJang", jangUpdate);
	}

	@Override
	public JangEntity selectJangByBookSeqOrderSerialNum(JangUpdate jangUpdate) {
		return sqlSession.selectOne("JangDAO.selectJangByBookSeqOrderSerialNum", jangUpdate);
	}

	@Override
	public Integer deleteJangItem(JangDeleteInfo jangDelete) {
		return sqlSession.delete("JangDAO.deleteJangItem", jangDelete);
	}

	@Override
	public Integer deleteJang(String myOrderSerialNum) {
		return sqlSession.delete("JangDAO.delete", myOrderSerialNum);
	}

	@Override
	public List<JangEntity> selectAll(String myOrderSerialNum) {
		return sqlSession.selectList("JangDAO.selectAll", myOrderSerialNum);
	}

	@Override
	public Integer updateOrderStatement(String myOrderSerialNum) {
		return sqlSession.update("JangDAO.updateOrderStatement", myOrderSerialNum);
	}

	@Override
	public JangEntity selectOrderDetail(OrderDetail orderDetail) {
		return sqlSession.selectOne("JangDAO.selectOrderDetail", orderDetail);
	}

	@Override
	public JangEntity findJangInfo(JangEntity jangEntity) {
		return sqlSession.selectOne("JangDAO.findJangInfo", jangEntity);
	}

}
