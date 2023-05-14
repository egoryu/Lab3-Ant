package data;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name = "Point")
@Table(name="POINT")
public class Point implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double xValue;
    private Double yValue;
    private Double rValue;
    private Boolean hitResult;

    public Point() { }

    public boolean validateX() {
        return Math.abs(xValue) <= 4.0;
    }

    public boolean validateY() {
        return yValue >= -5.0 && yValue <= 3.0;
    }

    public boolean validateR() {
        return rValue == 1.0 || rValue == 1.5 || rValue == 2.0 || rValue == 2.5 || rValue == 3.0;
    }

    public boolean validateValue() {
        return validateR() && validateY() && validateX();
    }
    
    public boolean checkTriangle() {
        return xValue <= 0 && yValue <= 0 && yValue >= (-xValue / 2 - rValue / 2);
    }

    public boolean checkRectangle() {
        return xValue >= 0 && yValue <= 0 && xValue <= rValue && yValue >= -rValue;
    }

    public boolean checkCircle() {
        return xValue >= 0 && yValue >= 0 && xValue * xValue + yValue * yValue <= rValue * rValue;
    }

    public void checkHit() {
        hitResult = validateValue() && (checkTriangle() || checkRectangle() || checkCircle());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getxValue() {
        return xValue;
    }

    public void setxValue(Double xValue) {
        this.xValue = xValue;
    }

    public Double getyValue() {
        return yValue;
    }

    public void setyValue(Double yValue) {
        this.yValue = yValue;
    }

    public Double getrValue() {
        return rValue;
    }

    public void setrValue(Double rValue) {
        this.rValue = rValue;
    }

    public Boolean getHitResult() {
        return hitResult;
    }

    public void setHitResult(Boolean hitResult) {
        this.hitResult = hitResult;
    }

    public String getHitTranscription() {
        return hitResult ? "Hit" : "Miss";
    }

    @Override
    public String toString() {
        return "Result{" +
                "xValue=" + xValue +
                ", yValue=" + yValue +
                ", rValue=" + rValue +
                ", hitResult=" + hitResult +
                '}';
    }
}
