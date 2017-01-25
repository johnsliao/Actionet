class Rectangle implements Shape {
    double length;
    double width;
    
    Rectangle (double l, double w) {
        length = l;
        width = w;
    }
    
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }  
}

class Triangle implements Shape {
    double base;
    double height;
    
    Triangle (double l, double h) {
        base = l;
        height = h;
    }
    
    public double getArea() {
        return base * height * 0.5;
    }

    public double getPerimeter() {
        // Assuming equilateral triangle
        return 3*base;
    }
}

class Circle implements Shape {
    double radius;
    
    Circle (double r) {
        radius = r;
    }
    
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }
}

class Ellipse implements Shape {
    double axis1;
    double axis2;
    
    Ellipse (double a1, double a2) {
        axis1 = a1;
        axis2 = a2;
    }
    
    public double getArea() {
        return Math.PI * axis1 * axis2;
    }

    public double getPerimeter() {
        // Approximation http://www.mathsisfun.com/geometry/ellipse-perimeter.html
        return 2 * Math.PI * Math.sqrt((Math.pow(axis1,2)+Math.pow(axis2,2))/2);
    }
}

class Square implements Shape {
    double side;
    
    Square (double s) {
        side = s;
    }
    
    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
        return 4 * side;
    }
}

class Quadrilateral implements Shape {
    double base;
    double height;
    
    Quadrilateral (double b, double h) {
        base = b;
        height = h;
    }
    
    public double getArea() {
        return base * height;
    }

    public double getPerimeter() {
        return 2 * (base + height);
    }
}
