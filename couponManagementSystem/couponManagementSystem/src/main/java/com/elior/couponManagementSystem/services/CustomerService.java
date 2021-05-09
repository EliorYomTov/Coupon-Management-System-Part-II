package com.elior.couponManagementSystem.services;

import java.util.List;

import com.elior.couponManagementSystem.beans.Category;
import com.elior.couponManagementSystem.beans.Coupon;
import com.elior.couponManagementSystem.beans.Customer;
import com.elior.couponManagementSystem.exception.CouponSystemException;

public interface CustomerService {

	public void purchaseCoupon(Coupon coupon) throws CouponSystemException;

	public List<Coupon> getCustomerCoupon();

	public List<Coupon> getCustomerCoupon(Category category);

	public List<Coupon> getCustomerCoupon(double maxPrice);

	public Customer getCustomerDetails() throws CouponSystemException;

}
