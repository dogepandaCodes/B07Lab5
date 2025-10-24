package lab5;

public class Parallelogram {
    Point A; // bottom-left
    Point B; // top-left
    Point C; // top-right
    Point D; // bottom-right
	
	public Parallelogram(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}

    public double perimeter(){
        return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
    }
}
