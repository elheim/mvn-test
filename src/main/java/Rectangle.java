public class Rectangle {

    private int height;
    private int weight;

    private int area;

    Rectangle(int height, int weight){
        checkPositive(height);
        checkPositive(weight);

        this.height = height;
        this.weight = weight;
        this.area = height * weight;
    }

    public void setHeight(int newHeight){
        checkPositive(newHeight);
        this.height = newHeight;
        this.area = weight * newHeight;
    }

    public void setWeight(int newWeight){
        checkPositive(newWeight);
        this.weight = newWeight;
        this.area = height * newWeight;
    }

    private void checkPositive(int length) {
        if (length <= 0){
            throw new IllegalArgumentException("Excepted positive integer, got " + length);
        }
    }

    public int calcArea() {
        return  area;
    }


}
