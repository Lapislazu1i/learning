package exercise1029;

//Page307 9.9
public class RegularPolygon {
  private int n; //����α���
  private double side; //�ߵĳ���
  private double x; //������е��x����
  private double y; //������е��y����
  
  public RegularPolygon() {
	n = 3;
	side = 1;
	x = 0;
	y = 0;
  }
  
  //�����ڣ�0,0��
  public RegularPolygon(int n1, double side1) {
	n = n1;
	side = side1;
	x = 0;
	y = 0;
  }
  
  //�����ڣ�x,y��
  public RegularPolygon(int n1, double side1, double x1, double y1) {
	n = n1;
	side = side1;
	x = x1;
	y = y1;
  }
  
  //����������ķ��������޸���
  public int getN() {
	return n;
  }
  
  public void setN(int n) {
	this.n = n;
  }
  
  public double getSide() {
	return side;
  }
  
  public void setSide(double side) {
	this.side = side;
  }
  
  public double getX() {
	return x;
  }
  
  public void setX(double x) {
	this.x = x;
  }
  
  public double getY() {
	return y;
  }
  
  public void setY(double y) {
	this.y = y;
  }
  
  public double getPerimeter() {
	return (this.n * this.side);
  }
  
  public double getArea() {
	return ((this.n * this.side * this.side) / (4 * Math.tan(Math.PI / this.n)));
  }
}
