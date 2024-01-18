package edu.project4.functions;

import edu.project4.entities.Point;

public class SwirlTransformation implements Transformation {

    @Override
    public Point apply(Point point) {
        double x = point.x();
        double y = point.y();
        double square = x * x + y * y;
        double newX = x * Math.sin(square) - y * Math.cos(square);
        double newY = x * Math.cos(square) + y * Math.sin(square);
        return new Point(newX, newY);
    }
}
