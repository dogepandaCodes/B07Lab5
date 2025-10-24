package lab5;

public class Parallelogram {
   	Point A; //assume bottom left is A
	Point B; //assume top left is B
	Point C; //assume top right is C
	Point D; //assume bottom right is D
	
	public Parallelogram(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}

    public double perimeter(){
        return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
    }

    public double area(){
        double abx = B.x - A.x;
        double adx = D.x - A.x;
        double aby = B.y - A.y;
        double ady = D.y - A.y;
        return Math.abs(abx * ady - aby * adx);
    }


}