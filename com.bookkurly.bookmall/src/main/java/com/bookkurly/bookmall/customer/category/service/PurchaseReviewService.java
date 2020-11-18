package com.bookkurly.bookmall.customer.category.service;

import java.util.List;

import com.bookkurly.bookmall.customer.category.entity.PurchaseReview;

public interface PurchaseReviewService {
	public Integer insertPurchaseReview(PurchaseReview purchaseReview);

	public PurchaseReview find(Integer purchaseReviewSeq);

	public Integer update(PurchaseReview before);

	public Integer delete(Integer purchaseReviewSeq);
	
	public List<PurchaseReview> findPurchaseReview(String myOrderSerialNum);
	
	public Integer deleteReviews(String myOrderSerialNum);
}
