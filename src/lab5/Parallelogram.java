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

    public boolean isValid(){
        double dAB = A.distance(B);
        double dCD = C.distance(D);
        double dBC = B.distance(C);
        double dAD = A.distance(D);

        if(dAB != dCD || dBC != dAD){
            return false;
        }
        return true;
    }

    public boolean isRectangle(){
        if(!this.isValid()){
            return false;
        }
        double abx = B.x - A.x;
        double aby = B.y - A.y;
        double bcx = C.x - B.x;
        double bcy = C.y - B.y;
        double dot_product = abx * bcx + aby * bcy;
        if(dot_product == 0){
            return true;
        }
        return false;
}