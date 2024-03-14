package in.satya.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Course1 {
	@Id
	private Integer cid;
	private String cName;
	private Double cPrice;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Double getcPrice() {
		return cPrice;
	}
	public void setcPrice(Double cPrice) {
		this.cPrice = cPrice;
	}
	@Override
	public String toString() {
		return "Course1 [cid=" + cid + ", cName=" + cName + ", cPrice=" + cPrice + "]";
	}
	
	

}
