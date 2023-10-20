package in.co.rays.hashmap;

public class Car {
String cname;
String type;
int price;
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Car [cname=" + cname + ", type=" + type + ", price=" + price + "]";
}

}
