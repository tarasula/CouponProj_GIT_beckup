/**
 * 
 */
package db_package;

import java.util.Collection;

/**
 * @author Andrey Orlov
 *
 */
public class Company {
	private long id;
	private String compName, password, email;
	
	private Collection<Coupon> coupon;

	public Company() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<Coupon> getCoupon() {
		return coupon;
	}

	public void setCoupon(Collection<Coupon> coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", compName=" + compName + ", password=" + password + ", email=" + email
				+ ", coupon=" + coupon + "]";
	}
	
}