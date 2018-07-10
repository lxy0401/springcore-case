package com.lxy.springcore.xml;

import com.lxy.springcore.common.Shape;

public class XmlShapeCompute {
    private Shape circular;
    private Shape rectangle;
    private Shape triangle;

    public Shape computeShape(String shapeName)
    {
        if(shapeName == null || shapeName.length() == 0)
        {
            throw new IllegalArgumentException("Not found it");
        }
        if(shapeName.equals("circular"))
        {
            return circular;
        }
        if(shapeName.equals("rectangle"))
        {
            return rectangle;
        }
        if(shapeName.equals("triangle"))
        {
            return triangle;
        }
        throw new IllegalArgumentException("Not found it" + shapeName);
    }

    public Shape getCircular() {
        return circular;
    }

    public void setCircular(Shape circular) {
        this.circular = circular;
    }

    public Shape getRectangle() {
        return rectangle;
    }

    public void setRectangle(Shape rectangle) {
        this.rectangle = rectangle;
    }

    public Shape getTriangle() {
        return triangle;
    }

    public void setTriangle(Shape triangle) {
        this.triangle = triangle;
    }
}
